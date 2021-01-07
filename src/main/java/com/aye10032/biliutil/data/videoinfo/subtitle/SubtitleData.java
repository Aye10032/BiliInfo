package com.aye10032.biliutil.data.videoinfo.subtitle;

import com.google.gson.JsonObject;

import java.util.List;

/**
 * @program: biliutil
 * @description: 字幕信息类
 * @author: Aye10032
 * @create: 2021-01-07 15:24
 **/
public class SubtitleData {
    private long id;
    private String lan;
    private String lan_doc;
    private boolean is_lock;
    private String subtitle_url;
    private List<SubtitleAuthor> author;

    public SubtitleData(JsonObject subtitle) {

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

    public List<SubtitleAuthor> getAuthor() {
        return author;
    }
}
