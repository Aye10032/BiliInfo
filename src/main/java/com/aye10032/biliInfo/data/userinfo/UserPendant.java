package com.aye10032.biliInfo.data.userinfo;

import com.aye10032.biliInfo.util.ImgUtils;
import com.google.gson.annotations.SerializedName;

import java.awt.*;

/**
 * @program: biliinfo
 * @description: 头像框信息
 * @author: Aye10032
 * @create: 2021-01-12 17:42
 **/
public class UserPendant {
    private int pid;
    private String name;

    @SerializedName("image")
    private String image_url;

    private int expire;

    @SerializedName("image_enhance")
    private String image_enhance_url;

    private String image_enhance_frame;

    public UserPendant(){}

    /**
     * @return 头像框ID
     */
    public int getPid() {
        return pid;
    }

    /**
     * @return 头像框名称
     */
    public String getName() {
        return name;
    }

    /**
     * @return 头像框图像URL
     */
    public String getImage_url() {
        return image_url;
    }

    /**
     * @return 头像框图像
     */
    public Image getImage(){
        return ImgUtils.getImage(getImage_url());
    }

    public int getExpire() {
        return expire;
    }

    /**
     * @return 头像框高清资源URL
     */
    public String getImage_enhance_url() {
        return image_enhance_url;
    }

    /**
     * @return 头像框高清图像
     */
    public Image getImage_enhance(){
        return ImgUtils.getImage(getImage_enhance_url());
    }

    public String getImage_enhance_frame() {
        return image_enhance_frame;
    }
}
