package com.ydm.platform.online.dto.outbound;

import com.ydm.platform.online.enums.OnlineOutboundStatusEnum;
import lombok.Data;

/**
 * @author myseital
 * @date 2021/10/18 17:59
 */
@Data
public class OnlineOutboundDTO {
    /**
     * 飞盒单号
     */
    private String orderSn;
    /**
     * 客户id
     */
    private Long customerId;
    /**
     * 平台出库单id
     */
    private String onlineOrderId;
    /**
     * 出库单状态
     * @see OnlineOutboundStatusEnum
     */
    private Integer onlineStatus;
}
