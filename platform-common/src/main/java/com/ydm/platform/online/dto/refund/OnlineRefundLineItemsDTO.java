package com.ydm.platform.online.dto.refund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 退款明细
 * @author myseital
 * @date 2021/6/7 17:31
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineRefundLineItemsDTO implements Serializable {
    private String skuId;
    private Integer quantity;
}
