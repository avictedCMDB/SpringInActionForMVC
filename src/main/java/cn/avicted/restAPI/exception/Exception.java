package cn.avicted.restAPI.exception;

import cn.avicted.model.Spittle;
import cn.avicted.restAPI.utils.Error;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName Exception
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/28/028 11:00
 * @Version 1.0
 **/

public class Exception {

    @ExceptionHandler(SpittleNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Error spittleNotFound(SpittleNotFoundException e) {
        Long spiitleId = e.getSpittleId();
        Error error = new Error();
        error.setCode(4);
        error.setMessage("Spittle [" + spiitleId + "] not found");
        return error;
    }



}
