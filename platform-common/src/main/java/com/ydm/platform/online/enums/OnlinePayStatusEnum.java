package com.ydm.platform.online.enums;

import lombok.Getter;

/**
 * @author myseital
 * @date 2021/6/8 14:58
 */
@Getter
public enum OnlinePayStatusEnum {
    WAIT_PAY(0,"待付款"),
    PAID(1, "已付款"),
    REFUNDED(2,"已取消|已退款"),
    PARTIALLY_REFUNDED(4,"部分退款"),
    PAID_FAIL(5,"付款失败"),
    PAYING(6,"付款中"),
    ;

    private Integer code;
    private String message;

    OnlinePayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
