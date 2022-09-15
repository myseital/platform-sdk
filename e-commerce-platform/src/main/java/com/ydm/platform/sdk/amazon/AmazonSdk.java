package com.ydm.platform.sdk.amazon;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.ydm.platform.sdk.AbsPlatformSession;
import com.ydm.platform.sdk.AuthorizationInfo;
import com.ydm.spapi.api.*;

import java.util.UUID;

import static com.ydm.platform.sdk.PlatformConstant.*;


/**
 * @author myseital
 * @date 2022/8/11
 */
public class AmazonSdk extends AbsPlatformSession {

    private AWSAuthenticationCredentials awsAuthenticationCredentials;

    private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;

    private LWAAuthorizationCredentials lwaAuthorizationCredentials;

    public static AmazonSdk newInstance(AmazonAuthorizationInfo authorizationInfo) {
        return new AmazonSdk(authorizationInfo.getSellingRegion(), authorizationInfo.getRefreshToken());
    }

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
                .endpoint(AMAZON_AUTH_ENDPOINT)
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
