package com.aye10032.biliInfo;

import com.aye10032.biliInfo.data.InfoType;
import com.aye10032.biliInfo.data.URL;
import com.aye10032.biliInfo.data.liveinfo.LiveData;
import com.aye10032.biliInfo.data.videoinfo.VideoData;
import com.aye10032.biliInfo.util.Util;
import com.google.gson.*;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * @program: biliinfo
 * @description: 直播间信息类
 * @author: Aye10032
 * @create: 2021-01-13 21:06
 **/
public class LiveInfo {

    private final StringBuilder url;
    private JsonObject body_json;

    private int code;
    private String message;
    private LiveData liveData;

    public LiveInfo(long id, int type) {
        url = new StringBuilder();
        url.append(URL.url_live_info)
                .append("?id=");
        if (type == InfoType.USER_ID) {
            url.append(new UserInfo(id).getUserData().getUser_liveroom().getRoomid());
        } else if (type == InfoType.LIVE_ROOM_ID) {
            url.append(id);
        }
        init(url.toString());
    }

    private void init(String url) {
        Gson gson = new Gson();

        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        Request request = new Request.Builder()
                .url(url)
                .method("GET", null)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String body = "";
            if (response.body() != null) {
                body = new String(response.body().bytes());
            }

            JsonElement element = JsonParser.parseString(body);

            if (element.isJsonObject()) {
                this.body_json = element.getAsJsonObject();
                this.code = body_json.get("code").getAsInt();
                this.message = body_json.get("message").getAsString();

                this.liveData = gson.fromJson(body_json.getAsJsonObject("data"), LiveData.class);
            }

        } catch (IOException | JsonSyntaxException | IllegalStateException | ClassCastException e) {
            e.printStackTrace();
        }
    }

    /**
     * @return 返回整个JSON对象
     */
    public JsonObject getBody_json() {
        return body_json;
    }

    /**
     * @return 直播间状态
     * 0：成功
     * 60004：直播间不存在
     */
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    /**
     * @return 返回视频信息类
     */
    public LiveData getLiveData() {
        return liveData;
    }

}
