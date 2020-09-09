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

public class rigster extends Activity implements View.OnClickListener{
    public Button btn1, btn2, btn3;
    public EditText text1, text2, text3,text4;
    public ImageView imageView;
    private Bitmap bitmap;
    private String code;
    private  boolean flag=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rigster);
        text1=(EditText)findViewById(R.id.text1);
        text2=(EditText)findViewById(R.id.text2);
        text3=(EditText)findViewById(R.id.text3);
        text4=(EditText)findViewById(R.id.text4);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            flag=false;
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
                    if(!flag) {
                        if (text1.getText().toString().equals("")) {
                            Toast.makeText(rigster.this, "用户名不能为空！", Toast.LENGTH_SHORT).show();
                        } else {
                            if (text2.getText().toString().equals("")) {
                                Toast.makeText(rigster.this, "密码不能为空！", Toast.LENGTH_SHORT).show();
                            } else {
                                if (text3.getText().toString().equals("")) {
                                    Toast.makeText(rigster.this, "确认密码不能为空！", Toast.LENGTH_SHORT).show();
                                } else {
                                    if (text4.getText().toString().equals("")) {
                                        Toast.makeText(rigster.this, "手机号不能为空！", Toast.LENGTH_SHORT).show();
                                    } else {
                                        if (!text2.getText().toString().equals(text3.getText().toString())) {
                                            Toast.makeText(rigster.this, "两次密码不一致！", Toast.LENGTH_SHORT).show();
                                            text3.setText("");
                                            text3.requestFocus();
                                        } else {
                                            if (text2.getText().toString().length() < 6) {

                                                Toast.makeText(rigster.this, "密码长度少于6位，请重新输入！", Toast.LENGTH_SHORT).show();
                                                text2.setText("");
                                                text3.setText("");
                                                text2.requestFocus();
                                            } else {
                                                if (text4.getText().toString().length() < 11) {

                                                    Toast.makeText(rigster.this, "请输入正确的手机号，请重新输入！", Toast.LENGTH_SHORT).show();
                                                    text4.setText("");
                                                    text4.requestFocus();
                                                }
                                                else
                                                {
                                                    flag=true;
                                                }
                                            }

                                        }
                                    }
                                }
                            }
                        }
                    }
                    if(flag) {
                        new Thread(() -> {
                            String username = text1.getText().toString();
                            String password = text2.getText().toString();
                            String tel = text4.getText().toString();
                            // final String response = LoginService.loginByGet(username,password);
                            final String response = RigService.loginByPost(username, password, tel);
                            rigwj.loginByGet(username);
                            runOnUiThread(() -> {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    String zt = jsonObject.getString("状态");
                                    if (response != null) {

                                        if (text1.getText().toString().equals("")) {
                                            Toast.makeText(rigster.this, "用户名不能为空！", Toast.LENGTH_SHORT).show();
                                        } else {
                                            if (text2.getText().toString().equals("")) {
                                                Toast.makeText(rigster.this, "密码不能为空！", Toast.LENGTH_SHORT).show();
                                            } else {
                                                if (text3.getText().toString().equals("")) {
                                                    Toast.makeText(rigster.this, "确认密码不能为空！", Toast.LENGTH_SHORT).show();
                                                } else {
                                                    if (text4.getText().toString().equals("")) {
                                                        Toast.makeText(rigster.this, "手机号不能为空！", Toast.LENGTH_SHORT).show();
                                                    } else {
                                                        if (!text2.getText().toString().equals(text3.getText().toString())) {
                                                            Toast.makeText(rigster.this, "两次密码不一致！", Toast.LENGTH_SHORT).show();
                                                            text3.setText("");
                                                            text3.requestFocus();
                                                        } else {
                                                            if (text2.getText().toString().length() < 6) {

                                                                Toast.makeText(rigster.this, "密码长度少于6位，请重新输入！", Toast.LENGTH_SHORT).show();
                                                                text2.setText("");
                                                                text3.setText("");
                                                                text2.requestFocus();
                                                            } else {
                                                                if (zt.equals("注册失败")) {
                                                                    Toast.makeText(rigster.this, "用户名已存在，请重新输入！", Toast.LENGTH_SHORT).show();
                                                                    text1.setText("");
                                                                    text1.requestFocus();
                                                                } else {
                                                                    if (zt.equals("注册成功")) {
                                                                        Toast.makeText(rigster.this, "注册成功，即将跳转到登录界面！", Toast.LENGTH_SHORT).show();
                                                                        text2.postDelayed(new Runnable() {
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
                                                }
                                            }
                                        }

                                        //if (zt.equals("注册成功")) {
                                        //  Toast.makeText(rigster.this, "注册成功，即将跳转到登录界面！", Toast.LENGTH_LONG).show();
                                        //  finish();
                                        //  } else {
                                        //    btn1.setText("注册失败");
                                        // }
                                    } else {
                                        Toast.makeText(rigster.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                                        text1.setText("");
                                        text2.setText("");
                                        text3.setText("");
                                        text4.setText("");
                                        text1.requestFocus();
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                            });
                        }).start();
                    }
                }
                else
                {
                    Toast.makeText(rigster.this, "无网络，请检查网络连接！", Toast.LENGTH_SHORT).show();
                    text1.setText("");
                    text2.setText("");
                    text3.setText("");
                    text4.setText("");
                    text1.requestFocus();
                }
                break;
            case R.id.btn2:
                flag=false;
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
