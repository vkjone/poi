package cn.lmf.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    public static String getCurrentDate(String format){
        SimpleDateFormat formatter= new SimpleDateFormat(format);
        Date date = new Date(System.currentTimeMillis());
        System.out.println(formatter.format(date));
        return formatter.format(date);
    }

    private DateUtil(){

    }
}
