package com.aye10032.biliInfo.data.liveinfo;

import com.aye10032.biliInfo.util.Util;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @program: biliinfo
 * @description: 直播间信息
 * @author: Aye10032
 * @create: 2021-01-13 21:27
 **/
public class LiveData {
    private long room_id;
    private long short_id;
    private long uid;
    private int need_p2p;
    private boolean is_hidden;
    private boolean is_locked;
    private boolean is_portrait;
    private int live_status;
    private long hidden_till;
    private long lock_till;
    private boolean encrypted;
    private boolean pwd_verified;
    private long live_time;
    private int room_shield;
    private int is_sp;
    private int special_type;

    public LiveData(){}

    /**
     * @return 直播间实际房间号
     */
    public long getRoom_id() {
        return room_id;
    }

    /**
     * @return 短ID
     */
    public long getShort_id() {
        return short_id;
    }

    /**
     * @return 主播UID
     */
    public long getUid() {
        return uid;
    }

    /**
     * @return 是否需要P2P
     */
    public int getNeed_p2p() {
        return need_p2p;
    }

    /**
     * @return 直播间是否隐藏
     */
    public boolean is_hidden() {
        return is_hidden;
    }

    /**
     * @return 直播间是否被锁定
     */
    public boolean is_locked() {
        return is_locked;
    }

    /**
     * @return 是否为竖屏直播
     */
    public boolean is_portrait() {
        return is_portrait;
    }

    /**
     * @return 直播状态
     * 0：未开播
     * 1：直播中
     * 2：轮播中
     */
    public int getLive_status() {
        return live_status;
    }

    /**
     * @return 隐藏时间戳
     */
    public long getHidden_till() {
        return hidden_till;
    }

    /**
     * @return 隐藏时间
     */
    public Date getHidden_date(){
        return Util.long2date(getHidden_till());
    }

    /**
     * @return 锁定时间戳
     */
    public long getLock_till() {
        return lock_till;
    }

    /**
     * @return 锁定时间
     */
    public Date getLock_date(){
        return Util.long2date(getLock_till());
    }

    /**
     * @return 是否加密
     */
    public boolean isEncrypted() {
        return encrypted;
    }

    /**
     * encrypted=true时才有意义
     * @return 是否通过密码验证
     */
    public boolean isPwd_verified() {
        return pwd_verified;
    }

    /**
     * @return 开播时间戳
     */
    public long getLive_time() {
        return live_time;
    }

    /**
     * @return 开播时间
     */
    public Date getLive_time_date(){
        return Util.long2date(getLive_time());
    }

    public int getRoom_shield() {
        return room_shield;
    }

    /**
     * @return 是否为特殊直播间
     * 0：普通直播间
     * 1：付费直播间
     */
    public int getIs_sp() {
        return is_sp;
    }

    /**
     * @return 特殊直播间类型
     * 0：普通直播间
     * 1：付费直播间
     * 2：拜年祭直播间
     */
    public int getSpecial_type() {
        return special_type;
    }
}
