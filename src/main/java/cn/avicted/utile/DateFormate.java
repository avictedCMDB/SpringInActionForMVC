package cn.avicted.utile;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateFormate
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/10/010 15:09
 * @Version 1.0
 **/
public class DateFormate {

    public static String formateDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strDate = simpleDateFormat.format(date);
        return strDate;
    }




    public static void main(String[] args) {
        DateFormate dateFormate = new DateFormate();
        System.out.println(dateFormate.formateDate(new Date()));
    }
}
