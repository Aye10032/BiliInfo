package com.aye10032.biliutil.data.videoinfo;

import com.aye10032.biliutil.util.ImgUtils;
import com.aye10032.biliutil.util.Util;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: biliutil
 * @description: 存储视频信息
 * @author: Aye10032
 * @create: 2021-01-05 10:28
 **/
public class VideoData {
    private String bvid;
    private long aid;
    private int videos;
    private int tid;
    private String tname;
    private int copyright;

    @SerializedName("pic")
    private String pic_url;

    private String title;
    private long pubdate;
    private long ctime;
    private String desc;
    private int state;
    private int duration;
    private int mission_id;

    @SerializedName("rights")
    private VideoRights videoRights;

    @SerializedName("owner")
    private VideoOwner videoOwner;

    @SerializedName("stat")
    private VideoStat videoStat;

    private String dynamic;
    private long cid;

    @SerializedName("dimension")
    private VideoDimension videoDimension;

    private boolean no_cache;

    @SerializedName("pages")
    private List<VideoPage> videoPages;

    @SerializedName("subtitle")
    private VideoSubtitle videoSubtitle;

    public VideoData(JsonObject body_json) {

    }

    /**
     * @return BV号
     */
    public String getBvid() {
        return bvid;
    }

    /**
     * @return AV号
     */
    public long getAid() {
        return aid;
    }

    /**
     * @return 视频分P数
     */
    public int getVideos() {
        return videos;
    }

    /**
     * @return 分区
     */
    public int getTid() {
        return tid;
    }

    /**
     * @return 子分区
     */
    public String getTname() {
        return tname;
    }

    /**
     * @return 转载\自制
     */
    public int getCopyright() {
        return copyright;
    }

    /**
     * @return 封面URL
     */
    public String getPic_url() {
        return pic_url;
    }

    /**
     * @return 封面image对象
     */
    public Image getPic() {
        return ImgUtils.getImage(getPic_url());
    }

    /**
     * @return 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return 发布日期的时间戳
     */
    public long getPubdate() {
        return pubdate;
    }

    /**
     * @return 发布日期
     */
    public Date getPub_date() {
        return Util.long2date(getPubdate());
    }

    /**
     * @return 上传日期的时间戳
     */
    public long getCtime() {
        return ctime;
    }

    /**
     * @return 上传日期
     */
    public Date getCtime_date() {
        return Util.long2date(getCtime());
    }

    /**
     * @return 简介
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @return 视频状态
     * 0：开放浏览
     * 1：橙色通过
     * -1：待审
     * -2：被打回
     * -3：网警锁定
     * -4：被锁定
     * -5：管理员锁定（可浏览）
     * -6：修复待审
     * -7：暂缓审核
     * -8：补档待审
     * -9：等待转码
     * -10：延迟审核
     * -11：视频源待修
     * -12：转储失败
     * -13：允许评论待审
     * -14：临时回收站
     * -15：分发中
     * -16：转码失败
     * -20：创建未提交
     * -30：创建已提交
     * -40：定时发布
     * -100：用户删除
     */
    public int getState() {
        return state;
    }

    /**
     * @return 稿件总时长（秒）
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @return 参与的活动ID
     */
    public int getMission_id() {
        return mission_id;
    }

    /**
     * @return 视频的具体属性信息
     */
    public VideoRights getVideoRights() {
        return videoRights;
    }

    /**
     * @return UP主信息
     */
    public VideoOwner getVideoOwner() {
        return videoOwner;
    }

    /**
     * @return 视频数据信息
     */
    public VideoStat getVideoStat() {
        return videoStat;
    }

    /**
     * @return 视频发布时的动态所配文字
     */
    public String getDynamic() {
        return dynamic;
    }

    /**
     * @return 1P的CID
     */
    public long getCid() {
        return cid;
    }

    /**
     * @return 视频分辨率信息
     */
    public VideoDimension getVideoDimension() {
        return videoDimension;
    }

    public boolean isNo_cache() {
        return no_cache;
    }

    /**
     * @return 视频分P信息
     */
    public List<VideoPage> getVideoPages() {
        return videoPages;
    }
}
