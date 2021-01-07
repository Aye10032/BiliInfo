package com.aye10032.biliutil.data.videoinfo.staff;

/**
 * @program: biliInfo
 * @description: 官方认证信息
 * @author: Aye10032
 * @create: 2021-01-07 19:15
 **/
public class StaffOfficial {
    private int role;
    private String title;
    private String desc;
    private int type;

    public StaffOfficial(){

    }

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
