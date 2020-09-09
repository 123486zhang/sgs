package com.xuexiang.xupdatedemo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.sgs10th.simulator.main;
import com.xuexiang.xupdate.XUpdate;
import com.xuexiang.xupdatedemo.custom.CustomUpdateParser;
import com.xuexiang.xupdatedemo.utils.NotifyUtils;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class login  extends Activity implements View.OnClickListener {
    public Button btn1,btn2,btn3;
    public EditText text1,text2,text3;
    public ImageView imageView;
    private Bitmap bitmap;
    private String code;
    private long mExitTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
        text3 = (EditText) findViewById(R.id.text3);
        imageView = (ImageView) findViewById(R.id.image);
        imageView.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        bitmap = CodeUtils.getInstance().createBitmap();
        //获取当前图片验证码的对应内容用于校验
        code = CodeUtils.getInstance().getCode();
        imageView.setImageBitmap(bitmap);
        new Thread(() -> {
            try {
                getVersion();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }).start();
        if (!NotifyUtils.isNotifyPermissionOpen(this)) {
            new AlertDialog.Builder(this)
                    .setCancelable(false)
                    .setMessage("通知权限未打开，是否前去打开？")
                    .setPositiveButton("是", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface d, int w) {
                            NotifyUtils.openNotifyPermissionSetting(login.this);
                        }
                    })
                    .setNegativeButton("否", null)
                    .show();
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {

            exit();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                if(isNetworkConnected(this)) {
                    new Thread(() -> {
                        String username = text1.getText().toString();
                        String password = text2.getText().toString();
                        // final String response = LoginService.loginByGet(username,password);
                        final String response = LoginService.loginByPost(username, password);

                        runOnUiThread(() -> {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                String userNname = jsonObject.getString("用户名");
                                String dlzt = jsonObject.getString("登录状态");
                                if (response != null) {
                                    if(text1.getText().toString().equals("")) {
                                        Toast.makeText(login.this, "用户名不能为空！", Toast.LENGTH_SHORT).show();
                                        bitmap = CodeUtils.getInstance().createBitmap();
                                        //获取当前图片验证码的对应内容用于校验
                                        code = CodeUtils.getInstance().getCode();
                                        imageView.setImageBitmap(bitmap);
                                    }
                                    else {
                                        if (text2.getText().toString().equals("")) {
                                            Toast.makeText(login.this, "密码不能为空！", Toast.LENGTH_SHORT).show();
                                            bitmap = CodeUtils.getInstance().createBitmap();
                                            //获取当前图片验证码的对应内容用于校验
                                            code = CodeUtils.getInstance().getCode();
                                            imageView.setImageBitmap(bitmap);
                                        } else {
                                            if (text3.getText().toString().equals("")) {
                                                Toast.makeText(login.this, "验证码不能为空！", Toast.LENGTH_SHORT).show();
                                                bitmap = CodeUtils.getInstance().createBitmap();
                                                //获取当前图片验证码的对应内容用于校验
                                                code = CodeUtils.getInstance().getCode();
                                                imageView.setImageBitmap(bitmap);
                                            }
                                            else
                                            {
                                                if(dlzt.equals("登录成功"))
                                                {
                                                    if(text3.getText().toString().equals(code))
                                                    {
                                                        Toast.makeText(login.this, " 登录成功！", Toast.LENGTH_SHORT).show();
                                                        text2.postDelayed(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                finish();
                                                            Intent intent11=new Intent(login.this, main.class);
                                                                intent11.putExtra("userName",text1.getText().toString());
                                                            startActivity(intent11);
                                                            }
                                                        }, 1000);
                                                    }
                                                    else
                                                    {
                                                        Toast.makeText(login.this, "验证码错误，请重试！", Toast.LENGTH_SHORT).show();
                                                        text3.setText("");
                                                        text3.requestFocus();
                                                        bitmap = CodeUtils.getInstance().createBitmap();
                                                        //获取当前图片验证码的对应内容用于校验
                                                        code = CodeUtils.getInstance().getCode();
                                                        imageView.setImageBitmap(bitmap);
                                                    }
                                                }
                                                else
                                                {
                                                    Toast.makeText(login.this, "用户名或密码错误！", Toast.LENGTH_SHORT).show();
                                                    text2.setText("");
                                                    text3.setText("");
                                                    text2.requestFocus();
                                                    bitmap = CodeUtils.getInstance().createBitmap();
                                                    //获取当前图片验证码的对应内容用于校验
                                                    code = CodeUtils.getInstance().getCode();
                                                    imageView.setImageBitmap(bitmap);
                                                }
                                            }
                                        }
                                    }
                                    /**
                                    if(text3.getText().toString().equals(code)) {
                                        if (dlzt.equals("登录成功") ) {
                                            finish();
                                            Intent intent1 = dea Intent(this, layout1.class);
                                            startActivity(intent1);
                                        }

                                        if (username.equals("") || password.equals("")) {
                                            bitmap = CodeUtils.getInstance().createBitmap();
                                            //获取当前图片验证码的对应内容用于校验
                                            code = CodeUtils.getInstance().getCode();
                                            imageView.setImageBitmap(bitmap);
                                            text3.setText("");
                                            showNormalDialog2();

                                        }
                                        if (!username.equals("") && !password.equals("") && !dlzt.equals("登录成功") ) {
                                            bitmap = CodeUtils.getInstance().createBitmap();
                                            //获取当前图片验证码的对应内容用于校验
                                            code = CodeUtils.getInstance().getCode();
                                            imageView.setImageBitmap(bitmap);
                                            text3.setText("");
                                            System.out.println(response);
                                            showNormalDialog();

                                        }
                                    }
                                    else
                                    {
                                        if (username.equals("") || password.equals("")) {
                                            bitmap = CodeUtils.getInstance().createBitmap();
                                            //获取当前图片验证码的对应内容用于校验
                                            code = CodeUtils.getInstance().getCode();
                                            imageView.setImageBitmap(bitmap);
                                            text3.setText("");
                                            showNormalDialog2();

                                        }
                                        else {
                                            bitmap = CodeUtils.getInstance().createBitmap();
                                            //获取当前图片验证码的对应内容用于校验
                                            code = CodeUtils.getInstance().getCode();
                                            imageView.setImageBitmap(bitmap);
                                            text3.setText("");
                                            System.out.println(444);
                                            showNormalDialog5();
                                        }
                                    }
**/
                                } else {
                                    Toast.makeText(login.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                                    text1.setText("");
                                    text2.setText("");
                                    text3.setText("");
                                    text1.requestFocus();
                                    bitmap = CodeUtils.getInstance().createBitmap();
                                    //获取当前图片验证码的对应内容用于校验
                                    code = CodeUtils.getInstance().getCode();
                                    imageView.setImageBitmap(bitmap);

                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        });

                    }).start();
                }
                    else
                    {
                        Toast.makeText(login.this, "无网络，请检查网络连接！", Toast.LENGTH_SHORT).show();
                        text1.setText("");
                        text2.setText("");
                        text3.setText("");
                        text1.requestFocus();
                        bitmap = CodeUtils.getInstance().createBitmap();
                        //获取当前图片验证码的对应内容用于校验
                        code = CodeUtils.getInstance().getCode();
                        imageView.setImageBitmap(bitmap);

                    }

                break;
            case R.id.image:
                bitmap = CodeUtils.getInstance().createBitmap();
                code = CodeUtils.getInstance().getCode();
                imageView.setImageBitmap(bitmap);
                break;
            case  R.id.btn3:
                Intent intent1 = new Intent(this, rigster.class);
                startActivity(intent1);
                break;
            case  R.id.btn2:
                Intent intent2 = new Intent(this, find.class);
                startActivity(intent2);
                break;
        }
    }
    private void setTextViewStyles(TextView textView) {
        /**
         int[] colors = {Color.RED, Color.GREEN, Color.BLUE};//颜色的数组
         float[] position = {0f, 0.7f, 1.0f};//颜色渐变位置的数组
         LinearGradient mLinearGradient = dea LinearGradient(0, 0, textView.getPaint().getTextSize() * textView.getText().length(), 0, colors, position, Shader.TileMode.CLAMP);
         textView.getPaint().setShader(mLinearGradient);
         textView.invalidate();
         **/
        LinearGradient mLinearGradient = new LinearGradient(0, 0, textView.getPaint().getTextSize()* textView.getText().length(), 0, Color.parseColor("#FFFF68FF"), Color.parseColor("#FFFED732"), Shader.TileMode.CLAMP);
        textView.getPaint().setShader(mLinearGradient);
        textView.invalidate();
    }
    private void setTextViewStyles2(TextView textView) {

        int[] colors = {Color.RED, Color.GREEN, Color.BLUE};//颜色的数组
        float[] position = {0f, 0.7f, 1.0f};//颜色渐变位置的数组
        LinearGradient mLinearGradient = new LinearGradient(0, 0, textView.getPaint().getTextSize() * textView.getText().length(), 0, colors, position, Shader.TileMode.CLAMP);
        textView.getPaint().setShader(mLinearGradient);
        textView.invalidate();

    }
    private void showNormalDialog(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(login.this,R.style.dialog);
        normalDialog.setTitle("登录失败");
        normalDialog.setIcon(R.mipmap.tips);
        normalDialog.setMessage("\n       用户名或密码错误，请重新输入。");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }
    private void showNormalDialog1(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(login.this,R.style.dialog);
        normalDialog.setTitle("登录失败");
        normalDialog.setIcon(R.mipmap.tips);
        normalDialog.setMessage("\n           无网络连接，请检查网络状态。");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }
    private void showNormalDialog2(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(login.this,R.style.dialog);
        normalDialog.setTitle("登录失败");
        normalDialog.setIcon(R.mipmap.tips);
        normalDialog.setMessage("\n                 用户名或密码不能为空。");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }

    public boolean isNetworkConnected(Context context) {
        if (context != null) {
            ConnectivityManager mConnectivityManager = (ConnectivityManager) context
                    .getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo mNetworkInfo = mConnectivityManager.getActiveNetworkInfo();
            if (mNetworkInfo != null) {
                return mNetworkInfo.isAvailable();
            }
        }
        return false;
    }
    private void showNormalDialog3(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(login.this,R.style.dialog);
        normalDialog.setTitle("登录失败");
        normalDialog.setIcon(R.mipmap.tips);
        normalDialog.setMessage("\n           服务器无响应，请稍后再试。");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }
    private void showNormalDialog4(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(login.this,R.style.dialog);
        normalDialog.setTitle("登录失败");
        normalDialog.setIcon(R.mipmap.tips);
        normalDialog.setMessage("\n                请输入验证码。");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }
    private void showNormalDialog5(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(login.this,R.style.dialog);
        normalDialog.setTitle("登录失败");
        normalDialog.setIcon(R.mipmap.tips);
        normalDialog.setMessage("\n                    验证码错误，请重试。");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }
    public void exit() {
        if ((System.currentTimeMillis() - mExitTime) > 2000) {
            Toast.makeText(login.this, "再按一次退出应用", Toast.LENGTH_SHORT).show();
            mExitTime = System.currentTimeMillis();
        } else {
            finish();
            System.exit(0);
        }
    }
    private int getVersion() throws IOException, JSONException {
        Looper.prepare();
        URL url = new URL("http://49.234.95.95/usgs10th.json");
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        System.out.println(httpURLConnection);
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setReadTimeout(2000);
        int code = httpURLConnection.getResponseCode();//获取返回码
        System.out.println(code);
        InputStream inputStream = httpURLConnection.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        StringBuffer sb = new StringBuffer();
        while ((line = bufferedReader.readLine()) != null) {
            sb.append(line);
        }
        String string;
        string = sb.toString();
        System.out.println(string);
        //对json数据进行解析
        JSONObject jsonObject = new JSONObject(string);
        int versionCode = jsonObject.getInt("versionCode");
        String versionNname = jsonObject.getString("versionName");
        int mLocalVersionCode = getVersionCode();
        String mlocalname = getVersionName();
        if (mLocalVersionCode < versionCode) {
            //消息机制
            System.out.println("有更新");
            XUpdate.newBuild(this)
                    .updateUrl("http://49.234.95.95/usgs10th.json")
                    .updateParser(new CustomUpdateParser())
                    .update();

        } else {

        }
        return versionCode;
    }
    private int getVersionCode() {
        PackageManager pm = getPackageManager();
        //版本号都在里面,0代表基本信息
        try {
            PackageInfo packageInfo = pm.getPackageInfo(this.getPackageName(), 0);
            //获取对应版本名称
            return packageInfo.versionCode;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    private String getVersionName() {
        PackageManager pm = getPackageManager();
        //版本号都在里面,0代表基本信息
        try {
            PackageInfo packageInfo = pm.getPackageInfo(this.getPackageName(), 0);
            //获取对应版本名称
            return packageInfo.versionName;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
