package com.aye10032.biliInfo.data.videoinfo.staff;

import com.aye10032.biliInfo.util.ImgUtils;
import com.google.gson.annotations.SerializedName;

import java.awt.*;

/**
 * @program: biliInfo
 * @description: 合作视频作者信息
 * @author: Aye10032
 * @create: 2021-01-07 18:53
 **/
public class VideoStaff {
    private long mid;
    private String title;
    private String name;
    private String face;

    @SerializedName("vip")
    private StaffVip staffVip;

    @SerializedName("official")
    private StaffOfficial staffOfficial;

    private int follower;
    private int label_style;

    public VideoStaff(){

    }

    /**
     * @return 成员UID
     */
    public long getMid() {
        return mid;
    }

    /**
     * @return 成员合作身份
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return 成员昵称
     */
    public String getName() {
        return name;
    }

    /**
     * @return 成员头像url
     */
    public String getFace() {
        return face;
    }

    /**
     * @return 成员头像image对象
     */
    public Image getFaceImage(){
        return ImgUtils.getImage(getFace());
    }

    /**
     * @return 成员大会员状态
     */
    public StaffVip getStaffVip() {
        return staffVip;
    }

    /**
     * @return 成员认证信息
     */
    public StaffOfficial getStaffOfficial() {
        return staffOfficial;
    }

    /**
     * @return 成员粉丝数
     */
    public int getFollower() {
        return follower;
    }

    public int getLabel_style() {
        return label_style;
    }
}
