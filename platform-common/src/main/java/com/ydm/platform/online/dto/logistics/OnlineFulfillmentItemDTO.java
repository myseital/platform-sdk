package com.ydm.platform.online.dto.logistics;

import com.ydm.platform.online.dto.order.OnlineOrderItemDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author myseital
 * @date 2021/6/8 17:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineFulfillmentItemDTO implements Serializable {
    /**
     * 发货对应的id参数
     * 已发货是Fulfillment对应的id
     */
    private String id;
    private Date createdAt;
    private List<OnlineOrderItemDTO> orderItems;
    private String trackingNumber;
    private String trackingCompany;
}
