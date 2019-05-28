package cn.avicted.restAPI.controller;

import cn.avicted.dao.SpittleRepository;
import cn.avicted.model.Spittle;
import cn.avicted.restAPI.exception.SpittleNotFoundException;
import cn.avicted.restAPI.utils.Error;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName SpittleController
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/27/027 15:18
 * @Version 1.0
 **/
@Controller
@RequestMapping("/spittles")
public class SpittleController {

    private static final String MAX_LONG_AS_STRING = "324354354235435234";

    @Autowired
    private SpittleRepository spittleRepository;


    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Spittle> spittles(@RequestParam(value = "max", defaultValue = MAX_LONG_AS_STRING)long max,
                                  @RequestParam(value = "count", defaultValue = "20") int count) {

        return spittleRepository.findSpittles(max, count);
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Spittle spittleById(@PathVariable long id) {
        /*Spittle spittle = spittleRepository.findOne(id);
        HttpStatus status = spittle != null ? HttpStatus.OK : HttpStatus.NOT_FOUND;

        return new ResponseEntity<Spittle>(spittle, status);*/

        Spittle spittle = spittleRepository.findOne(id);
        if (spittle == null) {
            throw new SpittleNotFoundException(id);
        }

        return spittle;


    }




}
