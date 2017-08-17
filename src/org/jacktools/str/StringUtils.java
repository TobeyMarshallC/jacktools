package org.jacktools.str;

import java.lang.Object;

/**
 * 字符串工具类
 * Created by jackluosi on 2017/8/17.
 */
public class StringUtils {

    /**
     * 判断是否为空
     * @param object 传入需要判断的对象
     * @return true表示为空，false表示不为空
     */
    public static boolean isNullOrEmpty(Object object){
        if(object == null){
            return true;
        }
        if(object.toString() == null){
            return true;
        }
        if("".equals(object.toString()) || 0 == object.toString().length()){
            return true;
        }
        return false;
    }
}
