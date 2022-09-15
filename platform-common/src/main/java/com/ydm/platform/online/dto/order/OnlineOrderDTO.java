package com.ydm.platform.online.dto.order;

import com.ydm.platform.online.dto.OnlineAddressDTO;
import com.ydm.platform.online.dto.logistics.OnlineFulfillmentItemDTO;
import com.ydm.platform.online.dto.refund.OnlineRefundItemDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author myseital
 * @date 2021/5/31 09:46
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderDTO implements Serializable {
    private String id;
    /**
     * 订单编号
     */
    private String orderNumber;
    /**
     * 订单状态
     */
    private Integer status;
    /**
     * 订单买家备注
     */
    private String remarks;
    /**
     * 卖家备注留言
     */
    private String notes;
    /**
     * 收件人地址信息
     */
    private OnlineAddressDTO consignee;
    /**
     * 买家信息
     */
    private OrderBuyerDTO buyer;
    /**
     * 订单交易信息
     */
    private List<OnlineOrderPaymentDTO> payments;
    /**
     * 订单明细
     */
    private List<OnlineOrderItemDTO> items;
    /**
     * 订单创建时间
     */
    private Date createdAt;
    /**
     * 订单更新时间
     */
    private Date updatedAt;
    /**
     * 发货状态
     */
    private Integer deliveryStatus;
    /**
     * 支付状态
     */
    private Integer payStatus;
    /**
     * 总额
     */
    private BigDecimal totalFee;
    /**
     * 运费
     */
    private BigDecimal postFee;
    /**
     * 优惠
     */
    private BigDecimal discountFee;
    /**
     * 货币类型
     */
    private String currency;

    /**
     * 已发货明细
     */
    private List<OnlineOrderItemDTO> sentItems;
    /**
     * 待履约明细
     */
    private List<OnlineFulfillmentItemDTO> waitSentItems;

    /**
     * 已履约明细
     */
    private List<OnlineFulfillmentItemDTO> fulfillmentItems;

    /**
     * 已退款明细
     */
    private List<OnlineRefundItemDTO> refundItems;

    /**
     * 配送方式
     */
    private List<ShippingMethodDTO> shippingMethods;

    /**
     * shopify库位Id
     */
    private String locationId;
    /**
     * cod订单
     */
    private Boolean cod;

    /**
     * 物流信息
     * 不需要在ERP操作选物流产品的
     */
    private OnlineOrderLogisticsDTO logisticsDTO;

    private Long depotId;

    private String depotCode;

    private String depotName;
}
