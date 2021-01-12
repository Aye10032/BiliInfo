package com.aye10032.biliInfo.data.userinfo;

/**
 * @program: biliinfo
 * @description: 系统通知
 * @author: Aye10032
 * @create: 2021-01-12 18:49
 **/
public class SysNotice {

    private int id;
    private String content;
    private String url;

    public SysNotice(){

    }

    /**
     * @return 系统提示类型ID
     */
    public int getId() {
        return id;
    }

    /**
     * @return 提示信息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * @return 提示信息链接url
     */
    public String getUrl() {
        return url;
    }
}
