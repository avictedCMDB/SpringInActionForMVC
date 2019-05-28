package cn.avicted.restAPI.utils;

/**
 * @ClassName Error
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/28/028 10:28
 * @Version 1.0
 **/
public class Error {
    private Integer code;
    private String message;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "错误码是：" + this.code + "； 错误信息是：" + this.message;
    }


}
