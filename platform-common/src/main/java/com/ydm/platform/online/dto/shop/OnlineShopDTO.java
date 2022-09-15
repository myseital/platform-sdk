package com.ydm.platform.online.dto.shop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author myseital
 * @date 2021/6/7 16:27
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OnlineShopDTO {
    private String id;
    private String name;
    private String currency;
}
