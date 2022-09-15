package com.ydm.platform.sdk.amazon;

import com.ydm.platform.sdk.AuthorizationInfo;
import lombok.Data;

import java.util.List;

/**
 * @author myseital
 * @date 2022/9/15
 */
@Data
public class AmazonAuthorizationInfo extends AuthorizationInfo {
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
     * 亚马逊区域信息 - 所有
     */
    private List<AmazonAuthorizationRegionInfo> authorizationRegionList;
}
