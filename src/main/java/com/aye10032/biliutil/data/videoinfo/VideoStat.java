package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 视频数据信息类
 * @author: Aye10032
 * @create: 2021-01-07 12:20
 **/
public class VideoStat {
    private final long aid;
    private final int view;
    private final int danmaku;
    private final int reply;
    private final int favorite;
    private final int coin;
    private final int share;
    private final int now_rank;
    private final int his_rank;
    private final int like;
    private final int dislike;
    private final String evaluation;
    private final String argue_msg;

    public VideoStat(JsonObject stat) {
        this.aid = stat.get("aid").getAsLong();
        this.view = stat.get("view").getAsInt();
        this.danmaku = stat.get("danmaku").getAsInt();
        this.reply = stat.get("reply").getAsInt();
        this.favorite = stat.get("favorite").getAsInt();
        this.coin = stat.get("coin").getAsInt();
        this.share = stat.get("share").getAsInt();
        this.now_rank = stat.get("now_rank").getAsInt();
        this.his_rank = stat.get("his_rank").getAsInt();
        this.like = stat.get("like").getAsInt();
        this.dislike = stat.get("dislike").getAsInt();
        this.evaluation = stat.get("evaluation").getAsString();
        this.argue_msg = stat.get("argue_msg").getAsString();
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
