package cn.avicted.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @ClassName SpittleNotFoundException
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/15/015 9:15
 * @Version 1.0
 **/
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "Spittle Not Found")
public class SpittleNotFoundException extends RuntimeException {

}
