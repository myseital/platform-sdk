package com.ydm.platform.online.dto.webhook;

import lombok.Data;

import java.io.Serializable;

/**
 * @author myseital
 * @date 2021/11/17 14:44
 */
@Data
public class OnlineWebhookRequest implements Serializable {
    private static final long serialVersionUID = 4896998364313885195L;
    /**
     * webhook配置回调Url
     */
    private String webhookUrl;
}
