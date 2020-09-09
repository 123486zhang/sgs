package com.xuexiang.xupdatedemo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.sgs10th.simulator.getguansuo;
import com.sgs10th.simulator.head;
import com.sgs10th.simulator.jiangxingshop;
import com.sgs10th.simulator.main;
import com.sgs10th.simulator.wujiang;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Timer;
import java.util.TimerTask;


public class jiangxing extends AppCompatActivity implements View.OnClickListener{
    private Button button1,btn2,btn3,btn4;
    private Button button2;
    private TextView text,text0,jiangxingtext;
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
    private TextView text6;
    private TextView text7;
    private TextView text8;
    private TextView text9,text10,text11,texttip,text13,text14,text16,text24,text21;
    private TextView text15;
    private TextView text17;
    private TextView text19;
    private TextView text25;
    private  String username;
    private EditText text27;
    private ImageView jiangxingshop,pjsget1;
    private int jf,pjs,count7,sflag;
    private String sjf,spjs,wj1,wj2,wj3,wj4,wj5,wj6,wj7,wj8,wj9,wj10
            ,wj11,wj12,wj13,wj14,wj15,wj16,wj17,wj18,wj19,wj20,wj21,wj22,wj23,wj24,wj25,wj26;
    private  java.util.Timer time;
    private TimerTask task;
    int count=0;
    int count1=0;
    int count2=0;
    int count3=0;
    int count4=0;
    int count5=0;
    int count6=0;
    Pair[] options1 = new Pair[]{new Pair("祈福将",10),
            new Pair("限定将",50),new Pair("活动场武将",667),new Pair("SS级武将",1600),new Pair("S级武将",4673),new Pair("将符",3000)};
    Pair[] options2 = new Pair[]{new Pair("祈福将",10),
            new Pair("限定将",50),new Pair("活动场武将",667),new Pair("SS级武将",1600)};
    Pair[] options11 = new Pair[]{new Pair("司马徽",1),new Pair("鲍三娘",1),new Pair("关索",1),new Pair("徐荣",1),
            new Pair("曹纯",1),new Pair("程昱",1),new Pair("张琪瑛",1),new Pair("曹婴",1),new Pair("赵襄",1)};
    Pair[] options12 = new Pair[]{new Pair("兀突骨",15),new Pair("孙皓",30),new Pair("陈琳",10),new Pair("士燮",10),
            new Pair("葛玄",30),new Pair("蒋干",20),new Pair("文鸯",10),new Pair("杨修",10)};
    Pair[] options13 = new Pair[]{new Pair("沙摩柯",350),new Pair("忙牙长",700),new Pair("许贡",700),new Pair("张菖蒲",126),
            new Pair("樊稠",1050),new Pair("张济",1575),new Pair("郭汜",1260),new Pair("李傕",900)};
    Pair[] options14 = new Pair[]{new Pair("于吉",1),new Pair("庞统",1),new Pair("卧龙诸葛",1),new Pair("太史慈",1),new Pair("庞德",1),new Pair("颜良文丑",1),new Pair("袁绍",1),
            new Pair("孙亮",1),new Pair("王平",1),new Pair("孟获",1),new Pair("祝融",1),new Pair("董卓",1),new Pair("孙坚",1),new Pair("徐晃",1),
            new Pair("蒯良蒯越",1),new Pair("陈到",1),new Pair("吕岱",1),new Pair("文聘",1),new Pair("贺齐",1),new Pair("群黄月英",1),new Pair("周鲂",1),
            new Pair("陆抗",1),new Pair("毋丘俭",1),new Pair("韩当",1),new Pair("刘表",1),new Pair("关平",1),new Pair("顾雍",1),new Pair("蔡夫人",1),
            new Pair("袁术",1),new Pair("张绣",1),new Pair("简雍",1),new Pair("韩浩史涣",1),new Pair("陈群",1),new Pair("刘谌",1),new Pair("曹休",1),
            new Pair("法正",1),new Pair("马谡",1),new Pair("潘璋马忠",1),new Pair("吴懿",1),new Pair("周仓",1),new Pair("孙休",1),new Pair("公孙渊",1),
            new Pair("徐庶",1),new Pair("吴国太",1),new Pair("孙鲁班",1),new Pair("司马朗",1),new Pair("杜畿",1),new Pair("诸葛诞",1),new Pair("孙登",1),
            new Pair("凌统",1),new Pair("徐盛",1),new Pair("孙乾",1),new Pair("潘濬",1),new Pair("郭皇后",1),new Pair("严畯",1),new Pair("刘繇",1),
            new Pair("高顺",1),new Pair("张春华",1),new Pair("王粲",1),new Pair("蔡邕",1),new Pair("蜀徐庶",1),new Pair("马云禄",1),new Pair("祖茂",1),
            new Pair("马岱",1),new Pair("程普",1),new Pair("吴庞统",1),new Pair("魏姜维",1),new Pair("朱桓",1),new Pair("踏顿",1)};
    Pair[] options15 = new Pair[]{new Pair("黄忠",1),new Pair("魏延",1),new Pair("徐氏",1),new Pair("关银屏",1),new Pair("吴苋",1),new Pair("郭图逢纪",1),new Pair("步骘",1),
            new Pair("曹仁",1),new Pair("小乔",1),new Pair("周妃",1),new Pair("诸葛瞻",1),new Pair("王基",1),new Pair("刘协",1),new Pair("曹昂",1),
            new Pair("周泰",1),new Pair("张角",1),new Pair("郝昭",1),new Pair("曹植",1),new Pair("许攸",1),new Pair("曹节",1),new Pair("董允",1),
            new Pair("荀彧",1),new Pair("曹丕",1),new Pair("步练师",1),new Pair("关兴张苞",1),new Pair("陈宫",1),new Pair("李典",1),new Pair("诸葛瑾",1),
            new Pair("鲁肃",1),new Pair("贾诩",1),new Pair("荀攸",1),new Pair("王异",1),new Pair("钟会",1),new Pair("刘焉",1),new Pair("张鲁",1),
            new Pair("张郃",1),new Pair("邓艾",1),new Pair("刘封",1),new Pair("满宠",1),new Pair("曹冲",1),new Pair("薛综",1),new Pair("秦宓",1),
            new Pair("刘禅",1),new Pair("姜维",1),new Pair("虞翻",1),new Pair("伏皇后",1),new Pair("李儒",1),new Pair("戏志才",1),new Pair("蜀孙尚香",1),
            new Pair("孙策",1),new Pair("张昭张纮",1),new Pair("曹叡",1),new Pair("沮授",1),new Pair("张松",1),new Pair("吕虔",1),new Pair("魏蔡文姬",1),
            new Pair("陆绩",1),new Pair("蔡文姬",1),new Pair("钟繇",1),new Pair("夏侯氏",1),new Pair("朱治",1),new Pair("糜竺",1),new Pair("李严",1),new Pair("李傕郭汜",1)};
    Pair[] options16 = new Pair[]{new Pair("将符1000",100),new Pair("将符300",125),new Pair("将符200",125),new Pair("将符100",125),
            new Pair("将符150",125),new Pair("将符36",1111),new Pair("将符18",1111),new Pair("将符14",1111)
            ,new Pair("将符12",1111),new Pair("将符10",1111),new Pair("将符8",1111),new Pair("将符6",16000)
            ,new Pair("将符2",46730)};
    Pair[] options17 = new Pair[]{new Pair("1",10),
            new Pair("2",5),new Pair("5",2),new Pair("10",1)};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jiangxing);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        texttip = (TextView) findViewById(R.id.texttip);
        text = (TextView) findViewById(R.id.text);
        text0=findViewById(R.id.text0);
        jiangxingtext = findViewById(R.id.jiangxingtext);
        pjsget1 = findViewById(R.id.pjsget1);
        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);
        text13 = (TextView) findViewById(R.id.text13);
        text14 = (TextView) findViewById(R.id.text14);
        text24 = (TextView) findViewById(R.id.text24);
        text16 = (TextView) findViewById(R.id.text16);
        text7 = (TextView) findViewById(R.id.text7);
        text8 = (TextView) findViewById(R.id.text8);
        text9 = (TextView) findViewById(R.id.text9);
        text10 = (TextView) findViewById(R.id.text10);
        text11 = (TextView) findViewById(R.id.text11);
        text15 = (TextView) findViewById(R.id.text15);
        text17 = (TextView) findViewById(R.id.text17);
        text19= (TextView) findViewById(R.id.text19);
        text21= (TextView) findViewById(R.id.text21);
        text25 = (TextView) findViewById(R.id.text25);
        text27 = (EditText) findViewById(R.id.text27);
        jiangxingshop =  findViewById(R.id.jiangxingshop);
        jiangxingshop.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        Intent intent = getIntent();
        username = intent.getStringExtra("userName");
        new Thread(() -> {
            // final String response = LoginService.loginByGet(username,password);
            final String response = mes.loginByPost(username);
            runOnUiThread(() -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String zt = jsonObject.getString("查询状态");
                    int coin = jsonObject.getInt("元宝数");
                    int zhaomuling = jsonObject.getInt("招募令数");
                    jf=jsonObject.getInt("将符数");
                    pjs=jsonObject.getInt("破界石数");
                    sflag=jsonObject.getInt("剩余次数");
                    String scoin = "" + coin;
                    String szhaomuling = "" + zhaomuling;
                    spjs = "" + pjs;
                    sjf = "" + jf;
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                            text11.setText(scoin);
                            text10.setText(szhaomuling);
                            text19.setText(spjs);
                            text21.setText(sjf);
                            jiangxingtext.setText(""+sflag);
                            count7=sflag;
                        } else {
                            Toast.makeText(jiangxing.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(jiangxing.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(jiangxing.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(jiangxing.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time.schedule(task,500,30000);
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
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            });
        }).start();

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            finish();
            Intent intent11=new Intent(jiangxing.this, main.class);
            intent11.putExtra("userName",username);
            startActivity(intent11);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button1:
                --count7;
                if(count7==0){
                    pjsget1.setImageResource(R.mipmap.getpjs1);
                    count7=10;
                    if (Integer.parseInt(text10.getText().toString()) < 1) {
                        Toast.makeText(jiangxing.this, "招募令不足！", Toast.LENGTH_SHORT).show();
                    } else {
                        text0.setText("恭喜你获得：");
                        text13.setText("本次累计：");
                        text14.setText("祈福将*");
                        text16.setText("限定将*");
                        text24.setText("活动将*");
                        text.setText("");
                        text1.setText("");
                        text2.setText("");
                        text3.setText("");
                        text4.setText("");
                        text5.setText("");
                        text6.setText("");
                        text7.setText("");
                        text8.setText("");
                        text9.setText("");
                        int zmlnow = Integer.parseInt(text10.getText().toString());
                        zmlnow--;
                        int finalZmlnow = zmlnow;
                        text10.setText(String.valueOf(zmlnow));
                        String H;
                        String cost;
                        count++;
                        count6 = count / 10;
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            updategssp.loginByGet2(username,""+count7);
                        }).start();
                        jiangxingtext.setText("" + count7);
                        WeightRandom random1 = new WeightRandom(options2);
                        H = (String) random1.nextItem();
                        if (H == "祈福将") {
                            count1++;
                            WeightRandom random13 = new WeightRandom(options11);
                            H = (String) random13.nextItem();
                            switch (H) {
                                case "关索":
                                    if(wj1.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj1(username, "true");
                                    Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putCharSequence("wj", H);
                                    bundle.putCharSequence("userName", username);
                                    intent11.putExtras(bundle);
                                    startActivity(intent11);
                                    break;
                                case "赵襄":
                                    if(wj2.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj2(username, "true");
                                    Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle1 = new Bundle();
                                    bundle1.putCharSequence("wj", H);
                                    bundle1.putCharSequence("userName", username);
                                    intent12.putExtras(bundle1);
                                    startActivity(intent12);
                                    break;
                                case "鲍三娘":
                                    if(wj3.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj3(username, "true");
                                    Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putCharSequence("wj", H);
                                    bundle3.putCharSequence("userName", username);
                                    intent13.putExtras(bundle3);
                                    startActivity(intent13);
                                    break;
                                case "徐荣":
                                    if(wj4.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj4(username, "true");
                                    Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putCharSequence("wj", H);
                                    bundle4.putCharSequence("userName", username);
                                    intent14.putExtras(bundle4);
                                    startActivity(intent14);
                                    break;
                                case "曹婴":
                                    if(wj5.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj5(username, "true");
                                    Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putCharSequence("wj", H);
                                    bundle5.putCharSequence("userName", username);
                                    intent15.putExtras(bundle5);
                                    startActivity(intent15);
                                    break;
                                case "曹纯":
                                    if(wj6.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj6(username, "true");
                                    Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putCharSequence("wj", H);
                                    bundle6.putCharSequence("userName", username);
                                    intent16.putExtras(bundle6);
                                    startActivity(intent16);
                                    break;
                                case "张琪瑛":
                                    if(wj7.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj7(username, "true");
                                    Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle7 = new Bundle();
                                    bundle7.putCharSequence("wj", H);
                                    bundle7.putCharSequence("userName", username);
                                    intent17.putExtras(bundle7);
                                    startActivity(intent17);
                                    break;
                                case "司马徽":
                                    if(wj9.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj8(username, "true");
                                    Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle8 = new Bundle();
                                    bundle8.putCharSequence("wj", H);
                                    bundle8.putCharSequence("userName", username);
                                    intent18.putExtras(bundle8);
                                    startActivity(intent18);
                                    break;
                                case "程昱":
                                    if(wj10.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj9(username, "true");
                                    Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle9 = new Bundle();
                                    bundle9.putCharSequence("wj", H);
                                    bundle9.putCharSequence("userName", username);
                                    intent19.putExtras(bundle9);
                                    startActivity(intent19);
                                    break;
                            }
                            text.setText(H);
                            texttip.setText("恭喜玩家" + username + "通过将星招募获得" + H + "!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            text.setTextColor(0xffc91406);/*红色 */
                        }
                        if (H == "限定将") {
                            count2++;
                            WeightRandom random13 = new WeightRandom(options12);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xffFAE639);/*红色 */
                            texttip.setText("恭喜玩家" + username + "通过将星招募获得" + H + "!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            switch (H) {
                                case "兀突骨":
                                    if(wj11.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+200*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj11(username, "true");
                                    break;
                                case "孙皓":
                                    if(wj12.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+100*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj12(username, "true");
                                    break;
                                case "陈琳":
                                    if(wj13.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj13(username, "true");
                                    break;
                                case "士燮":
                                    if(wj14.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj14(username, "true");
                                    break;
                                case "杨修":
                                    if(wj15.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj15(username, "true");
                                    break;
                                case "文鸯":
                                    if(wj16.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj16(username, "true");
                                    break;
                                case "蒋干":
                                    if(wj17.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+150*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj17(username, "true");
                                    break;
                                case "葛玄":
                                    if(wj18.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+100*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj18(username, "true");
                                    break;
                            }
                            Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                            Bundle bundle5 = new Bundle();
                            bundle5.putCharSequence("wj", H);
                            bundle5.putCharSequence("userName", username);
                            intent15.putExtras(bundle5);
                            startActivity(intent15);
                        }
                        if (H == "活动场武将") {
                            count3++;
                            WeightRandom random13 = new WeightRandom(options13);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xffEE815F);/*红色 */
                            switch (H) {
                                case "沙摩柯":
                                    if(wj19.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+36*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj19(username, "true");
                                    break;
                                case "忙牙长":
                                    if(wj20.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+18*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj20(username, "true");
                                    break;
                                case "许贡":
                                    if(wj21.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+18*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj21(username, "true");
                                    break;
                                case "张菖蒲":
                                    if(wj22.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+100*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj22(username, "true");
                                    break;
                                case "李傕":
                                    if(wj23.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+14*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj23(username, "true");
                                    break;
                                case "郭汜":
                                    if(wj24.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+10*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj24(username, "true");
                                    break;
                                case "樊稠":
                                    if(wj25.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+12*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj25(username, "true");
                                    break;
                                case "张济":
                                    if(wj26.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+8*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj26(username, "true");
                                    break;
                            }
                            Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                            Bundle bundle5 = new Bundle();
                            bundle5.putCharSequence("wj", H);
                            bundle5.putCharSequence("userName", username);
                            intent15.putExtras(bundle5);
                            startActivity(intent15);
                        }
                        if (H == "SS级武将") {
                            count4++;
                            WeightRandom random14 = new WeightRandom(options17);
                            String beishu = (String) random14.nextItem();
                            jf=jf+6*Integer.parseInt(beishu);
                            WeightRandom random13 = new WeightRandom(options15);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xff0CC213);/*红色 */
                        }
                        text15.setText("" + count1);
                        text17.setText("" + count2);
                        text25.setText("" + count3);
                        text19.setText("" + (count6 + pjs));
                        text21.setText("" + jf);
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            updatecoins.loginByGet(username, text11.getText().toString(), String.valueOf(finalZmlnow), text19.getText().toString(), text21.getText().toString());
                        }).start();
                    }
                }
                else {
                    pjsget1.setImageResource(0);
                    if (Integer.parseInt(text10.getText().toString()) < 1) {
                        Toast.makeText(jiangxing.this, "招募令不足！", Toast.LENGTH_SHORT).show();
                    } else {
                        text0.setText("恭喜你获得：");
                        text13.setText("本次累计：");
                        text14.setText("祈福将*");
                        text16.setText("限定将*");
                        text24.setText("活动将*");
                        text.setText("");
                        text1.setText("");
                        text2.setText("");
                        text3.setText("");
                        text4.setText("");
                        text5.setText("");
                        text6.setText("");
                        text7.setText("");
                        text8.setText("");
                        text9.setText("");
                        int zmlnow = Integer.parseInt(text10.getText().toString());
                        zmlnow--;
                        int finalZmlnow = zmlnow;
                        text10.setText(String.valueOf(zmlnow));
                        String H;
                        String cost;
                        count++;
                        count6 = count / 10;
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            updategssp.loginByGet2(username,""+count7);
                        }).start();
                        jiangxingtext.setText("" + count7);
                        WeightRandom random1 = new WeightRandom(options1);
                        H = (String) random1.nextItem();
                        if (H == "祈福将") {
                            count1++;
                            WeightRandom random13 = new WeightRandom(options11);
                            H = (String) random13.nextItem();
                            switch (H) {
                                case "关索":
                                    if(wj1.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj1(username, "true");
                                    Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle = new Bundle();
                                    bundle.putCharSequence("wj", H);
                                    bundle.putCharSequence("userName", username);
                                    intent11.putExtras(bundle);
                                    startActivity(intent11);
                                    break;
                                case "赵襄":
                                    if(wj2.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj2(username, "true");
                                    Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle1 = new Bundle();
                                    bundle1.putCharSequence("wj", H);
                                    bundle1.putCharSequence("userName", username);
                                    intent12.putExtras(bundle1);
                                    startActivity(intent12);
                                    break;
                                case "鲍三娘":
                                    if(wj3.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj3(username, "true");
                                    Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle3 = new Bundle();
                                    bundle3.putCharSequence("wj", H);
                                    bundle3.putCharSequence("userName", username);
                                    intent13.putExtras(bundle3);
                                    startActivity(intent13);
                                    break;
                                case "徐荣":
                                    if(wj4.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj4(username, "true");
                                    Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle4 = new Bundle();
                                    bundle4.putCharSequence("wj", H);
                                    bundle4.putCharSequence("userName", username);
                                    intent14.putExtras(bundle4);
                                    startActivity(intent14);
                                    break;
                                case "曹婴":
                                    if(wj5.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj5(username, "true");
                                    Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle5 = new Bundle();
                                    bundle5.putCharSequence("wj", H);
                                    bundle5.putCharSequence("userName", username);
                                    intent15.putExtras(bundle5);
                                    startActivity(intent15);
                                    break;
                                case "曹纯":
                                    if(wj6.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj6(username, "true");
                                    Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle6 = new Bundle();
                                    bundle6.putCharSequence("wj", H);
                                    bundle6.putCharSequence("userName", username);
                                    intent16.putExtras(bundle6);
                                    startActivity(intent16);
                                    break;
                                case "张琪瑛":
                                    if(wj7.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj7(username, "true");
                                    Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle7 = new Bundle();
                                    bundle7.putCharSequence("wj", H);
                                    bundle7.putCharSequence("userName", username);
                                    intent17.putExtras(bundle7);
                                    startActivity(intent17);
                                    break;
                                case "司马徽":
                                    if(wj9.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj8(username, "true");
                                    Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle8 = new Bundle();
                                    bundle8.putCharSequence("wj", H);
                                    bundle8.putCharSequence("userName", username);
                                    intent18.putExtras(bundle8);
                                    startActivity(intent18);
                                    break;
                                case "程昱":
                                    if(wj10.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+1000*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj9(username, "true");
                                    Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                    Bundle bundle9 = new Bundle();
                                    bundle9.putCharSequence("wj", H);
                                    bundle9.putCharSequence("userName", username);
                                    intent19.putExtras(bundle9);
                                    startActivity(intent19);
                                    break;
                            }
                            text.setText(H);
                            texttip.setText("恭喜玩家" + username + "通过将星招募获得" + H + "!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            text.setTextColor(0xffc91406);/*红色 */
                        }
                        if (H == "限定将") {
                            count2++;
                            jf = jf + 300;
                            WeightRandom random13 = new WeightRandom(options12);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xffFAE639);/*红色 */
                            texttip.setText("恭喜玩家" + username + "通过将星招募获得" + H + "!!!\t\t\t\t\t\t\t\t\t\t");
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                tip.loginByGet2(texttip.getText().toString());
                            }).start();
                            switch (H) {
                                case "兀突骨":
                                    if(wj11.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+200*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj11(username, "true");
                                    break;
                                case "孙皓":
                                    if(wj12.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+100*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj12(username, "true");
                                    break;
                                case "陈琳":
                                    if(wj13.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj13(username, "true");
                                    break;
                                case "士燮":
                                    if(wj14.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj14(username, "true");
                                    break;
                                case "杨修":
                                    if(wj15.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj15(username, "true");
                                    break;
                                case "文鸯":
                                    if(wj16.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+300*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj16(username, "true");
                                    break;
                                case "蒋干":
                                    if(wj17.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+150*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj17(username, "true");
                                    break;
                                case "葛玄":
                                    if(wj18.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+100*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj18(username, "true");
                                    break;
                            }
                            Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                            Bundle bundle5 = new Bundle();
                            bundle5.putCharSequence("wj", H);
                            bundle5.putCharSequence("userName", username);
                            intent15.putExtras(bundle5);
                            startActivity(intent15);
                        }
                        if (H == "活动场武将") {
                            count3++;
                            jf = jf + 36;
                            WeightRandom random13 = new WeightRandom(options13);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xffEE815F);/*红色 */
                            switch (H) {
                                case "沙摩柯":
                                    if(wj19.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+36*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj19(username, "true");
                                    break;
                                case "忙牙长":
                                    if(wj20.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+18*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj20(username, "true");
                                    break;
                                case "许贡":
                                    if(wj21.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+18*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj21(username, "true");
                                    break;
                                case "张菖蒲":
                                    if(wj22.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+100*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj22(username, "true");
                                    break;
                                case "李傕":
                                    if(wj23.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+14*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj23(username, "true");
                                    break;
                                case "郭汜":
                                    if(wj24.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+10*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj24(username, "true");
                                    break;
                                case "樊稠":
                                    if(wj25.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+12*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj25(username, "true");
                                    break;
                                case "张济":
                                    if(wj26.equals("true")){
                                        WeightRandom random14 = new WeightRandom(options17);
                                        String beishu = (String) random14.nextItem();
                                        jf=jf+8*Integer.parseInt(beishu);
                                    }
                                    updatewj.loginByGetwj26(username, "true");
                                    break;
                            }
                            Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                            Bundle bundle5 = new Bundle();
                            bundle5.putCharSequence("wj", H);
                            bundle5.putCharSequence("userName", username);
                            intent15.putExtras(bundle5);
                            startActivity(intent15);
                        }
                        if (H == "SS级武将") {
                            count4++;
                            WeightRandom random14 = new WeightRandom(options17);
                            String beishu = (String) random14.nextItem();
                            jf=jf+6*Integer.parseInt(beishu);
                            WeightRandom random13 = new WeightRandom(options15);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xff0CC213);/*红色 */
                        }
                        if (H == "S级武将") {
                            count5++;
                            WeightRandom random14 = new WeightRandom(options17);
                            String beishu = (String) random14.nextItem();
                            jf=jf+2*Integer.parseInt(beishu);
                            WeightRandom random13 = new WeightRandom(options14);
                            H = (String) random13.nextItem();
                            text.setText(H);
                            text.setTextColor(0xffffffff);/*红色 */
                        }
                        if (H == "将符") {
                            WeightRandom random13 = new WeightRandom(options16);
                            WeightRandom random14 = new WeightRandom(options17);
                            H = (String) random13.nextItem();
                            String beishu = (String) random14.nextItem();
                            String jfget = H.substring(2);
                            jf = jf + (Integer.parseInt(jfget) * Integer.parseInt(beishu));
                            text.setText(H + "*" + beishu);
                            text.setTextColor(0xffECBC49);/*cheng色 */
                        }
                        text15.setText("" + count1);
                        text17.setText("" + count2);
                        text25.setText("" + count3);
                        text19.setText("" + (count6 + pjs));
                        text21.setText("" + jf);
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            updatecoins.loginByGet(username, text11.getText().toString(), String.valueOf(finalZmlnow), text19.getText().toString(), text21.getText().toString());
                        }).start();
                    }
                }
                break;
            case R.id.button2:

                if(Integer.parseInt(text10.getText().toString())<10)
                {
                    Toast.makeText(jiangxing.this, "招募令不足！", Toast.LENGTH_SHORT).show();
                }
                else {
                    pjsget1.setImageResource(R.mipmap.getpjs1);
                    text0.setText("恭喜你获得：");
                    text13.setText("本次累计：");
                    text14.setText("祈福将*");
                    text16.setText("限定将*");
                    text24.setText("活动将*");
                    int zmlnow=Integer.parseInt(text10.getText().toString());
                    zmlnow=zmlnow-10;
                    int finalZmlnow = zmlnow;
                    text10.setText(String.valueOf(zmlnow));
                    String A;
                    String cost1;
                    count = count + 10;
                    count6 = count / 10;
                    new Thread(() -> {
                        // final String response = LoginService.loginByGet(username,password);
                        updategssp.loginByGet2(username,""+count7);
                    }).start();
                    jiangxingtext.setText(""+count7);
                    WeightRandom random2 = new WeightRandom(options2);
                    A = (String) random2.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        text.setText(A);
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text.setText(A);
                        text.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text.setText(A);
                        text.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text.setText(A);
                        text.setTextColor(0xff0CC213);/*红色 */
                    }
                    WeightRandom random3 = new WeightRandom(options1);
                    A = (String) random3.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text1.setText(A);
                        text1.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text1.setText(A);
                        text1.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text1.setText(A);
                        text1.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text1.setText(A);
                        text1.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text1.setText(A);
                        text1.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text1.setText(A+"*"+beishu);
                        text1.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random4 = new WeightRandom(options1);
                    A = (String) random4.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text2.setText(A);
                        text2.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text2.setText(A);
                        text2.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text2.setText(A);
                        text2.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text2.setText(A);
                        text2.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text2.setText(A);
                        text2.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text2.setText(A+"*"+beishu);
                        text2.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random5 = new WeightRandom(options1);
                    A = (String) random5.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text3.setText(A);
                        text3.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text3.setText(A);
                        text3.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text3.setText(A);
                        text3.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text3.setText(A);
                        text3.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text3.setText(A);
                        text3.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text3.setText(A+"*"+beishu);
                        text3.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random6 = new WeightRandom(options1);
                    A = (String) random6.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text4.setText(A);
                        text4.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text4.setText(A);
                        text4.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text4.setText(A);
                        text4.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text4.setText(A);
                        text4.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text4.setText(A);
                        text4.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text4.setText(A+"*"+beishu);
                        text4.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random7 = new WeightRandom(options1);
                    A = (String) random7.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text5.setText(A);
                        text5.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text5.setText(A);
                        text5.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text5.setText(A);
                        text5.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text5.setText(A);
                        text5.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text5.setText(A);
                        text5.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text5.setText(A+"*"+beishu);
                        text5.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random8 = new WeightRandom(options1);
                    A = (String) random8.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text6.setText(A);
                        text6.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text6.setText(A);
                        text6.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text6.setText(A);
                        text6.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text6.setText(A);
                        text6.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text6.setText(A);
                        text6.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text6.setText(A+"*"+beishu);
                        text6.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random9 = new WeightRandom(options1);
                    A = (String) random9.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text7.setText(A);
                        text7.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text.setText(A);
                        text.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text7.setText(A);
                        text7.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text7.setText(A);
                        text7.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text7.setText(A);
                        text7.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text7.setText(A+"*"+beishu);
                        text7.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random10 = new WeightRandom(options1);
                    A = (String) random10.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text8.setText(A);
                        text8.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text8.setText(A);
                        text8.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text8.setText(A);
                        text8.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text8.setText(A);
                        text8.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text8.setText(A);
                        text8.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text8.setText(A+"*"+beishu);
                        text8.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    WeightRandom random11 = new WeightRandom(options1);
                    A = (String) random11.nextItem();
                    if (A == "祈福将") {
                        count1++;
                        jf=jf+1000;
                        WeightRandom random13 = new WeightRandom(options11);
                        A = (String) random13.nextItem();
                        switch (A){
                            case "关索":
                                if(wj1.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj1(username, "true");
                                Intent intent11 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle = new Bundle();
                                bundle.putCharSequence("wj", A);
                                bundle.putCharSequence("userName", username);
                                intent11.putExtras(bundle);
                                startActivity(intent11);
                                break;
                            case "赵襄":
                                if(wj2.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj2(username, "true");
                                Intent intent12 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle1 = new Bundle();
                                bundle1.putCharSequence("wj", A);
                                bundle1.putCharSequence("userName", username);
                                intent12.putExtras(bundle1);
                                startActivity(intent12);
                                break;
                            case "鲍三娘":
                                if(wj3.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj3(username, "true");
                                Intent intent13 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle3 = new Bundle();
                                bundle3.putCharSequence("wj", A);
                                bundle3.putCharSequence("userName", username);
                                intent13.putExtras(bundle3);
                                startActivity(intent13);
                                break;
                            case "徐荣":
                                if(wj4.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj4(username, "true");
                                Intent intent14 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle4 = new Bundle();
                                bundle4.putCharSequence("wj", A);
                                bundle4.putCharSequence("userName", username);
                                intent14.putExtras(bundle4);
                                startActivity(intent14);
                                break;
                            case "曹婴":
                                if(wj5.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj5(username, "true");
                                Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle5 = new Bundle();
                                bundle5.putCharSequence("wj", A);
                                bundle5.putCharSequence("userName", username);
                                intent15.putExtras(bundle5);
                                startActivity(intent15);
                                break;
                            case "曹纯":
                                if(wj6.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj6(username, "true");
                                Intent intent16 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle6 = new Bundle();
                                bundle6.putCharSequence("wj", A);
                                bundle6.putCharSequence("userName", username);
                                intent16.putExtras(bundle6);
                                startActivity(intent16);
                                break;
                            case "张琪瑛":
                                if(wj7.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj7(username, "true");
                                Intent intent17 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle7 = new Bundle();
                                bundle7.putCharSequence("wj", A);
                                bundle7.putCharSequence("userName", username);
                                intent17.putExtras(bundle7);
                                startActivity(intent17);
                                break;
                            case "司马徽":
                                if(wj9.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj8(username, "true");
                                Intent intent18 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle8 = new Bundle();
                                bundle8.putCharSequence("wj", A);
                                bundle8.putCharSequence("userName", username);
                                intent18.putExtras(bundle8);
                                startActivity(intent18);
                                break;
                            case "程昱":
                                if(wj10.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+1000*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj9(username, "true");
                                Intent intent19 = new Intent(jiangxing.this, getguansuo.class);
                                Bundle bundle9 = new Bundle();
                                bundle9.putCharSequence("wj", A);
                                bundle9.putCharSequence("userName", username);
                                intent19.putExtras(bundle9);
                                startActivity(intent19);
                                break;
                        }
                        texttip.setText("恭喜玩家"+username+"通过将星招募获得"+A+"!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        text9.setText(A);
                        text9.setTextColor(0xffc91406);/*红色 */
                    }
                    if (A == "限定将") {
                        count2++;
                        jf=jf+300;
                        WeightRandom random13 = new WeightRandom(options12);
                        A = (String) random13.nextItem();
                        text9.setText(A);
                        text9.setTextColor(0xffFAE639);/*红色 */
                        texttip.setText("恭喜玩家" + username + "通过将星招募获得" + A+ "!!!\t\t\t\t\t\t\t\t\t\t");
                        new Thread(() -> {
                            // final String response = LoginService.loginByGet(username,password);
                            tip.loginByGet2(texttip.getText().toString());
                        }).start();
                        switch (A) {
                            case "兀突骨":
                                if(wj11.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+200*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj11(username, "true");
                                break;
                            case "孙皓":
                                if(wj12.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj12(username, "true");
                                break;
                            case "陈琳":
                                if(wj13.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj13(username, "true");
                                break;
                            case "士燮":
                                if(wj14.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj14(username, "true");
                                break;
                            case "杨修":
                                if(wj15.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj15(username, "true");
                                break;
                            case "文鸯":
                                if(wj16.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+300*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj16(username, "true");
                                break;
                            case "蒋干":
                                if(wj17.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+150*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj17(username, "true");
                                break;
                            case "葛玄":
                                if(wj18.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj18(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "活动场武将") {
                        count3++;
                        jf=jf+36;
                        WeightRandom random13 = new WeightRandom(options13);
                        A = (String) random13.nextItem();
                        text9.setText(A);
                        text9.setTextColor(0xffEE815F);/*红色 */
                        switch (A) {
                            case "沙摩柯":
                                if(wj19.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+36*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj19(username, "true");
                                break;
                            case "忙牙长":
                                if(wj20.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj20(username, "true");
                                break;
                            case "许贡":
                                if(wj21.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+18*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj21(username, "true");
                                break;
                            case "张菖蒲":
                                if(wj22.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+100*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj22(username, "true");
                                break;
                            case "李傕":
                                if(wj23.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+14*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj23(username, "true");
                                break;
                            case "郭汜":
                                if(wj24.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+10*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj24(username, "true");
                                break;
                            case "樊稠":
                                if(wj25.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+12*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj25(username, "true");
                                break;
                            case "张济":
                                if(wj26.equals("true")){
                                    WeightRandom random14 = new WeightRandom(options17);
                                    String beishu = (String) random14.nextItem();
                                    jf=jf+8*Integer.parseInt(beishu);
                                }
                                updatewj.loginByGetwj26(username, "true");
                                break;
                        }
                        Intent intent15 = new Intent(jiangxing.this, getguansuo.class);
                        Bundle bundle5 = new Bundle();
                        bundle5.putCharSequence("wj", A);
                        bundle5.putCharSequence("userName", username);
                        intent15.putExtras(bundle5);
                        startActivity(intent15);
                    }
                    if (A == "SS级武将") {
                        count4++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+6*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options15);
                        A = (String) random13.nextItem();
                        text9.setText(A);
                        text9.setTextColor(0xff0CC213);/*红色 */
                    }
                    if (A == "S级武将") {
                        count5++;
                        WeightRandom random14 = new WeightRandom(options17);
                        String beishu = (String) random14.nextItem();
                        jf=jf+2*Integer.parseInt(beishu);
                        WeightRandom random13 = new WeightRandom(options14);
                        A = (String) random13.nextItem();
                        text9.setText(A);
                        text9.setTextColor(0xffffffff);/*红色 */
                    }
                    if (A == "将符") {
                        WeightRandom random13 = new WeightRandom(options16);
                        WeightRandom random14 = new WeightRandom(options17);
                        A = (String) random13.nextItem();
                        String beishu=(String) random14.nextItem();
                        String jfget=A.substring(2);
                        jf=jf+(Integer.parseInt(jfget)*Integer.parseInt(beishu));
                        text9.setText(A+"*"+beishu);
                        text9.setTextColor(0xffECBC49);/*cheng色 */
                    }
                    text15.setText("" + count1);
                    text17.setText("" + count2);
                    text25.setText("" + count3);
                    text19.setText("" + (count6+pjs));
                    text21.setText(""+jf);
                    new Thread(() -> {
                        // final String response = LoginService.loginByGet(username,password);
                        updatecoins.loginByGet(username, text11.getText().toString(), String.valueOf(finalZmlnow),text19.getText().toString(),text21.getText().toString());
                    }).start();
                }
                break;
            case R.id.btn2:
                int num1=Integer.parseInt(text27.getText().toString());
                if(num1==0){
                    Toast.makeText(jiangxing.this, "购买失败，请输入正确的数量！", Toast.LENGTH_SHORT).show();
                }
                else {
                    showNormalDialog();
                }
                break;
            case R.id.btn3:
                int num=Integer.parseInt(text27.getText().toString());
                num--;
                if(num==0||num==-1) {
                    text27.setText("1");
                    Toast.makeText(jiangxing.this, "最小购买数量为1！", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    text27.setText(String.valueOf(num));
                }
                break;
            case R.id.btn4:
                int num2=Integer.parseInt(text27.getText().toString());
                num2++;
                if(num2==100) {
                    text27.setText("99");
                    Toast.makeText(jiangxing.this, "超出最大购买数量！", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    text27.setText(String.valueOf(num2));
                }
                break;
            case R.id.jiangxingshop:
                    finish();
                    Intent intent11=new Intent(jiangxing.this,jiangxingshop.class);
                    intent11.putExtra("userName",username);
                    startActivity(intent11);
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
                new AlertDialog.Builder(jiangxing.this);
        normalDialog.setTitle("Tips");
        normalDialog.setMessage("\n       确认购买?");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        int num1=Integer.parseInt(text27.getText().toString());
                        int coin1=Integer.parseInt(text11.getText().toString());
                        int cost=1000*num1;
                        if (coin1 < cost) {
                            Toast.makeText(jiangxing.this, "购买失败，元宝数量不足！", Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(jiangxing.this, "购买招募令*"+num1+"成功！", Toast.LENGTH_SHORT).show();
                            text11.setText(String.valueOf(coin1 - cost));
                            text10.setText(String.valueOf(Integer.parseInt(text10.getText().toString()) + num1));
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username, String.valueOf(coin1 - cost), text10.getText().toString(),text19.getText().toString(),text21.getText().toString());
                            }).start();
                        }
                    }
                });
        normalDialog.setNegativeButton("取消",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //...To-do
                        Toast.makeText(jiangxing.this, "取消购买", Toast.LENGTH_SHORT).show();
                    }
                });
        normalDialog.show();
    }

}
