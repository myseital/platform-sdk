package com.ydm.platform.online.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 订单明细
 * @author myseital
 * @date 2021/5/31 09:47
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderSendRequest {

    /**
     * 订单id
     */
    private String orderId;
    /**
     * 物流单号
     */
    private String trackingNumber;
    /**
     * 物流轨迹url
     */
    private String trackingUrl;
    /**
     * 物流承运商名称
     */
    private String deliveryProviderName;
    /**
     * 物流承运商名称对应code
     */
    private String deliveryProviderNameCode;
    /**
     * 明细信息
     */
    private List<OrderItemSendDTO> items;
    /**
     * 履约单id
     */
    private String fulfillmentOrderId;
    /**
     * shopify发货需要参数
     */
    private String locationId;

    /**
     * 是否通知用户
     */
    private Boolean notifyCustomer;

    /**
     * bigcommerce中的order_address_id,发货单时候需要
     */
    private Long orderAddressId;

    /**
     * 物流单号（原订单）
     */
    private String logisticsNo;

    @Data
    @NoArgsConstructor
    public static class OrderItemSendDTO {
        /**
         * 订单明细id
         */
        private String itemId;
        private String productId;
        private String skuId;
        private Integer quantity;
        /**
         * 商品版本号(shopline)
         */
        private String version;
        /**
         * bigcommerce中的order_address_id,发货单时候需要
         */
        private Long orderAddressId;
    }

    public void addItems(String itemId, Integer quantity) {
        if (items == null) items = new ArrayList<>();
        OrderItemSendDTO lineItem = new OrderItemSendDTO();
        lineItem.setItemId(itemId);
        lineItem.setQuantity(quantity);
        items.add(lineItem);
    }
}
