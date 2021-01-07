package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 字幕信息类
 * @author: Aye10032
 * @create: 2021-01-07 15:24
 **/
public class SubtitleData {
    private final long id;
    private final String lan;
    private final String lan_doc;
    private final boolean is_lock;
    private final String subtitle_url;
    private final SubtitleAuthor[] author;

    public SubtitleData(JsonObject subtitle) {
        Gson gson = new Gson();
        this.id = subtitle.get("id").getAsLong();
        this.lan = subtitle.get("lan").getAsString();
        this.lan_doc = subtitle.get("lan_doc").getAsString();
        this.is_lock = subtitle.get("is_lock").getAsBoolean();
        this.subtitle_url = subtitle.get("subtitle_url").getAsString();

        this.author = gson.fromJson(subtitle.getAsJsonObject("author"), SubtitleAuthor[].class);
    }

    /**
     * @return 字幕ID
     */
    public long getId() {
        return id;
    }

    /**
     * @return 字幕语言
     */
    public String getLan() {
        return lan;
    }

    /**
     * @return
     */
    public String getLan_doc() {
        return lan_doc;
    }

    public boolean isIs_lock() {
        return is_lock;
    }

    public String getSubtitle_url() {
        return subtitle_url;
    }

    public SubtitleAuthor getAuthor() {
        return author;
    }
}
