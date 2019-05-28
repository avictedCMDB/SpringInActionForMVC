package cn.avicted.restAPI.exception;

/**
 * @ClassName SpittleNotFoundException
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/28/028 10:56
 * @Version 1.0
 **/
public class SpittleNotFoundException extends RuntimeException {
    private Long spittleId;

    public Long getSpittleId() {
        return spittleId;
    }

    public void setSpittleId(Long spittleId) {
        this.spittleId = spittleId;
    }


}
