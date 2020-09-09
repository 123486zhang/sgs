package com.xuexiang.xupdatedemo;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

public class find extends Activity implements View.OnClickListener {
    public Button btn1, btn2, btn3;
    public EditText text1, text2, text3;
    public ImageView imageView;
    private Bitmap bitmap;
    private String code;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find);
        text1 = (EditText) findViewById(R.id.text1);
        text2 = (EditText) findViewById(R.id.text2);
        text3 = (EditText) findViewById(R.id.text3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public void onClick(View v)
    {
        switch (v.getId()) {
            case R.id.btn1:
                if(isNetworkConnected(this)) {
                    new Thread(() -> {
                        String username = text1.getText().toString();
                        String password = text3.getText().toString();
                        String tel = text2.getText().toString();
                        // final String response = LoginService.loginByGet(username,password);
                        final String response = findService.loginByPost(username, password, tel);
                        runOnUiThread(() -> {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                String zt = jsonObject.getString("状态");
                                if (response != null) {
                                   if(text1.getText().toString().equals(""))
                                   {
                                       Toast.makeText(find.this, "用户名不能为空！", Toast.LENGTH_SHORT).show();
                                   }
                                   else
                                   {
                                       if(text2.getText().toString().equals(""))
                                       {
                                           Toast.makeText(find.this, "手机号不能为空！", Toast.LENGTH_SHORT).show();
                                       }
                                       else
                                       {
                                           if(text3.getText().toString().equals(""))
                                           {
                                               Toast.makeText(find.this, "密码不能为空！", Toast.LENGTH_SHORT).show();
                                           }
                                           else
                                           {
                                               if(zt.equals("修改失败"))
                                               {
                                                   Toast.makeText(find.this, "用户名或手机号错误！", Toast.LENGTH_SHORT).show();
                                                   text1.setText("");
                                                   text2.setText("");
                                                   text1.requestFocus();
                                               }
                                               else
                                               {
                                                   Toast.makeText(find.this, "密码重置成功，即将跳转到登录界面！", Toast.LENGTH_SHORT).show();
                                                   text1.postDelayed(new Runnable() {
                                                   @Override
                                                   public void run() {
                                                       finish();
                                                   }
                                               }, 2000);
                                               }
                                           }
                                       }
                                   }

                                }
                                else {
                                    Toast.makeText(find.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                                    text1.setText("");
                                    text2.setText("");
                                    text3.setText("");
                                    text1.requestFocus();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        });
                    }).start();
                }
                else
                {
                    Toast.makeText(find.this, "无网络，请检查网络连接！", Toast.LENGTH_SHORT).show();
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                    text1.requestFocus();
                }
                break;
            case R.id.btn2:
                finish();
                break;
        }

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
}
