package com.ydm.platform.online.dto.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author myseital
 * @date 2021/5/31 09:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineProductDTO {
    /**
     * 商品id
     */
    private String id;
    /**
     * 商品编码
     */
    private String code;
    /**
     * 商品名称 - 目前默认都是英文的
     */
    private String name;

    private String nameCn;
    /**
     * 商品标题
     */
    private String title;

    private String titleCn;
    /**
     * 商品原价
     */
    private BigDecimal price;
    /**
     * 商品售价
     */
    private BigDecimal priceSale;
    /**
     * 商品类型
     */
    private String type;
    /**
     * 商品标签
     */
    private String tags;
    /**
     * 商品描述
     */
    private String description;
    /**
     * 商品链接
     */
    private String linkUrl;
    /**
     * 商品主图
     */
    private String mainImage;
    /**
     * 商品图片列表
     */
    private List<String> images;
    /**
     * 商品状态
     */
    private Integer status;
    /**
     * 商品明细（sku）
     */
    private List<OnlineProductItemDTO> items;
    /**
     * 商品创建时间
     */
    private Date createdAt;
    /**
     * 商品更新时间
     */
    private Date updatedAt;
    /**
     * 商品重量
     */
    private BigDecimal weight;
    /**
     * 商品邮费
     */
    private BigDecimal postFee;
    /**
     * 供应商
     */
    private String vendor;

    private String brandName;

    private String brandCode;

    /**
     * 报关信息
     */
    private OnlineProductDeclareDTO declareDTO;
}
