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
public class ShippingMethodDTO implements Serializable {
    /**
     * id
     */
    private String id;
    /**
     * 配送方式code
     */
    private String shippingCode;

    /**
     * 配送方式name
     */
    private String shippingName;

    /**
     * 平台来源
     */
    private String source;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名称
     */
    private String shopName;

}
