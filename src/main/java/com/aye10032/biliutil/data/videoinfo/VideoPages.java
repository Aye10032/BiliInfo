package com.aye10032.biliutil.data.videoinfo;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import java.util.ArrayList;

/**
 * @program: biliutil
 * @description: 分P列表
 * @author: Aye10032
 * @create: 2021-01-07 14:31
 **/
public class VideoPages{

    private final ArrayList<PageData> videoPages = new ArrayList<>();

    public VideoPages(JsonArray videoPages){
        for (JsonElement element : videoPages) {
            try {
                this.videoPages.add(new PageData(element.getAsJsonObject()));
            }catch (IllegalStateException e){
                e.printStackTrace();
            }

        }
    }

    public ArrayList<PageData> getPageList() {
        return videoPages;
    }

    public int getPartNum(){
        return getPageList().size();
    }
}
