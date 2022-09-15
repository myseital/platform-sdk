package com.ydm.platform.online.dto.outbound;

import lombok.Data;

/**
 * @author myseital
 * @date 2021/10/18 21:05
 */
@Data
public class OnlineOutboundItemCreateDTO {

    /**
     * 平台skuid
     */
    private String skuId;

    /**
     * 正品配货数
     */
    private Integer qualityNum;

    /**
     * 次品配货数
     */
    private Integer defectiveNum;
}
