package eneity;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;



import java.util.List;

public class Mobile {


    public void getMobile(String phone) {
        // 创建实例化对象
        MobileCodeWS weatherWS = new MobileCodeWS();
        // 通过实例化对象创建接口
        MobileCodeWSSoap weatherWSSoap = weatherWS.getMobileCodeWSSoap();
        // 通过接口传入城市名获取天气信息
        ArrayOfString weather = weatherWSSoap.getDatabaseInfo();
        if (weather != null) {
            // 将获取到的信息转成集合然后遍历
            List<String> weathers = weather.getString();
            for (String s : weathers) {
                String[] s1 = s.split(" ");
                if (s1[2].equals(phone)){
                    System.out.println("查询结果为" + s1[0] + " " + s1[1]);
                }
            }
        }
    }

}

