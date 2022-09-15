package com.ydm.platform.sdk;

import com.ydm.platform.sdk.amazon.AmazonSdk;
import com.ydm.platform.common.enums.SourcePlatformEnum;

/**
 * @author myseital
 * @date 2021/10/25 20:28
 */
public class PlatformSessionFactory {

    public static PlatformSession create(SourcePlatformEnum sourcePlatformEnum, AuthorizationInfo authorizationInfo) {
        switch (sourcePlatformEnum) {
            case AMAZON:
                return AmazonSdk.newInstance(authorizationInfo);
            default:
                throw new RuntimeException("不支持的平台类型");
        }
    }
}
