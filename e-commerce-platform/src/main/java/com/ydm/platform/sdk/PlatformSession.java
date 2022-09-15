package com.ydm.platform.sdk;

import com.ydm.platform.online.OnlineQueryRequest;
import com.ydm.platform.online.PageDTO;
import com.ydm.platform.online.dto.auth.AuthInfoRequestDTO;
import com.ydm.platform.online.dto.order.OnlineOrderDTO;
import com.ydm.platform.online.dto.order.OnlineOrderSendRequest;
import com.ydm.platform.online.dto.product.OnlineProductDTO;
import com.ydm.platform.online.dto.product.OnlineProductItemDTO;
import com.ydm.platform.online.dto.webhook.OnlineWebhookDTO;
import com.ydm.platform.online.dto.webhook.OnlineWebhookRequest;

import java.io.IOException;
import java.util.List;

/**
 * @author myseital
 * @date 2021/10/25 20:28
 */
public interface PlatformSession {

    /**
     * 构建授权链接
     *
     * @param redirectUrl 回调地址
     * @param state 自定义参数
     * @return
     */
    String generateAuthUrl(String redirectUrl, String state);

    /**
     * 用户授权后获取access_token
     *
     * @param request 自定义参数
     * @return
     */
    AuthorizationInfo getAccessToken(AuthInfoRequestDTO request) throws IOException;

    /**
     * 用户授权后获取access_token
     * @param request
     * @return
     * @throws IOException
     */
    AuthorizationInfo refreshToken(AuthInfoRequestDTO request) throws IOException;

    /**
     * 批量获取平台商品信息
     * @param request
     * @return
     * @throws IOException
     */
    PageDTO<OnlineProductDTO> listProduct(OnlineQueryRequest request) throws IOException;

    /**
     * 通过商品id查询商品信息
     * @param id
     * @return
     * @throws IOException
     */
    OnlineProductDTO getProductById(String id) throws IOException;

    /**
     * 通过商品id查询商品sku信息列表
     * @param productId
     * @return
     * @throws IOException
     */
    List<OnlineProductItemDTO> listProductItem(String productId) throws IOException;

    /**
     * 获取订单详情
     * @param orderId
     * @return
     * @throws IOException
     */
    OnlineOrderDTO getOrderById(String orderId) throws IOException;

    /**
     * 批量获取平台订单信息
     * @param request
     * @return
     * @throws IOException
     */
    PageDTO<OnlineOrderDTO> listOrder(OnlineQueryRequest request) throws IOException;

    /**
     * 订单履约
     * @param request
     * @return
     * @throws IOException
     */
    boolean createFulfillment(OnlineOrderSendRequest request) throws IOException;

    /**
     * 更新订单履约信息
     * @param request
     * @return
     * @throws IOException
     */
    boolean updateFulfillment(OnlineOrderSendRequest request) throws IOException;

    /**
     * 注册webhook
     * @param request
     * @return
     * @throws IOException
     */
    List<OnlineWebhookDTO> createWebhook(OnlineWebhookRequest request) throws IOException;
}
