package com.xuexiang.xupdatedemo;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class updatejl {
    public static String loginByGet(String username, String jl1,String jl2,String  jl3,String jl4,String zsd){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatejl?username="
                    + URLEncoder.encode(username,"UTF-8") + "&jl1=" + URLEncoder.encode(jl1,"UTF-8")
                    + "&jl2=" + URLEncoder.encode(jl2,"UTF-8")+ "&jl3=" + URLEncoder.encode(jl3,"UTF-8")
                    + "&jl4=" + URLEncoder.encode(jl4,"UTF-8") + "&zsd=" + URLEncoder.encode(zsd,"UTF-8");
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
