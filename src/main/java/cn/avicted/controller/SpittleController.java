package cn.avicted.controller;

import cn.avicted.daoImpl.SpittleData;
import cn.avicted.model.Spittle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @ClassName SpittleController
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/10/010 14:00
 * @Version 1.0
 **/
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    @Autowired
    private SpittleData spittleData;

    /*@RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model) {
        List<Spittle> spittleList = createSpittle.findSpittles(Long.MAX_VALUE, 20);
        model.addAttribute("spittleList", spittleList);

        return "spittles";
    }*/

    @RequestMapping(method = RequestMethod.GET)
    public String spittles(
            @RequestParam(value = "max", defaultValue = "" + Long.MAX_VALUE) long max,
            @RequestParam(value = "count", defaultValue = "20") long count,
            Model model) {
        List<Spittle> spittleList = spittleData.findSpittles(Long.MAX_VALUE, 20);

        model.addAttribute("spittleList", spittleList);

        return "spittles";
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String showSpittle(
            @RequestParam("spittle_id")long spittleId, Model model) {
        model.addAttribute("spittle", spittleData.findOne(spittleId));

        return "spittle";
    }

    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable long spittleId, Model model) {
        model.addAttribute("spittle", spittleData.findOne(spittleId));

        return "spittle";
    }


}
