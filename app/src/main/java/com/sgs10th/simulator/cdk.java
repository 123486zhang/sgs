package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.WeightRandom;
import com.xuexiang.xupdatedemo.cdkget;
import com.xuexiang.xupdatedemo.cdkuse;
import com.xuexiang.xupdatedemo.jiangxing;
import com.xuexiang.xupdatedemo.mes;
import com.xuexiang.xupdatedemo.tip;
import com.xuexiang.xupdatedemo.updatecoins;
import com.xuexiang.xupdatedemo.updategssp;
import com.xuexiang.xupdatedemo.updatewj;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.TimerTask;

public class cdk extends AppCompatActivity  implements View.OnClickListener {
    private EditText text3;
    private Button btn1;
    private TextView texttip,getcdkm;
    private String username,sjf,spjs,item4;
    private int jf,pjs,coin,zhaomuling,gssp;
    private TimerTask task;
    private  ImageView back,image2;
    private  java.util.Timer time;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cdk);
        Intent intent = getIntent();
        username = intent.getStringExtra("userName");
        text3 = findViewById(R.id.text3);
        texttip = findViewById(R.id.texttip);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(this);
        back = findViewById(R.id.back);
        back.setOnClickListener(this);
        image2 = findViewById(R.id.image2);
        image2.setOnClickListener(this);
        getcdkm = findViewById(R.id.getcdkm);
        getcdkm.setOnClickListener(this);
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
                    gssp=jsonObject.getInt("国士碎片数");
                    spjs = "" + pjs;
                    sjf = "" + jf;
                    if (response != null) {
                        if (zt.equals("查询成功")) {
                        } else {
                            Toast.makeText(cdk.this, "查询失败！", Toast.LENGTH_SHORT).show();
                        }
                    } else {
                        Toast.makeText(cdk.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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
                                    Toast.makeText(cdk.this, "查询失败！", Toast.LENGTH_SHORT).show();
                                }
                            } else {
                                Toast.makeText(cdk.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
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

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                String scdk = text3.getText().toString();
                if (scdk.length() == 0) {
                    Toast.makeText(cdk.this, "兑换码不能为空！", Toast.LENGTH_SHORT).show();
                } else if (scdk.length() != 12) {
                    Toast.makeText(cdk.this, "请输入正确的兑换码！", Toast.LENGTH_SHORT).show();
                } else {
                    new Thread(() -> {
                        // final String response = LoginService.loginByGet(username,password);
                        final String response = cdkget.loginByPost(scdk);
                        runOnUiThread(() -> {
                            try {
                                JSONObject jsonObject = new JSONObject(response);
                                String zt = jsonObject.getString("状态");
                                if (response != null) {
                                    if (zt.equals("存在")) {
                                        String item = jsonObject.getString("道具名称");
                                        int num = jsonObject.getInt("数量");
                                        String item2 = jsonObject.getString("道具名称2");
                                        int num2 = jsonObject.getInt("数量2");
                                        String item3 = jsonObject.getString("道具名称3");
                                        int num3 = jsonObject.getInt("数量3");
                                        String isuse = jsonObject.getString("使用状态");
                                        item4 = jsonObject.getString("道具名称4");
                                        if (isuse.equals("false")) {
                                            new Thread(() -> {
                                                // final String response = LoginService.loginByGet(username,password);
                                                cdkuse.loginByGet(scdk, "true");
                                            }).start();
                                            if(!item4.equals("null")){
                                                System.out.print("查看Item4"+item4);
                                                Toast.makeText(cdk.this, "兑换成功，恭喜你获得" + item4 +"!", Toast.LENGTH_LONG).show();
                                                texttip.setText("恭喜玩家" + username + "通过CDK兑换获得" + item4 + "!!!\t\t\t\t\t\t\t\t\t\t");
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    tip.loginByGet2(texttip.getText().toString());
                                                }).start();
                                                switch (item4)
                                                {
                                                    case "曹婴":
                                                        updatewj.loginByGetwj5(username, "true");
                                                        break;
                                                    case "徐荣":
                                                        updatewj.loginByGetwj4(username, "true");
                                                        break;
                                                    case "曹纯":
                                                        updatewj.loginByGetwj6(username, "true");
                                                        break;
                                                    case "司马徽":
                                                        updatewj.loginByGetwj8(username, "true");
                                                        break;
                                                }
                                                Intent intent15 = new Intent(cdk.this, getguansuo.class);
                                                Bundle bundle5 = new Bundle();
                                                bundle5.putCharSequence("wj", item4);
                                                bundle5.putCharSequence("userName", username);
                                                intent15.putExtras(bundle5);
                                                startActivity(intent15);
                                                text3.setText("");
                                        }
                                            else {
                                                Toast.makeText(cdk.this, "兑换成功，恭喜你获得" + item + "*" + num + "、" + item2 + "*" + num2 + "、" + item3 + "*" + num3 + "!", Toast.LENGTH_LONG).show();
                                                int coinnow = num + coin;
                                                String snum = "" + coinnow;
                                                int coinnow2 = num2 + zhaomuling;
                                                String snum2 = "" + coinnow2;
                                                int gsspnow = num3 + gssp;
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updatecoins.loginByGet(username, snum, snum2, spjs, sjf);
                                                }).start();
                                                new Thread(() -> {
                                                    // final String response = LoginService.loginByGet(username,password);
                                                    updategssp.loginByGet(username, "" + gsspnow);
                                                }).start();
                                                finish();
                                                Intent intent14 = new Intent(cdk.this, cdk.class);
                                                intent14.putExtra("userName", username);
                                                startActivity(intent14);
                                                text3.setText("");
                                            }
                                        } else {
                                            Toast.makeText(cdk.this, "该兑换码已使用！", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                    if (zt.equals("不存在")) {
                                        Toast.makeText(cdk.this, "请输入正确的兑换码！", Toast.LENGTH_SHORT).show();
                                    }
                                } else {
                                    Toast.makeText(cdk.this, "服务器无响应，请稍后再试！", Toast.LENGTH_SHORT).show();
                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }

                        });
                    }).start();
                }
                break;
            case R.id.back:
                finish();
                Intent intent14=new Intent(cdk.this, main.class);
                intent14.putExtra("userName",username);
                startActivity(intent14);
                break;
            case R.id.image2:
            case R.id.getcdkm:
                String qq = "2755412738";//填入要联系的qq
                if (checkApk(cdk.this, "com.tencent.mobileqq")) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + qq + "&version=1")));
                } else {
                    Toast.makeText(cdk.this, "本机未安装QQ应用", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            finish();
            Intent intent14=new Intent(cdk.this, main.class);
            intent14.putExtra("userName",username);
            startActivity(intent14);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
    public boolean checkApk(Context context, String packageName) {
        if (packageName == null || "".equals(packageName))
            return false;
        try {
            ApplicationInfo info = context.getPackageManager().getApplicationInfo(packageName,
                    PackageManager.GET_UNINSTALLED_PACKAGES);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
