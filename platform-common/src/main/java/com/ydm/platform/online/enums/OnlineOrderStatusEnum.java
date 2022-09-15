package com.ydm.platform.online.enums;

import lombok.Getter;

/**
 * 平台订单状态
 * @author myseital
 * @date 2021/5/31 09:44
 */
@Getter
public enum OnlineOrderStatusEnum {

    WAIT_PAY(0,"待付款"),
    PAID(1, "已付款"),
    SEND(2,"已发货"),
    FINISH(3,"已完成"),
    CANCELLED(4,"已取消"),
    ;

    private Integer code;
    private String message;

    OnlineOrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
