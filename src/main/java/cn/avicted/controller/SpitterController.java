package cn.avicted.controller;

import cn.avicted.dao.SpittleRepository;
import cn.avicted.daoImpl.SpitterData;
import cn.avicted.daoImpl.SpittleData;
import cn.avicted.model.Spitter;
import cn.avicted.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

/**
 * @ClassName SpitterController
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/10/010 16:13
 * @Version 1.0
 **/
@Controller
@RequestMapping("/spitter")
public class SpitterController {

    @Autowired
    private SpitterData spitterData;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String showRegistrationForm() {
        return "registerForm";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processRegistration(@Valid Spitter spitter, Errors errors) {
        //校验参数错误信息
        if (errors.hasErrors()) {
            return "registerForm";
        }

        spitterData.save(spitter);
        return "redirect:/spitter/" + spitter.getUserName();
    }

    /**
    * @Author xulei
    * @Description 使用MultipartFile方式保存文件，，需要配置MultipartFile（一共有两种方式，P209）
    * @Date 8:58 2019/5/15/015
    * @Param [multipartFile, spitter, errors]
    * @return java.lang.String
    **/
    @RequestMapping(value = "/registerForMultipart", method = RequestMethod.POST)
    public String registerForMultipart(@RequestParam("multipartFile") MultipartFile multipartFile,
                                       @Valid Spitter spitter, Errors errors) {

        // 创建文件实例
        File tempFilePath = new File("F:/GitProject/SpringInActionForMVC/upload/" + multipartFile.getOriginalFilename());
        try {
            multipartFile.transferTo(tempFilePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        spitterData.save(spitter);
        return "redirect:/spitter/" + spitter.getUserName();
    }

    /**
    * @Author xulei
    * @Description 使用Part方式保存文件，Part方式不需要配置MultipartResolver。
    * @Date 8:58 2019/5/15/015
    * @Param [partFile, spitter, errors]
    * @return java.lang.String
    **/
    @RequestMapping(value = "/registerForPart", method = RequestMethod.POST)
    public String registerForPart(@RequestParam("multipartFile") Part partFile,
                                       @Valid Spitter spitter, Errors errors) {

        // 创建文件实例
        String tempFilePath = "F:/GitProject/SpringInActionForMVC/upload/" + partFile.getSubmittedFileName();
        try {
            partFile.write(tempFilePath);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        spitterData.save(spitter);
        return "redirect:/spitter/" + spitter.getUserName();
    }

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String userName, Model model) {
        Spitter spitter = spitterData.findByUsername(userName);
        //System.out.println(spitter.getUserName() + " " + spitter.getPassword());
        model.addAttribute("spitter", spitter);
        return "profile";
    }




}
