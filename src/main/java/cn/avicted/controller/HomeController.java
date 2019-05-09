package cn.avicted.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName HomeController
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/9/009 15:25
 * @Version 1.0
 **/
@Controller
public class HomeController {

    @RequestMapping(value = "/",  method = RequestMethod.GET)
    public String home() {
        return "home";
    }

}
