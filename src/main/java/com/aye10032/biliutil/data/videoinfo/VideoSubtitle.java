package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: biliutil
 * @description: 外挂字幕信息
 * @author: Aye10032
 * @create: 2021-01-07 15:21
 **/
public class VideoSubtitle {
    private final boolean allow_submit;
    private final List<SubtitleData> list = new ArrayList<>();

    public VideoSubtitle(JsonObject subtitle) {
        this.allow_submit = subtitle.get("allow_submit").getAsBoolean();
        for (JsonElement element:subtitle.getAsJsonArray("list")){
            list.add(new SubtitleData(element.getAsJsonObject()));
        }
    }

    /**
     * @return 是否允许外挂字幕
     */
    public boolean isAllow_submit() {
        return allow_submit;
    }

    /**
     * @return 外挂字幕列表
     */
    public List<SubtitleData> getList() {
        return list;
    }

    /**
     * @return 外挂字幕数量
     */
    public int getSubtitlesNum(){
        return getList().size();
    }
}
