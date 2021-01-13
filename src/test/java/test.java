import com.aye10032.biliInfo.UserInfo;
import com.aye10032.biliInfo.VideoInfo;
import org.junit.Test;

import java.text.SimpleDateFormat;

public class test {

    @Test
    public void test() {
        UserInfo userInfo = new UserInfo(40077740L);
        System.out.println(userInfo.getUserData().getBirthday());
//        VideoInfo videoInfo = new VideoInfo("BV1fa4y1H7Gz");
//
//        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//        System.out.println(ft.format(videoInfo.getVideoData().getPub_date()));
//        System.out.println(videoInfo.getVideoData().getDesc());
//        System.out.println(videoInfo.getVideoData().getVideoPages().get(0).getDimension().getHeight());

    }

}
