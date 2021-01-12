package com.aye10032.biliInfo.data.userinfo;

import com.aye10032.biliInfo.util.ImgUtils;

import java.awt.*;

/**
 * @program: biliinfo
 * @description: 用户直播间信息
 * @author: Aye10032
 * @create: 2021-01-12 18:56
 **/
public class UserLiveroom {

    private int roomStatus;
    private int liveStatus;
    private String url;
    private String title;
    private String cover;
    private int online;
    private long roomid;
    private int roundStatus;
    private int broadcast_type;

    public UserLiveroom() {

    }

    /**
     * @return 直播间状态
     * 0：无房间
     * 1：有房间
     */
    public int getRoomStatus() {
        return roomStatus;
    }

    /**
     * @return 直播状态
     * 0：未开播
     * 1：直播中
     */
    public int getLiveStatus() {
        return liveStatus;
    }

    /**
     * @return 直播间链接
     */
    public String getUrl() {
        return url;
    }

    /**
     * @return 直播间标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return 直播间封面url
     */
    public String getCover() {
        return cover;
    }

    /**
     * @return 直播间封面图片
     */
    public Image getCoverImage() {
        return ImgUtils.getImage(getCover());
    }

    /**
     * @return 直播间人气
     */
    public int getOnline() {
        return online;
    }

    /**
     * @return 直播间ID
     */
    public long getRoomid() {
        return roomid;
    }

    /**
     * @return 轮播状态
     * 0：未轮播
     * 1：轮播
     */
    public int getRoundStatus() {
        return roundStatus;
    }

    public int getBroadcast_type() {
        return broadcast_type;
    }
}
