package com.xuexiang.xupdatedemo;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class querryhead {
    public static String loginByGet(String username){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/querryhead?username="
                    + URLEncoder.encode(username,"UTF-8");
            URL url = new URL(path);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();//打开连接

            conn.setRequestMethod("GET");//设置请求方式为get

            conn.setConnectTimeout(4000);//设置连接超时时间为5秒

            int code = conn.getResponseCode();//获得请求码
            if(code == 200){
                InputStream is = conn.getInputStream();
                String text = StreamTools.readInputStream(is);
                return text;
            }else{
                return null;
            }
//            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
