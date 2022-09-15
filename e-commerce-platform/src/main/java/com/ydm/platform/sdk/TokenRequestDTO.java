package com.ydm.platform.sdk;

import lombok.Data;

import java.io.Serializable;

/**
 * @author myseital
 * @date 2022/9/15
 */
@Data
public class TokenRequestDTO implements Serializable {
    private static final long serialVersionUID = 945929105701862147L;
    /**
     * 授权code
     */
    private String code;
    /**
     * 店铺完整域名，例[example.myshoplaza.com]
     */
    private String shop;
    /**
     * 平台类型
     */
    private String platform;
}
