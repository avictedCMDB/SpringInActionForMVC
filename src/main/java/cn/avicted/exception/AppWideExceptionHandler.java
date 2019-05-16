package cn.avicted.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName AppWideExceptionHandler
 * @Description 定义控制器通知。整个应用中说有带Request
 * @Author xulei
 * @Date 2019/5/15/015 9:38
 * @Version 1.0
 **/
@ControllerAdvice
public class AppWideExceptionHandler {

    @ExceptionHandler(DuplicateSpittleException.class)
    public String duplicateSpittleHandler() {

        return "error/duplicate";
    }



}
