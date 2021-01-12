package com.aye10032.biliInfo.data.userinfo;

/**
 * @program: biliinfo
 * @description: 认证信息
 * @author: Aye10032
 * @create: 2021-01-07 23:09
 **/
public class UserOfficial {
    private int role;
    private String title;
    private String desc;
    private int type;

    public UserOfficial(){}

    /**
     * @return 认证级别
     * 0：无
     * 1 2：个人认证
     * 3 4 5 6：机构认证
     */
    public int getRole() {
        return role;
    }

    /**
     * @return 认证名
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return 认证备注
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @return 认证类型
     * -1：无
     * 0：有
     */
    public int getType() {
        return type;
    }
}
