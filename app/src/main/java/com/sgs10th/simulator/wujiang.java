package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.media.MediaPlayer;
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

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class wujiang extends AppCompatActivity implements View.OnClickListener {
    private ImageView image1,image2,image3, image4,image5,image6, image7,image8,image9,image10,flags,s7,s8,s9,s10,s3,s4,s5,s6;
    private String username,wj1,wj2,wj3,wj4,wj5,wj6,wj7,wj8,wj9,wj10
            ,wj11,wj12,wj13,wj14,wj15,wj16,wj17,wj18,wj19,wj20,wj21,wj22,wj23,wj24,wj25,wj26
            ,wj27,wj28,wj29,wj30,wj31,wj32,wj33,wj34,wj35,wj36
            ,wj37,wj38,wj39,wj40,wj41,wj42,wj43,wj44,wj45,wj46
            ,wj47,wj48,wj49,wj50,wj51,wj52,wj53;
    private Button btn1,btn2,btn3;
    private MediaPlayer me;
    private static int s=1;
    private TextView texttip,text1,text2,text3,text4,text5,text6,text7,text8,text9,text10;
    private  java.util.Timer time;
    private TimerTask task;
    private static  int flag=1;
    private  ColorMatrixColorFilter grayColorFilter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wujiang);
        Intent intent = getIntent();
        username = intent.getStringExtra("userName");
       // setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);//横屏
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        image5=findViewById(R.id.image5);
        image6=findViewById(R.id.image6);
        image7=findViewById(R.id.image7);
        text1=findViewById(R.id.text1);
        text2=findViewById(R.id.text2);
        text3=findViewById(R.id.text3);
        text4=findViewById(R.id.text4);
        text5=findViewById(R.id.text5);
        text6=findViewById(R.id.text6);
        text7=findViewById(R.id.text7);
        text8=findViewById(R.id.text8);
        text9=findViewById(R.id.text9);
        text10=findViewById(R.id.text10);
        texttip = (TextView) findViewById(R.id.texttip);
        image8=findViewById(R.id.image8);
        image9=findViewById(R.id.image9);
        s4=findViewById(R.id.s4);
        s5=findViewById(R.id.s5);
        s6=findViewById(R.id.s6);
        s7=findViewById(R.id.s7);
        s8=findViewById(R.id.s8);
        s9=findViewById(R.id.s9);
        s10=findViewById(R.id.s10);
        image10=findViewById(R.id.image10);
        btn1=findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        btn2=findViewById(R.id.btn2);
        btn2.setOnClickListener(this);
        btn3=findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        flags=findViewById(R.id.flags);
        flags.setOnClickListener(this);
        image1.setOnClickListener(this);
        image2.setOnClickListener(this);
        image3.setOnClickListener(this);
        image4.setOnClickListener(this);
        image5.setOnClickListener(this);
        image6.setOnClickListener(this);
        image7.setOnClickListener(this);
        image8.setOnClickListener(this);
        image9.setOnClickListener(this);
        image10.setOnClickListener(this);
        ColorMatrix cm= new ColorMatrix();
        cm.setSaturation(0);
        grayColorFilter=new ColorMatrixColorFilter(cm);
      // 设置饱和度
        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
        image2.setColorFilter(grayColorFilter);
        image3.setColorFilter(grayColorFilter);
        image4.setColorFilter(grayColorFilter);
        image5.setColorFilter(grayColorFilter);
        image6.setColorFilter(grayColorFilter);
        image7.setColorFilter(grayColorFilter);
        image8.setColorFilter(grayColorFilter);
        image9.setColorFilter(grayColorFilter);
        image10.setColorFilter(grayColorFilter);
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
                        if(wj1.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj2.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj3.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj4.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj5.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj6.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj7.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj8.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj9.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj10.equals("true")){
                            image10.setColorFilter(null);
                        }
                    }
                    else
                    {
                        Toast.makeText(wujiang.this, "请检查网络连接！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(wujiang.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(wujiang.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            if(s!=1)
                me.release();
            flag=1;
            s=1;
            finish();
            Intent intent11=new Intent(wujiang.this, main.class);
            intent11.putExtra("userName",username);
            startActivity(intent11);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.image1:
                switch (flag) {
                    case 1:
                    if (s != 1)
                        me.stop();
                    s++;
                    me = MediaPlayer.create(wujiang.this, R.raw.guansuo);
                    me.start();
                    Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                    break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.wutugu);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.xugong);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w31);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w41);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w51);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image2:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.zhaoxiang);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.sunhao);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.zhangchangpu);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w32);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w42);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w52);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image3:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.baosanniang);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.chenlin);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.lique);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w33);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w43);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w53);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image4:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.xurong);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.shiyu);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.guosi);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w34);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w44);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image5:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.caoying);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.yangxiu);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.fanchou);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w35);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w45);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image6:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.caochun);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.wenyang);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.zhangji);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w36);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w46);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image7:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.zhangqiying);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.jianggan);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w27);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w37);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w47);
                        me.start();
                        Toast.makeText(wujiang.this, "通过将星招募、祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image8:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.wanglang);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.gexuan);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w28);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w38);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w48);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image9:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.simahui);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.shamoke);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w29);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w39);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w49);
                        me.start();
                        Toast.makeText(wujiang.this, "通过国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.image10:
                switch (flag) {
                    case 1:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.chengyu);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.mangyazhang);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或将星招募获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w30);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w40);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (s != 1)
                            me.stop();
                        s++;
                        me = MediaPlayer.create(wujiang.this, R.raw.w50);
                        me.start();
                        Toast.makeText(wujiang.this, "通过祈福或国士碎片兑换获得！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.btn1:
                flag=1;
                finish();
                if(s!=1)
                me.release();
                s=1;
                Intent intent11=new Intent(wujiang.this, jiangxing.class);
                intent11.putExtra("userName",username);
                startActivity(intent11);
                break;
            case R.id.flags:
                if(s!=1)
                    me.release();
                flag=1;
                finish();
                s=1;
                Intent intent12=new Intent(wujiang.this, main.class);
                intent12.putExtra("userName",username);
                startActivity(intent12);
                break;
            case R.id.btn2:
                ++flag;
                if(flag==7){
                    flag=1;
                }
                switch (flag){
                    case 1:
                        image1.setImageResource(R.mipmap.guansuo);
                        image2.setImageResource(R.mipmap.zhaoxiang);
                        image3.setImageResource(R.mipmap.baosanniang);
                        image4.setImageResource(R.mipmap.xurong);
                        image5.setImageResource(R.mipmap.caoying);
                        image6.setImageResource(R.mipmap.caochun);
                        image7.setImageResource(R.mipmap.zhangqiying);
                        image8.setImageResource(R.mipmap.wanglang);
                        image9.setImageResource(R.mipmap.simahui);
                        image10.setImageResource(R.mipmap.chengyv);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj1.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj2.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj3.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj4.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj5.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj6.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj7.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj8.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj9.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj10.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("蜀\n\n关\n索");
                        text2.setText("蜀\n\n赵\n襄");
                        text3.setText("蜀\n\n鲍\n三\n娘");
                        text4.setText("群\n\n徐\n荣");
                        text5.setText("魏\n\n曹\n婴");
                        text6.setText("魏\n\n曹\n纯");
                        text7.setText("群\n\n张\n琪\n瑛");
                        text8.setText("群\n\n王\n朗");
                        text9.setText("群\n\n司\n马\n徽");
                        text10.setText("魏\n\n程\n昱");
                        text1.setBackgroundColor(Color.parseColor("#EC5450"));//蜀
                        text2.setBackgroundColor(Color.parseColor("#EC5450"));
                        text3.setBackgroundColor(Color.parseColor("#EC5450"));
                        text4.setBackgroundColor(Color.parseColor("#6F724B"));//群
                        text5.setBackgroundColor(Color.parseColor("#1A5C96"));//魏
                        text6.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text7.setBackgroundColor(Color.parseColor("#6F724B"));
                        text8.setBackgroundColor(Color.parseColor("#6F724B"));
                        text9.setBackgroundColor(Color.parseColor("#6F724B"));
                        text10.setBackgroundColor(Color.parseColor("#1A5C96"));
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.wutugu);
                        image2.setImageResource(R.mipmap.sunhao);
                        image3.setImageResource(R.mipmap.chenlin);
                        image4.setImageResource(R.mipmap.shiyu);
                        image5.setImageResource(R.mipmap.yangxiu);
                        image6.setImageResource(R.mipmap.wenyang);
                        image7.setImageResource(R.mipmap.jianggan);
                        image8.setImageResource(R.mipmap.gexuan);
                        image9.setImageResource(R.mipmap.shamoke);
                        image10.setImageResource(R.mipmap.mangyazhang);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj11.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj12.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj13.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj14.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj15.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj16.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj17.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj18.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj19.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj20.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("群\n\n兀\n突\n骨");
                        text2.setText("吴\n\n孙\n皓");
                        text3.setText("魏\n\n陈\n琳");
                        text4.setText("群\n\n士\n燮");
                        text5.setText("魏\n\n杨\n修");
                        text6.setText("魏\n\n文\n鸯");
                        text7.setText("魏\n\n蒋\n干");
                        text8.setText("吴\n\n葛\n玄");
                        text9.setText("蜀\n\n沙\n摩\n柯");
                        text10.setText("群\n\n忙\n牙\n长");
                        text1.setBackgroundColor(Color.parseColor("#6F724B"));
                        text2.setBackgroundColor(Color.parseColor("#08970C"));//吴
                        text3.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text4.setBackgroundColor(Color.parseColor("#6F724B"));
                        text5.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text6.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text7.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text8.setBackgroundColor(Color.parseColor("#08970C"));
                        text9.setBackgroundColor(Color.parseColor("#EC5450"));
                        text10.setBackgroundColor(Color.parseColor("#6F724B"));
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.xugong);
                        image2.setImageResource(R.mipmap.zhangchangpu);
                        image3.setImageResource(R.mipmap.lijue);
                        image4.setImageResource(R.mipmap.guosi);
                        image5.setImageResource(R.mipmap.fanchou);
                        image6.setImageResource(R.mipmap.zhangji);
                        image7.setImageResource(R.mipmap.w27);
                        image8.setImageResource(R.mipmap.w28);
                        image9.setImageResource(R.mipmap.w29);
                        image10.setImageResource(R.mipmap.w30);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj21.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj22.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj23.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj24.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj25.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj26.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj27.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj28.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj29.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj30.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("吴\n\n许\n贡");
                        text2.setText("魏\n\n张\n菖\n蒲");
                        text3.setText("群\n\n李\n傕");
                        text4.setText("群\n\n郭\n汜");
                        text5.setText("群\n\n樊\n稠");
                        text6.setText("群\n\n张\n济");
                        text7.setText("群\n\n王\n允");
                        text8.setText("魏\n\n管\n辂");
                        text9.setText("蜀\n\n蒲\n元");
                        text10.setText("魏\n\n王\n双");
                        text1.setBackgroundColor(Color.parseColor("#08970C"));
                        text2.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text3.setBackgroundColor(Color.parseColor("#6F724B"));
                        text4.setBackgroundColor(Color.parseColor("#6F724B"));
                        text5.setBackgroundColor(Color.parseColor("#6F724B"));
                        text6.setBackgroundColor(Color.parseColor("#6F724B"));
                        text7.setBackgroundColor(Color.parseColor("#6F724B"));
                        text8.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text9.setBackgroundColor(Color.parseColor("#EC5450"));
                        text10.setBackgroundColor(Color.parseColor("#1A5C96"));
                        break;
                    case 4:
                        image1.setImageResource(R.mipmap.w31);
                        image2.setImageResource(R.mipmap.w32);
                        image3.setImageResource(R.mipmap.w33);
                        image4.setImageResource(R.mipmap.w34);
                        image5.setImageResource(R.mipmap.w35);
                        image6.setImageResource(R.mipmap.w36);
                        image7.setImageResource(R.mipmap.w37);
                        image8.setImageResource(R.mipmap.w38);
                        image9.setImageResource(R.mipmap.w39);
                        image10.setImageResource(R.mipmap.w40);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj31.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj32.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj33.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj34.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj35.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj36.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj37.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj38.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj39.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj40.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("群\n\n皇\n甫\n嵩");
                        text2.setText("蜀\n\n花\n鬟");
                        text3.setText("魏\n\n辛\n宪\n英");
                        text4.setText("吴\n\n孙\n鲁\n育");
                        text5.setText("魏\n\n辛\n毗");
                        text6.setText("群\n\n李\n肃");
                        text7.setText("吴\n\n张\n温");
                        text8.setText("蜀\n\n伊\n籍");
                        text9.setText("魏\n\n张\n恭");
                        text10.setText("蜀\n\n吕\n凯");
                        text1.setBackgroundColor(Color.parseColor("#6F724B"));
                        text2.setBackgroundColor(Color.parseColor("#EC5450"));
                        text3.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text4.setBackgroundColor(Color.parseColor("#08970C"));
                        text5.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text6.setBackgroundColor(Color.parseColor("#6F724B"));
                        text7.setBackgroundColor(Color.parseColor("#08970C"));
                        text8.setBackgroundColor(Color.parseColor("#EC5450"));
                        text9.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text10.setBackgroundColor(Color.parseColor("#EC5450"));
                        break;
                    case 5:
                        image1.setImageResource(R.mipmap.w41);
                        image2.setImageResource(R.mipmap.w42);
                        image3.setImageResource(R.mipmap.w43);
                        image4.setImageResource(R.mipmap.w44);
                        image5.setImageResource(R.mipmap.w45);
                        image6.setImageResource(R.mipmap.w46);
                        image7.setImageResource(R.mipmap.w47);
                        image8.setImageResource(R.mipmap.w48);
                        image9.setImageResource(R.mipmap.w49);
                        image10.setImageResource(R.mipmap.w50);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj41.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj42.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj43.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj44.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj45.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj46.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj47.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj48.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj49.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj50.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("吴\n\n卫\n温\n诸\n葛\n直");
                        text2.setText("群\n\n卑\n弥\n呼");
                        text3.setText("群\n\n灵\n雎");
                        text4.setText("蜀\n\n诸\n葛\n果");
                        text5.setText("吴\n\n诸\n葛\n恪");
                        text6.setText("群\n\n群\n赵\n云");
                        text7.setText("群\n\n李\n傕\n郭\n汜");
                        text8.setText("蜀\n\n夏\n侯\n霸");
                        text9.setText("群\n\n群\n马\n超");
                        text10.setText("群\n\n张\n宝");
                        text1.setBackgroundColor(Color.parseColor("#08970C"));
                        text2.setBackgroundColor(Color.parseColor("#6F724B"));
                        text3.setBackgroundColor(Color.parseColor("#6F724B"));
                        text4.setBackgroundColor(Color.parseColor("#EC5450"));
                        text5.setBackgroundColor(Color.parseColor("#08970C"));
                        text6.setBackgroundColor(Color.parseColor("#6F724B"));
                        text7.setBackgroundColor(Color.parseColor("#6F724B"));
                        text8.setBackgroundColor(Color.parseColor("#EC5450"));
                        text9.setBackgroundColor(Color.parseColor("#6F724B"));
                        text10.setBackgroundColor(Color.parseColor("#6F724B"));
                        break;
                    case 6:
                        image1.setImageResource(R.mipmap.w51);
                        image2.setImageResource(R.mipmap.w52);
                        image3.setImageResource(R.mipmap.w53);
                        image4.setImageResource(0);
                        image5.setImageResource(0);
                        image6.setImageResource(0);
                        image7.setImageResource(0);
                        image8.setImageResource(0);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        if(wj51.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj52.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj53.equals("true")){
                            image3.setColorFilter(null);
                        }
                        s4.setImageResource(0);
                        s5.setImageResource(0);
                        s6.setImageResource(0);
                        s7.setImageResource(0);
                        s8.setImageResource(0);
                        s9.setImageResource(0);
                        s10.setImageResource(0);
                        text1.setText("吴\n\n大\n乔\n小\n乔");
                        text2.setText("群\n\n潘\n凤");
                        text3.setText("群\n\n邢\n道\n荣");
                        text4.setText("");
                        text5.setText("");
                        text6.setText("");
                        text7.setText("");
                        text8.setText("");
                        text9.setText("");
                        text10.setText("");
                        text1.setBackgroundColor(Color.parseColor("#08970C"));
                        text2.setBackgroundColor(Color.parseColor("#6F724B"));
                        text3.setBackgroundColor(Color.parseColor("#6F724B"));
                        text4.setBackgroundColor(Color.TRANSPARENT);
                        text5.setBackgroundColor(Color.TRANSPARENT);
                        text6.setBackgroundColor(Color.TRANSPARENT);
                        text7.setBackgroundColor(Color.TRANSPARENT);
                        text8.setBackgroundColor(Color.TRANSPARENT);
                        text9.setBackgroundColor(Color.TRANSPARENT);
                        text10.setBackgroundColor(Color.TRANSPARENT);
                        break;
                }
                break;
            case R.id.btn3:
                --flag;
                if(flag==0){
                    flag=6;
                }
                switch (flag){
                    case 1:
                        image1.setImageResource(R.mipmap.guansuo);
                        image2.setImageResource(R.mipmap.zhaoxiang);
                        image3.setImageResource(R.mipmap.baosanniang);
                        image4.setImageResource(R.mipmap.xurong);
                        image5.setImageResource(R.mipmap.caoying);
                        image6.setImageResource(R.mipmap.caochun);
                        image7.setImageResource(R.mipmap.zhangqiying);
                        image8.setImageResource(R.mipmap.wanglang);
                        image9.setImageResource(R.mipmap.simahui);
                        image10.setImageResource(R.mipmap.chengyv);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj1.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj2.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj3.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj4.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj5.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj6.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj7.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj8.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj9.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj10.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("蜀\n\n关\n索");
                        text2.setText("蜀\n\n赵\n襄");
                        text3.setText("蜀\n\n鲍\n三\n娘");
                        text4.setText("群\n\n徐\n荣");
                        text5.setText("魏\n\n曹\n婴");
                        text6.setText("魏\n\n曹\n纯");
                        text7.setText("群\n\n张\n琪\n瑛");
                        text8.setText("群\n\n王\n朗");
                        text9.setText("群\n\n司\n马\n徽");
                        text10.setText("魏\n\n程\n昱");
                        text1.setBackgroundColor(Color.parseColor("#EC5450"));//蜀
                        text2.setBackgroundColor(Color.parseColor("#EC5450"));
                        text3.setBackgroundColor(Color.parseColor("#EC5450"));
                        text4.setBackgroundColor(Color.parseColor("#6F724B"));//群
                        text5.setBackgroundColor(Color.parseColor("#1A5C96"));//魏
                        text6.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text7.setBackgroundColor(Color.parseColor("#6F724B"));
                        text8.setBackgroundColor(Color.parseColor("#6F724B"));
                        text9.setBackgroundColor(Color.parseColor("#6F724B"));
                        text10.setBackgroundColor(Color.parseColor("#1A5C96"));
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.wutugu);
                        image2.setImageResource(R.mipmap.sunhao);
                        image3.setImageResource(R.mipmap.chenlin);
                        image4.setImageResource(R.mipmap.shiyu);
                        image5.setImageResource(R.mipmap.yangxiu);
                        image6.setImageResource(R.mipmap.wenyang);
                        image7.setImageResource(R.mipmap.jianggan);
                        image8.setImageResource(R.mipmap.gexuan);
                        image9.setImageResource(R.mipmap.shamoke);
                        image10.setImageResource(R.mipmap.mangyazhang);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj11.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj12.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj13.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj14.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj15.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj16.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj17.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj18.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj19.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj20.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("群\n\n兀\n突\n骨");
                        text2.setText("吴\n\n孙\n皓");
                        text3.setText("魏\n\n陈\n琳");
                        text4.setText("群\n\n士\n燮");
                        text5.setText("魏\n\n杨\n修");
                        text6.setText("魏\n\n文\n鸯");
                        text7.setText("魏\n\n蒋\n干");
                        text8.setText("吴\n\n葛\n玄");
                        text9.setText("蜀\n\n沙\n摩\n柯");
                        text10.setText("群\n\n忙\n牙\n长");
                        text1.setBackgroundColor(Color.parseColor("#6F724B"));
                        text2.setBackgroundColor(Color.parseColor("#08970C"));//吴
                        text3.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text4.setBackgroundColor(Color.parseColor("#6F724B"));
                        text5.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text6.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text7.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text8.setBackgroundColor(Color.parseColor("#08970C"));
                        text9.setBackgroundColor(Color.parseColor("#EC5450"));
                        text10.setBackgroundColor(Color.parseColor("#6F724B"));
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.xugong);
                        image2.setImageResource(R.mipmap.zhangchangpu);
                        image3.setImageResource(R.mipmap.lijue);
                        image4.setImageResource(R.mipmap.guosi);
                        image5.setImageResource(R.mipmap.fanchou);
                        image6.setImageResource(R.mipmap.zhangji);
                        image7.setImageResource(R.mipmap.w27);
                        image8.setImageResource(R.mipmap.w28);
                        image9.setImageResource(R.mipmap.w29);
                        image10.setImageResource(R.mipmap.w30);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj21.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj22.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj23.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj24.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj25.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj26.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj27.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj28.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj29.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj30.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("吴\n\n许\n贡");
                        text2.setText("魏\n\n张\n菖\n蒲");
                        text3.setText("群\n\n李\n傕");
                        text4.setText("群\n\n郭\n汜");
                        text5.setText("群\n\n樊\n稠");
                        text6.setText("群\n\n张\n济");
                        text7.setText("群\n\n王\n允");
                        text8.setText("魏\n\n管\n辂");
                        text9.setText("蜀\n\n蒲\n元");
                        text10.setText("魏\n\n王\n双");
                        text1.setBackgroundColor(Color.parseColor("#08970C"));
                        text2.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text3.setBackgroundColor(Color.parseColor("#6F724B"));
                        text4.setBackgroundColor(Color.parseColor("#6F724B"));
                        text5.setBackgroundColor(Color.parseColor("#6F724B"));
                        text6.setBackgroundColor(Color.parseColor("#6F724B"));
                        text7.setBackgroundColor(Color.parseColor("#6F724B"));
                        text8.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text9.setBackgroundColor(Color.parseColor("#EC5450"));
                        text10.setBackgroundColor(Color.parseColor("#1A5C96"));
                        break;
                    case 4:
                        image1.setImageResource(R.mipmap.w31);
                        image2.setImageResource(R.mipmap.w32);
                        image3.setImageResource(R.mipmap.w33);
                        image4.setImageResource(R.mipmap.w34);
                        image5.setImageResource(R.mipmap.w35);
                        image6.setImageResource(R.mipmap.w36);
                        image7.setImageResource(R.mipmap.w37);
                        image8.setImageResource(R.mipmap.w38);
                        image9.setImageResource(R.mipmap.w39);
                        image10.setImageResource(R.mipmap.w40);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj31.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj32.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj33.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj34.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj35.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj36.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj37.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj38.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj39.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj40.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("群\n\n皇\n甫\n嵩");
                        text2.setText("蜀\n\n花\n鬟");
                        text3.setText("魏\n\n辛\n宪\n英");
                        text4.setText("吴\n\n孙\n鲁\n育");
                        text5.setText("魏\n\n辛\n毗");
                        text6.setText("群\n\n李\n肃");
                        text7.setText("吴\n\n张\n温");
                        text8.setText("蜀\n\n伊\n籍");
                        text9.setText("魏\n\n张\n恭");
                        text10.setText("蜀\n\n吕\n凯");
                        text1.setBackgroundColor(Color.parseColor("#6F724B"));
                        text2.setBackgroundColor(Color.parseColor("#EC5450"));
                        text3.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text4.setBackgroundColor(Color.parseColor("#08970C"));
                        text5.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text6.setBackgroundColor(Color.parseColor("#6F724B"));
                        text7.setBackgroundColor(Color.parseColor("#08970C"));
                        text8.setBackgroundColor(Color.parseColor("#EC5450"));
                        text9.setBackgroundColor(Color.parseColor("#1A5C96"));
                        text10.setBackgroundColor(Color.parseColor("#EC5450"));
                        break;
                    case 5:
                        image1.setImageResource(R.mipmap.w41);
                        image2.setImageResource(R.mipmap.w42);
                        image3.setImageResource(R.mipmap.w43);
                        image4.setImageResource(R.mipmap.w44);
                        image5.setImageResource(R.mipmap.w45);
                        image6.setImageResource(R.mipmap.w46);
                        image7.setImageResource(R.mipmap.w47);
                        image8.setImageResource(R.mipmap.w48);
                        image9.setImageResource(R.mipmap.w49);
                        image10.setImageResource(R.mipmap.w50);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        image4.setColorFilter(grayColorFilter);
                        image5.setColorFilter(grayColorFilter);
                        image6.setColorFilter(grayColorFilter);
                        image7.setColorFilter(grayColorFilter);
                        image8.setColorFilter(grayColorFilter);
                        image9.setColorFilter(grayColorFilter);
                        image10.setColorFilter(grayColorFilter);
                        if(wj41.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj42.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj43.equals("true")){
                            image3.setColorFilter(null);
                        }
                        if(wj44.equals("true")){
                            image4.setColorFilter(null);
                        }
                        if(wj45.equals("true")){
                            image5.setColorFilter(null);
                        }
                        if(wj46.equals("true")){
                            image6.setColorFilter(null);
                        }
                        if(wj47.equals("true")){
                            image7.setColorFilter(null);
                        }
                        if(wj48.equals("true")){
                            image8.setColorFilter(null);
                        }
                        if(wj49.equals("true")){
                            image9.setColorFilter(null);
                        }
                        if(wj50.equals("true")){
                            image10.setColorFilter(null);
                        }
                        s4.setImageResource(R.mipmap.sss);
                        s5.setImageResource(R.mipmap.sss);
                        s6.setImageResource(R.mipmap.sss);
                        s7.setImageResource(R.mipmap.sss);
                        s8.setImageResource(R.mipmap.sss);
                        s9.setImageResource(R.mipmap.sss);
                        s10.setImageResource(R.mipmap.sss);
                        text1.setText("吴\n\n卫\n温\n诸\n葛\n直");
                        text2.setText("群\n\n卑\n弥\n呼");
                        text3.setText("群\n\n灵\n雎");
                        text4.setText("蜀\n\n诸\n葛\n果");
                        text5.setText("吴\n\n诸\n葛\n恪");
                        text6.setText("群\n\n群\n赵\n云");
                        text7.setText("群\n\n李\n傕\n郭\n汜");
                        text8.setText("蜀\n\n夏\n侯\n霸");
                        text9.setText("群\n\n群\n马\n超");
                        text10.setText("群\n\n张\n宝");
                        text1.setBackgroundColor(Color.parseColor("#08970C"));
                        text2.setBackgroundColor(Color.parseColor("#6F724B"));
                        text3.setBackgroundColor(Color.parseColor("#6F724B"));
                        text4.setBackgroundColor(Color.parseColor("#EC5450"));
                        text5.setBackgroundColor(Color.parseColor("#08970C"));
                        text6.setBackgroundColor(Color.parseColor("#6F724B"));
                        text7.setBackgroundColor(Color.parseColor("#6F724B"));
                        text8.setBackgroundColor(Color.parseColor("#EC5450"));
                        text9.setBackgroundColor(Color.parseColor("#6F724B"));
                        text10.setBackgroundColor(Color.parseColor("#6F724B"));
                        break;
                    case 6:
                        image1.setImageResource(R.mipmap.w51);
                        image2.setImageResource(R.mipmap.w52);
                        image3.setImageResource(R.mipmap.w53);
                        image4.setImageResource(0);
                        image5.setImageResource(0);
                        image6.setImageResource(0);
                        image7.setImageResource(0);
                        image8.setImageResource(0);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        image1.setColorFilter(grayColorFilter); // 如果想恢复彩色显示，设置为null即可
                        image2.setColorFilter(grayColorFilter);
                        image3.setColorFilter(grayColorFilter);
                        if(wj51.equals("true")){
                            image1.setColorFilter(null);
                        }
                        if(wj52.equals("true")){
                            image2.setColorFilter(null);
                        }
                        if(wj53.equals("true")){
                            image3.setColorFilter(null);
                        }
                        s4.setImageResource(0);
                        s5.setImageResource(0);
                        s6.setImageResource(0);
                        s7.setImageResource(0);
                        s8.setImageResource(0);
                        s9.setImageResource(0);
                        s10.setImageResource(0);
                        text1.setText("吴\n\n大\n乔\n小\n乔");
                        text2.setText("群\n\n潘\n凤");
                        text3.setText("群\n\n邢\n道\n荣");
                        text4.setText("");
                        text5.setText("");
                        text6.setText("");
                        text7.setText("");
                        text8.setText("");
                        text9.setText("");
                        text10.setText("");
                        text1.setBackgroundColor(Color.parseColor("#08970C"));
                        text2.setBackgroundColor(Color.parseColor("#6F724B"));
                        text3.setBackgroundColor(Color.parseColor("#6F724B"));
                        text4.setBackgroundColor(Color.TRANSPARENT);
                        text5.setBackgroundColor(Color.TRANSPARENT);
                        text6.setBackgroundColor(Color.TRANSPARENT);
                        text7.setBackgroundColor(Color.TRANSPARENT);
                        text8.setBackgroundColor(Color.TRANSPARENT);
                        text9.setBackgroundColor(Color.TRANSPARENT);
                        text10.setBackgroundColor(Color.TRANSPARENT);
                        break;
                }
                break;
        }
    }
}
