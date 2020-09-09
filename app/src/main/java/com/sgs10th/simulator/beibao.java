package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.jiangxing;
import com.xuexiang.xupdatedemo.mes;
import com.xuexiang.xupdatedemo.tip;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class beibao extends AppCompatActivity implements View.OnClickListener {
private  String  username;
private ImageView back;
private TextView text1,text2,text3,text4,yb,texttip,text32;
    private  java.util.Timer time;
    private TimerTask task;
    private  int zsd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beibao);
        Intent intent = getIntent();
         username = intent.getStringExtra("userName");
         back=findViewById(R.id.back);
         back.setOnClickListener(this);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text32=findViewById(R.id.text32);
        yb=findViewById(R.id.yb);
        texttip=findViewById(R.id.texttip);
        new Thread(() -> {
            // final String response = LoginService.loginByGet(username,password);
            final String response = mes.loginByPost(username);
            runOnUiThread(() -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String zt = jsonObject.getString("查询状态");
                    int coin = jsonObject.getInt("元宝数");
                    int zhaomuling = jsonObject.getInt("招募令数");
                    int  jf=jsonObject.getInt("将符数");
                    int  pjs=jsonObject.getInt("破界石数");
                    int gssp=jsonObject.getInt("国士碎片数");
                    zsd=jsonObject.getInt("转生丹数");
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                            yb.setText(""+coin);
                            text32.setText(""+zsd);
                            if(zhaomuling>999){
                                text1.setText("999+");
                            }
                            else
                            {
                                text1.setText(""+zhaomuling);
                            }
                            if(jf>999){
                                text2.setText("999+");
                            }
                            else
                            {
                                text2.setText(""+jf);
                            }
                            if(pjs>999){
                                text3.setText("999+");
                            }
                            else
                            {
                                text3.setText(""+pjs);
                            }
                            if(gssp>999){
                                text4.setText("999+");
                            }
                            else
                            {
                                text4.setText(""+gssp);
                            }
                        } else {
                            Toast.makeText(beibao.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(beibao.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            });
        }).start();
        time=new java.util.Timer(true);
        task=new TimerTask() {
            @Override
            public void run() {
                new Thread(() -> {
                    // final String response = LoginService.loginByGet(username,password);
                    final String response1 = tip.loginByGet();
                    runOnUiThread(() -> {
                        try {
                            JSONObject jsonObject = new JSONObject(response1);
                            String zt = jsonObject.getString("查询状态");
                            String tip1 = jsonObject.getString("通知");
                            if (response1 != null) {
                                if (zt.equals("查询成功")) {
                                    texttip.setText(tip1);
                                } else {
                                    Toast.makeText(beibao.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(beibao.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time.schedule(task,500,30000);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.back:
                finish();
                break;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
