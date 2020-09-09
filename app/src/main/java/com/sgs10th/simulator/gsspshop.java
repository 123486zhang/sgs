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
import com.xuexiang.xupdatedemo.updategssp;
import com.xuexiang.xupdatedemo.updatewj;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class gsspshop extends AppCompatActivity implements View.OnClickListener{
    private  String username,wj1,wj2,wj3,wj4,wj5,wj6,wj7,wj8,wj9,wj10
            ,wj11,wj12,wj13,wj14,wj15,wj16,wj17,wj18,wj19,wj20,wj21,wj22,wj23,wj24,wj25,wj26
            ,spjs,sjf,scoin,szhaomuling,wj27,wj28,wj29,wj30,wj31,wj32,wj33,wj34,wj35,wj36
            ,wj37,wj38,wj39,wj40,wj41,wj42,wj43,wj44,wj45,wj46
            ,wj47,wj48,wj49,wj50,wj51,wj52,wj53;
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
        setContentView(R.layout.gsspshop);
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
                    wj8=jsonObject.getString("王朗");
                    wj27=jsonObject.getString("王允");
                    wj28=jsonObject.getString("管辂");
                    wj29=jsonObject.getString("蒲元");
                    wj30=jsonObject.getString("王双");
                    wj31=jsonObject.getString("皇甫嵩");
                    wj32=jsonObject.getString("花鬟");
                    wj33=jsonObject.getString("辛宪英");
                    wj34=jsonObject.getString("孙鲁育");
                    wj35=jsonObject.getString("辛毗");
                    wj36=jsonObject.getString("李肃");
                    wj37=jsonObject.getString("张温");
                    wj38=jsonObject.getString("伊籍");
                    wj39=jsonObject.getString("张恭");
                    wj40=jsonObject.getString("吕凯");
                    wj41=jsonObject.getString("卫温诸葛直");
                    wj42=jsonObject.getString("卑弥呼");
                    wj43=jsonObject.getString("灵雎");
                    wj44=jsonObject.getString("诸葛果");
                    wj45=jsonObject.getString("诸葛恪");
                    wj46=jsonObject.getString("群赵云");
                    wj47=jsonObject.getString("李傕郭汜");
                    wj48=jsonObject.getString("夏侯霸");
                    wj49=jsonObject.getString("群马超");
                    wj50=jsonObject.getString("张宝");
                    wj51=jsonObject.getString("大乔小乔");
                    wj52=jsonObject.getString("潘凤");
                    wj53=jsonObject.getString("邢道荣");
                    if(zt.equals("查询成功")){
                        if(wj8.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("3000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj27.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("800");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj28.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("500");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj29.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("500");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj30.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("500");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj31.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("500");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj32.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj33.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("300");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj34.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("300");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj35.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj8.equals("true")){
                            get1.setText("");
                            jftext1.setText("3000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj27.equals("true")){
                            get2.setText("");
                            jftext2.setText("800");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj28.equals("true")){
                            get3.setText("");
                            jftext3.setText("500");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj29.equals("true")){
                            get4.setText("");
                            jftext4.setText("500");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj30.equals("true")){
                            get5.setText("");
                            jftext5.setText("500");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj31.equals("true")){
                            get6.setText("");
                            jftext6.setText("500");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj32.equals("true")){
                            get7.setText("");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj33.equals("true")){
                            get8.setText("");
                            jftext8.setText("300");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj34.equals("true")){
                            get9.setText("");
                            jftext9.setText("300");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj35.equals("true")){
                            get10.setText("");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                    }
                    else
                    {
                        Toast.makeText(gsspshop.this, "请检查网络连接！", Toast.LENGTH_SHORT).show();
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
                    jf=jsonObject.getInt("国士碎片数");
                    scoin = "" + coin;
                    szhaomuling = "" + zhaomuling;
                    spjs = "" + pjs;
                    sjf = "" + jf;
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                            text11.setText(scoin);
                            text10.setText(sjf);
                        } else {
                            Toast.makeText(gsspshop.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(gsspshop.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(gsspshop.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(gsspshop.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                        if(!wj8.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<3000)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=8;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj36.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=36;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj46.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<200)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=46;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget2:
                switch (flag){
                    case 1:
                        if(!wj27.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<800)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=27;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj37.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=37;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj47.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=47;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget3:
                switch (flag){
                    case 1:
                        if(!wj28.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=28;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj38.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<200)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=38;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj48.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=48;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget4:
                switch (flag){
                    case 1:
                        if(!wj29.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=29;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj39.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<200)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=39;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj49.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=49;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget5:
                switch (flag){
                    case 1:
                        if(!wj30.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=30;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj40.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<300)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=40;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj50.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=50;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget6:
                switch (flag){
                    case 1:
                        if(!wj31.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=31;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj41.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=41;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj51.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=51;
                                showNormalDialog();

                            }
                        }
                        break;
                }
                break;
            case R.id.btnget7:
                switch (flag){
                    case 1:
                        if(!wj32.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=32;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj42.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<500)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=42;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj52.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=52;
                                showNormalDialog();

                            }
                        }
                        break;
                }
                break;
            case R.id.btnget8:
                switch (flag){
                    case 1:
                        if(!wj33.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<300)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=33;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj43.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<200)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=43;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 3:
                        if(!wj53.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<100)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=53;
                                showNormalDialog();

                            }
                        }
                        break;
                }
                break;
            case R.id.btnget9:
                switch (flag){
                    case 1:
                        if(!wj34.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<300)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=34;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj44.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<200)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=44;
                                showNormalDialog();

                            }
                        }
                        break;

                }
                break;
            case R.id.btnget10:
                switch (flag){
                    case 1:
                        if(!wj35.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<300)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=35;
                                showNormalDialog();

                            }
                        }
                        break;
                    case 2:
                        if(!wj45.equals("true"))
                        {
                            if(Integer.parseInt(text10.getText().toString())<300)
                            {
                                Toast.makeText(gsspshop.this, "国士碎片数量不足！", Toast.LENGTH_SHORT).show();
                            }
                            else
                            {
                                id=45;
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
                        image1.setImageResource(R.mipmap.wanglang);
                        image2.setImageResource(R.mipmap.w27);
                        image3.setImageResource(R.mipmap.w28);
                        image4.setImageResource(R.mipmap.w29);
                        image5.setImageResource(R.mipmap.w30);
                        image6.setImageResource(R.mipmap.w31);
                        image7.setImageResource(R.mipmap.w32);
                        image8.setImageResource(R.mipmap.w33);
                        image9.setImageResource(R.mipmap.w34);
                        image10.setImageResource(R.mipmap.w35);
                        jiangfu6.setImageResource(R.mipmap.gssp);
                        jiangfu7.setImageResource(R.mipmap.gssp);
                        jiangfu8.setImageResource(R.mipmap.gssp);
                        jiangfu9.setImageResource(R.mipmap.gssp);
                        jiangfu10.setImageResource(R.mipmap.gssp);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj8.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("3000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj27.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("800");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj28.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("500");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj29.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("500");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj30.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("500");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj31.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("500");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj32.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj33.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("300");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj34.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("300");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj35.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj8.equals("true")){
                            get1.setText("");
                            jftext1.setText("3000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj27.equals("true")){
                            get2.setText("");
                            jftext2.setText("800");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj28.equals("true")){
                            get3.setText("");
                            jftext3.setText("500");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj29.equals("true")){
                            get4.setText("");
                            jftext4.setText("500");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj30.equals("true")){
                            get5.setText("");
                            jftext5.setText("500");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj31.equals("true")){
                            get6.setText("");
                            jftext6.setText("500");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj32.equals("true")){
                            get7.setText("");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj33.equals("true")){
                            get8.setText("");
                            jftext8.setText("300");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj34.equals("true")){
                            get9.setText("");
                            jftext9.setText("300");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj35.equals("true")){
                            get10.setText("");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.w36);
                        image2.setImageResource(R.mipmap.w37);
                        image3.setImageResource(R.mipmap.w38);
                        image4.setImageResource(R.mipmap.w39);
                        image5.setImageResource(R.mipmap.w40);
                        image6.setImageResource(R.mipmap.w41);
                        image7.setImageResource(R.mipmap.w42);
                        image8.setImageResource(R.mipmap.w43);
                        image9.setImageResource(R.mipmap.w44);
                        image10.setImageResource(R.mipmap.w45);
                        jiangfu6.setImageResource(R.mipmap.gssp);
                        jiangfu7.setImageResource(R.mipmap.gssp);
                        jiangfu8.setImageResource(R.mipmap.gssp);
                        jiangfu9.setImageResource(R.mipmap.gssp);
                        jiangfu10.setImageResource(R.mipmap.gssp);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj36.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("100");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj37.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("500");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj38.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("200");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj39.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("200");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj40.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("300");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj41.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj42.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj43.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("200");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj44.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("200");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj45.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj36.equals("true")){
                            get1.setText("");
                            jftext1.setText("100");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj37.equals("true")){
                            get2.setText("");
                            jftext2.setText("500");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj38.equals("true")){
                            get3.setText("");
                            jftext3.setText("200");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj39.equals("true")){
                            get4.setText("");
                            jftext4.setText("200");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj40.equals("true")){
                            get5.setText("");
                            jftext5.setText("300");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj41.equals("true")){
                            get6.setText("");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj42.equals("true")){
                            get7.setText("");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj43.equals("true")){
                            get8.setText("");
                            jftext8.setText("200");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj44.equals("true")){
                            get9.setText("");
                            jftext9.setText("200");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj45.equals("true")){
                            get10.setText("");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.w46);
                        image2.setImageResource(R.mipmap.w47);
                        image3.setImageResource(R.mipmap.w48);
                        image4.setImageResource(R.mipmap.w49);
                        image5.setImageResource(R.mipmap.w50);
                        image6.setImageResource(R.mipmap.w51);
                        image7.setImageResource(R.mipmap.w52);
                        image8.setImageResource(R.mipmap.w53);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        get9.setText("");
                        get10.setText("");
                        jftext9.setText("");
                        jftext10.setText("");
                        btnget9.setText("");
                        btnget10.setText("");
                        btnget9.setBackgroundResource(0x00000000);
                        btnget10.setBackgroundResource(0x00000000);
                        jiangfu9.setImageResource(0);
                        jiangfu10.setImageResource(0);
                        if(wj46.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("200");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj47.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("100");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj48.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj49.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("100");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj50.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("100");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj51.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj52.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext7.setText("100");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj53.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext8.setText("100");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(!wj46.equals("true")){
                            get1.setText("");
                            jftext1.setText("200");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj47.equals("true")){
                            get2.setText("");
                            jftext2.setText("100");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj48.equals("true")){
                            get3.setText("");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj49.equals("true")){
                            get4.setText("");
                            jftext4.setText("100");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj50.equals("true")){
                            get5.setText("");
                            jftext5.setText("100");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj51.equals("true")){
                            get6.setText("");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj52.equals("true")){
                            get7.setText("");
                            jftext7.setText("100");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj53.equals("true")){
                            get8.setText("");
                            jftext8.setText("100");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
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
                        image1.setImageResource(R.mipmap.wanglang);
                        image2.setImageResource(R.mipmap.w27);
                        image3.setImageResource(R.mipmap.w28);
                        image4.setImageResource(R.mipmap.w29);
                        image5.setImageResource(R.mipmap.w30);
                        image6.setImageResource(R.mipmap.w31);
                        image7.setImageResource(R.mipmap.w32);
                        image8.setImageResource(R.mipmap.w33);
                        image9.setImageResource(R.mipmap.w34);
                        image10.setImageResource(R.mipmap.w35);
                        jiangfu6.setImageResource(R.mipmap.gssp);
                        jiangfu7.setImageResource(R.mipmap.gssp);
                        jiangfu8.setImageResource(R.mipmap.gssp);
                        jiangfu9.setImageResource(R.mipmap.gssp);
                        jiangfu10.setImageResource(R.mipmap.gssp);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj8.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("3000");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj27.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("800");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj28.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("500");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj29.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("500");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj30.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("500");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj31.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("500");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj32.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj33.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("300");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj34.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("300");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj35.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj8.equals("true")){
                            get1.setText("");
                            jftext1.setText("3000");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj27.equals("true")){
                            get2.setText("");
                            jftext2.setText("800");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj28.equals("true")){
                            get3.setText("");
                            jftext3.setText("500");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj29.equals("true")){
                            get4.setText("");
                            jftext4.setText("500");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj30.equals("true")){
                            get5.setText("");
                            jftext5.setText("500");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj31.equals("true")){
                            get6.setText("");
                            jftext6.setText("500");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj32.equals("true")){
                            get7.setText("");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj33.equals("true")){
                            get8.setText("");
                            jftext8.setText("300");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj34.equals("true")){
                            get9.setText("");
                            jftext9.setText("300");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj35.equals("true")){
                            get10.setText("");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.w36);
                        image2.setImageResource(R.mipmap.w37);
                        image3.setImageResource(R.mipmap.w38);
                        image4.setImageResource(R.mipmap.w39);
                        image5.setImageResource(R.mipmap.w40);
                        image6.setImageResource(R.mipmap.w41);
                        image7.setImageResource(R.mipmap.w42);
                        image8.setImageResource(R.mipmap.w43);
                        image9.setImageResource(R.mipmap.w44);
                        image10.setImageResource(R.mipmap.w45);
                        jiangfu6.setImageResource(R.mipmap.gssp);
                        jiangfu7.setImageResource(R.mipmap.gssp);
                        jiangfu8.setImageResource(R.mipmap.gssp);
                        jiangfu9.setImageResource(R.mipmap.gssp);
                        jiangfu10.setImageResource(R.mipmap.gssp);
                        btnget6.setText("兑换");
                        btnget7.setText("兑换");
                        btnget8.setText("兑换");
                        btnget9.setText("兑换");
                        btnget10.setText("兑换");
                        if(wj36.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("100");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj37.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("500");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj38.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("200");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj39.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("200");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj40.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("300");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj41.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj42.equals("true")){
                            get7.setText("已\n拥\n有");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj43.equals("true")){
                            get8.setText("已\n拥\n有");
                            jftext8.setText("200");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(wj44.equals("true")){
                            get9.setText("已\n拥\n有");
                            jftext9.setText("200");
                            jftext9.setTextColor(0xff9C1C1A);
                            btnget9.setBackgroundResource(R.animator.jbs);
                            btnget9.setTextColor(0xffE78A14);
                        }
                        if(wj45.equals("true")){
                            get10.setText("已\n拥\n有");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xff9C1C1A);
                            btnget10.setBackgroundResource(R.animator.jbs);
                            btnget10.setTextColor(0xffE78A14);
                        }
                        if(!wj36.equals("true")){
                            get1.setText("");
                            jftext1.setText("100");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj37.equals("true")){
                            get2.setText("");
                            jftext2.setText("500");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj38.equals("true")){
                            get3.setText("");
                            jftext3.setText("200");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj39.equals("true")){
                            get4.setText("");
                            jftext4.setText("200");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj40.equals("true")){
                            get5.setText("");
                            jftext5.setText("300");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj41.equals("true")){
                            get6.setText("");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj42.equals("true")){
                            get7.setText("");
                            jftext7.setText("500");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj43.equals("true")){
                            get8.setText("");
                            jftext8.setText("200");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        if(!wj44.equals("true")){
                            get9.setText("");
                            jftext9.setText("200");
                            jftext9.setTextColor(0xffffffff);
                            btnget9.setBackgroundResource(R.animator.jbsgray);
                            btnget9.setTextColor(0xffffffff);
                        }
                        if(!wj45.equals("true")){
                            get10.setText("");
                            jftext10.setText("300");
                            jftext10.setTextColor(0xffffffff);
                            btnget10.setBackgroundResource(R.animator.jbsgray);
                            btnget10.setTextColor(0xffffffff);
                        }
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.w46);
                        image2.setImageResource(R.mipmap.w47);
                        image3.setImageResource(R.mipmap.w48);
                        image4.setImageResource(R.mipmap.w49);
                        image5.setImageResource(R.mipmap.w50);
                        image6.setImageResource(R.mipmap.w51);
                        image7.setImageResource(R.mipmap.w52);
                        image8.setImageResource(R.mipmap.w53);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        get9.setText("");
                        get10.setText("");
                        jftext9.setText("");
                        jftext10.setText("");
                        btnget9.setText("");
                        btnget10.setText("");
                        btnget9.setBackgroundResource(0x00000000);
                        btnget10.setBackgroundResource(0x00000000);
                        jiangfu9.setImageResource(0);
                        jiangfu10.setImageResource(0);
                        if(wj46.equals("true")){
                            get1.setText("已\n拥\n有");
                            jftext1.setText("200");
                            jftext1.setTextColor(0xff9C1C1A);
                            btnget1.setBackgroundResource(R.animator.jbs);
                            btnget1.setTextColor(0xffE78A14);
                        }
                        if(wj47.equals("true")){
                            get2.setText("已\n拥\n有");
                            jftext2.setText("100");
                            jftext2.setTextColor(0xff9C1C1A);
                            btnget2.setBackgroundResource(R.animator.jbs);
                            btnget2.setTextColor(0xffE78A14);
                        }
                        if(wj48.equals("true")){
                            get3.setText("已\n拥\n有");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xff9C1C1A);
                            btnget3.setBackgroundResource(R.animator.jbs);
                            btnget3.setTextColor(0xffE78A14);
                        }
                        if(wj49.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext4.setText("100");
                            jftext4.setTextColor(0xff9C1C1A);
                            btnget4.setBackgroundResource(R.animator.jbs);
                            btnget4.setTextColor(0xffE78A14);
                        }
                        if(wj50.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext5.setText("100");
                            jftext5.setTextColor(0xff9C1C1A);
                            btnget5.setBackgroundResource(R.animator.jbs);
                            btnget5.setTextColor(0xffE78A14);
                        }
                        if(wj51.equals("true")){
                            get6.setText("已\n拥\n有");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xff9C1C1A);
                            btnget6.setBackgroundResource(R.animator.jbs);
                            btnget6.setTextColor(0xffE78A14);
                        }
                        if(wj52.equals("true")){
                            get4.setText("已\n拥\n有");
                            jftext7.setText("100");
                            jftext7.setTextColor(0xff9C1C1A);
                            btnget7.setBackgroundResource(R.animator.jbs);
                            btnget7.setTextColor(0xffE78A14);
                        }
                        if(wj53.equals("true")){
                            get5.setText("已\n拥\n有");
                            jftext8.setText("100");
                            jftext8.setTextColor(0xff9C1C1A);
                            btnget8.setBackgroundResource(R.animator.jbs);
                            btnget8.setTextColor(0xffE78A14);
                        }
                        if(!wj46.equals("true")){
                            get1.setText("");
                            jftext1.setText("200");
                            jftext1.setTextColor(0xffffffff);
                            btnget1.setBackgroundResource(R.animator.jbsgray);
                            btnget1.setTextColor(0xffffffff);
                        }
                        if(!wj47.equals("true")){
                            get2.setText("");
                            jftext2.setText("100");
                            jftext2.setTextColor(0xffffffff);
                            btnget2.setBackgroundResource(R.animator.jbsgray);
                            btnget2.setTextColor(0xffffffff);
                        }
                        if(!wj48.equals("true")){
                            get3.setText("");
                            jftext3.setText("100");
                            jftext3.setTextColor(0xffffffff);
                            btnget3.setBackgroundResource(R.animator.jbsgray);
                            btnget3.setTextColor(0xffffffff);
                        }
                        if(!wj49.equals("true")){
                            get4.setText("");
                            jftext4.setText("100");
                            jftext4.setTextColor(0xffffffff);
                            btnget4.setBackgroundResource(R.animator.jbsgray);
                            btnget4.setTextColor(0xffffffff);
                        }
                        if(!wj50.equals("true")){
                            get5.setText("");
                            jftext5.setText("100");
                            jftext5.setTextColor(0xffffffff);
                            btnget5.setBackgroundResource(R.animator.jbsgray);
                            btnget5.setTextColor(0xffffffff);
                        }
                        if(!wj51.equals("true")){
                            get6.setText("");
                            jftext6.setText("100");
                            jftext6.setTextColor(0xffffffff);
                            btnget6.setBackgroundResource(R.animator.jbsgray);
                            btnget6.setTextColor(0xffffffff);
                        }
                        if(!wj52.equals("true")){
                            get7.setText("");
                            jftext7.setText("100");
                            jftext7.setTextColor(0xffffffff);
                            btnget7.setBackgroundResource(R.animator.jbsgray);
                            btnget7.setTextColor(0xffffffff);
                        }
                        if(!wj53.equals("true")){
                            get8.setText("");
                            jftext8.setText("100");
                            jftext8.setTextColor(0xffffffff);
                            btnget8.setBackgroundResource(R.animator.jbsgray);
                            btnget8.setTextColor(0xffffffff);
                        }
                        break;
                }
                break;
            case R.id.back:
                flag=1;
                finish();
                Intent intent11=new Intent(gsspshop.this, main.class);
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
            Intent intent11=new Intent(gsspshop.this, main.class);
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
                new AlertDialog.Builder(gsspshop.this);
        normalDialog.setTitle("Tips");
        normalDialog.setMessage("\n       确认兑换?");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if(id==8) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 3000;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得王朗!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj10(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "王朗");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==27) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 800;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得王允!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj27(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "王允");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==28) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得管辂!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj28(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "管辂");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==29) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得蒲元!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj29(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "蒲元");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==30) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得王双!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj30(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "王双");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==31) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得皇甫嵩!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj31(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "皇甫嵩");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==32) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得花鬟!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj32(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "花鬟");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==33) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 300;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj33(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "辛宪英");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==34) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 300;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj34(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "孙鲁育");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==35) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 300;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj35(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "辛毗");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==36) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj36(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "李肃");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==37) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得张温!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj37(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "张温");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==38) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 200;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj38(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "伊籍");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==39) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 200;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj39(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "张恭");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==40) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 300;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj40(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "吕凯");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==41) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj41(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "卫温诸葛直");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==42) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 500;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            texttip.setText("恭喜玩家" + username + "通过国士碎片商店兑换获得卑弥呼!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj42(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "卑弥呼");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==43) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 200;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj43(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "灵雎");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==44) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 200;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj44(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "诸葛果");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==45) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 300;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj45(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "诸葛恪");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==46) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 200;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj46(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "群赵云");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==47) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj47(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "李傕郭汜");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==48) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj48(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "夏侯霸");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==49) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj49(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "群马超");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==50) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj50(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "张宝");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==51) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj51(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "大乔小乔");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==52) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj52(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "潘凤");
                            bundle.putCharSequence("userName", username);
                            intent11.putExtras(bundle);
                            startActivity(intent11);
                        }
                        if(id==53) {
                            int jfnow = Integer.parseInt(text10.getText().toString()) - 100;
                            text10.setText(""+jfnow);
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username,""+jfnow);
                            }).start();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatewj.loginByGetwj53(username, "true");
                            }).start();
                            flag=1;
                            finish();
                            Intent intent10=new Intent(gsspshop.this, gsspshop.class);
                            intent10.putExtra("userName",username);
                            startActivity(intent10);
                            Intent intent11 = new Intent(gsspshop.this, getguansuo.class);
                            Bundle bundle = new Bundle();
                            bundle.putCharSequence("wj", "邢道荣");
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
