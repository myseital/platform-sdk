package com.ydm.platform.online.enums;

import com.google.common.collect.Lists;
import lombok.Getter;

import java.util.List;

/**
 * 订单物流状态
 * @author myseital
 * @date 2021/6/1 11:04
 */
@Getter
public enum OnlineDeliveryStatusEnum {
    WAIT_SHIP(0, "未发货"),
    SHIPPED(1,"已发货"),
    FINISH(2,"已签收"),
    RETURN(3,"已退货"),
    PARTIAL(4,"部分发货"),
    ;

    private Integer code;
    private String message;

    OnlineDeliveryStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static  List<Integer> getFinishedStatusList(){
        return Lists.newArrayList(SHIPPED.getCode(),FINISH.getCode());
    }
}
