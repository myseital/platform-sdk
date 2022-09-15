package com.ydm.platform.sdk;

import org.junit.Test;

/**
 * @author myseital
 * @date 2022/9/15
 */
public class PlatformConstantTest {

    @Test
    public void testConstant() {
        String amazonSecretKey = PlatformConstant.AMAZON_SECRET_KEY;
        System.out.println(amazonSecretKey);
    }
}
