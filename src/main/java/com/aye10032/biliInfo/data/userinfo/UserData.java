package com.aye10032.biliInfo.data.userinfo;

import com.aye10032.biliInfo.data.userinfo.vip.UserVip;
import com.google.gson.annotations.SerializedName;

/**
 * @program: biliinfo
 * @description: 存储用户信息
 * @author: Aye10032
 * @create: 2021-01-05 15:38
 **/
public class UserData {
    private long mid;
    private String name;
    private String sex;
    private String face;
    private String sign;
    private int rank;
    private int level;

    @SerializedName("jointime")
    private int join_time;

    private int moral;
    private int silence;
    private String birthday;
    private int coins;
    private boolean fans_badge;

    @SerializedName("official")
    private UserOfficial user_official;

    @SerializedName("vip")
    private UserVip user_vip;

    @SerializedName("pendant")
    private UserPendant user_pendant;

    @SerializedName("nameplate")
    private UserNameplate user_nameplate;

    private boolean is_followed;
    private String top_photo;

    @SerializedName("theme")
    private UserTheme user_theme;

    private SysNotice sys_notice;

    @SerializedName("live_room")
    private UserLiveroom user_liveroom;

    public UserData(){

    }

    public long getMid() {
        return mid;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getFace() {
        return face;
    }

    public String getSign() {
        return sign;
    }

    public int getRank() {
        return rank;
    }

    public int getLevel() {
        return level;
    }

    public int getJoin_time() {
        return join_time;
    }

    public int getMoral() {
        return moral;
    }

    public int getSilence() {
        return silence;
    }

    public String getBirthday() {
        return birthday;
    }

    public int getCoins() {
        return coins;
    }

    public boolean isFans_badge() {
        return fans_badge;
    }

    public UserOfficial getUser_official() {
        return user_official;
    }

    public UserVip getUser_vip() {
        return user_vip;
    }

    public UserPendant getUser_pendant() {
        return user_pendant;
    }

    public UserNameplate getUser_nameplate() {
        return user_nameplate;
    }

    public boolean isIs_followed() {
        return is_followed;
    }

    public String getTop_photo() {
        return top_photo;
    }

    public UserTheme getUser_theme() {
        return user_theme;
    }

    public SysNotice getSys_notice() {
        return sys_notice;
    }

    public UserLiveroom getUser_liveroom() {
        return user_liveroom;
    }
}
