package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 视频属性信息
 * @author: Aye10032
 * @create: 2021-01-05 17:31
 **/
public class VideoRights {
    private final int bp;
    private final int elec;
    private final int download;
    private final int movie;
    private final int pay;
    private final int hd5;
    private final int no_reprint;
    private final int autoplay;
    private final int ugc_pay;
    private final int is_cooperation;
    private final int ugc_pay_preview;
    private final int no_background;
    private final int clean_mode;
    private final int is_stein_gate;

    public VideoRights(JsonObject rights) {
        this.bp = rights.get("pb").getAsInt();
        this.elec = rights.get("elec").getAsInt();
        this.download = rights.get("download").getAsInt();
        this.movie = rights.get("movie").getAsInt();
        this.pay = rights.get("pay").getAsInt();
        this.hd5 = rights.get("hd5").getAsInt();
        this.no_reprint = rights.get("no_reprint").getAsInt();
        this.autoplay = rights.get("autoplay").getAsInt();
        this.ugc_pay = rights.get("ugc_pay").getAsInt();
        this.is_cooperation = rights.get("is_cooperation").getAsInt();
        this.ugc_pay_preview = rights.get("ugc_pay_preview").getAsInt();
        this.no_background = rights.get("no_background").getAsInt();
        this.clean_mode = rights.get("clean_mode").getAsInt();
        this.is_stein_gate = rights.get("is_stein_gate").getAsInt();
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
