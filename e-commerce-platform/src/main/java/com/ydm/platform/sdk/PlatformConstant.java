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

    public static String QIMEN_URL = prop.getProperty("qimen.url");
    public static String QIMEN_APPKEY = prop.getProperty("qimen.appkey");
    public static String QIMEN_SECRET = prop.getProperty("qimen.secret");
}
