package com.thomasmaffia.wow.bnet.api.request;

import com.thomasmaffia.wow.bnet.api.objects.ApiType;
import com.thomasmaffia.wow.bnet.api.objects.Region;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class BnetRequest {

    private final Region region;
    private final ApiType apiType;

    private Map<String, String> pathParams = new HashMap<>();
    private Map<String, String> queryParams = new HashMap<>();

    public BnetRequest(Region region, Locale locale, String apiKey, ApiType apiType,
                       Map<String, String> pathParams, Map<String, String> queryParams) {
        this.region = region;
        this.apiType = apiType;
        this.queryParams.put("locale", locale.toString());
        this.queryParams.put("apikey", apiKey);
    }

    public Region getRegion() {
        return region;
    }

    public ApiType getApiType() {
        return apiType;
    }

    public Map<String, String> getPathParams() {
        return pathParams;
    }

    public Map<String, String> getQueryParams() {
        return queryParams;
    }

    public String buildRequest() {
        StringBuilder builder = new StringBuilder(region.getUrl());
        builder.append("/").append(apiType);

        pathParams.forEach((k, v) -> builder.append("/").append(v));

        builder.append("?");
        queryParams.forEach((k, v) -> builder.append(k).append("=").append(v).append("&"));
        return builder.toString();
    }
}
