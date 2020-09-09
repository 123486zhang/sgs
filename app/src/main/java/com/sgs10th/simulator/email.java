package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
import com.xuexiang.xupdatedemo.updatejl;
import com.xuexiang.xupdatedemo.updatewj;
import com.xuexiang.xupdatedemo.updateyj;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class email extends AppCompatActivity implements View.OnClickListener {
    private ImageView image,back,image2;
    private TextView item,texttip;
    private Button btn1;
    private  String username,yjzt,yjitem,jlid1,jlid2,jlid3,jlid4,wj1,wj2,wj3,wj4,wj5,wj6,wj7,wj8,wj9,wj10;
    private  int yjsl,yjnum,zsd,coin,zhaomuling,jf,gssp,pjs;
    private  java.util.Timer time,time2;
    private TimerTask task,task2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.email);
        Intent intent = getIntent();
        username = intent.getStringExtra("userName");
        image=findViewById(R.id.image);
        image2=findViewById(R.id.image2);
        item=findViewById(R.id.item);
        btn1=findViewById(R.id.btn1);
        texttip=findViewById(R.id.texttip);
        btn1.setOnClickListener(this);
        back=findViewById(R.id.back);
        back.setOnClickListener(this);
        time=new java.util.Timer(true);
        task=new TimerTask() {
            @Override
            public void run() {
                new Thread(() -> {
                    final String response = mes.loginByPost(username);
                    runOnUiThread(() -> {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String zt = jsonObject.getString("查询状态");
                            zsd=jsonObject.getInt("转生丹数");
                            yjsl = jsonObject.getInt("剩余邮件数");
                            yjzt = jsonObject.getString("邮件状态");
                            yjnum=jsonObject.getInt("物品数量");
                            yjitem=jsonObject.getString("邮件物品");
                            jlid1 = jsonObject.getString("jl1");
                            jlid2 = jsonObject.getString("jl2");
                            jlid3 = jsonObject.getString("jl3");
                            jlid4 = jsonObject.getString("jl4");
                            coin = jsonObject.getInt("元宝数");
                            zhaomuling = jsonObject.getInt("招募令数");
                            jf=jsonObject.getInt("将符数");
                            gssp=jsonObject.getInt("国士碎片数");
                            pjs=jsonObject.getInt("破界石数") ;
                            if (response != null) {
                                if (zt.equals("查询成功")) {
                                    if(yjzt.equals("true")){
                                        btn1.setText("已领取");
                                        item.setText(yjitem+"*"+yjnum+",目前剩余"+yjsl+"份!");
                                        switch (yjitem)
                                        {
                                            case "转生丹":
                                                image.setImageResource(R.mipmap.zsd);
                                                break;
                                            case "招募令":
                                                image.setImageResource(R.mipmap.sgszml);
                                                break;
                                            case "元宝":
                                                image.setImageResource(R.mipmap.sgsyb);
                                                break;
                                            case "国士碎片":
                                                image.setImageResource(R.mipmap.gssp);
                                                break;
                                            case "将符":
                                                image.setImageResource(R.mipmap.jinagfu);
                                                break;
                                            case "将灵公孙瓒":
                                                image.setImageResource(R.mipmap.jl1);
                                                break;
                                            case "武将曹婴":
                                                image2.setImageResource(R.mipmap.caoyingbg);
                                                break;
                                            case "武将曹纯":
                                                image2.setImageResource(R.mipmap.caochunbg);
                                                break;
                                            case "武将张琪瑛":
                                                image2.setImageResource(R.mipmap.zhangqiyingbg);
                                                break;
                                            case "武将关索":
                                                image2.setImageResource(R.mipmap.guansuobg);
                                                break;
                                            case "武将鲍三娘":
                                                image2.setImageResource(R.mipmap.baosanniangbg);
                                                break;
                                            case "武将徐荣":
                                                image2.setImageResource(R.mipmap.xurongbg);
                                                break;
                                            case "武将赵襄":
                                                image2.setImageResource(R.mipmap.zhaoxiangbg);
                                                break;
                                            case "武将司马徽":
                                                image2.setImageResource(R.mipmap.simahuibg);
                                                break;
                                        }
                                    }
                                    if(yjzt.equals("false")){
                                        btn1.setText("领取");
                                        item.setText(yjitem+"*"+yjnum+",目前剩余"+yjsl+"份!");
                                        switch (yjitem)
                                        {
                                            case "转生丹":
                                                image.setImageResource(R.mipmap.zsd);
                                                break;
                                            case "招募令":
                                                image.setImageResource(R.mipmap.sgszml);
                                                break;
                                            case "元宝":
                                                image.setImageResource(R.mipmap.sgsyb);
                                                break;
                                            case "国士碎片":
                                                image.setImageResource(R.mipmap.gssp);
                                                break;
                                            case "将符":
                                                image.setImageResource(R.mipmap.jinagfu);
                                                break;
                                            case "将灵公孙瓒":
                                                image.setImageResource(R.mipmap.jl1);
                                                break;
                                            case "武将曹婴":
                                                image2.setImageResource(R.mipmap.caoyingbg);
                                                break;
                                            case "武将曹纯":
                                                image2.setImageResource(R.mipmap.caochunbg);
                                                break;
                                            case "武将张琪瑛":
                                                image2.setImageResource(R.mipmap.zhangqiyingbg);
                                                break;
                                            case "武将关索":
                                                image2.setImageResource(R.mipmap.guansuobg);
                                                break;
                                            case "武将鲍三娘":
                                                image2.setImageResource(R.mipmap.baosanniangbg);
                                                break;
                                            case "武将徐荣":
                                                image2.setImageResource(R.mipmap.xurongbg);
                                                break;
                                            case "武将赵襄":
                                                image2.setImageResource(R.mipmap.zhaoxiangbg);
                                                break;
                                            case "武将司马徽":
                                                image2.setImageResource(R.mipmap.simahuibg);
                                                break;
                                        }
                                    }
                                } else {
                                    Toast.makeText(email.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(email.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time.schedule(task,0,2000);
        time2=new java.util.Timer(true);
        task2=new TimerTask() {
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
                                    Toast.makeText(email.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(email.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
            }
        };
        time2.schedule(task2,500,30000);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                if (yjzt.equals("false")) {
                    if(yjsl>0){
                    switch (yjitem) {
                        case "转生丹":
                            Toast.makeText(email.this, "领取成功，恭喜你获得转生丹*" + yjnum + "！", Toast.LENGTH_LONG).show();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatejl.loginByGet(username, jlid1, jlid2, jlid3, jlid4, "" + (zsd + yjnum));
                            }).start();
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            break;
                        case "招募令":
                            Toast.makeText(email.this, "领取成功，恭喜你获得招募令*" + yjnum + "！", Toast.LENGTH_LONG).show();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username, "" + coin, "" + (zhaomuling + yjnum), "" + pjs, "" + jf);
                            }).start();
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            break;
                        case "元宝":
                            Toast.makeText(email.this, "领取成功，恭喜你获得元宝*" + yjnum + "！", Toast.LENGTH_LONG).show();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username, "" + (coin + yjnum), "" + zhaomuling, "" + pjs, "" + jf);
                            }).start();
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            break;
                        case "国士碎片":
                            Toast.makeText(email.this, "领取成功，恭喜你获得国士碎片*" + yjnum + "！", Toast.LENGTH_LONG).show();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updategssp.loginByGet(username, "" + (gssp + yjnum));
                            }).start();
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            break;
                        case "将符":
                            Toast.makeText(email.this, "领取成功，恭喜你获得将符*" + yjnum + "！", Toast.LENGTH_LONG).show();
                            new Thread(() -> {
                                // final String response = LoginService.loginByGet(username,password);
                                updatecoins.loginByGet(username, "" + coin, "" + zhaomuling, "" + pjs, "" + (jf + yjnum));
                            }).start();
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            break;
                        case "将灵公孙瓒":
                            if (jlid1.equals("null")) {
                                Toast.makeText(email.this, "领取成功，恭喜你获得将灵公孙瓒*1！", Toast.LENGTH_LONG).show();
                                new Thread(() -> {
                                    // final String response = LoginService.loginByGet(username,password);
                                    updatejl.loginByGet(username, "公孙瓒", jlid2, jlid3, jlid4, "" + zsd);
                                }).start();
                                updateyj.loginByGet("" + (yjsl - 1));
                                updateyj.loginByGet2(username, "true");
                            } else {
                                if (jlid2.equals("null")) {
                                    Toast.makeText(email.this, "领取成功，恭喜你获得将灵公孙瓒*1！", Toast.LENGTH_LONG).show();
                                    new Thread(() -> {
                                        // final String response = LoginService.loginByGet(username,password);
                                        updatejl.loginByGet(username, jlid1, "公孙瓒", jlid3, jlid4, "" + zsd);
                                    }).start();
                                    updateyj.loginByGet("" + (yjsl - 1));
                                    updateyj.loginByGet2(username, "true");
                                } else {
                                    if (jlid3.equals("null")) {
                                        Toast.makeText(email.this, "领取成功，恭喜你获得将灵公孙瓒*1！", Toast.LENGTH_LONG).show();
                                        new Thread(() -> {
                                            // final String response = LoginService.loginByGet(username,password);
                                            updatejl.loginByGet(username, jlid1, jlid2, "公孙瓒", jlid4, "" + zsd);
                                        }).start();
                                        updateyj.loginByGet("" + (yjsl - 1));
                                        updateyj.loginByGet2(username, "true");
                                    } else {
                                        if (jlid4.equals("null")) {
                                            Toast.makeText(email.this, "领取成功，恭喜你获得将灵公孙瓒*1！", Toast.LENGTH_LONG).show();
                                            new Thread(() -> {
                                                // final String response = LoginService.loginByGet(username,password);
                                                updatejl.loginByGet(username, jlid1, jlid2, jlid3, "公孙瓒", "" + zsd);
                                            }).start();
                                            updateyj.loginByGet("" + (yjsl - 1));
                                            updateyj.loginByGet2(username, "true");
                                        } else {
                                            Toast.makeText(email.this, "领取失败，将灵数量已达最大限制！", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }
                            }

                            break;
                        case "武将关索":
                            Toast.makeText(email.this, "领取成功，恭喜你获得关索!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得关索!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj1(username, "true");
                            Intent intent15 = new Intent(email.this, getguansuo.class);
                            Bundle bundle5 = new Bundle();
                            bundle5.putCharSequence("wj", "关索");
                            bundle5.putCharSequence("userName", username);
                            intent15.putExtras(bundle5);
                            startActivity(intent15);
                            break;
                        case "武将赵襄":
                            Toast.makeText(email.this, "领取成功，恭喜你获得赵襄!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得赵襄!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj2(username, "true");
                            Intent intent11 = new Intent(email.this, getguansuo.class);
                            Bundle bundle1 = new Bundle();
                            bundle1.putCharSequence("wj", "赵襄");
                            bundle1.putCharSequence("userName", username);
                            intent11.putExtras(bundle1);
                            startActivity(intent11);
                            break;
                        case "武将鲍三娘":
                            Toast.makeText(email.this, "领取成功，恭喜你获得鲍三娘!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得鲍三娘!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj3(username, "true");
                            Intent intent13 = new Intent(email.this, getguansuo.class);
                            Bundle bundle3 = new Bundle();
                            bundle3.putCharSequence("wj", "鲍三娘");
                            bundle3.putCharSequence("userName", username);
                            intent13.putExtras(bundle3);
                            startActivity(intent13);
                            break;
                        case "武将徐荣":
                            Toast.makeText(email.this, "领取成功，恭喜你获得徐荣!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得徐荣!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj4(username, "true");
                            Intent intent14 = new Intent(email.this, getguansuo.class);
                            Bundle bundle4 = new Bundle();
                            bundle4.putCharSequence("wj", "徐荣");
                            bundle4.putCharSequence("userName", username);
                            intent14.putExtras(bundle4);
                            startActivity(intent14);
                            break;
                        case "武将曹婴":
                            Toast.makeText(email.this, "领取成功，恭喜你获得曹婴!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得曹婴!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj5(username, "true");
                            Intent intent151 = new Intent(email.this, getguansuo.class);
                            Bundle bundle51 = new Bundle();
                            bundle51.putCharSequence("wj", "曹婴");
                            bundle51.putCharSequence("userName", username);
                            intent151.putExtras(bundle51);
                            startActivity(intent151);
                            break;
                        case "武将曹纯":
                            Toast.makeText(email.this, "领取成功，恭喜你获得曹纯!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得曹纯!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj6(username, "true");
                            Intent intent16 = new Intent(email.this, getguansuo.class);
                            Bundle bundle6 = new Bundle();
                            bundle6.putCharSequence("wj", "曹纯");
                            bundle6.putCharSequence("userName", username);
                            intent16.putExtras(bundle6);
                            startActivity(intent16);
                            break;
                        case "武将张琪瑛":
                            Toast.makeText(email.this, "领取成功，恭喜你获得张琪瑛!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得张琪瑛!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj7(username, "true");
                            Intent intent17 = new Intent(email.this, getguansuo.class);
                            Bundle bundle7 = new Bundle();
                            bundle7.putCharSequence("wj", "张琪瑛");
                            bundle7.putCharSequence("userName", username);
                            intent17.putExtras(bundle7);
                            startActivity(intent17);
                            break;
                        case "武将司马徽":
                            Toast.makeText(email.this, "领取成功，恭喜你获得司马徽!" , Toast.LENGTH_LONG).show();
                            texttip.setText("恭喜玩家" + username + "通过邮件获得司马徽!!!\t\t\t\t\t\t\t\t\t\t");
                            updateyj.loginByGet("" + (yjsl - 1));
                            updateyj.loginByGet2(username, "true");
                            updatewj.loginByGetwj1(username, "true");
                            updatewj.loginByGetwj8(username, "true");
                            Intent intent18 = new Intent(email.this, getguansuo.class);
                            Bundle bundle8 = new Bundle();
                            bundle8.putCharSequence("wj", "司马徽");
                            bundle8.putCharSequence("userName", username);
                            intent18.putExtras(bundle8);
                            startActivity(intent18);
                            break;
                    }
                    btn1.setText("已领取");
                }
                    if(yjsl<=0){
                        Toast.makeText(email.this, "领取失败，邮件已经被领完！", Toast.LENGTH_SHORT).show();
                    }
        }
                if(yjzt.equals("true"))
                {
                    Toast.makeText(email.this, "不能重复领取！", Toast.LENGTH_SHORT).show();
                }
                new Thread(() -> {
                    final String response = mes.loginByPost(username);
                    runOnUiThread(() -> {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            String zt = jsonObject.getString("查询状态");
                            zsd=jsonObject.getInt("转生丹数");
                            yjsl = jsonObject.getInt("剩余邮件数");
                            yjzt = jsonObject.getString("邮件状态");
                            yjnum=jsonObject.getInt("物品数量");
                            yjitem=jsonObject.getString("邮件物品");
                            jlid1 = jsonObject.getString("jl1");
                            jlid2 = jsonObject.getString("jl2");
                            jlid3 = jsonObject.getString("jl3");
                            jlid4 = jsonObject.getString("jl4");
                            coin = jsonObject.getInt("元宝数");
                            zhaomuling = jsonObject.getInt("招募令数");
                            jf=jsonObject.getInt("将符数");
                            gssp=jsonObject.getInt("国士碎片数");
                            pjs=jsonObject.getInt("破界石数") ;
                            if (response != null) {
                                if (zt.equals("查询成功")) {
                                    if(yjzt.equals("true")){
                                        btn1.setText("已领取");
                                        item.setText(yjitem+"*"+yjnum+",目前剩余"+yjsl+"份!");
                                        switch (yjitem)
                                        {
                                            case "转生丹":
                                                image.setImageResource(R.mipmap.zsd);
                                                break;
                                            case "招募令":
                                                image.setImageResource(R.mipmap.sgszml);
                                                break;
                                            case "元宝":
                                                image.setImageResource(R.mipmap.sgsyb);
                                                break;
                                            case "国士碎片":
                                                image.setImageResource(R.mipmap.gssp);
                                                break;
                                            case "将符":
                                                image.setImageResource(R.mipmap.jinagfu);
                                                break;
                                            case "将灵公孙瓒":
                                                image.setImageResource(R.mipmap.jl1);
                                                break;
                                            case "武将曹婴":
                                                image2.setImageResource(R.mipmap.caoyingbg);
                                                break;
                                            case "武将曹纯":
                                                image2.setImageResource(R.mipmap.caochunbg);
                                                break;
                                            case "武将张琪瑛":
                                                image2.setImageResource(R.mipmap.zhangqiyingbg);
                                                break;
                                            case "武将关索":
                                                image2.setImageResource(R.mipmap.guansuobg);
                                                break;
                                            case "武将鲍三娘":
                                                image2.setImageResource(R.mipmap.baosanniangbg);
                                                break;
                                            case "武将徐荣":
                                                image2.setImageResource(R.mipmap.xurongbg);
                                                break;
                                            case "武将赵襄":
                                                image2.setImageResource(R.mipmap.zhaoxiangbg);
                                                break;
                                            case "武将司马徽":
                                                image2.setImageResource(R.mipmap.simahuibg);
                                                break;
                                        }
                                    }
                                    if(yjzt.equals("false")){
                                        btn1.setText("领取");
                                        item.setText(yjitem+"*"+yjnum+",目前剩余"+yjsl+"份!");
                                        switch (yjitem)
                                        {
                                            case "转生丹":
                                                image.setImageResource(R.mipmap.zsd);
                                                break;
                                            case "招募令":
                                                image.setImageResource(R.mipmap.sgszml);
                                                break;
                                            case "元宝":
                                                image.setImageResource(R.mipmap.sgsyb);
                                                break;
                                            case "国士碎片":
                                                image.setImageResource(R.mipmap.gssp);
                                                break;
                                            case "将符":
                                                image.setImageResource(R.mipmap.jinagfu);
                                                break;
                                            case "将灵公孙瓒":
                                                image.setImageResource(R.mipmap.jl1);
                                                break;
                                            case "武将曹婴":
                                                image2.setImageResource(R.mipmap.caoyingbg);
                                                break;
                                            case "武将曹纯":
                                                image2.setImageResource(R.mipmap.caochunbg);
                                                break;
                                            case "武将张琪瑛":
                                                image2.setImageResource(R.mipmap.zhangqiyingbg);
                                                break;
                                            case "武将关索":
                                                image2.setImageResource(R.mipmap.guansuobg);
                                                break;
                                            case "武将鲍三娘":
                                                image2.setImageResource(R.mipmap.baosanniangbg);
                                                break;
                                            case "武将徐荣":
                                                image2.setImageResource(R.mipmap.xurongbg);
                                                break;
                                            case "武将赵襄":
                                                image2.setImageResource(R.mipmap.zhaoxiangbg);
                                                break;
                                            case "武将司马徽":
                                                image2.setImageResource(R.mipmap.simahuibg);
                                                break;
                                        }
                                    }
                                } else {
                                    Toast.makeText(email.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(email.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    });
                }).start();
                break;
            case R.id.back:
                finish();
                Intent intent11=new Intent(email.this, main.class);
                intent11.putExtra("userName",username);
                startActivity(intent11);
                break;

        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            finish();
            Intent intent11=new Intent(email.this, main.class);
            intent11.putExtra("userName",username);
            startActivity(intent11);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
