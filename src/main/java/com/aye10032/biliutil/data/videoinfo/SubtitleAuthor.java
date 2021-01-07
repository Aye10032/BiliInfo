package com.aye10032.biliutil.data.videoinfo;

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

    public int getMid() {
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

    public Image getFace_Image() {
        return ImgUtils.getImage(getFace());
    }

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
