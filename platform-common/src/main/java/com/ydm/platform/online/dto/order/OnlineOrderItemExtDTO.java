package com.ydm.platform.online.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author myseital
 * @date 2021/6/2 17:01
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderItemExtDTO implements Serializable {
    /**
     * shopline 明细中商品版本
     */
    private String version;
    /**
     * 履约单id
     */
    private String fulfillmentOrderId;
}
