package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonObject;

/**
 * @program: biliutil
 * @description: 视频分辨率类
 * @author: Aye10032
 * @create: 2021-01-07 12:47
 **/
public class VideoDimension {
    private final int width;
    private final int height;
    private final int rotate;

    public VideoDimension(JsonObject dimension) {
        this.width = dimension.get("width").getAsInt();
        this.height = dimension.get("height").getAsInt();
        this.rotate = dimension.get("rotate").getAsInt();
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
