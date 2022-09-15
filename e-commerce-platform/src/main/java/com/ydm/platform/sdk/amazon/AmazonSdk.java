package com.ydm.platform.sdk.amazon;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.ydm.spapi.api.*;

import java.util.UUID;

/**
 * @author myseital
 * @date 2022/8/11
 */
public class AmazonSdk {

    /**
     * 亚马逊开发者keyId
     */
    private final String AMAZON_ACCESS_KEY_ID = "";
    /**
     * 亚马逊开发者秘钥
     */
    private final String AMAZON_SECRET_KEY = "";

    /**
     * 亚马逊角色串
     */
    private final String AMAZON_ROLE_ARN = "";

    /**
     * 应用客户端ID
     */
    private final String AMAZON_CLIENT_ID = "";

    /**
     * 客户端秘钥
     */
    private final String AMAZON_SECRET = "";

    /**
     * 授权接口
     */
    private final String AUTH_ENDPOINT = "https://api.amazon.com/auth/o2/token";


    private AWSAuthenticationCredentials awsAuthenticationCredentials;

    private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;

    private LWAAuthorizationCredentials lwaAuthorizationCredentials;


    public AmazonSdk(String region, String refreshToken) {
        awsAuthenticationCredentials = AWSAuthenticationCredentials.builder()
                .accessKeyId(AMAZON_ACCESS_KEY_ID)
                .secretKey(AMAZON_SECRET_KEY)
                .region(region)
                .build();
        awsAuthenticationCredentialsProvider = AWSAuthenticationCredentialsProvider.builder()
                .roleArn(AMAZON_ROLE_ARN)
                .roleSessionName(UUID.randomUUID().toString())
                .build();
        lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
                .clientId(AMAZON_CLIENT_ID)
                .clientSecret(AMAZON_SECRET)
                .refreshToken(refreshToken)
                .endpoint(AUTH_ENDPOINT)
                .build();
    }


    public CatalogApi getCatalogApi(String endPoint) {
        return new CatalogApi.Builder()
                .awsAuthenticationCredentials(awsAuthenticationCredentials)
                .lwaAuthorizationCredentials(lwaAuthorizationCredentials)
                .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
                .endpoint(endPoint)
                .build();
    }

    public OrdersV0Api getOrderApi(String endPoint) {
        return new OrdersV0Api.Builder()
                .awsAuthenticationCredentials(awsAuthenticationCredentials)
                .lwaAuthorizationCredentials(lwaAuthorizationCredentials)
                .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
                .endpoint(endPoint)
                .build();
    }

    public SellersApi getSellersApi(String endPoint){
        return new SellersApi.Builder()
                .awsAuthenticationCredentials(awsAuthenticationCredentials)
                .lwaAuthorizationCredentials(lwaAuthorizationCredentials)
                .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
                .endpoint(endPoint)
                .build();
    }

    public ReportsApi getReportsApi(String endPoint){
        return new ReportsApi.Builder()
                .awsAuthenticationCredentials(awsAuthenticationCredentials)
                .lwaAuthorizationCredentials(lwaAuthorizationCredentials)
                .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
                .endpoint(endPoint)
                .build();
    }

    public FbaOutboundApi getFbaOutboundApi(String endPoint){
        return new FbaOutboundApi.Builder()
                .awsAuthenticationCredentials(awsAuthenticationCredentials)
                .lwaAuthorizationCredentials(lwaAuthorizationCredentials)
                .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
                .endpoint(endPoint)
                .build();
    }

    public FeedsApi getFeedsApi(String endPoint) {
        return new FeedsApi.Builder()
                .awsAuthenticationCredentials(awsAuthenticationCredentials)
                .lwaAuthorizationCredentials(lwaAuthorizationCredentials)
                .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
                .endpoint(endPoint)
                .build();
    }
}
