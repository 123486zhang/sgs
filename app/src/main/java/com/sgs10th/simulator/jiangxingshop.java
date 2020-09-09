package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.jiangxing;
import com.xuexiang.xupdatedemo.mes;
import com.xuexiang.xupdatedemo.rigwj;
import com.xuexiang.xupdatedemo.tip;
import com.xuexiang.xupdatedemo.updatecoins;
import com.xuexiang.xupdatedemo.updatewj;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class jiangxingshop extends AppCompatActivity implements View.OnClickListener{
private  String username,wj1,wj2,wj3,wj4,wj5,wj6,wj7,wj8,wj9,wj10
        ,wj11,wj12,wj13,wj14,wj15,wj16,wj17,wj18,wj19,wj20,wj21,wj22,wj23,wj24,wj25,wj26
        ,spjs,sjf,scoin,szhaomuling;
private  int coin,zhaomuling,jf,pjs;
private ImageView image1,image2,image3, image4,image5,image6, image7,image8,image9,image10,back,jiangfu6,jiangfu7,jiangfu8,jiangfu9,jiangfu10;
private TextView get1,get2,get3,get4,get5,get6,get7,get8,get9,get10,texttip,jftext1,jftext2,
        jftext3,jftext4,jftext5,jftext6,jftext7,jftext8,jftext9,jftext10,text10,text11;
private Button btn2,btn3,btnget1,btnget2,btnget3,btnget4,btnget5,btnget6,btnget7,btnget8,btnget9,btnget10;
private static int flag=1,id;
    private  java.util.Timer time;
    private TimerTask task;
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiangxingshop);
        Intent intent = getIntent();
        username = intent.getStringExtra("userName");
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        image5=findViewById(R.id.image5);
        image6=findViewById(R.id.image6);
        image7=findViewById(R.id.image7);
        image8=findViewById(R.id.image8);
        image9=findViewById(R.id.image9);
        image10=findViewById(R.id.image10);
        jiangfu6=findViewById(R.id.jiangfu6);
        jiangfu7=findViewById(R.id.jiangfu7);
        jiangfu8=findViewById(R.id.jiangfu8);
        jiangfu9=findViewById(R.id.jiangfu9);
        jiangfu10=findViewById(R.id.jiangfu10);
        get1=findViewById(R.id.get1);
        get2=findViewById(R.id.get2);
        get3=findViewById(R.id.get3);
        get4=findViewById(R.id.get4);
        get5=findViewById(R.id.get5);
        get6=findViewById(R.id.get6);
        get7=findViewById(R.id.get7);
        get8=findViewById(R.id.get8);
        get9=findViewById(R.id.get9);
        get10=findViewById(R.id.get10);
        text10=findViewById(R.id.text10);
        text11=findViewById(R.id.text11);
        texttip=findViewById(R.id.texttip);
        jftext1=findViewById(R.id.jftext1);
        jftext2=findViewById(R.id.jftext2);
        jftext3=findViewById(R.id.jftext2);
        jftext3=findViewById(R.id.jftext3);
        jftext4=findViewById(R.id.jftext4);
        jftext5=findViewById(R.id.jftext5);
        jftext6=findViewById(R.id.jftext6);
        jftext7=findViewById(R.id.jftext7);
        jftext8=findViewById(R.id.jftext8);
        jftext9=findViewById(R.id.jftext9);
        jftext10=findViewById(R.id.jftext10);
        back=findViewById(R.id.back);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btnget1=findViewById(R.id.btnget1);
        btnget2=findViewById(R.id.btnget2);
        btnget3=findViewById(R.id.btnget3);
        btnget4=findViewById(R.id.btnget4);
        btnget5=findViewById(R.id.btnget5);
        btnget6=findViewById(R.id.btnget6);
        btnget7=findViewById(R.id.btnget7);
        btnget8=findViewById(R.id.btnget8);
        btnget9=findViewById(R.id.btnget9);
        btnget10=findViewById(R.id.btnget10);
        back.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btnget1.setOnClickListener(this);
        btnget2.setOnClickListener(this);
        btnget3.setOnClickListener(this);
        btnget4.setOnClickListener(this);
        btnget5.setOnClickListener(this);
        btnget6.setOnClickListener(this);
        btnget7.setOnClickListener(this);
        btnget8.setOnClickListener(this);
        btnget9.setOnClickListener(this);
        btnget10.setOnClickListener(this);
        new Thread(() -> {
            // final String response = LoginService.loginByGet(username,password);
            final String response = rigwj.loginByGetwj(username);
            runOnUiThread(() -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String zt = jsonObject.getString("查询状态");
                    wj1=jsonObject.getString("关索");
                    wj2=jsonObject.getString("赵襄");
                    wj3=jsonObject.getString("鲍三娘");
                    wj4=jsonObject.getString("徐荣");
                    wj5=jsonObject.getString("曹婴");
                    wj6=jsonObject.getString("曹纯");
                    wj7=jsonObject.getString("张琪瑛");
                    wj8=jsonObject.getString("王朗");
                    wj9=jsonObject.getString("司马徽");
                    wj10=jsonObject.getString("程昱");
                    wj11=jsonObject.getString("兀突骨");
                    wj12=jsonObject.getString("孙皓");
                    wj13=jsonObject.getString("陈琳");
                    wj14=jsonObject.getString("士燮");
                    wj15=jsonObject.getString("杨修");
                    wj16=jsonObject.getString("文鸯");
                    wj17=jsonObject.getString("蒋干");
                    wj18=jsonObject.getString("葛玄");
                    wj19=jsonObject.getString("沙摩柯");
                    wj20=jsonObject.getString("忙牙长");
                    wj21=jsonObject.getString("许贡");
                    wj22=jsonObject.getString("张菖蒲");
                    wj23=jsonObject.getString("李傕");
                    wj24=jsonObject.getString("郭汜");
                    wj25=jsonObject.getString("樊稠");
                    wj26=jsonObject.getString("张济");
                    if(zt.equals("查询成功")){
                        if(wj1.equals("true")){
                           get1.setText("已\n拥\n有");
                           jftext1.setText("10000");
                           jftext1.setTextColor(0xff9C1C1A);
                           btnget1.setBackgroundResource(R.animator.jbs);
                           btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj2.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("10000");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj3.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("10000");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj4.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("10000");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj5.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("10000");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj6.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("10000");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj7.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("10000");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj13.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("3000");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj9.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("10000");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj10.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("10000");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj1.equals("true")){
                            get1.setText("");
                            jftext1.setText("10000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj2.equals("true")){
                            get2.setText("");
                            jftext2.setText("10000");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj3.equals("true")){
                            get3.setText("");
                            jftext3.setText("10000");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj4.equals("true")){
                            get4.setText("");
                            jftext4.setText("10000");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj5.equals("true")){
                            get5.setText("");
                            jftext5.setText("10000");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj6.equals("true")){
                            get6.setText("");
                            jftext6.setText("10000");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj7.equals("true")){
                            get7.setText("");
                            jftext7.setText("10000");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj13.equals("true")){
                            get8.setText("");
                            jftext8.setText("3000");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj9.equals("true")){
                            get9.setText("");
                            jftext9.setText("10000");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj10.equals("true")){
                            get10.setText("");
                            jftext10.setText("10000");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                    }
                    else
                    {
                        Toast.makeText(jiangxingshop.this, "请检查网络连接！", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            });
        }).start();
        new Thread(() -> {
            // final String response = LoginService.loginByGet(username,password);
            final String response = mes.loginByPost(username);
            runOnUiThread(() -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String zt = jsonObject.getString("查询状态");
                     coin = jsonObject.getInt("元宝数");
                     zhaomuling = jsonObject.getInt("招募令数");
                    jf=jsonObject.getInt("将符数");
                    pjs=jsonObject.getInt("破界石数");
                     scoin = "" + coin;
                     szhaomuling = "" + zhaomuling;
                    spjs = "" + pjs;
                    sjf = "" + jf;
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                            text11.setText(scoin);
                            text10.setText(sjf);
                        } else {
                            Toast.makeText(jiangxingshop.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(jiangxingshop.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(jiangxingshop.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(jiangxingshop.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
    @SuppressLint("ResourceType")
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnget1:
                switch (flag){
                    case 1:
                        if(!wj1.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=1;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj11.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<2000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=11;
                                showNormalDialog();

                            }
                        }
                        break;
                        case 3:
                            if(!wj22.equals("true"))
                            {
                                if(Integer.parseInt(text10.getText().toString())<1000)
                                {
                                    Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                                }
                                else
                                {
                                    id=22;
                                    showNormalDialog();

                                }
                            }
                        break;

                }
                break;
            case R.id.btnget2:
                switch (flag){
                    case 1:
                        if(!wj2.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=2;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj12.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<1000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=12;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj23.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<140)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=23;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget3:
                switch (flag){
                    case 1:
                        if(!wj3.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=3;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj14.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<3000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=14;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj24.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=24;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget4:
                switch (flag){
                    case 1:
                        if(!wj4.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=4;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj15.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<3000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=15;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj25.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<120)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=25;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget5:
                switch (flag){
                    case 1:
                        if(!wj5.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=5;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj16.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<3000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=16;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj26.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<80)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=26;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget6:
                switch (flag){
                    case 1:
                        if(!wj6.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=6;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj17.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<1500)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=17;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget7:
                switch (flag){
                    case 1:
                        if(!wj7.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=7;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj18.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<1000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=18;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget8:
                switch (flag){
                    case 1:
                        if(!wj13.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<3000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=13;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj19.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<360)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=19;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget9:
                switch (flag){
                    case 1:
                        if(!wj9.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=9;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj20.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<180)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=20;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget10:
                switch (flag){
                    case 1:
                        if(!wj10.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<10000)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=10;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj21.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<180)
                            {
                                Toast.makeText(jiangxingshop.this, "将符数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=21;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btn2:
                ++flag;
                if(flag==4){
                    flag=1;
                }
                switch (flag) {
                    case 1:
                        image1.setImageResource(R.mipmap.guansuo);
                        image2.setImageResource(R.mipmap.zhaoxiang);
                        image3.setImageResource(R.mipmap.baosanniang);
                        image4.setImageResource(R.mipmap.xurong);
                        image5.setImageResource(R.mipmap.caoying);
                        image6.setImageResource(R.mipmap.caochun);
                        image7.setImageResource(R.mipmap.zhangqiying);
                        image8.setImageResource(R.mipmap.chenlin);
                        image9.setImageResource(R.mipmap.simahui);
                        image10.setImageResource(R.mipmap.chengyv);
                        jiangfu6.setImageResource(R.mipmap.jinagfu);
                        jiangfu7.setImageResource(R.mipmap.jinagfu);
                        jiangfu8.setImageResource(R.mipmap.jinagfu);
                        jiangfu9.setImageResource(R.mipmap.jinagfu);
                        jiangfu10.setImageResource(R.mipmap.jinagfu);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj1.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("10000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj2.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("10000");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj3.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("10000");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj4.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("10000");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj5.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("10000");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj6.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("10000");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj7.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("10000");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj13.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("3000");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj9.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("10000");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj10.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("10000");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj1.equals("true")){
                            get1.setText("");
                            jftext1.setText("10000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj2.equals("true")){
                            get2.setText("");
                            jftext2.setText("10000");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj3.equals("true")){
                            get3.setText("");
                            jftext3.setText("10000");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj4.equals("true")){
                            get4.setText("");
                            jftext4.setText("10000");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj5.equals("true")){
                            get5.setText("");
                            jftext5.setText("10000");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj6.equals("true")){
                            get6.setText("");
                            jftext6.setText("10000");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj7.equals("true")){
                            get7.setText("");
                            jftext7.setText("10000");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj13.equals("true")){
                            get8.setText("");
                            jftext8.setText("3000");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj9.equals("true")){
                            get9.setText("");
                            jftext9.setText("10000");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj10.equals("true")){
                            get10.setText("");
                            jftext10.setText("10000");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.wutugu);
                        image2.setImageResource(R.mipmap.sunhao);
                        image3.setImageResource(R.mipmap.shiyu);
                        image4.setImageResource(R.mipmap.yangxiu);
                        image5.setImageResource(R.mipmap.wenyang);
                        image6.setImageResource(R.mipmap.jianggan);
                        image7.setImageResource(R.mipmap.gexuan);
                        image8.setImageResource(R.mipmap.shamoke);
                        image9.setImageResource(R.mipmap.mangyazhang);
                        image10.setImageResource(R.mipmap.xugong);
                        jiangfu6.setImageResource(R.mipmap.jinagfu);
                        jiangfu7.setImageResource(R.mipmap.jinagfu);
                        jiangfu8.setImageResource(R.mipmap.jinagfu);
                        jiangfu9.setImageResource(R.mipmap.jinagfu);
                        jiangfu10.setImageResource(R.mipmap.jinagfu);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj11.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("2000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj12.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("1000");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj14.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("3000");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj15.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("3000");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj16.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("3000");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj17.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("1500");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj18.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("1000");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj19.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("360");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj20.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("180");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj21.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("180");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj11.equals("true")){
                            get1.setText("");
                            jftext1.setText("2000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj12.equals("true")){
                            get2.setText("");
                            jftext2.setText("1000");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj14.equals("true")){
                            get3.setText("");
                            jftext3.setText("3000");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj15.equals("true")){
                            get4.setText("");
                            jftext4.setText("3000");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj16.equals("true")){
                            get5.setText("");
                            jftext5.setText("3000");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj17.equals("true")){
                            get6.setText("");
                            jftext6.setText("1500");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj18.equals("true")){
                            get7.setText("");
                            jftext7.setText("1000");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj19.equals("true")){
                            get8.setText("");
                            jftext8.setText("360");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj20.equals("true")){
                            get9.setText("");
                            jftext9.setText("180");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj21.equals("true")){
                            get10.setText("");
                            jftext10.setText("180");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.zhangchangpu);
                        image2.setImageResource(R.mipmap.lijue);
                        image3.setImageResource(R.mipmap.guosi);
                        image4.setImageResource(R.mipmap.fanchou);
                        image5.setImageResource(R.mipmap.zhangji);
                        image6.setImageResource(0);
                        image7.setImageResource(0);
                        image8.setImageResource(0);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        get6.setText("");
                        get7.setText("");
                        get8.setText("");
                        get9.setText("");
                        get10.setText("");
                        jftext6.setText("");
                        jftext7.setText("");
                        jftext8.setText("");
                        jftext9.setText("");
                        jftext10.setText("");
                        btnget6.setText("");
                        btnget7.setText("");
                        btnget8.setText("");
                        btnget9.setText("");
                        btnget10.setText("");
                        btnget6.setBackgroundResource(0x00000000);
                        btnget7.setBackgroundResource(0x00000000);
                        btnget8.setBackgroundResource(0x00000000);
                        btnget9.setBackgroundResource(0x00000000);
                        btnget10.setBackgroundResource(0x00000000);
                        jiangfu6.setImageResource(0);
                        jiangfu7.setImageResource(0);
                        jiangfu8.setImageResource(0);
                        jiangfu9.setImageResource(0);
                        jiangfu10.setImageResource(0);
                        if(wj22.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("1000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj23.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("140");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj24.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj25.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("120");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj26.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("80");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(!wj22.equals("true")){
                            get1.setText("");
                            jftext1.setText("1000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj23.equals("true")){
                            get2.setText("");
                            jftext2.setText("140");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj24.equals("true")){
                            get3.setText("");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj25.equals("true")){
                            get4.setText("");
                            jftext4.setText("120");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj26.equals("true")){
                            get5.setText("");
                            jftext5.setText("80");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        break;
                }
                break;
            case R.id.btn3:
                --flag;
                if(flag==0){
                    flag=3;
                }
                switch (flag) {
                    case 1:
                        image1.setImageResource(R.mipmap.guansuo);
                        image2.setImageResource(R.mipmap.zhaoxiang);
                        image3.setImageResource(R.mipmap.baosanniang);
                        image4.setImageResource(R.mipmap.xurong);
                        image5.setImageResource(R.mipmap.caoying);
                        image6.setImageResource(R.mipmap.caochun);
                        image7.setImageResource(R.mipmap.zhangqiying);
                        image8.setImageResource(R.mipmap.chenlin);
                        image9.setImageResource(R.mipmap.simahui);
                        image10.setImageResource(R.mipmap.chengyv);
                        jiangfu6.setImageResource(R.mipmap.jinagfu);
                        jiangfu7.setImageResource(R.mipmap.jinagfu);
                        jiangfu8.setImageResource(R.mipmap.jinagfu);
                        jiangfu9.setImageResource(R.mipmap.jinagfu);
                        jiangfu10.setImageResource(R.mipmap.jinagfu);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj1.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("10000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj2.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("10000");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj3.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("10000");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj4.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("10000");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj5.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("10000");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj6.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("10000");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj7.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("10000");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj13.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("3000");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj9.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("10000");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj10.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("10000");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj1.equals("true")){
                            get1.setText("");
                            jftext1.setText("10000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj2.equals("true")){
                            get2.setText("");
                            jftext2.setText("10000");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj3.equals("true")){
                            get3.setText("");
                            jftext3.setText("10000");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj4.equals("true")){
                            get4.setText("");
                            jftext4.setText("10000");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj5.equals("true")){
                            get5.setText("");
                            jftext5.setText("10000");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj6.equals("true")){
                            get6.setText("");
                            jftext6.setText("10000");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj7.equals("true")){
                            get7.setText("");
                            jftext7.setText("10000");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj13.equals("true")){
                            get8.setText("");
                            jftext8.setText("3000");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj9.equals("true")){
                            get9.setText("");
                            jftext9.setText("10000");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj10.equals("true")){
                            get10.setText("");
                            jftext10.setText("10000");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.wutugu);
                        image2.setImageResource(R.mipmap.sunhao);
                        image3.setImageResource(R.mipmap.shiyu);
                        image4.setImageResource(R.mipmap.yangxiu);
                        image5.setImageResource(R.mipmap.wenyang);
                        image6.setImageResource(R.mipmap.jianggan);
                        image7.setImageResource(R.mipmap.gexuan);
                        image8.setImageResource(R.mipmap.shamoke);
                        image9.setImageResource(R.mipmap.mangyazhang);
                        image10.setImageResource(R.mipmap.xugong);
                        jiangfu6.setImageResource(R.mipmap.jinagfu);
                        jiangfu7.setImageResource(R.mipmap.jinagfu);
                        jiangfu8.setImageResource(R.mipmap.jinagfu);
                        jiangfu9.setImageResource(R.mipmap.jinagfu);
                        jiangfu10.setImageResource(R.mipmap.jinagfu);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj11.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("2000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj12.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("1000");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj14.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("3000");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj15.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("3000");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj16.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("3000");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj17.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("1500");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj18.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("1000");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj19.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("360");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj20.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("180");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj21.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("180");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj11.equals("true")){
                            get1.setText("");
                            jftext1.setText("2000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj12.equals("true")){
                            get2.setText("");
                            jftext2.setText("1000");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj14.equals("true")){
                            get3.setText("");
                            jftext3.setText("3000");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj15.equals("true")){
                            get4.setText("");
                            jftext4.setText("3000");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj16.equals("true")){
                            get5.setText("");
                            jftext5.setText("3000");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj17.equals("true")){
                            get6.setText("");
                            jftext6.setText("1500");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj18.equals("true")){
                            get7.setText("");
                            jftext7.setText("1000");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj19.equals("true")){
                            get8.setText("");
                            jftext8.setText("360");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj20.equals("true")){
                            get9.setText("");
                            jftext9.setText("180");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj21.equals("true")){
                            get10.setText("");
                            jftext10.setText("180");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.zhangchangpu);
                        image2.setImageResource(R.mipmap.lijue);
                        image3.setImageResource(R.mipmap.guosi);
                        image4.setImageResource(R.mipmap.fanchou);
                        image5.setImageResource(R.mipmap.zhangji);
                        image6.setImageResource(0);
                        image7.setImageResource(0);
                        image8.setImageResource(0);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        get6.setText("");
                        get7.setText("");
                        get8.setText("");
                        get9.setText("");
                        get10.setText("");
                        jftext6.setText("");
                        jftext7.setText("");
                        jftext8.setText("");
                        jftext9.setText("");
                        jftext10.setText("");
                        btnget6.setText("");
                        btnget7.setText("");
                        btnget8.setText("");
                        btnget9.setText("");
                        btnget10.setText("");
                        btnget6.setBackgroundResource(0x00000000);
                        btnget7.setBackgroundResource(0x00000000);
                        btnget8.setBackgroundResource(0x00000000);
                        btnget9.setBackgroundResource(0x00000000);
                        btnget10.setBackgroundResource(0x00000000);
                        jiangfu6.setImageResource(0);
                        jiangfu7.setImageResource(0);
                        jiangfu8.setImageResource(0);
                        jiangfu9.setImageResource(0);
                        jiangfu10.setImageResource(0);
                        if(wj22.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("1000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj23.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("140");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj24.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj25.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("120");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj26.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("80");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(!wj22.equals("true")){
                            get1.setText("");
                            jftext1.setText("1000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj23.equals("true")){
                            get2.setText("");
                            jftext2.setText("140");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj24.equals("true")){
                            get3.setText("");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj25.equals("true")){
                            get4.setText("");
                            jftext4.setText("120");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj26.equals("true")){
                            get5.setText("");
                            jftext5.setText("80");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        break;
                }
                break;
            case R.id.back:
                flag=1;
                finish();
                Intent intent11=new Intent(jiangxingshop.this, main.class);
                intent11.putExtra("userName",username);
                startActivity(intent11);
                break;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            flag=1;
            finish();
            Intent intent11=new Intent(jiangxingshop.this, main.class);
            intent11.putExtra("userName",username);
            startActivity(intent11);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    private void showNormalDialog(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jiangxingshop.this);
        normalDialog.setTitle("Tips");
        normalDialog.setMessage("\n       确认兑换?");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(id==1) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得关索!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj1(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "关索");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==2) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得赵襄!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj2(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "赵襄");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==3) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得鲍三娘!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj3(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "鲍三娘");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==4) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得徐荣!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj4(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "徐荣");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==5) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得曹婴!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj5(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "曹婴");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==6) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得曹纯!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj6(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "曹纯");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==7) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得张琪瑛!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj7(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "张琪瑛");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==9) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得司马徽!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj8(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "司马徽");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==10) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 10000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得程昱!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj9(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "程昱");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==11) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 2000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得兀突骨!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj11(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "兀突骨");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==12) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 1000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得孙皓!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj12(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "孙皓");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==13) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 3000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得陈琳!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj13(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "陈琳");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==14) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 3000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得士燮!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj14(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "士燮");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==15) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 3000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得杨修!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj15(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "杨修");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==16) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 3000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得文鸯!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj16(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "文鸯");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==17) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 1500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得蒋干!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj17(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "蒋干");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==18) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 1000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过将星商店兑换获得葛玄!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj18(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "葛玄");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==19) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 360;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj19(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "沙摩柯");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==20) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 180;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj20(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "忙牙长");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==21) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 180;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj21(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "许贡");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==22) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 1000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj22(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "张菖蒲");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==23) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 140;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj23(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "李傕");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==24) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj24(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "郭汜");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==25) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 120;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj25(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "樊稠");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==26) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 80;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username,scoin,szhaomuling,spjs,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj26(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(jiangxingshop.this, jiangxingshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(jiangxingshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "张济");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                    }
                });
        normalDialog.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                    }
                });
        normalDialog.show();
    }
}
