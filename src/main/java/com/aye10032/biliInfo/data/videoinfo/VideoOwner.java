package com.aye10032.biliInfo.data.videoinfo;

import com.aye10032.biliInfo.util.ImgUtils;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;

import java.awt.*;

/**
 * @program: biliutil
 * @description: UP主信息
 * @author: Aye10032
 * @create: 2021-01-06 19:36
 **/
public class VideoOwner {
    private long mid;
    private String name;

    @SerializedName("face")
    private String face_url;

    public VideoOwner(JsonObject owner) {
    }

    /**
     * @return 作者MID
     */
    public long getMid() {
        return mid;
    }

    /**
     * @return UP主昵称
     */
    public String getName() {
        return name;
    }

    /**
     * @return 头像URL
     */
    public String getFace_url() {
        return face_url;
    }

    /**
     * @return 头像Image对象
     */
    public Image getFace() {
        return ImgUtils.getImage(getFace_url());
    }
}
