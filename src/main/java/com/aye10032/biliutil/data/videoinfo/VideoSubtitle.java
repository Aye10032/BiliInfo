package com.aye10032.biliutil.data.videoinfo;

import com.aye10032.biliutil.data.videoinfo.subtitle.SubtitleData;
import com.google.gson.JsonObject;

import java.util.List;

/**
 * @program: biliutil
 * @description: 外挂字幕信息
 * @author: Aye10032
 * @create: 2021-01-07 15:21
 **/
public class VideoSubtitle {
    private boolean allow_submit;
    private List<SubtitleData> list;

    public VideoSubtitle(JsonObject subtitle) {

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
    public int getSubtitlesNum() {
        return getList().size();
    }
}
