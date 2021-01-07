package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 视频数据信息类
 * @author: Aye10032
 * @create: 2021-01-07 12:20
 **/
public class VideoStat {
    private long aid;
    private int view;
    private int danmaku;
    private int reply;
    private int favorite;
    private int coin;
    private int share;
    private int now_rank;
    private int his_rank;
    private int like;
    private int dislike;
    private String evaluation;
    private String argue_msg;

    public VideoStat(JsonObject stat) {

    }

    /**
     * @return AV号
     */
    public long getAid() {
        return aid;
    }

    /**
     * @return 播放数
     */
    public int getView() {
        return view;
    }

    /**
     * @return 弹幕数
     */
    public int getDanmaku() {
        return danmaku;
    }

    /**
     * @return 评论数
     */
    public int getReply() {
        return reply;
    }

    /**
     * @return 收藏数
     */
    public int getFavorite() {
        return favorite;
    }

    /**
     * @return 投币数
     */
    public int getCoin() {
        return coin;
    }

    /**
     * @return 分享数
     */
    public int getShare() {
        return share;
    }

    /**
     * @return 当前排名
     */
    public int getNow_rank() {
        return now_rank;
    }

    /**
     * @return 历史最高排名
     */
    public int getHis_rank() {
        return his_rank;
    }

    /**
     * @return 点赞数
     */
    public int getLike() {
        return like;
    }

    /**
     * @return 点踩数
     */
    public int getDislike() {
        return dislike;
    }

    /**
     * @return 视频评分
     */
    public String getEvaluation() {
        return evaluation;
    }

    public String getArgue_msg() {
        return argue_msg;
    }
}
