package com.aye10032.biliInfo.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 视频属性信息
 * @author: Aye10032
 * @create: 2021-01-05 17:31
 **/
public class VideoRights {
    private int bp;
    private int elec;
    private int download;
    private int movie;
    private int pay;
    private int hd5;
    private int no_reprint;
    private int autoplay;
    private int ugc_pay;
    private int is_cooperation;
    private int ugc_pay_preview;
    private int no_background;
    private int clean_mode;
    private int is_stein_gate;

    public VideoRights(JsonObject rights) {

    }

    public int getBp() {
        return bp;
    }

    /**
     * @return 是否支持充电
     */
    public int getElec() {
        return elec;
    }

    /**
     * @return 是否允许下载
     */
    public int getDownload() {
        return download;
    }

    /**
     * @return 是否电影
     */
    public int getMovie() {
        return movie;
    }

    /**
     * @return 是否PGC付费
     */
    public int getPay() {
        return pay;
    }

    /**
     * @return 是否有高码率
     */
    public int getHd5() {
        return hd5;
    }

    /**
     * @return 是否显示“禁止转载“标志
     */
    public int getNo_reprint() {
        return no_reprint;
    }

    /**
     * @return 是否自动播放
     */
    public int getAutoplay() {
        return autoplay;
    }

    /**
     * @return 是否UGC付费
     */
    public int getUgc_pay() {
        return ugc_pay;
    }

    /**
     * @return 是否为联合投稿
     */
    public int getIs_cooperation() {
        return is_cooperation;
    }

    public int getUgc_pay_preview() {
        return ugc_pay_preview;
    }

    public int getNo_background() {
        return no_background;
    }

    public int getClean_mode() {
        return clean_mode;
    }

    public int getIs_stein_gate() {
        return is_stein_gate;
    }
}
