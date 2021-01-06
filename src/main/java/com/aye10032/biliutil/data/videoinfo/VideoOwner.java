package com.aye10032.biliutil.data.videoinfo;

import com.aye10032.biliutil.util.ImgUtils;
import com.google.gson.JsonObject;

import java.awt.*;

/**
 * @program: biliutil
 * @description: UP主信息
 * @author: Aye10032
 * @create: 2021-01-06 19:36
 **/
public class VideoOwner {
    private final long mid;
    private final String name;
    private final String face_url;

    public VideoOwner(JsonObject owner) {
        this.mid = owner.get("mid").getAsLong();
        this.name = owner.get("name").getAsString();
        this.face_url = owner.get("face").getAsString();
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
