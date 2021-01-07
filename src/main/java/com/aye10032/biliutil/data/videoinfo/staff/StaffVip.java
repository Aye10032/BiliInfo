package com.aye10032.biliutil.data.videoinfo.staff;

/**
 * @program: biliInfo
 * @description: 大会员信息
 * @author: Aye10032
 * @create: 2021-01-07 19:06
 **/
public class StaffVip {
    private int type;
    private int status;
    private int vip_pay_type;
    private int theme_type;

    public StaffVip(){

    }

    /**
     * @return 大会员类型
     * 0：无
     * 1：月度大会员
     * 2：年度大会员
     */
    public int getType() {
        return type;
    }

    /**
     * @return 大会员状态
     * 0：无
     * 1：有
     */
    public int getStatus() {
        return status;
    }

    public int getVip_pay_type() {
        return vip_pay_type;
    }

    public int getTheme_type() {
        return theme_type;
    }
}
