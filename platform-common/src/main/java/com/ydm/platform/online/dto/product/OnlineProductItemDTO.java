package com.ydm.platform.online.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * 商品明细（SKU）
 * @author myseital
 * @date 2021/5/31 09:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineProductItemDTO {
    private String id;
    /**
     * 规格编码
     */
    private String code;

    /**
     * 供方skuId
     */
    private String supplierSkuId;

    /**
     * 规格名称
     */
    private String name;
    /**
     * 规格属性值
     */
    private List<String> specValues;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    /**
     * 重量 默认kg
     */
    private BigDecimal weight;
    /**
     * 原价
     */
    private BigDecimal price;
    /**
     * 售价
     */
    private BigDecimal priceSale;
    /**
     * 成本价
     */
    private BigDecimal cost;
    private Integer quantity;
    private String mainImage;
    private String currency;
    private Date updatedAt;
    private Date createdAt;
    private Integer status;
}
