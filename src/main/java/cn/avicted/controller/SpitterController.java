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

import javax.validation.Valid;

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

    @RequestMapping(value = "/{userName}",method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable String userName, Model model) {
        Spitter spitter = spitterData.findByUsername(userName);
        //System.out.println(spitter.getUserName() + " " + spitter.getPassword());
        model.addAttribute("spitter", spitter);
        return "profile";
    }




}
