package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 分P信息
 * @author: Aye10032
 * @create: 2021-01-07 14:28
 **/
public class PageData {
    private final long cid;
    private final int page;
    private final String from;
    private final String part;
    private final int duration;
    private final String vid;
    private final String weblink;
    private final VideoDimension dimension;

    public PageData(JsonObject page) {
        this.cid = page.get("cid").getAsLong();
        this.page = page.get("page").getAsInt();
        this.from = page.get("from").getAsString();
        this.part = page.get("part").getAsString();
        this.duration = page.get("duration").getAsInt();
        this.vid = page.get("vid").getAsString();
        this.weblink = page.get("weblink").getAsString();
        this.dimension = new VideoDimension(page.get("dimension").getAsJsonObject());
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
