package com.thomasmaffia.wow.bnet.api.request.wow;

/**
 * {@link WowApiType} is an enum that sets the URL paths for different query types.
 * @author Tom Maffia <ta.maffia@gmail.com>
 *
 */

public enum WowApiType {
    CHARACTER("wow/character"),
    GUILD("wow/guild"),
    BOSS("wow/boss"),
    ITEM("wow/item"),
    ITEMSET("wow/item/set"),
    SPELL("wow/spell");

    private final String apiPath;

    WowApiType(String apiPath) {
        this.apiPath = apiPath;
    }

    protected String getApiPath() {
        return apiPath;
    }
}