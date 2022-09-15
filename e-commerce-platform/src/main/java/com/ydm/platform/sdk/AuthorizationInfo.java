package com.ydm.platform.sdk;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;


/**
 * @author myseital
 * @date 2021/10/25 20:29
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class AuthorizationInfo {

    private static final long serialVersionUID = 1617610523176455641L;
    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 公司名称
     */
    private String companyName;

    /**
     * 平台ID
     */
    private Integer platformId;

    /**
     * 平台名称
     */
    private String platformName;

    /**
     * 店铺ID
     */
    private Long shopId;

    /**
     * 店铺名字
     */
    private String shopName;

    /**
     * key
     */
    private String apiKey;
    /**
     * 秘钥
     */
    private String apiSecret;
    /**
     * 平台授权码或者token
     */
    private String accessToken;
    /**
     * 刷新token
     */
    private String refreshToken;
    /**
     * 授权过期时间 时间戳毫秒级
     */
    private Long expiresAt;

    /**
     * 地点ID集合
     */
    private List<String> marketPlaceIdList;

    /**
     * 销售区域
     */
    private String sellingRegion;

    /**
     * 端点
     */
    private String endpoint;

    /**
     * 站点url
     */
    private String storeUrl;

    /**
     * 亚马逊区域信息 - 所有
     */
    private List<AmazonAuthorizationRegionInfo> authorizationRegionList;
}
