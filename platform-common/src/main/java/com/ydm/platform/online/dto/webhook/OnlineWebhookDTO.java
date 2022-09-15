package com.ydm.platform.online.dto.webhook;

import lombok.Data;

/**
 * @author myseital
 * @date 2021/11/17 09:40
 */
@Data
public class OnlineWebhookDTO {
    private String id;
    private String callbackUrl;
    private String topic;
}
