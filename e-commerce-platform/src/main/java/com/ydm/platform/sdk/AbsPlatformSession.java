package com.ydm.platform.sdk;

import com.ydm.platform.online.OnlineQueryRequest;
import com.ydm.platform.online.PageDTO;
import com.ydm.platform.online.dto.auth.AuthInfoRequestDTO;
import com.ydm.platform.online.dto.order.OnlineOrderDTO;
import com.ydm.platform.online.dto.order.OnlineOrderSendRequest;
import com.ydm.platform.online.dto.product.OnlineProductDTO;
import com.ydm.platform.online.dto.product.OnlineProductItemDTO;
import com.ydm.platform.online.dto.product.OnlineProductOptionValueDTO;
import com.ydm.platform.online.dto.webhook.OnlineWebhookDTO;
import com.ydm.platform.online.dto.webhook.OnlineWebhookRequest;
import com.ydm.platform.online.exception.PlatformException;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author myseital
 * @date 2021/10/25 20:29
 */
public class AbsPlatformSession implements PlatformSession {

    @Override
    public String generateAuthUrl(String redirectUrl, String state) {
        throw new PlatformException("接口未实现");
    }

    @Override
    public AuthorizationInfo getAccessToken(AuthInfoRequestDTO request) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public AuthorizationInfo refreshToken(AuthInfoRequestDTO request) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public PageDTO<OnlineProductDTO> listProduct(OnlineQueryRequest request) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public OnlineProductDTO getProductById(String id) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public List<OnlineProductItemDTO> listProductItem(String productId) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public OnlineOrderDTO getOrderById(String orderId) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public PageDTO<OnlineOrderDTO> listOrder(OnlineQueryRequest request) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public boolean createFulfillment(OnlineOrderSendRequest request) throws IOException {
        throw new PlatformException("接口未实现");
    }

    @Override
    public boolean updateFulfillment(OnlineOrderSendRequest request) throws IOException {
        throw new RuntimeException("接口未实现");
    }

    @Override
    public List<OnlineWebhookDTO> createWebhook(OnlineWebhookRequest request) throws IOException {
        throw new PlatformException("接口未实现");
    }

    public final List<OnlineProductDTO> buildOnlineProductDTO(List<Map<String, Object>> items) {
        return items.stream().map(this::populateOnlineProductDTO).collect(Collectors.toList());
    }

    protected OnlineProductDTO populateOnlineProductDTO(Map<String, Object> product) {
        return null;
    }

    public final List<OnlineProductItemDTO> buildOnlineSkuDTO(OnlineProductDTO onlineProductDTO, List<Map<String, Object>> skus,
                                                              Map<String, List<OnlineProductOptionValueDTO>> optionMap) {
        return skus.stream().map(sku -> {
            return populateOnlineProductItemDTO(onlineProductDTO, sku, optionMap);
        }).collect(Collectors.toList());
    }

    protected OnlineProductItemDTO populateOnlineProductItemDTO(OnlineProductDTO onlineProductDTO, Map<String, Object> sku,
                                                                Map<String, List<OnlineProductOptionValueDTO>> optionMap) {
        return null;
    }

    public final List<OnlineOrderDTO> buildOnlineOrderDTO(List<Map<String, Object>> orders) {
        return orders.stream().map(this::populateOnlineOrderDTO).collect(Collectors.toList());
    }

    protected OnlineOrderDTO populateOnlineOrderDTO(Map<String, Object> order) {
        return null;
    }

}
