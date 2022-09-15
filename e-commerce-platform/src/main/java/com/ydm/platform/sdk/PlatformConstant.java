package com.ydm.platform.sdk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author myseital
 * @date 2022/8/30 14:20
 */
public class PlatformConstant {

    private static final Logger log = LoggerFactory.getLogger(PlatformConstant.class);
    private static Properties prop = new Properties();

    static {
        try (InputStream is = PlatformConstant.class.getClassLoader().getResourceAsStream("platform.properties")) {
            prop.load(is);
        } catch (IOException e) {
            log.error("读取platform.properties配置文件失败，", e);
        }
    }

    /**
     * 亚马逊开发者keyId
     */
    public static String AMAZON_ACCESS_KEY_ID = prop.getProperty("amazon.access.key.id");
    /**
     * 亚马逊开发者秘钥
     */
    public static String AMAZON_SECRET_KEY = prop.getProperty("amazon.secret.key");
    /**
     * 亚马逊角色串
     */
    public static String AMAZON_ROLE_ARN = prop.getProperty("amazon.role.arn");
    /**
     * 应用客户端ID
     */
    public static String AMAZON_CLIENT_ID = prop.getProperty("amazon.client.id");
    /**
     * 客户端秘钥
     */
    public static String AMAZON_SECRET = prop.getProperty("amazon.secret");
    /**
     * 授权接口
     */
    public static String AMAZON_AUTH_ENDPOINT = prop.getProperty("amazon.auth.endpoint");
}
