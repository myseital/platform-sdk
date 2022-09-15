package com.ydm.platform.online.dto.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author myseital
 * @date 2021/6/21 10:42
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineOrderPaymentDTO implements Serializable {
    /**
     * 付款方式
     */
    private String method;
    /**
     * 付款状态
     */
    private Integer status;
    /**
     * 交易流水号
     */
    private String transactionNo;
}
