package com.aye10032.biliutil;

import com.aye10032.biliutil.data.URL;
import com.google.gson.JsonObject;
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

    public UserInfo(long mid){
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
        try {
            Response response = client.newCall(request).execute();
            System.out.println(Objects.requireNonNull(response.body()).string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param cookie 可传入cookie（但是似乎没必要）
     */
    public UserInfo(String mid, String cookie){
        OkHttpClient client = new OkHttpClient().newBuilder()
                .build();

        url = new StringBuilder();
        url.append(URL.url_user_space)
                .append("?")
                .append("mid=")
                .append(mid);

        Request request = new Request.Builder()
                .url("http://api.bilibili.com/x/space/acc/info?mid=40077740")
                .method("GET", null)
                .addHeader("Cookie", cookie)
                .build();
        try {
            Response response = client.newCall(request).execute();
            System.out.println(Objects.requireNonNull(response.body()).string());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
