package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xuexiang.xupdatedemo.Pair;
import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.WeightRandom;
import com.xuexiang.xupdatedemo.jiangxing;
import com.xuexiang.xupdatedemo.login;
import com.xuexiang.xupdatedemo.mes;
import com.xuexiang.xupdatedemo.tip;
import com.xuexiang.xupdatedemo.updatecoins;
import com.xuexiang.xupdatedemo.updategssp;
import com.xuexiang.xupdatedemo.updatejl;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class jlzs extends AppCompatActivity implements View.OnClickListener {
    private ImageView jl1,jl2,jl3,jl4,back;
    private TextView jltext1,jltext2,jltext3,jltext4,yb,yb2,texttip,zszt;
    private Button  btn1,btn2,btn3,btn4;
    private  String username,jlid1,jlid2,jlid3,jlid4;
    private int zsd,jflag,jflag2;
    private boolean flag1=true,flag2=true,flag3=true,flag4=true;
    private  java.util.Timer time;
    private TimerTask task;
    Pair[] options2 = new Pair[]{new Pair("转生成功",1),
            new Pair("转生失败",1)};//a-s
    Pair[] options1 = new Pair[]{new Pair("转生成功",8),
            new Pair("转生失败",2)};//b-a
    Pair[] options3 = new Pair[]{new Pair("转生成功",1)};//e-d,d-c,c-b,s-s;
    Pair[] options11 = new Pair[]{new Pair("张梁",1),
            new Pair("文聘",1), new Pair("祖茂",1)};
    Pair[] options12 = new Pair[]{new Pair("踏顿",1),
            new Pair("郭淮",1), new Pair("孙鲁班",1),new Pair("徐盛",1),
            new Pair("马忠",1), new Pair("张嶷",1)};
    Pair[] options13 = new Pair[]{new Pair("荀攸",3),
            new Pair("华雄",3), new Pair("袁绍",2),new Pair("郭皇后",1),
            new Pair("曹叡",1), new Pair("孙登",2), new Pair("关银屏",1)};
    Pair[] options14 = new Pair[]{new Pair("关羽",1),
            new Pair("姜维",3), new Pair("戏志才",1),new Pair("祝融",1),
            new Pair("小乔",3), new Pair("郭嘉",2), new Pair("陆逊",3), new Pair("貂蝉",1)};
    Pair[] options18 = new Pair[]{new Pair("诸葛果",3), new Pair("灵雎",1), new Pair("神周瑜",2)};
    Pair[] options15 = new Pair[]{new Pair("灵雎",1), new Pair("神周瑜",2)};
    Pair[] options16 = new Pair[]{new Pair("诸葛果",3), new Pair("神周瑜",2)};
    Pair[] options17 = new Pair[]{new Pair("诸葛果",3), new Pair("灵雎",1)};
    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jllzs);
        Intent intent = getIntent();
         username = intent.getStringExtra("userName");
         jl1=findViewById(R.id.jl1);
         jl2=findViewById(R.id.jl2);
         jl3=findViewById(R.id.jl3);
         jl4=findViewById(R.id.jl4);
         back=findViewById(R.id.back);
        zszt=findViewById(R.id.zszt);
         texttip=findViewById(R.id.texttip);
        jltext1=findViewById(R.id.jltext1);
        jltext2=findViewById(R.id.jltext2);
        jltext3=findViewById(R.id.jltext3);
        jltext4=findViewById(R.id.jltext4);
        yb=findViewById(R.id.yb);
        yb2=findViewById(R.id.yb2);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        jl1.setOnClickListener(this);
        jl2.setOnClickListener(this);
        jl3.setOnClickListener(this);
        jl4.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        back.setOnClickListener(this);
        new Thread(() -> {
            final String response = mes.loginByPost(username);
            runOnUiThread(() -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String zt = jsonObject.getString("查询状态");
                    zsd=jsonObject.getInt("转生丹数");
                    jlid1 = jsonObject.getString("jl1");
                    jlid2 = jsonObject.getString("jl2");
                    jlid3 = jsonObject.getString("jl3");
                    jlid4 = jsonObject.getString("jl4");
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                            if(!jlid1.equals("null")) {

                                    jltext1.setText(jlid1);


                            }
                            else
                            {
                                btn1.setBackgroundResource(0x00000000);
                                btn1.setText("");
                                jltext1.setText("");
                                jl1.setImageResource(0);
                            }
                            if(!jlid2.equals("null")) {

                                    jltext2.setText(jlid2);


                            }
                            else
                            {
                                btn2.setBackgroundResource(0x00000000);
                                btn2.setText("");
                                jltext2.setText("");
                                jl2.setImageResource(0);
                            }
                            if(!jlid3.equals("null")) {


                                    jltext3.setText(jlid3);

                            }
                            else
                            {
                                btn3.setBackgroundResource(0x00000000);
                                btn3.setText("");
                                jltext3.setText("");
                                jl3.setImageResource(0);
                            }
                            if(!jlid4.equals("null")) {
                                    jltext4.setText(jlid4);

                            }
                            else
                            {
                                btn4.setBackgroundResource(0x00000000);
                                btn4.setText("");
                                jltext4.setText("");
                                jl4.setImageResource(0);
                            }
                            switch (jlid1)
                            {
                                case "公孙瓒":
                                    jltext1.setTextColor(0xffffffff);
                                    jl1.setImageResource(R.mipmap.jl1);
                                    break;
                                case "张梁":
                                    jltext1.setTextColor(0xff2DE936);
                                    jl1.setImageResource(R.mipmap.jl2);
                                    break;
                                case "文聘":
                                    jltext1.setTextColor(0xff2DE936);
                                    jl1.setImageResource(R.mipmap.jl3);
                                    break;
                                case "祖茂":
                                    jltext1.setTextColor(0xff2DE936);
                                    jl1.setImageResource(R.mipmap.jl4);
                                    break;
                                case "踏顿":
                                    jltext1.setTextColor(0xffC22FE9);
                                    jl1.setImageResource(R.mipmap.jl5);
                                    break;
                                case "郭淮":
                                    jltext1.setTextColor(0xffC22FE9);
                                    jl1.setImageResource(R.mipmap.jl6);
                                    break;
                                case "孙鲁班":
                                    jltext1.setTextColor(0xffC22FE9);
                                    jl1.setImageResource(R.mipmap.jl7);
                                    break;
                                case "徐盛":
                                    jltext1.setTextColor(0xffC22FE9);
                                    jl1.setImageResource(R.mipmap.jl8);
                                    break;
                                case "马忠":
                                    jltext1.setTextColor(0xffC22FE9);
                                    jl1.setImageResource(R.mipmap.jl9);
                                    break;
                                case "张嶷":
                                    jltext1.setTextColor(0xffC22FE9);
                                    jl1.setImageResource(R.mipmap.jl10);
                                    break;
                                case "荀攸":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl11);
                                    break;
                                case "华雄":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl12);
                                    break;
                                case "袁绍":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl13);
                                    break;
                                case "郭皇后":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl14);
                                    break;
                                case "曹叡":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl15);
                                    break;
                                case "孙登":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl16);
                                    break;
                                case "关银屏":
                                    jltext1.setTextColor(0xffEEC40A);
                                    jl1.setImageResource(R.mipmap.jl17);
                                    break;
                                case "关羽":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl18);
                                    break;
                                case "姜维":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl19);
                                    break;
                                case "戏志才":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl20);
                                    break;
                                case "祝融":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl21);
                                    break;
                                case "诸葛亮":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl22);
                                    break;
                                case "大乔":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl23);
                                    break;
                                case "小乔":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl24);
                                    break;
                                case "郭嘉":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl25);
                                    break;
                                case "陆逊":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl26);
                                    break;
                                case "貂蝉":
                                    jltext1.setTextColor(0xffF4511E);
                                    jl1.setImageResource(R.mipmap.jl27);
                                    break;
                                case "诸葛果":
                                    jltext1.setTextColor(0xffF0201A);
                                    jl1.setImageResource(R.mipmap.jl28);
                                    break;
                                case "年兽":
                                    jltext1.setTextColor(0xffF0201A);
                                    jl1.setImageResource(R.mipmap.jl29);
                                    break;
                                case "神赵云":
                                    jltext1.setTextColor(0xffF0201A);
                                    jl1.setImageResource(R.mipmap.jl30);
                                    break;
                                case "灵雎":
                                    jltext1.setTextColor(0xffF0201A);
                                    jl1.setImageResource(R.mipmap.jl31);
                                    break;
                                case "神周瑜":
                                    jltext1.setTextColor(0xffF0201A);
                                    jl1.setImageResource(R.mipmap.jl32);
                                    break;
                            }
                            switch (jlid2)
                            {
                                case "公孙瓒":
                                    jltext2.setTextColor(0xffffffff);
                                    jl2.setImageResource(R.mipmap.jl1);
                                    break;
                                case "张梁":
                                    jltext2.setTextColor(0xff2DE936);
                                    jl2.setImageResource(R.mipmap.jl2);
                                    break;
                                case "文聘":
                                    jltext2.setTextColor(0xff2DE936);
                                    jl2.setImageResource(R.mipmap.jl3);
                                    break;
                                case "祖茂":
                                    jltext2.setTextColor(0xff2DE936);
                                    jl2.setImageResource(R.mipmap.jl4);
                                    break;
                                case "踏顿":
                                    jltext2.setTextColor(0xffC22FE9);
                                    jl2.setImageResource(R.mipmap.jl5);
                                    break;
                                case "郭淮":
                                    jltext2.setTextColor(0xffC22FE9);
                                    jl2.setImageResource(R.mipmap.jl6);
                                    break;
                                case "孙鲁班":
                                    jltext2.setTextColor(0xffC22FE9);
                                    jl2.setImageResource(R.mipmap.jl7);
                                    break;
                                case "徐盛":
                                    jltext2.setTextColor(0xffC22FE9);
                                    jl2.setImageResource(R.mipmap.jl8);
                                    break;
                                case "马忠":
                                    jltext2.setTextColor(0xffC22FE9);
                                    jl2.setImageResource(R.mipmap.jl9);
                                    break;
                                case "张嶷":
                                    jltext2.setTextColor(0xffC22FE9);
                                    jl2.setImageResource(R.mipmap.jl10);
                                    break;
                                case "荀攸":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl11);
                                    break;
                                case "华雄":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl12);
                                    break;
                                case "袁绍":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl13);
                                    break;
                                case "郭皇后":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl14);
                                    break;
                                case "曹叡":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl15);
                                    break;
                                case "孙登":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl16);
                                    break;
                                case "关银屏":
                                    jltext2.setTextColor(0xffEEC40A);
                                    jl2.setImageResource(R.mipmap.jl17);
                                    break;
                                case "关羽":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl18);
                                    break;
                                case "姜维":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl19);
                                    break;
                                case "戏志才":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl20);
                                    break;
                                case "祝融":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl21);
                                    break;
                                case "诸葛亮":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl22);
                                    break;
                                case "大乔":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl23);
                                    break;
                                case "小乔":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl24);
                                    break;
                                case "郭嘉":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl25);
                                    break;
                                case "陆逊":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl26);
                                    break;
                                case "貂蝉":
                                    jltext2.setTextColor(0xffF4511E);
                                    jl2.setImageResource(R.mipmap.jl27);
                                    break;
                                case "诸葛果":
                                    jltext2.setTextColor(0xffF0201A);
                                    jl2.setImageResource(R.mipmap.jl28);
                                    break;
                                case "年兽":
                                    jltext2.setTextColor(0xffF0201A);
                                    jl2.setImageResource(R.mipmap.jl29);
                                    break;
                                case "神赵云":
                                    jltext2.setTextColor(0xffF0201A);
                                    jl2.setImageResource(R.mipmap.jl30);
                                    break;
                                case "灵雎":
                                    jltext2.setTextColor(0xffF0201A);
                                    jl2.setImageResource(R.mipmap.jl31);
                                    break;
                                case "神周瑜":
                                    jltext2.setTextColor(0xffF0201A);
                                    jl2.setImageResource(R.mipmap.jl32);
                                    break;
                            }
                            switch (jlid3)
                            {
                                case "公孙瓒":
                                    jltext3.setTextColor(0xffffffff);
                                    jl3.setImageResource(R.mipmap.jl1);
                                    break;
                                case "张梁":
                                    jltext3.setTextColor(0xff2DE936);
                                    jl3.setImageResource(R.mipmap.jl2);
                                    break;
                                case "文聘":
                                    jltext3.setTextColor(0xff2DE936);
                                    jl3.setImageResource(R.mipmap.jl3);
                                    break;
                                case "祖茂":
                                    jltext3.setTextColor(0xff2DE936);
                                    jl3.setImageResource(R.mipmap.jl4);
                                    break;
                                case "踏顿":
                                    jltext3.setTextColor(0xffC22FE9);
                                    jl3.setImageResource(R.mipmap.jl5);
                                    break;
                                case "郭淮":
                                    jltext3.setTextColor(0xffC22FE9);
                                    jl3.setImageResource(R.mipmap.jl6);
                                    break;
                                case "孙鲁班":
                                    jltext3.setTextColor(0xffC22FE9);
                                    jl3.setImageResource(R.mipmap.jl7);
                                    break;
                                case "徐盛":
                                    jltext3.setTextColor(0xffC22FE9);
                                    jl3.setImageResource(R.mipmap.jl8);
                                    break;
                                case "马忠":
                                    jltext3.setTextColor(0xffC22FE9);
                                    jl3.setImageResource(R.mipmap.jl9);
                                    break;
                                case "张嶷":
                                    jltext3.setTextColor(0xffC22FE9);
                                    jl3.setImageResource(R.mipmap.jl10);
                                    break;
                                case "荀攸":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl11);
                                    break;
                                case "华雄":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl12);
                                    break;
                                case "袁绍":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl13);
                                    break;
                                case "郭皇后":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl14);
                                    break;
                                case "曹叡":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl15);
                                    break;
                                case "孙登":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl16);
                                    break;
                                case "关银屏":
                                    jltext3.setTextColor(0xffEEC40A);
                                    jl3.setImageResource(R.mipmap.jl17);
                                    break;
                                case "关羽":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl18);
                                    break;
                                case "姜维":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl19);
                                    break;
                                case "戏志才":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl20);
                                    break;
                                case "祝融":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl21);
                                    break;
                                case "诸葛亮":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl22);
                                    break;
                                case "大乔":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl23);
                                    break;
                                case "小乔":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl24);
                                    break;
                                case "郭嘉":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl25);
                                    break;
                                case "陆逊":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl26);
                                    break;
                                case "貂蝉":
                                    jltext3.setTextColor(0xffF4511E);
                                    jl3.setImageResource(R.mipmap.jl27);
                                    break;
                                case "诸葛果":
                                    jltext3.setTextColor(0xffF0201A);
                                    jl3.setImageResource(R.mipmap.jl28);
                                    break;
                                case "年兽":
                                    jltext3.setTextColor(0xffF0201A);
                                    jl3.setImageResource(R.mipmap.jl29);
                                    break;
                                case "神赵云":
                                    jltext3.setTextColor(0xffF0201A);
                                    jl3.setImageResource(R.mipmap.jl30);
                                    break;
                                case "灵雎":
                                    jltext3.setTextColor(0xffF0201A);
                                    jl3.setImageResource(R.mipmap.jl31);
                                    break;
                                case "神周瑜":
                                    jltext3.setTextColor(0xffF0201A);
                                    jl3.setImageResource(R.mipmap.jl32);
                                    break;
                            }
                            switch (jlid4)
                            {
                                case "公孙瓒":
                                    jltext4.setTextColor(0xffffffff);
                                    jl4.setImageResource(R.mipmap.jl1);
                                    break;
                                case "张梁":
                                    jltext4.setTextColor(0xff2DE936);
                                    jl4.setImageResource(R.mipmap.jl2);
                                    break;
                                case "文聘":
                                    jltext4.setTextColor(0xff2DE936);
                                    jl4.setImageResource(R.mipmap.jl3);
                                    break;
                                case "祖茂":
                                    jltext4.setTextColor(0xff2DE936);
                                    jl4.setImageResource(R.mipmap.jl4);
                                    break;
                                case "踏顿":
                                    jltext4.setTextColor(0xffC22FE9);
                                    jl4.setImageResource(R.mipmap.jl5);
                                    break;
                                case "郭淮":
                                    jltext4.setTextColor(0xffC22FE9);
                                    jl4.setImageResource(R.mipmap.jl6);
                                    break;
                                case "孙鲁班":
                                    jltext4.setTextColor(0xffC22FE9);
                                    jl4.setImageResource(R.mipmap.jl7);
                                    break;
                                case "徐盛":
                                    jltext4.setTextColor(0xffC22FE9);
                                    jl4.setImageResource(R.mipmap.jl8);
                                    break;
                                case "马忠":
                                    jltext4.setTextColor(0xffC22FE9);
                                    jl4.setImageResource(R.mipmap.jl9);
                                    break;
                                case "张嶷":
                                    jltext4.setTextColor(0xffC22FE9);
                                    jl4.setImageResource(R.mipmap.jl10);
                                    break;
                                case "荀攸":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl11);
                                    break;
                                case "华雄":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl12);
                                    break;
                                case "袁绍":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl13);
                                    break;
                                case "郭皇后":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl14);
                                    break;
                                case "曹叡":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl15);
                                    break;
                                case "孙登":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl16);
                                    break;
                                case "关银屏":
                                    jltext4.setTextColor(0xffEEC40A);
                                    jl4.setImageResource(R.mipmap.jl17);
                                    break;
                                case "关羽":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl18);
                                    break;
                                case "姜维":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl19);
                                    break;
                                case "戏志才":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl20);
                                    break;
                                case "祝融":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl21);
                                    break;
                                case "诸葛亮":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl22);
                                    break;
                                case "大乔":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl23);
                                    break;
                                case "小乔":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl24);
                                    break;
                                case "郭嘉":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl25);
                                    break;
                                case "陆逊":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl26);
                                    break;
                                case "貂蝉":
                                    jltext4.setTextColor(0xffF4511E);
                                    jl4.setImageResource(R.mipmap.jl27);
                                    break;
                                case "诸葛果":
                                    jltext4.setTextColor(0xffF0201A);
                                    jl4.setImageResource(R.mipmap.jl28);
                                    break;
                                case "年兽":
                                    jltext4.setTextColor(0xffF0201A);
                                    jl4.setImageResource(R.mipmap.jl29);
                                    break;
                                case "神赵云":
                                    jltext4.setTextColor(0xffF0201A);
                                    jl4.setImageResource(R.mipmap.jl30);
                                    break;
                                case "灵雎":
                                    jltext4.setTextColor(0xffF0201A);
                                    jl4.setImageResource(R.mipmap.jl31);
                                    break;
                                case "神周瑜":
                                    jltext4.setTextColor(0xffF0201A);
                                    jl4.setImageResource(R.mipmap.jl32);
                                    break;
                            }
                            yb.setText(""+zsd);
                        } else {
                            Toast.makeText(jlzs.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(jlzs.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(jlzs.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(jlzs.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
            case R.id.jl1:
                jflag2 = 1;
                showNormalDialog6();
                break;
            case R.id.jl2:
                jflag2 = 2;
                showNormalDialog6();
                break;
            case R.id.jl3:
                jflag2 = 3;
                showNormalDialog6();
                break;
            case R.id.jl4:
                jflag2 = 4;
                showNormalDialog6();
                break;
            case R.id.back:
                flag1=true;
                flag2=true;
                flag3=true;
                flag4=true;
                jflag=0;
                finish();
                Intent intent11=new Intent(jlzs.this, main.class);
                intent11.putExtra("userName",username);
                startActivity(intent11);
                break;
            case R.id.btn1:
                if(jltext4.getText().toString().equals("null")) {
                    btn4.setBackgroundResource(0x00000000);
                    btn4.setText("");
                    jltext4.setText("");
                    jl4.setImageResource(0);
                }
                if(jltext3.getText().toString().equals("null")) {
                    btn3.setBackgroundResource(0x00000000);
                    btn3.setText("");
                    jltext3.setText("");
                    jl3.setImageResource(0);
                }
                if(jltext2.getText().toString().equals("null")) {
                    btn2.setBackgroundResource(0x00000000);
                    btn2.setText("");
                    jltext2.setText("");
                    jl2.setImageResource(0);
                }
                jflag=1;
                zszt.setText("");
                if(flag1) {
                    switch (jltext1.getText().toString()) {
                        case "公孙瓒":
                            yb2.setText("0");
                            showNormalDialog();
                            break;
                        case "张梁":
                        case "文聘":
                        case "祖茂":
                            yb2.setText("1");
                            if (Integer.parseInt(yb.getText().toString()) < 1) {
                                btn1.setBackgroundResource(R.animator.jbs2);
                                btn1.setTextColor(0xffE53935);
                                flag1=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog1();
                            }
                            break;
                        case "踏顿":
                        case "张嶷":
                        case "马忠":
                        case "徐盛":
                        case "孙鲁班":
                        case "郭淮":
                            yb2.setText("3");
                            if (Integer.parseInt(yb.getText().toString()) < 3) {
                                btn1.setBackgroundResource(R.animator.jbs2);
                                btn1.setTextColor(0xffE53935);
                                flag1=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog2();
                            }
                            break;
                        case "荀攸":
                        case "华雄":
                        case "袁绍":
                        case "郭皇后":
                        case "曹叡":
                        case "孙登":
                        case "关银屏":
                            yb2.setText("6");
                            if (Integer.parseInt(yb.getText().toString()) < 6) {
                                btn1.setBackgroundResource(R.animator.jbs2);
                                btn1.setTextColor(0xffE53935);
                                flag1=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog3();
                            }
                            break;
                        case "关羽":
                        case "姜维":
                        case "戏志才":
                        case "祝融":
                        case "诸葛亮":
                        case "大乔":
                        case "小乔":
                        case "郭嘉":
                        case "陆逊":
                        case "貂蝉":
                            yb2.setText("10");
                            if (Integer.parseInt(yb.getText().toString()) < 10) {
                                btn1.setBackgroundResource(R.animator.jbs2);
                                btn1.setTextColor(0xffE53935);
                                flag1=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog4();
                            }
                            break;
                        case "诸葛果":
                        case "年兽":
                        case "神赵云":
                        case "灵雎":
                        case "神周瑜":
                            yb2.setText("20");
                            if (Integer.parseInt(yb.getText().toString()) < 20) {
                                btn1.setBackgroundResource(R.animator.jbs2);
                                btn1.setTextColor(0xffE53935);
                                flag1=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog5();
                            }
                            break;
                    }
                }
                break;
            case R.id.btn2:
                if(jltext4.getText().toString().equals("null")) {
                    btn4.setBackgroundResource(0x00000000);
                    btn4.setText("");
                    jltext4.setText("");
                    jl4.setImageResource(0);
                }
                if(jltext3.getText().toString().equals("null")) {
                    btn3.setBackgroundResource(0x00000000);
                    btn3.setText("");
                    jltext3.setText("");
                    jl3.setImageResource(0);
                }
                if(jltext1.getText().toString().equals("null")) {
                    btn1.setBackgroundResource(0x00000000);
                    btn1.setText("");
                    jltext1.setText("");
                    jl1.setImageResource(0);
                }
                jflag=2;
                zszt.setText("");
                if(flag2) {
                    switch (jltext2.getText().toString()) {
                        case "公孙瓒":
                            yb2.setText("0");
                            showNormalDialog();
                            break;
                        case "张梁":
                        case "文聘":
                        case "祖茂":
                            yb2.setText("1");
                            if (Integer.parseInt(yb.getText().toString()) < 1) {
                                btn2.setBackgroundResource(R.animator.jbs2);
                                btn2.setTextColor(0xffE53935);
                                flag2=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog1();
                            }
                            break;
                        case "踏顿":
                        case "张嶷":
                        case "马忠":
                        case "徐盛":
                        case "孙鲁班":
                        case "郭淮":
                            yb2.setText("3");
                            if (Integer.parseInt(yb.getText().toString()) < 3) {
                                btn2.setBackgroundResource(R.animator.jbs2);
                                btn2.setTextColor(0xffE53935);
                                flag2=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog2();
                            }
                            break;
                        case "荀攸":
                        case "华雄":
                        case "袁绍":
                        case "郭皇后":
                        case "曹叡":
                        case "孙登":
                        case "关银屏":
                            yb2.setText("6");
                            if (Integer.parseInt(yb.getText().toString()) < 6) {
                                btn2.setBackgroundResource(R.animator.jbs2);
                                btn2.setTextColor(0xffE53935);
                                flag2=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog3();
                            }
                            break;
                        case "关羽":
                        case "姜维":
                        case "戏志才":
                        case "祝融":
                        case "诸葛亮":
                        case "大乔":
                        case "小乔":
                        case "郭嘉":
                        case "陆逊":
                        case "貂蝉":
                            yb2.setText("10");
                            if (Integer.parseInt(yb.getText().toString()) < 10) {
                                btn2.setBackgroundResource(R.animator.jbs2);
                                btn2.setTextColor(0xffE53935);
                                flag2=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog4();
                            }
                            break;
                        case "诸葛果":
                        case "年兽":
                        case "神赵云":
                        case "灵雎":
                        case "神周瑜":
                            yb2.setText("20");
                            if (Integer.parseInt(yb.getText().toString()) < 20) {
                                btn2.setBackgroundResource(R.animator.jbs2);
                                btn2.setTextColor(0xffE53935);
                                flag2=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog5();
                            }
                            break;
                    }
                }
                break;
            case R.id.btn3:
                if(jltext4.getText().toString().equals("null")) {
                    btn4.setBackgroundResource(0x00000000);
                    btn4.setText("");
                    jltext4.setText("");
                    jl4.setImageResource(0);
                }
                if(jltext2.getText().toString().equals("null")) {
                    btn2.setBackgroundResource(0x00000000);
                    btn2.setText("");
                    jltext2.setText("");
                    jl2.setImageResource(0);
                }
                if(jltext1.getText().toString().equals("null")) {
                    btn1.setBackgroundResource(0x00000000);
                    btn1.setText("");
                    jltext1.setText("");
                    jl1.setImageResource(0);
                }
                jflag=3;
                zszt.setText("");
                if(flag3) {
                    switch (jltext3.getText().toString()) {
                        case "公孙瓒":
                            yb2.setText("0");
                            showNormalDialog();
                            break;
                        case "张梁":
                        case "文聘":
                        case "祖茂":
                            yb2.setText("1");
                            if (Integer.parseInt(yb.getText().toString()) < 1) {
                                btn3.setBackgroundResource(R.animator.jbs2);
                                btn3.setTextColor(0xffE53935);
                                flag3=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog1();
                            }
                            break;
                        case "踏顿":
                        case "张嶷":
                        case "马忠":
                        case "徐盛":
                        case "孙鲁班":
                        case "郭淮":
                            yb2.setText("3");
                            if (Integer.parseInt(yb.getText().toString()) < 3) {
                                btn3.setBackgroundResource(R.animator.jbs2);
                                btn3.setTextColor(0xffE53935);
                                flag3=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog2();
                            }
                            break;
                        case "荀攸":
                        case "华雄":
                        case "袁绍":
                        case "郭皇后":
                        case "曹叡":
                        case "孙登":
                        case "关银屏":
                            yb2.setText("6");
                            if (Integer.parseInt(yb.getText().toString()) < 6) {
                                btn3.setBackgroundResource(R.animator.jbs2);
                                btn3.setTextColor(0xffE53935);
                                flag3=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog3();
                            }
                            break;
                        case "关羽":
                        case "姜维":
                        case "戏志才":
                        case "祝融":
                        case "诸葛亮":
                        case "大乔":
                        case "小乔":
                        case "郭嘉":
                        case "陆逊":
                        case "貂蝉":
                            yb2.setText("10");
                            if (Integer.parseInt(yb.getText().toString()) < 10) {
                                btn3.setBackgroundResource(R.animator.jbs2);
                                btn3.setTextColor(0xffE53935);
                                flag3=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog4();
                            }
                            break;
                        case "诸葛果":
                        case "年兽":
                        case "神赵云":
                        case "灵雎":
                        case "神周瑜":
                            yb2.setText("20");
                            if (Integer.parseInt(yb.getText().toString()) < 20) {
                                btn3.setBackgroundResource(R.animator.jbs2);
                                btn3.setTextColor(0xffE53935);
                                flag3=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog5();
                            }
                            break;
                    }
                }
                break;
            case R.id.btn4:
                if(jltext3.getText().toString().equals("null")) {
                    btn3.setBackgroundResource(0x00000000);
                    btn3.setText("");
                    jltext3.setText("");
                    jl3.setImageResource(0);
                }
                if(jltext2.getText().toString().equals("null")) {
                    btn2.setBackgroundResource(0x00000000);
                    btn2.setText("");
                    jltext2.setText("");
                    jl2.setImageResource(0);
                }
                if(jltext1.getText().toString().equals("null")) {
                    btn1.setBackgroundResource(0x00000000);
                    btn1.setText("");
                    jltext1.setText("");
                    jl1.setImageResource(0);
                }
                jflag=4;
                zszt.setText("");
                if(flag4) {
                    switch (jltext4.getText().toString()) {
                        case "公孙瓒":
                            yb2.setText("0");
                            showNormalDialog();
                            break;
                        case "张梁":
                        case "文聘":
                        case "祖茂":
                            yb2.setText("1");
                            if (Integer.parseInt(yb.getText().toString()) < 1) {
                                btn4.setBackgroundResource(R.animator.jbs2);
                                btn4.setTextColor(0xffE53935);
                                flag4=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog1();
                            }
                            break;
                        case "踏顿":
                        case "张嶷":
                        case "马忠":
                        case "徐盛":
                        case "孙鲁班":
                        case "郭淮":
                            yb2.setText("3");
                            if (Integer.parseInt(yb.getText().toString()) < 3) {
                                btn4.setBackgroundResource(R.animator.jbs2);
                                btn4.setTextColor(0xffE53935);
                                flag4=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog2();
                            }
                            break;
                        case "荀攸":
                        case "华雄":
                        case "袁绍":
                        case "郭皇后":
                        case "曹叡":
                        case "孙登":
                        case "关银屏":
                            yb2.setText("6");
                            if (Integer.parseInt(yb.getText().toString()) < 6) {
                                btn4.setBackgroundResource(R.animator.jbs2);
                                btn4.setTextColor(0xffE53935);
                                flag4=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog3();
                            }
                            break;
                        case "关羽":
                        case "姜维":
                        case "戏志才":
                        case "祝融":
                        case "诸葛亮":
                        case "大乔":
                        case "小乔":
                        case "郭嘉":
                        case "陆逊":
                        case "貂蝉":
                            yb2.setText("10");
                            if (Integer.parseInt(yb.getText().toString()) < 10) {
                                btn4.setBackgroundResource(R.animator.jbs2);
                                btn4.setTextColor(0xffE53935);
                                flag4=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog4();
                            }
                            break;
                        case "诸葛果":
                        case "年兽":
                        case "神赵云":
                        case "灵雎":
                        case "神周瑜":
                            yb2.setText("20");
                            if (Integer.parseInt(yb.getText().toString()) < 20) {
                                btn4.setBackgroundResource(R.animator.jbs2);
                                btn4.setTextColor(0xffE53935);
                                flag4=false;
                                Toast.makeText(jlzs.this, "转生丹不足！", Toast.LENGTH_SHORT).show();
                            } else {
                                showNormalDialog5();
                            }
                            break;
                    }
                }
                break;
        }
    }
    private void showNormalDialog(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag){
            case 1:
        normalDialog.setMessage("\n       消耗转生丹*0,转生成功率100%,确认将E级将灵"+jltext1.getText().toString()+"转生吗?");
        break;
            case 2:
                normalDialog.setMessage("\n       消耗转生丹*0,转生成功率100%,确认将E级将灵"+jltext2.getText().toString()+"转生吗?");
                break;
            case 3:
                normalDialog.setMessage("\n       消耗转生丹*0,转生成功率100%,确认将E级将灵"+jltext3.getText().toString()+"转生吗?");
                break;
            case 4:
                normalDialog.setMessage("\n       消耗转生丹*0,转生成功率100%,确认将E级将灵"+jltext4.getText().toString()+"转生吗?");
        break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        yb.setText(""+(Integer.parseInt(yb.getText().toString())-0));
                        switch (jflag){
                            case 1:
                                WeightRandom random1 = new WeightRandom(options11);
                                String j1 = (String) random1.nextItem();
                                jltext1.setText(j1);
                                zszt.setText("转生成功\n恭喜你获得D级将灵:"+j1);
                                zszt.setTextColor(0xffE41111);
                                switch (j1){
                                    case "张梁":
                                        jltext1.setTextColor(0xff2DE936);
                                        jl1.setImageResource(R.mipmap.jl2);
                                        break;
                                    case "文聘":
                                        jltext1.setTextColor(0xff2DE936);
                                        jl1.setImageResource(R.mipmap.jl3);
                                        break;
                                    case "祖茂":
                                        jltext1.setTextColor(0xff2DE936);
                                        jl1.setImageResource(R.mipmap.jl4);
                                        break;
                                }
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 2:
                                WeightRandom random2 = new WeightRandom(options11);
                                String j12 = (String) random2.nextItem();
                                jltext2.setText(j12);
                                zszt.setText("转生成功\n恭喜你获得D级将灵:"+j12);
                                zszt.setTextColor(0xffE41111);
                                switch (j12){
                                    case "张梁":
                                        jltext2.setTextColor(0xff2DE936);
                                        jl2.setImageResource(R.mipmap.jl2);
                                        break;
                                    case "文聘":
                                        jltext2.setTextColor(0xff2DE936);
                                        jl2.setImageResource(R.mipmap.jl3);
                                        break;
                                    case "祖茂":
                                        jltext2.setTextColor(0xff2DE936);
                                        jl2.setImageResource(R.mipmap.jl4);
                                        break;
                                }
                                String szsd2=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 3:
                                WeightRandom random3 = new WeightRandom(options11);
                                String j13 = (String) random3.nextItem();
                                jltext3.setText(j13);
                                zszt.setText("转生成功\n恭喜你获得D级将灵:"+j13);
                                zszt.setTextColor(0xffE41111);
                                switch (j13){
                                    case "张梁":
                                        jltext3.setTextColor(0xff2DE936);
                                        jl3.setImageResource(R.mipmap.jl2);
                                        break;
                                    case "文聘":
                                        jltext3.setTextColor(0xff2DE936);
                                        jl3.setImageResource(R.mipmap.jl3);
                                        break;
                                    case "祖茂":
                                        jltext3.setTextColor(0xff2DE936);
                                        jl3.setImageResource(R.mipmap.jl4);
                                        break;
                                }
                                String szsd3=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 4:
                                WeightRandom random4 = new WeightRandom(options11);
                                String j14 = (String) random4.nextItem();
                                jltext4.setText(j14);
                                zszt.setText("转生成功\n恭喜你获得D级将灵:"+j14);
                                zszt.setTextColor(0xffE41111);
                                switch (j14){
                                    case "张梁":
                                        jltext4.setTextColor(0xff2DE936);
                                        jl4.setImageResource(R.mipmap.jl2);
                                        break;
                                    case "文聘":
                                        jltext4.setTextColor(0xff2DE936);
                                        jl4.setImageResource(R.mipmap.jl3);
                                        break;
                                    case "祖茂":
                                        jltext4.setTextColor(0xff2DE936);
                                        jl4.setImageResource(R.mipmap.jl4);
                                        break;
                                }
                                String szsd4=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
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
    private void showNormalDialog1(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag){
            case 1:
                normalDialog.setMessage("\n       消耗转生丹*1,转生成功率100%,确认将D级将灵"+jltext1.getText().toString()+"转生吗?");
                break;
            case 2:
                normalDialog.setMessage("\n       消耗转生丹*1,转生成功率100%,确认将D级将灵"+jltext2.getText().toString()+"转生吗?");
                break;
            case 3:
                normalDialog.setMessage("\n       消耗转生丹*1,转生成功率100%,确认将D级将灵"+jltext3.getText().toString()+"转生吗?");
                break;
            case 4:
                normalDialog.setMessage("\n       消耗转生丹*1,转生成功率100%,确认将D级将灵"+jltext4.getText().toString()+"转生吗?");
                break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        yb.setText(""+(Integer.parseInt(yb.getText().toString())-1));
                        switch (jflag){
                            case 1:
                                WeightRandom random1 = new WeightRandom(options12);
                                String j1 = (String) random1.nextItem();
                                jltext1.setText(j1);
                                zszt.setText("转生成功\n恭喜你获得C级将灵:"+j1);
                                zszt.setTextColor(0xffE41111);
                                switch (j1){
                                    case "踏顿":
                                        jltext1.setTextColor(0xffC22FE9);
                                        jl1.setImageResource(R.mipmap.jl5);
                                        break;
                                    case "郭淮":
                                        jltext1.setTextColor(0xffC22FE9);
                                        jl1.setImageResource(R.mipmap.jl6);
                                        break;
                                    case "孙鲁班":
                                        jltext1.setTextColor(0xffC22FE9);
                                        jl1.setImageResource(R.mipmap.jl7);
                                        break;
                                    case "徐盛":
                                        jltext1.setTextColor(0xffC22FE9);
                                        jl1.setImageResource(R.mipmap.jl8);
                                        break;
                                    case "马忠":
                                        jltext1.setTextColor(0xffC22FE9);
                                        jl1.setImageResource(R.mipmap.jl9);
                                        break;
                                    case "张嶷":
                                        jltext1.setTextColor(0xffC22FE9);
                                        jl1.setImageResource(R.mipmap.jl10);
                                        break;
                                }
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 2:
                                WeightRandom random2 = new WeightRandom(options12);
                                String j12 = (String) random2.nextItem();
                                jltext2.setText(j12);
                                zszt.setText("转生成功\n恭喜你获得C级将灵:"+j12);
                                zszt.setTextColor(0xffE41111);
                                switch (j12){
                                    case "踏顿":
                                        jltext2.setTextColor(0xffC22FE9);
                                        jl2.setImageResource(R.mipmap.jl5);
                                        break;
                                    case "郭淮":
                                        jltext2.setTextColor(0xffC22FE9);
                                        jl2.setImageResource(R.mipmap.jl6);
                                        break;
                                    case "孙鲁班":
                                        jltext2.setTextColor(0xffC22FE9);
                                        jl2.setImageResource(R.mipmap.jl7);
                                        break;
                                    case "徐盛":
                                        jltext2.setTextColor(0xffC22FE9);
                                        jl2.setImageResource(R.mipmap.jl8);
                                        break;
                                    case "马忠":
                                        jltext2.setTextColor(0xffC22FE9);
                                        jl2.setImageResource(R.mipmap.jl9);
                                        break;
                                    case "张嶷":
                                        jltext2.setTextColor(0xffC22FE9);
                                        jl2.setImageResource(R.mipmap.jl10);
                                        break;
                                }
                                String szsd2=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 3:
                                WeightRandom random3 = new WeightRandom(options12);
                                String j13 = (String) random3.nextItem();
                                jltext3.setText(j13);
                                zszt.setText("转生成功\n恭喜你获得C级将灵:"+j13);
                                zszt.setTextColor(0xffE41111);
                                switch (j13){
                                    case "踏顿":
                                        jltext3.setTextColor(0xffC22FE9);
                                        jl3.setImageResource(R.mipmap.jl5);
                                        break;
                                    case "郭淮":
                                        jltext3.setTextColor(0xffC22FE9);
                                        jl3.setImageResource(R.mipmap.jl6);
                                        break;
                                    case "孙鲁班":
                                        jltext3.setTextColor(0xffC22FE9);
                                        jl3.setImageResource(R.mipmap.jl7);
                                        break;
                                    case "徐盛":
                                        jltext3.setTextColor(0xffC22FE9);
                                        jl3.setImageResource(R.mipmap.jl8);
                                        break;
                                    case "马忠":
                                        jltext3.setTextColor(0xffC22FE9);
                                        jl3.setImageResource(R.mipmap.jl9);
                                        break;
                                    case "张嶷":
                                        jltext3.setTextColor(0xffC22FE9);
                                        jl3.setImageResource(R.mipmap.jl10);
                                        break;
                                }
                                String szsd3=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 4:
                                WeightRandom random4 = new WeightRandom(options12);
                                String j14 = (String) random4.nextItem();
                                jltext4.setText(j14);
                                zszt.setText("转生成功\n恭喜你获得C级将灵:"+j14);
                                zszt.setTextColor(0xffE41111);
                                switch (j14){
                                    case "踏顿":
                                        jltext4.setTextColor(0xffC22FE9);
                                        jl4.setImageResource(R.mipmap.jl5);
                                        break;
                                    case "郭淮":
                                        jltext4.setTextColor(0xffC22FE9);
                                        jl4.setImageResource(R.mipmap.jl6);
                                        break;
                                    case "孙鲁班":
                                        jltext4.setTextColor(0xffC22FE9);
                                        jl4.setImageResource(R.mipmap.jl7);
                                        break;
                                    case "徐盛":
                                        jltext4.setTextColor(0xffC22FE9);
                                        jl4.setImageResource(R.mipmap.jl8);
                                        break;
                                    case "马忠":
                                        jltext4.setTextColor(0xffC22FE9);
                                        jl4.setImageResource(R.mipmap.jl9);
                                        break;
                                    case "张嶷":
                                        jltext4.setTextColor(0xffC22FE9);
                                        jl4.setImageResource(R.mipmap.jl10);
                                        break;
                                }
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
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
    private void showNormalDialog2(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag){
            case 1:
                normalDialog.setMessage("\n       消耗转生丹*3,转生成功率100%,确认将C级将灵"+jltext1.getText().toString()+"转生吗?");
                break;
            case 2:
                normalDialog.setMessage("\n       消耗转生丹*3,转生成功率100%,确认将C级将灵"+jltext2.getText().toString()+"转生吗?");
                break;
            case 3:
                normalDialog.setMessage("\n       消耗转生丹*3,转生成功率100%,确认将C级将灵"+jltext3.getText().toString()+"转生吗?");
                break;
            case 4:
                normalDialog.setMessage("\n       消耗转生丹*3,转生成功率100%,确认将C级将灵"+jltext4.getText().toString()+"转生吗?");
                break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        yb.setText(""+(Integer.parseInt(yb.getText().toString())-3));
                        switch (jflag){
                            case 1:
                                WeightRandom random1 = new WeightRandom(options13);
                                String j1 = (String) random1.nextItem();
                                jltext1.setText(j1);
                                zszt.setText("转生成功\n恭喜你获得B级将灵:"+j1);
                                zszt.setTextColor(0xffE41111);
                                switch (j1){
                                    case "荀攸":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl11);
                                        break;
                                    case "华雄":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl12);
                                        break;
                                    case "袁绍":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl13);
                                        break;
                                    case "郭皇后":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl14);
                                        break;
                                    case "曹叡":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl15);
                                        break;
                                    case "孙登":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl16);
                                        break;
                                    case "关银屏":
                                        jltext1.setTextColor(0xffEEC40A);
                                        jl1.setImageResource(R.mipmap.jl17);
                                        break;
                                }
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 2:
                                WeightRandom random2 = new WeightRandom(options13);
                                String j12 = (String) random2.nextItem();
                                jltext2.setText(j12);
                                zszt.setText("转生成功\n恭喜你获得B级将灵:"+j12);
                                zszt.setTextColor(0xffE41111);
                                switch (j12){
                                        case "荀攸":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl11);
                                            break;
                                        case "华雄":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl12);
                                            break;
                                        case "袁绍":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl13);
                                            break;
                                        case "郭皇后":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl14);
                                            break;
                                        case "曹叡":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl15);
                                            break;
                                        case "孙登":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl16);
                                            break;
                                        case "关银屏":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl17);
                                            break;
                                    
                                }
                                String szsd2=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 3:
                                WeightRandom random3 = new WeightRandom(options13);
                                String j13 = (String) random3.nextItem();
                                jltext3.setText(j13);
                                zszt.setText("转生成功\n恭喜你获得B级将灵:"+j13);
                                zszt.setTextColor(0xffE41111);
                                switch (j13){
                                    case "荀攸":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl11);
                                        break;
                                    case "华雄":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl12);
                                        break;
                                    case "袁绍":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl13);
                                        break;
                                    case "郭皇后":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl14);
                                        break;
                                    case "曹叡":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl15);
                                        break;
                                    case "孙登":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl16);
                                        break;
                                    case "关银屏":
                                        jltext3.setTextColor(0xffEEC40A);
                                        jl3.setImageResource(R.mipmap.jl17);
                                        break;
                                }
                                String szsd3=""+(zsd-0);
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
                            case 4:
                                WeightRandom random4 = new WeightRandom(options13);
                                String j14 = (String) random4.nextItem();
                                jltext4.setText(j14);
                                zszt.setText("转生成功\n恭喜你获得B级将灵:"+j14);
                                zszt.setTextColor(0xffE41111);
                                switch (j14){
                                    case "荀攸":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl11);
                                        break;
                                    case "华雄":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl12);
                                        break;
                                    case "袁绍":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl13);
                                        break;
                                    case "郭皇后":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl14);
                                        break;
                                    case "曹叡":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl15);
                                        break;
                                    case "孙登":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl16);
                                        break;
                                    case "关银屏":
                                        jltext4.setTextColor(0xffEEC40A);
                                        jl4.setImageResource(R.mipmap.jl17);
                                        break;
                                }
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                }).start();
                                break;
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
    private void showNormalDialog3(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag){
            case 1:
                normalDialog.setMessage("\n       消耗转生丹*6,转生成功率80%,确认将B级将灵"+jltext1.getText().toString()+"转生吗?");
                break;
            case 2:
                normalDialog.setMessage("\n       消耗转生丹*6,转生成功率80%,确认将B级将灵"+jltext2.getText().toString()+"转生吗?");
                break;
            case 3:
                normalDialog.setMessage("\n       消耗转生丹*6,转生成功率80%,确认将B级将灵"+jltext3.getText().toString()+"转生吗?");
                break;
            case 4:
                normalDialog.setMessage("\n       消耗转生丹*6,转生成功率80%,确认将B级将灵"+jltext4.getText().toString()+"转生吗?");
                break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        yb.setText(""+(Integer.parseInt(yb.getText().toString())-6));
                        WeightRandom randomn= new WeightRandom(options1);
                        String jn = (String) randomn.nextItem();
                        if(jn.equals("转生成功")) {
                            switch (jflag) {
                                case 1:
                                    WeightRandom random1 = new WeightRandom(options14);
                                    String j1 = (String) random1.nextItem();
                                    jltext1.setText(j1);
                                    zszt.setText("转生成功\n恭喜你获得A级将灵:" + j1);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j1) {
                                        case "关羽":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl18);
                                            break;
                                        case "姜维":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl19);
                                            break;
                                        case "戏志才":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl20);
                                            break;
                                        case "祝融":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl21);
                                            break;
                                        case "小乔":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl24);
                                            break;
                                        case "郭嘉":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl25);
                                            break;
                                        case "陆逊":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl26);
                                            break;
                                        case "貂蝉":
                                            jltext1.setTextColor(0xffF4511E);
                                            jl1.setImageResource(R.mipmap.jl27);
                                            break;
                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                                case 2:
                                    WeightRandom random2 = new WeightRandom(options14);
                                    String j12 = (String) random2.nextItem();
                                    jltext2.setText(j12);
                                    zszt.setText("转生成功\n恭喜你获得A级将灵:" + j12);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j12 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j12) {
                                        case "关羽":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl18);
                                            break;
                                        case "姜维":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl19);
                                            break;
                                        case "戏志才":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl20);
                                            break;
                                        case "祝融":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl21);
                                            break;
                                        case "小乔":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl24);
                                            break;
                                        case "郭嘉":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl25);
                                            break;
                                        case "陆逊":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl26);
                                            break;
                                        case "貂蝉":
                                            jltext2.setTextColor(0xffF4511E);
                                            jl2.setImageResource(R.mipmap.jl27);
                                            break;

                                    }
                                    String szsd2 = "" + (zsd - 0);
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                                case 3:
                                    WeightRandom random3 = new WeightRandom(options14);
                                    String j13 = (String) random3.nextItem();
                                    jltext3.setText(j13);
                                    zszt.setText("转生成功\n恭喜你获得A级将灵:" + j13);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j13 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j13) {
                                        case "关羽":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl18);
                                            break;
                                        case "姜维":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl19);
                                            break;
                                        case "戏志才":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl20);
                                            break;
                                        case "祝融":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl21);
                                            break;
                                        case "小乔":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl24);
                                            break;
                                        case "郭嘉":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl25);
                                            break;
                                        case "陆逊":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl26);
                                            break;
                                        case "貂蝉":
                                            jltext3.setTextColor(0xffF4511E);
                                            jl3.setImageResource(R.mipmap.jl27);
                                            break;
                                    }
                                    String szsd3 = "" + (zsd - 0);
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                                case 4:
                                    WeightRandom random4 = new WeightRandom(options14);
                                    String j14 = (String) random4.nextItem();
                                    jltext4.setText(j14);
                                    zszt.setText("转生成功\n恭喜你获得A级将灵:" + j14);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j14 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j14) {
                                        case "关羽":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl18);
                                            break;
                                        case "姜维":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl19);
                                            break;
                                        case "戏志才":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl20);
                                            break;
                                        case "祝融":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl21);
                                            break;
                                        case "小乔":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl24);
                                            break;
                                        case "郭嘉":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl25);
                                            break;
                                        case "陆逊":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl26);
                                            break;
                                        case "貂蝉":
                                            jltext4.setTextColor(0xffF4511E);
                                            jl4.setImageResource(R.mipmap.jl27);
                                            break;
                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                            }
                        }
                        if(jn.equals("转生失败"))
                        {
                            switch (jflag){
                                case 1:
                                    WeightRandom random1 = new WeightRandom(options13);
                                    String j1 = (String) random1.nextItem();
                                    jltext1.setText(j1);
                                    zszt.setText("转生失败\n获得B级将灵:"+j1);
                                    zszt.setTextColor(0xffffffff);
                                    switch (j1){
                                        case "荀攸":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl11);
                                            break;
                                        case "华雄":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl12);
                                            break;
                                        case "袁绍":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl13);
                                            break;
                                        case "郭皇后":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl14);
                                            break;
                                        case "曹叡":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl15);
                                            break;
                                        case "孙登":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl16);
                                            break;
                                        case "关银屏":
                                            jltext1.setTextColor(0xffEEC40A);
                                            jl1.setImageResource(R.mipmap.jl17);
                                            break;
                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                    }).start();
                                    break;
                                case 2:
                                    WeightRandom random2 = new WeightRandom(options13);
                                    String j12 = (String) random2.nextItem();
                                    jltext2.setText(j12);
                                    zszt.setText("转生失败\n获得B级将灵:"+j12);
                                    zszt.setTextColor(0xffffffff);
                                    switch (j12){
                                        case "荀攸":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl11);
                                            break;
                                        case "华雄":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl12);
                                            break;
                                        case "袁绍":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl13);
                                            break;
                                        case "郭皇后":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl14);
                                            break;
                                        case "曹叡":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl15);
                                            break;
                                        case "孙登":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl16);
                                            break;
                                        case "关银屏":
                                            jltext2.setTextColor(0xffEEC40A);
                                            jl2.setImageResource(R.mipmap.jl17);
                                            break;

                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                    }).start();
                                    break;
                                case 3:
                                    WeightRandom random3 = new WeightRandom(options13);
                                    String j13 = (String) random3.nextItem();
                                    jltext3.setText(j13);
                                    zszt.setText("转生失败\n获得B级将灵:"+j13);
                                    zszt.setTextColor(0xffffffff);
                                    switch (j13){
                                        case "荀攸":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl11);
                                            break;
                                        case "华雄":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl12);
                                            break;
                                        case "袁绍":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl13);
                                            break;
                                        case "郭皇后":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl14);
                                            break;
                                        case "曹叡":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl15);
                                            break;
                                        case "孙登":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl16);
                                            break;
                                        case "关银屏":
                                            jltext3.setTextColor(0xffEEC40A);
                                            jl3.setImageResource(R.mipmap.jl17);
                                            break;
                                    }
                                    String szsd3=""+(zsd-0);
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                    }).start();
                                    break;
                                case 4:
                                    WeightRandom random4 = new WeightRandom(options13);
                                    String j14 = (String) random4.nextItem();
                                    jltext4.setText(j14);
                                    zszt.setText("转生失败\n获得B级将灵:"+j14);
                                    zszt.setTextColor(0xffffffff);
                                    switch (j14){
                                        case "荀攸":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl11);
                                            break;
                                        case "华雄":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl12);
                                            break;
                                        case "袁绍":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl13);
                                            break;
                                        case "郭皇后":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl14);
                                            break;
                                        case "曹叡":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl15);
                                            break;
                                        case "孙登":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl16);
                                            break;
                                        case "关银屏":
                                            jltext4.setTextColor(0xffEEC40A);
                                            jl4.setImageResource(R.mipmap.jl17);
                                            break;
                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username,jltext1.getText().toString(),jltext2.getText().toString(),jltext3.getText().toString(),jltext4.getText().toString(),yb.getText().toString());
                                    }).start();
                                    break;
                            }

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
    private void showNormalDialog4(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag){
            case 1:
                normalDialog.setMessage("\n       消耗转生丹*10,转生成功率50%,确认将A级将灵"+jltext1.getText().toString()+"转生吗?");
                break;
            case 2:
                normalDialog.setMessage("\n       消耗转生丹*10,转生成功率50%,确认将A级将灵"+jltext2.getText().toString()+"转生吗?");
                break;
            case 3:
                normalDialog.setMessage("\n       消耗转生丹*10,转生成功率50%,确认将A级将灵"+jltext3.getText().toString()+"转生吗?");
                break;
            case 4:
                normalDialog.setMessage("\n       消耗转生丹*10,转生成功率50%,确认将A级将灵"+jltext4.getText().toString()+"转生吗?");
                break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        yb.setText(""+(Integer.parseInt(yb.getText().toString())-10));
                        WeightRandom randomn= new WeightRandom(options2);
                        String jn = (String) randomn.nextItem();
                        if(jn.equals("转生成功")) {
                            switch (jflag) {
                                case 1:
                                    WeightRandom random1 = new WeightRandom(options18);
                                    String j1 = (String) random1.nextItem();
                                    jltext1.setText(j1);
                                    zszt.setText("转生成功\n恭喜你获得S级将灵:" + j1);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j1) {
                                        case "诸葛果":
                                            jltext1.setTextColor(0xffF0201A);
                                            jl1.setImageResource(R.mipmap.jl28);
                                            break;
                                        case "灵雎":
                                            jltext1.setTextColor(0xffF0201A);
                                            jl1.setImageResource(R.mipmap.jl31);
                                            break;
                                        case "神周瑜":
                                            jltext1.setTextColor(0xffF0201A);
                                            jl1.setImageResource(R.mipmap.jl32);
                                            break;
                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                                case 2:
                                    WeightRandom random2 = new WeightRandom(options18);
                                    String j12 = (String) random2.nextItem();
                                    jltext2.setText(j12);
                                    zszt.setText("转生成功\n恭喜你获得S级将灵:" + j12);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j12 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j12) {
                                        case "诸葛果":
                                            jltext2.setTextColor(0xffF0201A);
                                            jl2.setImageResource(R.mipmap.jl28);
                                            break;
                                        case "灵雎":
                                            jltext2.setTextColor(0xffF0201A);
                                            jl2.setImageResource(R.mipmap.jl31);
                                            break;
                                        case "神周瑜":
                                            jltext2.setTextColor(0xffF0201A);
                                            jl2.setImageResource(R.mipmap.jl32);
                                            break;

                                    }
                                    String szsd2 = "" + (zsd - 0);
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                                case 3:
                                    WeightRandom random3 = new WeightRandom(options18);
                                    String j13 = (String) random3.nextItem();
                                    jltext3.setText(j13);
                                    zszt.setText("转生成功\n恭喜你获得S级将灵:" + j13);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j13 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j13) {
                                        case "诸葛果":
                                            jltext3.setTextColor(0xffF0201A);
                                            jl3.setImageResource(R.mipmap.jl28);
                                            break;
                                        case "灵雎":
                                            jltext3.setTextColor(0xffF0201A);
                                            jl3.setImageResource(R.mipmap.jl31);
                                            break;
                                        case "神周瑜":
                                            jltext3.setTextColor(0xffF0201A);
                                            jl3.setImageResource(R.mipmap.jl32);
                                            break;
                                    }
                                    String szsd3 = "" + (zsd - 0);
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                                case 4:
                                    WeightRandom random4 = new WeightRandom(options18);
                                    String j14 = (String) random4.nextItem();
                                    jltext4.setText(j14);
                                    zszt.setText("转生成功\n恭喜你获得S级将灵:" + j14);
                                    zszt.setTextColor(0xffE41111);
                                    texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j14 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        tip.loginByGet2(texttip.getText().toString());
                                    }).start();
                                    switch (j14) {
                                        case "诸葛果":
                                            jltext4.setTextColor(0xffF0201A);
                                            jl4.setImageResource(R.mipmap.jl28);
                                            break;
                                        case "灵雎":
                                            jltext4.setTextColor(0xffF0201A);
                                            jl4.setImageResource(R.mipmap.jl31);
                                            break;
                                        case "神周瑜":
                                            jltext4.setTextColor(0xffF0201A);
                                            jl4.setImageResource(R.mipmap.jl32);
                                            break;
                                    }
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                    }).start();
                                    break;
                            }
                        }
                            if(!jn.equals("转生成功")) {
                                switch (jflag) {
                                    case 1:
                                        WeightRandom random1 = new WeightRandom(options14);
                                        String j1 = (String) random1.nextItem();
                                        jltext1.setText(j1);
                                        zszt.setText("转生失败\n获得A级将灵:" + j1);
                                        zszt.setTextColor(0xffffffff);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j1) {
                                            case "关羽":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl18);
                                                break;
                                            case "姜维":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl19);
                                                break;
                                            case "戏志才":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl20);
                                                break;
                                            case "祝融":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl21);
                                                break;
                                            case "小乔":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl24);
                                                break;
                                            case "郭嘉":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl25);
                                                break;
                                            case "陆逊":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl26);
                                                break;
                                            case "貂蝉":
                                                jltext1.setTextColor(0xffF4511E);
                                                jl1.setImageResource(R.mipmap.jl27);
                                                break;
                                        }
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;
                                    case 2:
                                        WeightRandom random2 = new WeightRandom(options14);
                                        String j12 = (String) random2.nextItem();
                                        jltext2.setText(j12);
                                        zszt.setText("转生失败\n获得A级将灵:" + j12);
                                        zszt.setTextColor(0xffffffff);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j12 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j12) {
                                            case "关羽":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl18);
                                                break;
                                            case "姜维":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl19);
                                                break;
                                            case "戏志才":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl20);
                                                break;
                                            case "祝融":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl21);
                                                break;
                                            case "小乔":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl24);
                                                break;
                                            case "郭嘉":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl25);
                                                break;
                                            case "陆逊":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl26);
                                                break;
                                            case "貂蝉":
                                                jltext2.setTextColor(0xffF4511E);
                                                jl2.setImageResource(R.mipmap.jl27);
                                                break;

                                        }
                                        String szsd2 = "" + (zsd - 0);
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;
                                    case 3:
                                        WeightRandom random3 = new WeightRandom(options14);
                                        String j13 = (String) random3.nextItem();
                                        jltext3.setText(j13);
                                        zszt.setText("转生失败\n获得A级将灵:" + j13);
                                        zszt.setTextColor(0xffffffff);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j13 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j13) {
                                            case "关羽":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl18);
                                                break;
                                            case "姜维":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl19);
                                                break;
                                            case "戏志才":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl20);
                                                break;
                                            case "祝融":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl21);
                                                break;
                                            case "小乔":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl24);
                                                break;
                                            case "郭嘉":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl25);
                                                break;
                                            case "陆逊":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl26);
                                                break;
                                            case "貂蝉":
                                                jltext3.setTextColor(0xffF4511E);
                                                jl3.setImageResource(R.mipmap.jl27);
                                                break;
                                        }
                                        String szsd3 = "" + (zsd - 0);
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;
                                    case 4:
                                        WeightRandom random4 = new WeightRandom(options14);
                                        String j14 = (String) random4.nextItem();
                                        jltext4.setText(j14);
                                        zszt.setText("转生失败\n获得A级将灵:" + j14);
                                        zszt.setTextColor(0xffffffff);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得A级将灵" + j14 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j14) {
                                            case "关羽":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl18);
                                                break;
                                            case "姜维":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl19);
                                                break;
                                            case "戏志才":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl20);
                                                break;
                                            case "祝融":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl21);
                                                break;
                                            case "小乔":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl24);
                                                break;
                                            case "郭嘉":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl25);
                                                break;
                                            case "陆逊":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl26);
                                                break;
                                            case "貂蝉":
                                                jltext4.setTextColor(0xffF4511E);
                                                jl4.setImageResource(R.mipmap.jl27);
                                                break;
                                        }
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;
                                }
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
    private void showNormalDialog5(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag){
            case 1:
                normalDialog.setMessage("\n       消耗转生丹*20,转生成功率100%,确认将S级将灵"+jltext1.getText().toString()+"转生为其他将灵吗?");
                break;
            case 2:
                normalDialog.setMessage("\n       消耗转生丹*20,转生成功率100%,确认将S级将灵"+jltext2.getText().toString()+"转生为其他将灵吗?");
                break;
            case 3:
                normalDialog.setMessage("\n       消耗转生丹*20,转生成功率100%,确认将S级将灵"+jltext3.getText().toString()+"转生为其他将灵吗?");
                break;
            case 4:
                normalDialog.setMessage("\n       消耗转生丹*20,转生成功率100%,确认将S级将灵"+jltext4.getText().toString()+"转生为其他将灵吗?");
                break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        yb.setText(""+(Integer.parseInt(yb.getText().toString())-20));
                        switch (jflag){
                            case 1:
                                switch (jltext1.getText().toString()) {
                                    case "诸葛果":
                                        WeightRandom random1 = new WeightRandom(options15);
                                        String j1 = (String) random1.nextItem();
                                        jltext1.setText(j1);
                                        zszt.setText("转生成功\n恭喜你获得S级将灵:" + j1);
                                        zszt.setTextColor(0xffE41111);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j1) {
                                            case "灵雎":
                                                jltext1.setTextColor(0xffF0201A);
                                                jl1.setImageResource(R.mipmap.jl31);
                                                break;
                                            case "神周瑜":
                                                jltext1.setTextColor(0xffF0201A);
                                                jl1.setImageResource(R.mipmap.jl32);
                                                break;
                                        }
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;
                                    case "灵雎":
                                        WeightRandom random2 = new WeightRandom(options16);
                                        String j2 = (String) random2.nextItem();
                                        jltext1.setText(j2);
                                        zszt.setText("转生成功\n恭喜你获得S级将灵:" + j2);
                                        zszt.setTextColor(0xffE41111);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j2 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j2) {
                                            case "诸葛果":
                                                jltext1.setTextColor(0xffF0201A);
                                                jl1.setImageResource(R.mipmap.jl28);
                                                break;
                                            case "神周瑜":
                                                jltext1.setTextColor(0xffF0201A);
                                                jl1.setImageResource(R.mipmap.jl32);
                                                break;
                                        }
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;
                                    case "神周瑜":
                                        WeightRandom random3 = new WeightRandom(options17);
                                        String j3 = (String) random3.nextItem();
                                        jltext1.setText(j3);
                                        zszt.setText("转生成功\n恭喜你获得S级将灵:" + j3);
                                        zszt.setTextColor(0xffE41111);
                                        texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j3+ "!!!\t\t\t\t\t\t\t\t\t\t");
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            tip.loginByGet2(texttip.getText().toString());
                                        }).start();
                                        switch (j3) {
                                            case "诸葛果":
                                                jltext1.setTextColor(0xffF0201A);
                                                jl1.setImageResource(R.mipmap.jl28);
                                                break;
                                            case "灵雎":
                                                jltext1.setTextColor(0xffF0201A);
                                                jl1.setImageResource(R.mipmap.jl31);
                                                break;
                                        }
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                        }).start();
                                        break;

                                }
                                    break;
                                    case 2:
                                        switch (jltext2.getText().toString()) {
                                            case "诸葛果":
                                                WeightRandom random1 = new WeightRandom(options15);
                                                String j1 = (String) random1.nextItem();
                                                jltext2.setText(j1);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j1);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j1) {
                                                    case "灵雎":
                                                        jltext2.setTextColor(0xffF0201A);
                                                        jl2.setImageResource(R.mipmap.jl31);
                                                        break;
                                                    case "神周瑜":
                                                        jltext2.setTextColor(0xffF0201A);
                                                        jl2.setImageResource(R.mipmap.jl32);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;
                                            case "灵雎":
                                                WeightRandom random2 = new WeightRandom(options16);
                                                String j2 = (String) random2.nextItem();
                                                jltext2.setText(j2);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j2);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j2+ "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j2) {
                                                    case "诸葛果":
                                                        jltext2.setTextColor(0xffF0201A);
                                                        jl2.setImageResource(R.mipmap.jl28);
                                                        break;
                                                    case "神周瑜":
                                                        jltext2.setTextColor(0xffF0201A);
                                                        jl2.setImageResource(R.mipmap.jl32);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;
                                            case "神周瑜":
                                                WeightRandom random3 = new WeightRandom(options17);
                                                String j3 = (String) random3.nextItem();
                                                jltext2.setText(j3);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j3);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j3 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j3) {
                                                    case "诸葛果":
                                                        jltext2.setTextColor(0xffF0201A);
                                                        jl2.setImageResource(R.mipmap.jl28);
                                                        break;
                                                    case "灵雎":
                                                        jltext2.setTextColor(0xffF0201A);
                                                        jl2.setImageResource(R.mipmap.jl31);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;

                                        }
                                        break;
                                    case 3:
                                        switch (jltext3.getText().toString()) {
                                            case "诸葛果":
                                                WeightRandom random1 = new WeightRandom(options15);
                                                String j1 = (String) random1.nextItem();
                                                jltext3.setText(j1);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j1);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j1) {
                                                    case "灵雎":
                                                        jltext3.setTextColor(0xffF0201A);
                                                        jl3.setImageResource(R.mipmap.jl31);
                                                        break;
                                                    case "神周瑜":
                                                        jltext3.setTextColor(0xffF0201A);
                                                        jl3.setImageResource(R.mipmap.jl32);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;
                                            case "灵雎":
                                                WeightRandom random2 = new WeightRandom(options16);
                                                String j2 = (String) random2.nextItem();
                                                jltext3.setText(j2);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j2);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j2 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                zszt.setTextColor(0xffE41111);
                                                switch (j2) {
                                                    case "诸葛果":
                                                        jltext3.setTextColor(0xffF0201A);
                                                        jl3.setImageResource(R.mipmap.jl28);
                                                        break;
                                                    case "神周瑜":
                                                        jltext3.setTextColor(0xffF0201A);
                                                        jl3.setImageResource(R.mipmap.jl32);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;
                                            case "神周瑜":
                                                WeightRandom random3 = new WeightRandom(options17);
                                                String j3 = (String) random3.nextItem();
                                                jltext3.setText(j3);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j3);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j3 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j3) {
                                                    case "诸葛果":
                                                        jltext3.setTextColor(0xffF0201A);
                                                        jl3.setImageResource(R.mipmap.jl28);
                                                        break;
                                                    case "灵雎":
                                                        jltext3.setTextColor(0xffF0201A);
                                                        jl3.setImageResource(R.mipmap.jl31);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;

                                        }
                                        break;
                                    case 4:
                                        switch (jltext4.getText().toString()) {
                                            case "诸葛果":
                                                WeightRandom random1 = new WeightRandom(options15);
                                                String j1 = (String) random1.nextItem();
                                                jltext4.setText(j1);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j1);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j1 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j1) {
                                                    case "灵雎":
                                                        jltext4.setTextColor(0xffF0201A);
                                                        jl4.setImageResource(R.mipmap.jl31);
                                                        break;
                                                    case "神周瑜":
                                                        jltext4.setTextColor(0xffF0201A);
                                                        jl4.setImageResource(R.mipmap.jl32);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;
                                            case "灵雎":
                                                WeightRandom random2 = new WeightRandom(options16);
                                                String j2 = (String) random2.nextItem();
                                                jltext4.setText(j2);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j2);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j2 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j2) {
                                                    case "诸葛果":
                                                        jltext4.setTextColor(0xffF0201A);
                                                        jl4.setImageResource(R.mipmap.jl28);
                                                        break;
                                                    case "神周瑜":
                                                        jltext4.setTextColor(0xffF0201A);
                                                        jl4.setImageResource(R.mipmap.jl32);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;
                                            case "神周瑜":
                                                WeightRandom random3 = new WeightRandom(options17);
                                                String j3 = (String) random3.nextItem();
                                                jltext4.setText(j3);
                                                zszt.setText("转生成功\n恭喜你获得S级将灵:" + j3);
                                                zszt.setTextColor(0xffE41111);
                                                texttip.setText("恭喜玩家" + username + "通过将灵转生获得S级将灵" + j3 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (j3) {
                                                    case "诸葛果":
                                                        jltext4.setTextColor(0xffF0201A);
                                                        jl4.setImageResource(R.mipmap.jl28);
                                                        break;
                                                    case "灵雎":
                                                        jltext4.setTextColor(0xffF0201A);
                                                        jl4.setImageResource(R.mipmap.jl31);
                                                        break;
                                                }
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatejl.loginByGet(username, jltext1.getText().toString(), jltext2.getText().toString(), jltext3.getText().toString(), jltext4.getText().toString(), yb.getText().toString());
                                                }).start();
                                                break;

                                        }
                                        break;

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
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            flag1=true;
            flag2=true;
            flag3=true;
            flag4=true;
            jflag=0;
            finish();
            Intent intent11=new Intent(jlzs.this, main.class);
            intent11.putExtra("userName",username);
            startActivity(intent11);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    private void showNormalDialog6(){
        /* @setIcon 设置对话框图标
         * @setTitle 设置对话框标题
         * @setMessage 设置对话框消息提示
         * setXXX方法返回Dialog对象，因此可以链式设置属性
         */
        final AlertDialog.Builder normalDialog =
                new AlertDialog.Builder(jlzs.this);
        normalDialog.setTitle("Tips");
        switch (jflag2){
            case 1:
                normalDialog.setMessage("\n       是否将"+jltext1.getText().toString()+"将灵设置为默认展示?");
                break;
            case 2:
                normalDialog.setMessage("\n       是否将"+jltext2.getText().toString()+"将灵设置为默认展示?");
                break;
            case 3:
                normalDialog.setMessage("\n       是否将"+jltext3.getText().toString()+"将灵设置为默认展示?");
                break;
            case 4:
                normalDialog.setMessage("\n       是否将"+jltext4.getText().toString()+"将灵设置为默认展示?");
                break;}
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (jflag2){
                            case 1:
                                updatecoins.loginByGet3(username,jltext1.getText().toString());
                                break;
                            case 2:
                                updatecoins.loginByGet3(username,jltext2.getText().toString());
                                break;
                            case 3:
                                updatecoins.loginByGet3(username,jltext3.getText().toString());
                                break;
                            case 4:
                                updatecoins.loginByGet3(username,jltext4.getText().toString());
                                break;}
                        Toast.makeText(jlzs.this, "设置成功！", Toast.LENGTH_SHORT).show();

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
