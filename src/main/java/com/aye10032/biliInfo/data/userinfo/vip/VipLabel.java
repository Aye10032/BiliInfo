package com.aye10032.biliInfo.data.userinfo.vip;

/**
 * @program: biliinfo
 * @description: 大会员标签信息
 * @author: Aye10032
 * @create: 2021-01-07 23:00
 **/
public class VipLabel {
    private String path;
    private String text;
    private String label_theme;

    public VipLabel(){}

    public String getPath() {
        return path;
    }

    /**
     * @return 会员名称
     */
    public String getText() {
        return text;
    }

    /**
     * @return 大会员类型
     * vip：大会员
     * annual_vip：年度大会员
     * ten_annual_vip：十年大会员
     * hundred_annual_vip：百年大会员
     */
    public String getLabel_theme() {
        return label_theme;
    }
}
