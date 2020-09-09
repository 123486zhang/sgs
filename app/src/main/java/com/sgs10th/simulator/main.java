package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.jiangxing;
import com.xuexiang.xupdatedemo.login;
import com.xuexiang.xupdatedemo.mes;
import com.xuexiang.xupdatedemo.querryhead;
import com.xuexiang.xupdatedemo.tip;
import com.xuexiang.xupdatedemo.updatecoins;
import com.xuexiang.xupdatedemo.updategssp;
import com.xuexiang.xupdatedemo.upstate;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class main extends AppCompatActivity implements View.OnClickListener{
    private TextView text1,text2,headtext;
    private EditText text3,text7;
    private Button btn2,btn3,btn4,btn5,btn7,btn9,btn8,btn10,btn6,btn11,btn13,btn12,btn14,btn15;
    private String scdk;
    private static int s=1;
    private int pjs,jf,coin,zhaomuling,gssp,zsd,yjsl;
    private  String spjs,sjf,signState,sgssp,jlid1,jlid2,jlid3,jlid4,jlid5,yjzt;
    private  TextView texttip,jlid;
    private  java.util.Timer time,time2;
    private TimerTask task,task2;
    private ImageView head,bg2,bg3,bg4,jl,red;
    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        text1 = findViewById(R.id.text1);//id
        text2 = findViewById(R.id.text2);//元宝
        text3 = findViewById(R.id.text3);//cdkget
        headtext = findViewById(R.id.headtext);
        jl = findViewById(R.id.jl);
        jl.setOnClickListener(this);
        jlid = findViewById(R.id.jlidx);
        headtext.setOnClickListener(this);
        btn5 = findViewById(R.id.btn5);
        btn5.setOnClickListener(this);
        btn9 = findViewById(R.id.btn9);
        btn9.setOnClickListener(this);
        btn8 = findViewById(R.id.btn8);
        btn8.setOnClickListener(this);
        btn10 = findViewById(R.id.btn10);
        btn10.setOnClickListener(this);
        btn7 = findViewById(R.id.btn7);
        texttip = (TextView) findViewById(R.id.texttip);
        head=findViewById(R.id.head);
        head.setOnClickListener(this);
        btn7.setOnClickListener(this);
        bg2 = findViewById(R.id.bg2);
        bg2.setOnClickListener(this);
        bg3 = findViewById(R.id.bg3);
        bg3.setOnClickListener(this);
        bg4 = findViewById(R.id.bg4);
        bg4.setOnClickListener(this);
        btn6 = findViewById(R.id.btn6);
        btn6.setOnClickListener(this);
        btn11 = findViewById(R.id.btn11);
        btn11.setOnClickListener(this);
        btn13 = findViewById(R.id.btn13);
        btn13.setOnClickListener(this);
        btn12 = findViewById(R.id.btn12);
        btn12.setOnClickListener(this);
        btn14 = findViewById(R.id.btn14);
        btn14.setOnClickListener(this);
        btn15 = findViewById(R.id.btn15);
        red = findViewById(R.id.red);
        btn15.setOnClickListener(this);
        Intent intent = getIntent();
        String userName = intent.getStringExtra("userName");
        text1.setText(userName);
        new Thread(() -> {
            String username = text1.getText().toString();
            // final String response = LoginService.loginByGet(username,password);
            final String response = querryhead.loginByGet(username);
            runOnUiThread(() -> {
                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String zt = jsonObject.getString("查询状态");
                    int head1 = jsonObject.getInt("头像");
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                           switch (head1){
                               case 1:
                                   head.setImageResource(R.mipmap.male);
                                   break;
                               case 2:
                                   head.setImageResource(R.mipmap.female);
                                   break;
                               case 3:
                                   head.setImageResource(R.mipmap.guansuohead);
                                   break;
                               case 4:
                                   head.setImageResource(R.mipmap.zhaoxianghead);
                                   break;
                               case 5:
                                   head.setImageResource(R.mipmap.baosannianghead);
                                   break;
                               case 6:
                                   head.setImageResource(R.mipmap.xuronghead);
                                   break;
                               case 7:
                                   head.setImageResource(R.mipmap.caoyinghead);
                                   break;
                               case 8:
                                   head.setImageResource(R.mipmap.caochunhead);
                                   break;
                               case 9:
                                   head.setImageResource(R.mipmap.zhangqiyinghead);
                                   break;
                               case 10:
                                   head.setImageResource(R.mipmap.wanglanghead);
                                   break;
                               case 11:
                                   head.setImageResource(R.mipmap.simahuihead);
                                   break;
                               case 12:
                                   head.setImageResource(R.mipmap.chengyuhead);
                                   break;
                               case 13:
                                   head.setImageResource(R.mipmap.wutuguhead);
                                   break;
                               case 14:
                                   head.setImageResource(R.mipmap.sunhaohead);
                                   break;
                               case 15:
                                   head.setImageResource(R.mipmap.chenlinhead);
                                   break;
                               case 16:
                                   head.setImageResource(R.mipmap.shiyuhead);
                                   break;
                               case 17:
                                   head.setImageResource(R.mipmap.yangxiuhead);
                                   break;
                               case 18:
                                   head.setImageResource(R.mipmap.wenyanghead);
                                   break;
                               case 19:
                                   head.setImageResource(R.mipmap.jiangganhead);
                                   break;
                               case 20:
                                   head.setImageResource(R.mipmap.gexuanhead);
                                   break;
                               case 21:
                                   head.setImageResource(R.mipmap.shamokehead);
                                   break;
                               case 22:
                                   head.setImageResource(R.mipmap.mangyazhanghead);
                                   break;
                               case 23:
                                   head.setImageResource(R.mipmap.xugonghead);
                                   break;
                               case 24:
                                   head.setImageResource(R.mipmap.zhangchangpuhead);
                                   break;
                               case 25:
                                   head.setImageResource(R.mipmap.liquehead);
                                   break;
                               case 26:
                                   head.setImageResource(R.mipmap.guosihead);
                                   break;
                               case 27:
                                   head.setImageResource(R.mipmap.fanchouhead);
                                   break;
                               case 28:
                                   head.setImageResource(R.mipmap.zhangjihead);
                                   break;
                               case 29:
                                   head.setImageResource(R.mipmap.h27);
                                   break;
                               case 30:
                                   head.setImageResource(R.mipmap.h28);
                                   break;
                               case 31:
                                   head.setImageResource(R.mipmap.h29);
                                   break;
                               case 32:
                                   head.setImageResource(R.mipmap.h30);
                                   break;
                               case 33:
                                   head.setImageResource(R.mipmap.h31);
                                   break;
                               case 34:
                                   head.setImageResource(R.mipmap.h32);
                                   break;
                               case 35:
                                   head.setImageResource(R.mipmap.h33);
                                   break;
                               case 36:
                                   head.setImageResource(R.mipmap.h34);
                                   break;
                               case 37:
                                   head.setImageResource(R.mipmap.h35);
                                   break;
                               case 38:
                                   head.setImageResource(R.mipmap.h36);
                                   break;
                               case 39:
                                   head.setImageResource(R.mipmap.h37);
                                   break;
                               case 40:
                                   head.setImageResource(R.mipmap.h38);
                                   break;
                               case 41:
                                   head.setImageResource(R.mipmap.h39);
                                   break;
                               case 42:
                                   head.setImageResource(R.mipmap.h40);
                                   break;
                               case 43:
                                   head.setImageResource(R.mipmap.h41);
                                   break;
                               case 44:
                                   head.setImageResource(R.mipmap.h42);
                                   break;
                               case 45:
                                   head.setImageResource(R.mipmap.h43);
                                   break;
                               case 46:
                                   head.setImageResource(R.mipmap.h44);
                                   break;
                               case 47:
                                   head.setImageResource(R.mipmap.h45);
                                   break;
                               case 48:
                                   head.setImageResource(R.mipmap.h46);
                                   break;
                               case 49:
                                   head.setImageResource(R.mipmap.h47);
                                   break;
                               case 50:
                                   head.setImageResource(R.mipmap.h48);
                                   break;
                               case 51:
                                   head.setImageResource(R.mipmap.h49);
                                   break;
                               case 52:
                                   head.setImageResource(R.mipmap.h50);
                                   break;
                               case 53:
                                   head.setImageResource(R.mipmap.h51);
                                   break;
                               case 54:
                                   head.setImageResource(R.mipmap.h52);
                                   break;
                               case 55:
                                   head.setImageResource(R.mipmap.h53);
                                   break;
                           }
                        } else {
                            Toast.makeText(main.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(main.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }

            });
        }).start();
        new Thread(() -> {
            String username = text1.getText().toString();
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
                    gssp=jsonObject.getInt("国士碎片数");
                    zsd=jsonObject.getInt("转生丹数");
                     jlid1 = jsonObject.getString("jl1");
                     jlid2 = jsonObject.getString("jl2");
                     jlid3 = jsonObject.getString("jl3");
                     jlid4 = jsonObject.getString("jl4");
                     jlid5 = jsonObject.getString("jl5");
                    signState = jsonObject.getString("签到状态");
                    yjsl = jsonObject.getInt("剩余邮件数");
                    yjzt = jsonObject.getString("邮件状态");
                     spjs = "" + pjs;
                     sjf = "" + jf;
                    String scoin = "" + coin;
                    jl.setImageResource(0);
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                            if(yjsl>0&&yjzt.equals("false")) {
                               red.setImageResource(R.mipmap.redpoint);
                            }
                            else
                            {
                                red.setImageResource(0);
                            }
                            if(!jlid5.equals("null")) {
                                if (jlid5.length() < 3) {
                                    jlid.setText(jlid5);
                                } else {
                                    jlid.setText(jlid5);
                                }
                            }
                            else
                            {
                                jlid.setText(jlid1);
                            }
                            switch (jlid.getText().toString())
                            {
                                case "公孙瓒":
                                    jlid.setTextColor(0xffffffff);
                                    jl.setImageResource(R.mipmap.jl1);
                                    break;
                                case "张梁":
                                    jlid.setTextColor(0xff2DE936);
                                    jl.setImageResource(R.mipmap.jl2);
                                    break;
                                case "文聘":
                                    jlid.setTextColor(0xff2DE936);
                                    jl.setImageResource(R.mipmap.jl3);
                                    break;
                                case "祖茂":
                                    jlid.setTextColor(0xff2DE936);
                                    jl.setImageResource(R.mipmap.jl4);
                                    break;
                                case "踏顿":
                                    jlid.setTextColor(0xffC22FE9);
                                    jl.setImageResource(R.mipmap.jl5);
                                    break;
                                case "郭淮":
                                    jlid.setTextColor(0xffC22FE9);
                                    jl.setImageResource(R.mipmap.jl6);
                                    break;
                                case "孙鲁班":
                                    jlid.setTextColor(0xffC22FE9);
                                    jl.setImageResource(R.mipmap.jl7);
                                    break;
                                case "徐盛":
                                    jlid.setTextColor(0xffC22FE9);
                                    jl.setImageResource(R.mipmap.jl8);
                                    break;
                                case "马忠":
                                    jlid.setTextColor(0xffC22FE9);
                                    jl.setImageResource(R.mipmap.jl9);
                                    break;
                                case "张嶷":
                                    jlid.setTextColor(0xffC22FE9);
                                    jl.setImageResource(R.mipmap.jl10);
                                    break;
                                case "荀攸":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl11);
                                    break;
                                case "华雄":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl12);
                                    break;
                                case "袁绍":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl13);
                                    break;
                                case "郭皇后":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl14);
                                    break;
                                case "曹叡":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl15);
                                    break;
                                case "孙登":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl16);
                                    break;
                                case "关银屏":
                                    jlid.setTextColor(0xffEEC40A);
                                    jl.setImageResource(R.mipmap.jl17);
                                    break;
                                case "关羽":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl18);
                                    break;
                                case "姜维":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl19);
                                    break;
                                case "戏志才":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl20);
                                    break;
                                case "祝融":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl21);
                                    break;
                                case "诸葛亮":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl22);
                                    break;
                                case "大乔":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl23);
                                    break;
                                case "小乔":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl24);
                                    break;
                                case "郭嘉":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl25);
                                    break;
                                case "陆逊":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl26);
                                    break;
                                case "貂蝉":
                                    jlid.setTextColor(0xffF4511E);
                                    jl.setImageResource(R.mipmap.jl27);
                                    break;
                                case "诸葛果":
                                    jlid.setTextColor(0xffF0201A);
                                    jl.setImageResource(R.mipmap.jl28);
                                    break;
                                case "年兽":
                                    jlid.setTextColor(0xffF0201A);
                                    jl.setImageResource(R.mipmap.jl29);
                                    break;
                                case "神赵云":
                                    jlid.setTextColor(0xffF0201A);
                                    jl.setImageResource(R.mipmap.jl30);
                                    break;
                                case "灵雎":
                                    jlid.setTextColor(0xffF0201A);
                                    jl.setImageResource(R.mipmap.jl31);
                                    break;
                                case "神周瑜":
                                    jlid.setTextColor(0xffF0201A);
                                    jl.setImageResource(R.mipmap.jl32);
                                    break;
                            }
                            text2.setText(scoin);
                        } else {
                            Toast.makeText(main.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(main.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(main.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(main.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time.schedule(task,500,30000);
        time2=new java.util.Timer(true);
        task2=new TimerTask() {
            @Override
            public void run() {
                new Thread(() -> {
                    String username = text1.getText().toString();
                    // final String response = LoginService.loginByGet(username,password);
                    final String response = mes.loginByPost(username);
                    runOnUiThread(() -> {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String zt = jsonObject.getString("查询状态");
                            yjsl = jsonObject.getInt("剩余邮件数");
                            yjzt = jsonObject.getString("邮件状态");
                            if (response != null) {
                                if (zt.equals("查询成功")) {
                                    if(yjsl>0&&yjzt.equals("false")) {
                                        red.setImageResource(R.mipmap.redpoint);
                                    }
                                    else
                                    {
                                        red.setImageResource(0);
                                    }
                                } else {
                                    Toast.makeText(main.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(main.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time2.schedule(task2,500,5000);
    }
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.btn5:
                    finish();
                    Intent intent11=new Intent(main.this, jiangxing.class);
                    intent11.putExtra("userName",text1.getText().toString());
                    startActivity(intent11);
                    break;
                case R.id.btn7:
                    finish();
                    Intent intent12=new Intent(main.this, wujiang.class);
                    intent12.putExtra("userName",text1.getText().toString());
                    startActivity(intent12);
                    break;
                case R.id.head:
                case R.id.headtext:
                    finish();
                    Intent intent13=new Intent(main.this, head.class);
                    intent13.putExtra("userName",text1.getText().toString());
                    startActivity(intent13);
                    break;
                case R.id.btn9:
                    finish();
                    Intent intent14=new Intent(main.this, cdk.class);
                    intent14.putExtra("userName",text1.getText().toString());
                    startActivity(intent14);
                    break;
                case R.id.btn8:
                    if(signState.equals("true"))
                    {
                        Toast.makeText(main.this,"不能重复签到哦，明天再来吧！",Toast.LENGTH_LONG).show();
                    }
                    else
                    {
                        new Thread(() -> {
                            String signstatee="true"; //返回签到状态
                            // final String response = LoginService.loginByGet(username,password);
                            final String response = upstate.loginByGet(text1.getText().toString(),"23",signstatee);
                            runOnUiThread(() -> {
                                try {
                                    JSONObject jsonObject = new JSONObject(response);
                                    String zt = jsonObject.getString("状态");
                                    if(zt.equals("签到成功")) {
                                        signState="false";
                                        int coins=coin+5000;
                                        int zhaomulings=zhaomuling+10;
                                        int gssps=gssp+50;
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatecoins.loginByGet(text1.getText().toString(), ""+coins, ""+zhaomulings, spjs, sjf);
                                        }).start();
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updategssp.loginByGet(text1.getText().toString(), ""+gssps);
                                        }).start();
                                        Toast.makeText(main.this, "签到成功,获得元宝*5000、招募令*10、国士碎片*50！", Toast.LENGTH_LONG).show();
                                        finish();
                                        Intent intent15=new Intent(main.this, main.class);
                                        intent15.putExtra("userName",text1.getText().toString());
                                        startActivity(intent15);
                                    }
                                    else
                                    {
                                        Toast.makeText(main.this, "签到失败！", Toast.LENGTH_LONG).show();
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }

                            });
                        }).start();
                    }
                    break;
                case R.id.btn10:
                    Intent intent17=new Intent(main.this, beibao.class);
                    intent17.putExtra("userName",text1.getText().toString());
                    startActivity(intent17);
                    break;
                case R.id.bg3:
                case R.id.bg2:
                case R.id.bg4:
                case R.id.btn6:
                case R.id.btn11:
                case R.id.btn13:
                    Toast.makeText(main.this, "尽请期待！", Toast.LENGTH_LONG).show();
                    break;
                case R.id.btn12:
                    finish();
                    Intent intent18=new Intent(main.this, gsspshop.class);
                    intent18.putExtra("userName",text1.getText().toString());
                    startActivity(intent18);
                    break;
                case R.id.btn14:
                case R.id.jl:
                    finish();
                    Intent intent19=new Intent(main.this, jlzs.class);
                    intent19.putExtra("userName",text1.getText().toString());
                    startActivity(intent19);
                    break;
                case R.id.btn15:
                    finish();
                    Intent intent20=new Intent(main.this, email.class);
                    intent20.putExtra("userName",text1.getText().toString());
                    startActivity(intent20);
                    break;
            }

        }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            showNormalDialog();
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
                new AlertDialog.Builder(main.this);
        normalDialog.setTitle("Tips");
        normalDialog.setMessage("\n       确认注销登录吗？");
        normalDialog.setPositiveButton("确定",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        Intent intent1=new Intent(main.this, login.class);
                        startActivity(intent1);
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
