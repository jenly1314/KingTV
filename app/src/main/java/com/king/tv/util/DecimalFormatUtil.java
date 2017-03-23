package com.king.tv.util;

import com.king.base.util.LogUtils;

import java.text.DecimalFormat;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

/**
 * @author Jenly <a href="mailto:jenly1314@gmail.com">Jenly</a>
 * @since 2017/3/15
 */

public class DecimalFormatUtil {

    private static final DecimalFormat decimalFormat = new DecimalFormat();


    public static String formatW(int vaule){
        if(vaule>=10000){
            float l = vaule/10000.0f;

            return format(l,"#.#'W'");
        }
       return String.valueOf(vaule);
    }

    public static String format(float vaule,String pattern){
        LogUtils.d("vaule:" + vaule);
        decimalFormat.applyPattern(pattern);
        return decimalFormat.format(vaule);
    }
}
