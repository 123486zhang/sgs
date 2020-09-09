package com.xuexiang.xupdatedemo;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

public class updatewj {
    public static String loginByGetwj1(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj1?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj1=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj2(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj2?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj2=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj3(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj3?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj3=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj4(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj4?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj4=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj5(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj5?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj5=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj6(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj6?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj6=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj7(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj7?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj7=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj8(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj8?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj8=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj9(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/updatewj9?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj9=" + URLEncoder.encode(wj1,"UTF-8");
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

    public static String loginByGetwj11(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update11?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj11=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj12(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update12?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj12=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj13(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update13?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj13=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj14(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update14?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj14=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj15(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update15?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj15=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj16(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update16?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj16=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj17(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update17?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj17=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj18(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update18?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj18=" + URLEncoder.encode(wj1,"UTF-8");
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

    public static String loginByGetwj19(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update19?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj19=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj20(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update20?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj20=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj21(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update21?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj21=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj22(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update22?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj22=" + URLEncoder.encode(wj1,"UTF-8");
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

    public static String loginByGetwj23(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update23?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj23=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj24(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update24?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj24=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj25(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update25?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj25=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj26(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update26?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj26=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj10(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/update10?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj27(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u27?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj28(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u28?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj29(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u29?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj30(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u30?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj31(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u31?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj32(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u32?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj33(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u33?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj34(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u34?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj35(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u35?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj36(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u36?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj37(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u37?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj38(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u38?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj39(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u39?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj40(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u40?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj41(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u41?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj42(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u42?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj43(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u43?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj44(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u44?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj45(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u45?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj46(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u46?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj47(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u47?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj48(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u48?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj49(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u49?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj50(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u50?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj51(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u51?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj52(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u52?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
    public static String loginByGetwj53(String username, String wj1){
        try {
            //提交数据到服务器
            //拼装路径
            String path = "http://49.234.95.95:8080/Demo/u53?username="
                    + URLEncoder.encode(username,"UTF-8") + "&wj10=" + URLEncoder.encode(wj1,"UTF-8");
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
