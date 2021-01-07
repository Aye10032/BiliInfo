package com.aye10032.biliInfo.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 视频分辨率类
 * @author: Aye10032
 * @create: 2021-01-07 12:47
 **/
public class VideoDimension {
    private int width;
    private int height;
    private int rotate;

    public VideoDimension(JsonObject dimension) {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    /**
     * @return 视频方向
     */
    public int getRotate() {
        return rotate;
    }
}
