package com.ydm.platform.online.dto.order;

import lombok.Data;

/**
 * @author ：myseital
 * @date ：2021/10/27 10:53 上午
 * @description ：
 */
@Data
public class OnlineLocalizationExtensionsNodeDTO {
    /**
     * 国家
     */
    private String countryCode;
    /**
     * 目的
     */
    private String purpose;
    /**
     * 标题
     */
    private String title;
    /**
     * 内容
     */
    private String value;

}
