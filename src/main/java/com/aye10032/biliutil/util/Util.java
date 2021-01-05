package com.aye10032.biliutil.util;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @program: biliutil
 * @description: 工具类
 * @author: Aye10032
 * @create: 2020-12-23 18:46
 **/
public class Util {

    public static Boolean IsBvid(String id) {
        if (id.substring(0, 2).equalsIgnoreCase("BV")
                || id.substring(0, 2).equalsIgnoreCase("AV")) {
            id = id.substring(2);
        }
        Pattern pattern   =   Pattern.compile("(?i)[a-z]");
        Matcher matcher   =   pattern.matcher(id);
        return matcher.find();
    }

    public static Date long2date(long timestamp){
        Date date = new Date(TimeUnit.SECONDS.toMillis(timestamp));
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        return date;
    }

}
