package com.ydm.platform.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

/**
 * @author myseital
 * @date 2021/10/25 20:29
 */
@AllArgsConstructor
public enum SourcePlatformEnum {

    AMAZON(1, "amazon", "amazon"),

    ;
    @Getter
    private Integer id;
    @Getter
    private String code;
    @Getter
    private String name;

    public static SourcePlatformEnum getByCode(String code) {
        for (SourcePlatformEnum platformEnum : SourcePlatformEnum.values()) {
            if (Objects.equals(platformEnum.getCode(), code)) {
                return platformEnum;
            }
        }
        return null;
    }

    public static SourcePlatformEnum getById(Integer id) {
        for (SourcePlatformEnum platformEnum : SourcePlatformEnum.values()) {
            if (Objects.equals(platformEnum.getId(), id)) {
                return platformEnum;
            }
        }
        return null;
    }
}
