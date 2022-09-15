package com.ydm.platform.common.utils;

import java.util.Map;

/**
 * @author myseital
 * @date 2022/9/6
 */
public class MapUtil {

    public static boolean isEmpty(Map map) {
        return map == null || map.isEmpty();
    }

    public static boolean isNotEmpty(Map map) {
        return !isEmpty(map);
    }
}