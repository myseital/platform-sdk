package com.ydm.platform.online.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 订单明细
 * @author myseital
 * @date 2021/5/31 09:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderItemDTO implements Serializable {

    /**
     * 明细id
     */
    private String id;
    /**
     * 商品id
     */
    private String productId;
    /**
     * 数量
     */
    private Integer quantity;
    /**
     * 货币类型
     */
    private String currency;
    /**
     * 明细商品原价
     */
    private BigDecimal price;
    /**
     * 明细商品售价
     */
    private BigDecimal priceSale;
    private BigDecimal total;
    /**
     * 明细商品图片
     */
    private String image;
    /**
     * 明细商品名称
     */
    private String title;
    /**
     * 明细skuId
     */
    private String skuId;
    /**
     * 明细skuCode
     */
    private String skuCode;
    /**
     * 明细sku属性值
     */
    private String skuValue;
    /**
     * 明细总重量 = 单件 * 数量  单位kg
     */
    private BigDecimal weight;

    /**
     * shopline中的明细version
     */
    private OnlineOrderItemExtDTO extend;

    /**
     * bigcommerce中的order_address_id,发货单时候需要
     */
    private Long orderAddressId;
}
