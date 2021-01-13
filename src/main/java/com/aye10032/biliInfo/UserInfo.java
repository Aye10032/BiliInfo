package com.aye10032.biliInfo;

import com.aye10032.biliInfo.data.URL;
import com.aye10032.biliInfo.data.userinfo.UserData;
import com.aye10032.biliInfo.data.videoinfo.VideoData;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

/**
 * @program: biliutil
 * @description: UP主个人空间信息
 * @author: Aye10032
 * @create: 2020-12-23 16:21
 **/
public class UserInfo {

    private final StringBuilder url;
    private JsonObject body_json;

    private int code;
    private String message;
    private int ttl;
    private UserData userData;

    public UserInfo(long mid) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        url = new StringBuilder();
        url.append(URL.url_user_space)
                .append("?")
                .append("mid=")
                .append(mid);

        Request request = new Request.Builder()
                .url(url.toString())
                .method("GET", null)
                .build();
        init(client, request);
    }

    /**
     * @param cookie 可传入cookie（硬币数量等涉及个人信息的需要）
     */
    public UserInfo(String mid, String cookie) {
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        url = new StringBuilder();
        url.append(URL.url_user_space)
                .append("?")
                .append("mid=")
                .append(mid);

        Request request = new Request.Builder()
                .url(url.toString())
                .method("GET", null)
                .addHeader("Cookie", cookie)
                .build();
        init(client, request);
    }

    private void init(OkHttpClient client, Request request) {
        Gson gson = new Gson();
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
                this.ttl = body_json.get("ttl").getAsInt();

                this.userData = gson.fromJson(body_json.getAsJsonObject("data"), UserData.class);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public JsonObject getBody_json() {
        return body_json;
    }

    /**
     * @return 视频状态
     * 0:成功
     * -400：请求错误
     * -403：权限不足
     * -404：无视频
     * 62002：稿件不可见
     */
    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public int getTtl() {
        return ttl;
    }

    /**
     * @return 返回个人信息类
     */
    public UserData getUserData() {
        return userData;
    }
}
