package cn.avicted.stomp.model;

import java.util.Date;

/**
 * @ClassName SpittleFrom
 * @Description TODO
 * @Author xulei
 * @Date 2019/6/13/013 9:31
 * @Version 1.0
 **/
public class SpittleFrom {
    private String text;
    private Date date;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "test message is : " + this.text + " date message is : " + this.date;
    }

}
