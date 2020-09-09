package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.jiangxing;
import com.xuexiang.xupdatedemo.rigwj;
import com.xuexiang.xupdatedemo.tip;
import com.xuexiang.xupdatedemo.updatecoins;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class head extends AppCompatActivity implements View.OnClickListener {
    private TextView texttip;
    private java.util.Timer time;
    private TimerTask task;
    private ImageView image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12,back;
    private static String username,wj1,wj2,wj3,wj4,wj5,wj6,wj7,wj8,wj9,wj10
            ,wj11,wj12,wj13,wj14,wj15,wj16,wj17,wj18,wj19,wj20,wj21,wj22,wj23,wj24,wj25,wj26
            ,wj27,wj28,wj29,wj30,wj31,wj32,wj33,wj34,wj35,wj36
            ,wj37,wj38,wj39,wj40,wj41,wj42,wj43,wj44,wj45,wj46
            ,wj47,wj48,wj49,wj50,wj51,wj52,wj53;
    private String id;
    private  int flag=1;
    private Button btn3,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.head);
        Intent intent = getIntent();
        username = intent.getStringExtra("userName");
        texttip = (TextView) findViewById(R.id.texttip);
        image1 = findViewById(R.id.head1);
        image2 = findViewById(R.id.head2);
        image3 = findViewById(R.id.head3);
        image4 = findViewById(R.id.head4);
        image5 = findViewById(R.id.head5);
        image6 = findViewById(R.id.head6);
        image7 = findViewById(R.id.head7);
        image8 = findViewById(R.id.head8);
        image9 = findViewById(R.id.head9);
        image10 = findViewById(R.id.head10);
        image11 = findViewById(R.id.head11);
        image12 = findViewById(R.id.head12);
        back = findViewById(R.id.back);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(this);
        btn2.setOnClickListener(this);
        back.setOnClickListener(this);
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
        image11.setOnClickListener(this);
        image12.setOnClickListener(this);
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
                            image3.setImageResource(R.mipmap.guansuohead);
                        }
                        if(wj2.equals("true")){
                            image4.setImageResource(R.mipmap.zhaoxianghead);
                        }
                        if(wj3.equals("true")){
                            image5.setImageResource(R.mipmap.baosannianghead);
                        }
                        if(wj4.equals("true")){
                            image6.setImageResource(R.mipmap.xuronghead);
                        }
                        if(wj5.equals("true")){
                              image7.setImageResource(R.mipmap.caoyinghead);
                        }
                        if(wj6.equals("true")){
                            image8.setImageResource(R.mipmap.caochunhead);
                        }
                        if(wj7.equals("true")){
                            image9.setImageResource(R.mipmap.zhangqiyinghead);
                        }
                        if(wj8.equals("true")){
                            image10.setImageResource(R.mipmap.wanglanghead);
                        }
                        if(wj9.equals("true")){
                            image11.setImageResource(R.mipmap.simahuihead);
                        }
                        if(wj10.equals("true")){
                            image12.setImageResource(R.mipmap.chengyuhead);
                        }
                    }
                    else
                    {
                        Toast.makeText(head.this, "请检查网络连接！", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            });
        }).start();
        time = new java.util.Timer(true);
        task = new TimerTask() {
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
                                    Toast.makeText(head.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(head.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time.schedule(task, 500, 30000);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.head1:
                switch (flag) {
                    case 1:
                id = "1";
                showNormalDialog();
                break;
                    case 2:
                    if (wj11.equals("true")){
                        id = "13";
                        showNormalDialog();}
                    else
                        Toast.makeText(head.this, "拥有武将兀突骨自动解锁！", Toast.LENGTH_SHORT).show();
                    break;
                    case 3:
                        if (wj23.equals("true")){
                            id = "25";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将李傕自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj35.equals("true")){
                            id = "37";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将辛毗自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj47.equals("true")){
                            id = "49";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将李傕郭汜自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head2:
                switch (flag) {
                    case 1:
                        id = "2";
                        showNormalDialog();
                        break;
                    case 2:
                        if (wj12.equals("true")){
                            id = "14";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将孙皓自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj24.equals("true")){
                            id = "26";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将郭汜自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj36.equals("true")){
                            id = "38";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将李肃自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj48.equals("true")){
                            id = "50";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将夏侯霸自动解锁！", Toast.LENGTH_SHORT).show();
                        break;

                }
                break;
            case R.id.head3:
                switch (flag) {
                    case 1:
                        if (wj1.equals("true")){
                            id = "3";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将关索自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj13.equals("true")){
                            id = "15";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将陈琳自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj25.equals("true")){
                            id = "27";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将樊稠自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj37.equals("true")){
                            id = "39";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将张温自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj49.equals("true")){
                            id = "51";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将群马超自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head4:
                switch (flag) {
                    case 1:
                        if (wj2.equals("true")){
                            id = "4";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将赵襄自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj14.equals("true")){
                            id = "16";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将士燮自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj26.equals("true")){
                            id = "28";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将张济自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj38.equals("true")){
                            id = "40";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将伊籍自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj50.equals("true")){
                            id = "52";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将张宝自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head5:
                switch (flag) {
                    case 1:
                        if (wj3.equals("true")){
                            id = "5";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将鲍三娘自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj15.equals("true")){
                            id = "17";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将杨修自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj27.equals("true")){
                            id = "29";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将王允自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj39.equals("true")){
                            id = "41";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将张恭自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj51.equals("true")){
                            id = "53";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将大乔小乔自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head6:
                switch (flag) {
                    case 1:
                        if (wj4.equals("true")){
                            id = "6";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将徐荣自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj16.equals("true")){
                            id = "18";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将文鸯自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj28.equals("true")){
                            id = "30";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将管辂自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj40.equals("true")){
                            id = "42";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将吕凯自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj52.equals("true")){
                            id = "54";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将潘凤自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head7:
                switch (flag) {
                    case 1:
                        if (wj5.equals("true")){
                            id = "7";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将曹婴自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj17.equals("true")){
                            id = "19";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将蒋干自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj29.equals("true")){
                            id = "31";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将蒲元自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj41.equals("true")){
                            id = "43";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将卫温诸葛直自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        if (wj53.equals("true")){
                            id = "55";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将邢道荣自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head8:
                switch (flag) {
                    case 1:
                        if (wj6.equals("true")){
                            id = "8";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将曹纯自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj18.equals("true")){
                            id = "20";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将葛玄自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj30.equals("true")){
                            id = "32";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将王双自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj42.equals("true")){
                            id = "44";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将卑弥呼自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head9:
                switch (flag) {
                    case 1:
                        if (wj7.equals("true")){
                            id = "9";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将张琪瑛自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj19.equals("true")){
                            id = "21";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将沙摩柯自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj31.equals("true")){
                            id = "33";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将皇甫嵩自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj43.equals("true")){
                            id = "45";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将灵雎自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head10:
                switch (flag) {
                    case 1:
                        if (wj8.equals("true")){
                            id = "10";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将王朗自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj20.equals("true")){
                            id = "22";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将忙牙长自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj32.equals("true")){
                            id = "34";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将花鬟自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj44.equals("true")){
                            id = "46";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将诸葛果自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head11:
                switch (flag) {
                    case 1:
                        if (wj9.equals("true")){
                            id = "11";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将司马徽自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj21.equals("true")){
                            id = "23";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将许贡自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj33.equals("true")){
                            id = "35";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将辛宪英自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj45.equals("true")){
                            id = "47";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将诸葛恪自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.head12:
                switch (flag) {
                    case 1:
                        if (wj10.equals("true")){
                            id = "12";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将程昱自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        if (wj22.equals("true")){
                            id = "24";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将张菖蒲自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        if (wj34.equals("true")){
                            id = "36";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将孙鲁育自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        if (wj46.equals("true")){
                            id = "48";
                            showNormalDialog();}
                        else
                            Toast.makeText(head.this, "拥有武将群赵云自动解锁！", Toast.LENGTH_SHORT).show();
                        break;
                }
                break;
            case R.id.back:
                flag=1;
                finish();
                Intent intent=new Intent(head.this,main.class);
                intent.putExtra("userName",username);
                startActivity(intent);
                break;
            case R.id.btn2:
                ++flag;
                if(flag==6){
                    flag=1;
                }
                switch (flag) {
                    case 1:
                        image1.setImageResource(R.mipmap.male);
                        image2.setImageResource(R.mipmap.female);
                        image3.setImageResource(R.mipmap.guansuoheadh);
                        image4.setImageResource(R.mipmap.zhaoxiangheadh);
                        image5.setImageResource(R.mipmap.baosanniangheadh);
                        image6.setImageResource(R.mipmap.xurongheadh);
                        image7.setImageResource(R.mipmap.caoyingheadh);
                        image8.setImageResource(R.mipmap.caochunheadh);
                        image9.setImageResource(R.mipmap.zhangqiyingheadh);
                        image10.setImageResource(R.mipmap.wanglangheadh);
                        image11.setImageResource(R.mipmap.simahuiheadh);
                        image12.setImageResource(R.mipmap.chengyuheadh);
                        if(wj1.equals("true")){
                            image3.setImageResource(R.mipmap.guansuohead);
                        }
                        if(wj2.equals("true")){
                            image4.setImageResource(R.mipmap.zhaoxianghead);
                        }
                        if(wj3.equals("true")){
                            image5.setImageResource(R.mipmap.baosannianghead);
                        }
                        if(wj4.equals("true")){
                            image6.setImageResource(R.mipmap.xuronghead);
                        }
                        if(wj5.equals("true")){
                            image7.setImageResource(R.mipmap.caoyinghead);
                        }
                        if(wj6.equals("true")){
                            image8.setImageResource(R.mipmap.caochunhead);
                        }
                        if(wj7.equals("true")){
                            image9.setImageResource(R.mipmap.zhangqiyinghead);
                        }
                        if(wj8.equals("true")){
                            image10.setImageResource(R.mipmap.wanglanghead);
                        }
                        if(wj9.equals("true")){
                            image11.setImageResource(R.mipmap.simahuihead);
                        }
                        if(wj10.equals("true")){
                            image12.setImageResource(R.mipmap.chengyuhead);
                        }
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.wutuguheadh);
                        image2.setImageResource(R.mipmap.sunhaoheadh);
                        image3.setImageResource(R.mipmap.chenlinheadh);
                        image4.setImageResource(R.mipmap.shiyuheadh);
                        image5.setImageResource(R.mipmap.yangxiuheadh);
                        image6.setImageResource(R.mipmap.wenyangheadh);
                        image7.setImageResource(R.mipmap.jiangganheadh);
                        image8.setImageResource(R.mipmap.gexuanheadh);
                        image9.setImageResource(R.mipmap.shamokeheadh);
                        image10.setImageResource(R.mipmap.mangyazhangheadh);
                        image11.setImageResource(R.mipmap.xugongheadh);
                        image12.setImageResource(R.mipmap.zhangchangpuheadh);
                        if(wj11.equals("true")){
                            image1.setImageResource(R.mipmap.wutuguhead);
                        }
                        if(wj12.equals("true")){
                            image2.setImageResource(R.mipmap.sunhaohead);
                        }
                        if(wj13.equals("true")){
                            image3.setImageResource(R.mipmap.chenlinhead);
                        }
                        if(wj14.equals("true")){
                            image4.setImageResource(R.mipmap.shiyuhead);
                        }
                        if(wj15.equals("true")){
                            image5.setImageResource(R.mipmap.yangxiuhead);
                        }
                        if(wj16.equals("true")){
                            image6.setImageResource(R.mipmap.wenyanghead);
                        }
                        if(wj17.equals("true")){
                            image7.setImageResource(R.mipmap.jiangganhead);
                        }
                        if(wj18.equals("true")){
                            image8.setImageResource(R.mipmap.gexuanhead);
                        }
                        if(wj19.equals("true")){
                            image9.setImageResource(R.mipmap.shamokehead);
                        }
                        if(wj20.equals("true")){
                            image10.setImageResource(R.mipmap.mangyazhanghead);
                        }
                        if(wj21.equals("true")){
                            image11.setImageResource(R.mipmap.xugonghead);
                        }
                        if(wj22.equals("true")){
                            image12.setImageResource(R.mipmap.zhangchangpuhead);
                        }
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.liqueheadh);
                        image2.setImageResource(R.mipmap.guosiheadh);
                        image3.setImageResource(R.mipmap.fanchouheadh);
                        image4.setImageResource(R.mipmap.zhangjiheadh);
                        image5.setImageResource(R.mipmap.hh27);
                        image6.setImageResource(R.mipmap.hh28);
                        image7.setImageResource(R.mipmap.hh29);
                        image8.setImageResource(R.mipmap.hh30);
                        image9.setImageResource(R.mipmap.hh31);
                        image10.setImageResource(R.mipmap.hh32);
                        image11.setImageResource(R.mipmap.hh33);
                        image12.setImageResource(R.mipmap.hh34);
                        if(wj23.equals("true")){
                            image1.setImageResource(R.mipmap.liquehead);
                        }
                        if(wj24.equals("true")){
                            image2.setImageResource(R.mipmap.guosihead);
                        }
                        if(wj25.equals("true")){
                            image3.setImageResource(R.mipmap.fanchouhead);
                        }
                        if(wj26.equals("true")){
                            image4.setImageResource(R.mipmap.zhangjihead);
                        }
                        if(wj27.equals("true")){
                            image5.setImageResource(R.mipmap.h27);
                        }
                        if(wj28.equals("true")){
                            image6.setImageResource(R.mipmap.h28);
                        }
                        if(wj29.equals("true")){
                            image7.setImageResource(R.mipmap.h29);
                        }
                        if(wj30.equals("true")){
                            image8.setImageResource(R.mipmap.h30);
                        }
                        if(wj31.equals("true")){
                            image9.setImageResource(R.mipmap.h31);
                        }
                        if(wj32.equals("true")){
                            image10.setImageResource(R.mipmap.h32);
                        }
                        if(wj33.equals("true")){
                            image11.setImageResource(R.mipmap.h33);
                        }
                        if(wj34.equals("true")){
                            image12.setImageResource(R.mipmap.h34);
                        }
                        break;
                    case 4:
                        image1.setImageResource(R.mipmap.hh35);
                        image2.setImageResource(R.mipmap.hh36);
                        image3.setImageResource(R.mipmap.hh37);
                        image4.setImageResource(R.mipmap.hh38);
                        image5.setImageResource(R.mipmap.hh39);
                        image6.setImageResource(R.mipmap.hh40);
                        image7.setImageResource(R.mipmap.hh41);
                        image8.setImageResource(R.mipmap.hh42);
                        image9.setImageResource(R.mipmap.hh43);
                        image10.setImageResource(R.mipmap.hh44);
                        image11.setImageResource(R.mipmap.hh45);
                        image12.setImageResource(R.mipmap.hh46);
                        if(wj35.equals("true")){
                            image1.setImageResource(R.mipmap.h35);
                        }
                        if(wj36.equals("true")){
                            image2.setImageResource(R.mipmap.h36);
                        }
                        if(wj37.equals("true")){
                            image3.setImageResource(R.mipmap.h37);
                        }
                        if(wj38.equals("true")){
                            image4.setImageResource(R.mipmap.h38);
                        }
                        if(wj39.equals("true")){
                            image5.setImageResource(R.mipmap.h39);
                        }
                        if(wj40.equals("true")){
                            image6.setImageResource(R.mipmap.h40);
                        }
                        if(wj41.equals("true")){
                            image7.setImageResource(R.mipmap.h41);
                        }
                        if(wj42.equals("true")){
                            image8.setImageResource(R.mipmap.h42);
                        }
                        if(wj43.equals("true")){
                            image9.setImageResource(R.mipmap.h43);
                        }
                        if(wj44.equals("true")){
                            image10.setImageResource(R.mipmap.h44);
                        }
                        if(wj45.equals("true")){
                            image11.setImageResource(R.mipmap.h45);
                        }
                        if(wj46.equals("true")){
                            image12.setImageResource(R.mipmap.h46);
                        }
                        break;
                    case 5:
                        image1.setImageResource(R.mipmap.hh47);
                        image2.setImageResource(R.mipmap.hh48);
                        image3.setImageResource(R.mipmap.hh49);
                        image4.setImageResource(R.mipmap.hh50);
                        image5.setImageResource(R.mipmap.hh51);
                        image6.setImageResource(R.mipmap.hh52);
                        image7.setImageResource(R.mipmap.hh53);
                        image8.setImageResource(0);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        image11.setImageResource(0);
                        image12.setImageResource(0);
                        if(wj47.equals("true")){
                            image1.setImageResource(R.mipmap.h47);
                        }
                        if(wj48.equals("true")){
                            image2.setImageResource(R.mipmap.h48);
                        }
                        if(wj49.equals("true")){
                            image3.setImageResource(R.mipmap.h49);
                        }
                        if(wj50.equals("true")){
                            image4.setImageResource(R.mipmap.h50);
                        }
                        if(wj51.equals("true")){
                            image5.setImageResource(R.mipmap.h51);
                        }
                        if(wj52.equals("true")){
                            image6.setImageResource(R.mipmap.h52);
                        }
                        if(wj53.equals("true")){
                            image7.setImageResource(R.mipmap.h53);
                        }
                        break;
                }
                break;
            case R.id.btn3:
                --flag;
                if(flag==0){
                    flag=5;
                }
                switch (flag) {
                    case 1:
                        image1.setImageResource(R.mipmap.male);
                        image2.setImageResource(R.mipmap.female);
                        image3.setImageResource(R.mipmap.guansuoheadh);
                        image4.setImageResource(R.mipmap.zhaoxiangheadh);
                        image5.setImageResource(R.mipmap.baosanniangheadh);
                        image6.setImageResource(R.mipmap.xurongheadh);
                        image7.setImageResource(R.mipmap.caoyingheadh);
                        image8.setImageResource(R.mipmap.caochunheadh);
                        image9.setImageResource(R.mipmap.zhangqiyingheadh);
                        image10.setImageResource(R.mipmap.wanglangheadh);
                        image11.setImageResource(R.mipmap.simahuiheadh);
                        image12.setImageResource(R.mipmap.chengyuheadh);
                        if(wj1.equals("true")){
                            image3.setImageResource(R.mipmap.guansuohead);
                        }
                        if(wj2.equals("true")){
                            image4.setImageResource(R.mipmap.zhaoxianghead);
                        }
                        if(wj3.equals("true")){
                            image5.setImageResource(R.mipmap.baosannianghead);
                        }
                        if(wj4.equals("true")){
                            image6.setImageResource(R.mipmap.xuronghead);
                        }
                        if(wj5.equals("true")){
                            image7.setImageResource(R.mipmap.caoyinghead);
                        }
                        if(wj6.equals("true")){
                            image8.setImageResource(R.mipmap.caochunhead);
                        }
                        if(wj7.equals("true")){
                            image9.setImageResource(R.mipmap.zhangqiyinghead);
                        }
                        if(wj8.equals("true")){
                            image10.setImageResource(R.mipmap.wanglanghead);
                        }
                        if(wj9.equals("true")){
                            image11.setImageResource(R.mipmap.simahuihead);
                        }
                        if(wj10.equals("true")){
                            image12.setImageResource(R.mipmap.chengyuhead);
                        }
                        break;
                    case 2:
                        image1.setImageResource(R.mipmap.wutuguheadh);
                        image2.setImageResource(R.mipmap.sunhaoheadh);
                        image3.setImageResource(R.mipmap.chenlinheadh);
                        image4.setImageResource(R.mipmap.shiyuheadh);
                        image5.setImageResource(R.mipmap.yangxiuheadh);
                        image6.setImageResource(R.mipmap.wenyangheadh);
                        image7.setImageResource(R.mipmap.jiangganheadh);
                        image8.setImageResource(R.mipmap.gexuanheadh);
                        image9.setImageResource(R.mipmap.shamokeheadh);
                        image10.setImageResource(R.mipmap.mangyazhangheadh);
                        image11.setImageResource(R.mipmap.xugongheadh);
                        image12.setImageResource(R.mipmap.zhangchangpuheadh);
                        if(wj11.equals("true")){
                            image1.setImageResource(R.mipmap.wutuguhead);
                        }
                        if(wj12.equals("true")){
                            image2.setImageResource(R.mipmap.sunhaohead);
                        }
                        if(wj13.equals("true")){
                            image3.setImageResource(R.mipmap.chenlinhead);
                        }
                        if(wj14.equals("true")){
                            image4.setImageResource(R.mipmap.shiyuhead);
                        }
                        if(wj15.equals("true")){
                            image5.setImageResource(R.mipmap.yangxiuhead);
                        }
                        if(wj16.equals("true")){
                            image6.setImageResource(R.mipmap.wenyanghead);
                        }
                        if(wj17.equals("true")){
                            image7.setImageResource(R.mipmap.jiangganhead);
                        }
                        if(wj18.equals("true")){
                            image8.setImageResource(R.mipmap.gexuanhead);
                        }
                        if(wj19.equals("true")){
                            image9.setImageResource(R.mipmap.shamokehead);
                        }
                        if(wj20.equals("true")){
                            image10.setImageResource(R.mipmap.mangyazhanghead);
                        }
                        if(wj21.equals("true")){
                            image11.setImageResource(R.mipmap.xugonghead);
                        }
                        if(wj22.equals("true")){
                            image12.setImageResource(R.mipmap.zhangchangpuhead);
                        }
                        break;
                    case 3:
                        image1.setImageResource(R.mipmap.liqueheadh);
                        image2.setImageResource(R.mipmap.guosiheadh);
                        image3.setImageResource(R.mipmap.fanchouheadh);
                        image4.setImageResource(R.mipmap.zhangjiheadh);
                        image5.setImageResource(R.mipmap.hh27);
                        image6.setImageResource(R.mipmap.hh28);
                        image7.setImageResource(R.mipmap.hh29);
                        image8.setImageResource(R.mipmap.hh30);
                        image9.setImageResource(R.mipmap.hh31);
                        image10.setImageResource(R.mipmap.hh32);
                        image11.setImageResource(R.mipmap.hh33);
                        image12.setImageResource(R.mipmap.hh34);
                        if(wj23.equals("true")){
                            image1.setImageResource(R.mipmap.liquehead);
                        }
                        if(wj24.equals("true")){
                            image2.setImageResource(R.mipmap.guosihead);
                        }
                        if(wj25.equals("true")){
                            image3.setImageResource(R.mipmap.fanchouhead);
                        }
                        if(wj26.equals("true")){
                            image4.setImageResource(R.mipmap.zhangjihead);
                        }
                        if(wj27.equals("true")){
                            image5.setImageResource(R.mipmap.h27);
                        }
                        if(wj28.equals("true")){
                            image6.setImageResource(R.mipmap.h28);
                        }
                        if(wj29.equals("true")){
                            image7.setImageResource(R.mipmap.h29);
                        }
                        if(wj30.equals("true")){
                            image8.setImageResource(R.mipmap.h30);
                        }
                        if(wj31.equals("true")){
                            image9.setImageResource(R.mipmap.h31);
                        }
                        if(wj32.equals("true")){
                            image10.setImageResource(R.mipmap.h32);
                        }
                        if(wj33.equals("true")){
                            image11.setImageResource(R.mipmap.h33);
                        }
                        if(wj34.equals("true")){
                            image12.setImageResource(R.mipmap.h34);
                        }
                        break;
                    case 4:
                        image1.setImageResource(R.mipmap.hh35);
                        image2.setImageResource(R.mipmap.hh36);
                        image3.setImageResource(R.mipmap.hh37);
                        image4.setImageResource(R.mipmap.hh38);
                        image5.setImageResource(R.mipmap.hh39);
                        image6.setImageResource(R.mipmap.hh40);
                        image7.setImageResource(R.mipmap.hh41);
                        image8.setImageResource(R.mipmap.hh42);
                        image9.setImageResource(R.mipmap.hh43);
                        image10.setImageResource(R.mipmap.hh44);
                        image11.setImageResource(R.mipmap.hh45);
                        image12.setImageResource(R.mipmap.hh46);
                        if(wj35.equals("true")){
                            image1.setImageResource(R.mipmap.h35);
                        }
                        if(wj36.equals("true")){
                            image2.setImageResource(R.mipmap.h36);
                        }
                        if(wj37.equals("true")){
                            image3.setImageResource(R.mipmap.h37);
                        }
                        if(wj38.equals("true")){
                            image4.setImageResource(R.mipmap.h38);
                        }
                        if(wj39.equals("true")){
                            image5.setImageResource(R.mipmap.h39);
                        }
                        if(wj40.equals("true")){
                            image6.setImageResource(R.mipmap.h40);
                        }
                        if(wj41.equals("true")){
                            image7.setImageResource(R.mipmap.h41);
                        }
                        if(wj42.equals("true")){
                            image8.setImageResource(R.mipmap.h42);
                        }
                        if(wj43.equals("true")){
                            image9.setImageResource(R.mipmap.h43);
                        }
                        if(wj44.equals("true")){
                            image10.setImageResource(R.mipmap.h44);
                        }
                        if(wj45.equals("true")){
                            image11.setImageResource(R.mipmap.h45);
                        }
                        if(wj46.equals("true")){
                            image12.setImageResource(R.mipmap.h46);
                        }
                        break;
                    case 5:
                        image1.setImageResource(R.mipmap.hh47);
                        image2.setImageResource(R.mipmap.hh48);
                        image3.setImageResource(R.mipmap.hh49);
                        image4.setImageResource(R.mipmap.hh50);
                        image5.setImageResource(R.mipmap.hh51);
                        image6.setImageResource(R.mipmap.hh52);
                        image7.setImageResource(R.mipmap.hh53);
                        image8.setImageResource(0);
                        image9.setImageResource(0);
                        image10.setImageResource(0);
                        image11.setImageResource(0);
                        image12.setImageResource(0);
                        if(wj47.equals("true")){
                            image1.setImageResource(R.mipmap.h47);
                        }
                        if(wj48.equals("true")){
                            image2.setImageResource(R.mipmap.h48);
                        }
                        if(wj49.equals("true")){
                            image3.setImageResource(R.mipmap.h49);
                        }
                        if(wj50.equals("true")){
                            image4.setImageResource(R.mipmap.h50);
                        }
                        if(wj51.equals("true")){
                            image5.setImageResource(R.mipmap.h51);
                        }
                        if(wj52.equals("true")){
                            image6.setImageResource(R.mipmap.h52);
                        }
                        if(wj53.equals("true")){
                            image7.setImageResource(R.mipmap.h53);
                        }
                        break;
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
                new AlertDialog.Builder(head.this);
        normalDialog.setTitle("Tips");
        normalDialog.setMessage("\n       确认更换头像?");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            updatecoins.loginByGet2(username, id);
                        }).start();
                                flag=1;
                                finish();
                                Intent intent=new Intent(head.this,main.class);
                                intent.putExtra("userName",username);
                                startActivity(intent);
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
            flag=1;
            finish();
            Intent intent=new Intent(head.this,main.class);
            intent.putExtra("userName",username);
            startActivity(intent);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
