package com.ydm.platform.online.dto.logistics;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 订单履约
 * @author myseital
 * @date 2021/6/7 17:31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineFulfillmentDTO {
    private String orderId;
    private List<OnlineFulfillmentItemDTO> sentItems;
    private List<OnlineFulfillmentItemDTO> waitSentItems;
}
