package com.ydm.platform.online.dto.auth;

import lombok.Data;

/**
 * @author myseital
 * @date 2021/5/31 10:20
 */
@Data
public class AuthInfoRequest {

    private String key;
    private String secret;
    private String token;
    private String refreshToken;
}
