package com.ydm.platform.online.dto.refund;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author liubaocheng
 * @date 2021/9/15 17:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineRefundItemDTO implements Serializable {
    private String id;
    private List<OnlineRefundLineItemsDTO> refundItems;
}
