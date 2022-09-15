package com.ydm.platform.common.utils;


import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;

/**
 * @author myseital
 * @date 2022/9/6
 */
public class NullUtil {

    /**
     * 字符串null -> ""
     * @param str
     * @return
     */
    public static String ofNullable(String str){
        return Optional.ofNullable(str).orElse("");
    }

    /**
     *
     * @param bigDecimal
     * @return
     */
    public static BigDecimal ofNullable(BigDecimal bigDecimal){
        return Optional.ofNullable(bigDecimal).orElse(BigDecimal.ZERO);
    }

    public static Integer ofNullable(Integer a){
        return Optional.ofNullable(a).orElse(0);
    }


    public static Long ofNullable(Long a){
        return Optional.ofNullable(a).orElse(0L);
    }


    public static Date ofNullableDate(Date date){
        return Optional.ofNullable(date).orElse(DateUtil.getTodayOfStart());
    }


    /**
     * 获取对象字符串属性值，为空则默认
     *
     * @param t
     * @param function
     * @param <T>
     * @return
     */
    public static <T> String getStrField(T t, Function<T, String> function) {
        return Objects.nonNull(t) ? function.apply(t) : "";
    }
}
