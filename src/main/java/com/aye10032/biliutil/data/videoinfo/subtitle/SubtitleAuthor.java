package com.aye10032.biliutil.data.videoinfo.subtitle;

import com.aye10032.biliutil.util.ImgUtils;
import com.google.gson.JsonObject;

import java.awt.*;

/**
 * @program: biliutil
 * @description: 字幕上传者信息类
 * @author: Aye10032
 * @create: 2021-01-07 15:33
 **/
public class SubtitleAuthor {
    private int mid;
    private String name;
    private String sex;
    private String face;
    private String sign;
    private long rank;
    private long birthday;
    private int is_fake_account;
    private int is_deleted;

    public SubtitleAuthor() {

    }

    /**
     * @return 字幕上传者UID
     */
    public int getMid() {
        return mid;
    }

    /**
     * @return 字幕上传者昵称
     */
    public String getName() {
        return name;
    }

    /**
     * @return 字幕上传者性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * @return 字幕上传者头像url
     */
    public String getFace() {
        return face;
    }

    /**
     * @return 字幕上传者头像image对象
     */
    public Image getFace_Image() {
        return ImgUtils.getImage(getFace());
    }

    /**
     * @return 字幕上传者签名
     */
    public String getSign() {
        return sign;
    }

    public long getRank() {
        return rank;
    }

    public long getBirthday() {
        return birthday;
    }

    public int getIs_fake_account() {
        return is_fake_account;
    }

    public int getIs_deleted() {
        return is_deleted;
    }
}
