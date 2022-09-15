package com.ydm.platform.online.dto.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author myseital
 * @date 2021/5/31 10:21
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShopAuthInfoDTO {

    private String shopId;
    private String shopName;
    private String token;
    /**
     * shopline新站标记
     */
    private Boolean newSite;
}
