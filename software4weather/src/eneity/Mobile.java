package eneity;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.MobileCodeWS;
import cn.com.webxml.MobileCodeWSSoap;



import java.util.List;

public class Mobile {


    public void getMobile(String phone) {
        // ����ʵ��������
        MobileCodeWS weatherWS = new MobileCodeWS();
        // ͨ��ʵ�������󴴽��ӿ�
        MobileCodeWSSoap weatherWSSoap = weatherWS.getMobileCodeWSSoap();
        // ͨ���ӿڴ����������ȡ������Ϣ
        ArrayOfString weather = weatherWSSoap.getDatabaseInfo();
        if (weather != null) {
            // ����ȡ������Ϣת�ɼ���Ȼ�����
            List<String> weathers = weather.getString();
            for (String s : weathers) {
                String[] s1 = s.split(" ");
                if (s1[2].equals(phone)){
                    System.out.println("��ѯ���Ϊ" + s1[0] + " " + s1[1]);
                }
            }
        }
    }

}

