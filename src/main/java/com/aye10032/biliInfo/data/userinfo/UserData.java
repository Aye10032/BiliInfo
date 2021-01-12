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
}
