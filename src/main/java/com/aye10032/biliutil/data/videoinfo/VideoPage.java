package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 分P信息
 * @author: Aye10032
 * @create: 2021-01-07 14:28
 **/
public class VideoPage {
    private long cid;
    private int page;
    private String from;
    private String part;
    private int duration;
    private String vid;
    private String weblink;
    private VideoDimension dimension;

    public VideoPage(JsonObject page) {

    }

    /**
     * @return 当前分P CID
     */
    public long getCid() {
        return cid;
    }

    /**
     * @return 当前分P
     */
    public int getPage() {
        return page;
    }

    /**
     * @return 视频来源
     */
    public String getFrom() {
        return from;
    }

    /**
     * @return 分P标题
     */
    public String getPart() {
        return part;
    }

    /**
     * @return 当前part时长
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @return 站外播放VID
     */
    public String getVid() {
        return vid;
    }

    /**
     * @return 站外跳转URL
     */
    public String getWeblink() {
        return weblink;
    }

    /**
     * @return 当前part分辨率
     */
    public VideoDimension getDimension() {
        return dimension;
    }
}
