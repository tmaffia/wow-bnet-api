package com.thomasmaffia.wow.bnet.api.objects;

public enum ApiType {
    CHARACTER("character"),
    GUILD("guild");

    private final String apiPath;

    ApiType(String apiPath) {
        this.apiPath = apiPath;
    }

    public String getApiPath() {
        return apiPath;
    }
}
