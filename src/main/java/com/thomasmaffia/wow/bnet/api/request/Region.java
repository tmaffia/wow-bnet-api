package com.thomasmaffia.wow.bnet.api.request;

/**
 * {@link Region} Enum for wow api regions.
 * @author Tom Maffia <ta.maffia@gmail.com>
 *
 */

public enum Region {
    EUROPE("https://eu.api.battle.net/"),
    USA("https://us.api.battle.net/"),
    KOREA("https://kr.api.battle.net/"),
    SOUTH_EAST_ASIA("https://sea.api.battle.net/"),
    TAIWAN("https://tw.api.battle.net/");

    private String url;

    Region(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}