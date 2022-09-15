package com.ydm.platform.sdk.amazon;

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
public class AmazonAuthorizationRegionInfo {

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


}
