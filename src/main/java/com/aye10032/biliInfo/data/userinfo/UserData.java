package com.aye10032.biliInfo.data.userinfo;

import com.aye10032.biliInfo.data.userinfo.vip.UserVip;
import com.aye10032.biliInfo.util.ImgUtils;
import com.google.gson.annotations.SerializedName;

import java.awt.*;

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

    /**
     * @return UID
     */
    public long getMid() {
        return mid;
    }

    /**
     * @return 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * @return 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * @return 头像URL
     */
    public String getFace_url() {
        return face;
    }

    /**
     * @return 头像Image对象
     */
    public Image getFace() {
        return ImgUtils.getImage(getFace_url());
    }

    /**
     * @return 个性签名
     */
    public String getSign() {
        return sign;
    }

    public int getRank() {
        return rank;
    }

    /**
     * @return 等级
     */
    public int getLevel() {
        return level;
    }

    public int getJoin_time() {
        return join_time;
    }

    public int getMoral() {
        return moral;
    }

    /**
     * @return 封禁状态
     * 0：正常
     * 1：被封
     */
    public int getSilence() {
        return silence;
    }

    /**
     * @return 生日 格式：MM-DD
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 需要cookie
     * @return 硬币数量
     */
    public int getCoins() {
        return coins;
    }

    /**
     * @return 是否具有粉丝勋章
     */
    public boolean isFans_badge() {
        return fans_badge;
    }

    /**
     * @return 认证信息
     */
    public UserOfficial getUser_official() {
        return user_official;
    }

    /**
     * @return 大会员信息
     */
    public UserVip getUser_vip() {
        return user_vip;
    }

    /**
     * @return 头像框信息
     */
    public UserPendant getUser_pendant() {
        return user_pendant;
    }

    /**
     * @return 佩戴勋章信息
     */
    public UserNameplate getUser_nameplate() {
        return user_nameplate;
    }

    /**
     * 需要cookie
     * @return 是否已关注此人
     */
    public boolean isIs_followed() {
        return is_followed;
    }

    /**
     * @return 	主页头图链接
     */
    public String getTop_photo_url() {
        return top_photo;
    }

    /**
     * @return 	主页头图Image对象
     */
    public Image getTop_photo() {
        return ImgUtils.getImage(getTop_photo_url());
    }

    public UserTheme getUser_theme() {
        return user_theme;
    }

    public SysNotice getSys_notice() {
        return sys_notice;
    }

    /**
     * @return 直播间信息
     */
    public UserLiveroom getUser_liveroom() {
        return user_liveroom;
    }
}
