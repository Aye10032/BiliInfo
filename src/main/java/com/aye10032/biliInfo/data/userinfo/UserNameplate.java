package com.aye10032.biliInfo.data.userinfo;

import com.aye10032.biliInfo.util.ImgUtils;

import java.awt.*;

/**
 * @program: biliinfo
 * @description: 佩戴勋章信息
 * @author: Aye10032
 * @create: 2021-01-12 18:02
 **/
public class UserNameplate {

    private int nid;
    private String name;
    private String image;
    private String image_small;
    private String level;
    private String condition;

    public UserNameplate() {

    }

    /**
     * @return 勋章ID
     */
    public int getNid() {
        return nid;
    }

    /**
     * @return 勋章名称
     */
    public String getName() {
        return name;
    }

    /**
     * @return 勋章图像URL
     */
    public String getImage_URL() {
        return image;
    }

    /**
     * @return 勋章图像
     */
    public Image getImage() {
        return ImgUtils.getImage(getImage_URL());
    }

    /**
     * @return 勋章预览图URL
     */
    public String getImage_small_URL() {
        return image_small;
    }

    /**
     * @return 勋章预览图像
     */
    public Image getImage_small(){
        return ImgUtils.getImage(getImage_small_URL());
    }

    /**
     * @return 勋章等级
     */
    public String getLevel() {
        return level;
    }

    /**
     * @return 勋章解锁条件描述
     */
    public String getCondition() {
        return condition;
    }
}
