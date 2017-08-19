package org.jacktools.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 日期工具类
 * Created by jackluosi on 2017/8/19.
 */
public class DateTimeTools {

    /**
     * 得到长日期
     * 格式：YYYY-MM-DD hh:mm:ss
     * @param calendar
     * @return
     */
    public static String getLongDate(Calendar calendar){
        if(calendar == null){
            calendar = Calendar.getInstance();
        }
        StringBuilder res = new StringBuilder();
        res.append(calendar.get(Calendar.YEAR)).append("-")
                .append(calendar.get(Calendar.MONTH)+1).append("-")
                .append(calendar.get(Calendar.DATE)).append(" ")
                .append(calendar.get(Calendar.HOUR_OF_DAY)).append(":")
                .append(calendar.get(Calendar.MINUTE)).append(":")
                .append(calendar.get(Calendar.SECOND));
        return res.toString();
    }

    /**
     * 得到短日期
     * 格式：YYYY-MM-DD
     * @param calendar
     * @return
     */
    public static String getShortDate(Calendar calendar){
        if(calendar == null){
            calendar = Calendar.getInstance();
        }
        StringBuilder res = new StringBuilder();
        res.append(calendar.get(Calendar.YEAR)).append("-")
                .append(calendar.get(Calendar.MONTH)+1).append("-")
                .append(calendar.get(Calendar.DATE));
        return res.toString();
    }

}
