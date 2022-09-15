package com.ydm.platform.sdk;

import cn.hutool.json.JSONUtil;
import com.google.common.collect.Lists;
import com.ydm.platform.online.exception.PlatformException;
import com.ydm.platform.sdk.amazon.AmazonSdk;
import com.ydm.spapi.ApiException;
import com.ydm.spapi.model.reports.CreateReportResponse;
import com.ydm.spapi.model.reports.CreateReportSpecification;
import com.ydm.spapi.model.sellers.GetMarketplaceParticipationsResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author myseital
 * @date 2022/9/15
 */
public class AmazonTest {

    private AmazonSdk sdk;

    private String region = "us-east-1";
    private String refreshToken = "Atzr|IwEBIE-J47mgt3FuPLLB_eIIRg4usKZG-vLJHw46KcSv2p0HOVi33YhIsl7BSj4UvmwPNeWVHwE5MhTnr1kqD4K4BzQ-Nd2EI9vjlNxmko6KFJLdqouHTzyOJ3FubFWayXGrf01owLwURxAH_D1_GhfUMOF2TjpgaHTFZluYKg1Mqvzu_yzNFr3VUTR2xsUBDDBe0yoUwxX6KxCimvWkUAIbL0NGD16DUVfPm1C2_kr96hanJpR5UNn745lgjhZ4f9OsuBp3Auu_e-twNG17aUI15WKXDhtcdT7_f4FAA6OeZmW7waln3JnpeWUg-RuKaJzoZpQ";
    private String endPoint = "https://sellingpartnerapi-na.amazon.com";

    @Before
    public void init() {
        sdk = new AmazonSdk(region, refreshToken);
    }

    @Test
    public void getMarketplaceTest() throws ApiException {
        GetMarketplaceParticipationsResponse reportResponse = sdk.getSellersApi(endPoint).getMarketplaceParticipations();
        System.out.println(JSONUtil.toJsonStr(reportResponse));
    }

    @Test
    public void getReportsTest() throws ApiException {
        CreateReportSpecification body = new CreateReportSpecification();
        body.setReportType("GET_MERCHANT_LISTINGS_DATA");
        List<String> marketplaceIds = Lists.newArrayList("ATVPDKIKX0DER");
        body.setMarketplaceIds(marketplaceIds);
        CreateReportResponse reportResponse = sdk.getReportsApi(endPoint).createReport(body);
        System.out.println(JSONUtil.toJsonStr(reportResponse));
    }
}
