package com.aye10032.biliInfo.data.userinfo.vip;

import com.google.gson.annotations.SerializedName;

/**
 * @program: biliinfo
 * @description: 大会员信息
 * @author: Aye10032
 * @create: 2021-01-07 22:56
 **/
public class UserVip {
    private int type;
    private int status;
    private int theme_type;

    @SerializedName("label")
    private VipLabel vipLabel;

    private int avatar_subscript;
    private String nickname_color;

    public UserVip(){

    }

    /**
     * @return 会员类型
     * 0：无
     * 1：月大会员
     * 2：年度及以上大会员
     */
    public int getType() {
        return type;
    }

    /**
     * @return 会员状态
     * 0：无
     * 1：有
     */
    public int getStatus() {
        return status;
    }


    public int getTheme_type() {
        return theme_type;
    }

    /**
     * @return 标签属性
     */
    public VipLabel getVipLabel() {
        return vipLabel;
    }

    /**
     * @return 是否显示大会员标志
     * 0：不显示
     * 1：显示
     */
    public int getAvatar_subscript() {
        return avatar_subscript;
    }

    /**
     * @return 大会员昵称颜色代码
     */
    public String getNickname_color() {
        return nickname_color;
    }
}
