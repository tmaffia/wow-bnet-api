package com.thomasmaffia.wow.bnet.api.objects;

public enum Region {
    EUROPE("https://eu.api.battle.net/wow/"),
    USA("https://us.api.battle.net/wow/"),
    KOREA("https://kr.api.battle.net/wow/"),
    SOUTH_EAST_ASIA("https://sea.api.battle.net/wow/"),
    TAIWAN("https://tw.api.battle.net/wow/");

    private String url;

    Region(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
