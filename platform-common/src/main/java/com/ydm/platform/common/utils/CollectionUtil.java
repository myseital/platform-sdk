package com.ydm.platform.common.utils;

import java.util.Collection;

/**
 * @author myseital
 * @date 2022/9/6
 */
public class CollectionUtil {

    public static boolean isEmpty(Collection<?> coll) {
        return coll == null || coll.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> coll) {
        return !isEmpty(coll);
    }
}
