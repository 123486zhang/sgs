package com.sgs10th.simulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.xuexiang.xupdatedemo.R;
import com.xuexiang.xupdatedemo.jiangxing;

public class getguansuo extends AppCompatActivity {
    private ImageView image1,image2;
    private TextView text1;
    private String username,wj;
    private RelativeLayout layout;
    private MediaPlayer me;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.getguansuo);
        Intent intent = getIntent();
        Bundle bundle=intent.getExtras();
        username = bundle.getString("userName");
        wj=bundle.getString("wj");
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        text1=findViewById(R.id.text1);
        layout=findViewById(R.id.layout);
        if(wj.equals("关索")){
            image1.setImageResource(R.mipmap.guansuobg);
            image2.setImageResource(R.mipmap.guansuobiankuang);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过将星招募获得：");
            me = MediaPlayer.create(getguansuo.this, R.raw.guansuo);
            me.start();
        }
        if(wj.equals("赵襄")){
            image1.setImageResource(R.mipmap.zhaoxiangbg);
            image2.setImageResource(R.mipmap.zhaoxiangbk);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过将星招募获得：");
            me = MediaPlayer.create(getguansuo.this, R.raw.zhaoxiang);
            me.start();
        }
        if(wj.equals("鲍三娘")){
            image1.setImageResource(R.mipmap.baosanniangbg);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过将星招募获得：鲍三娘");
            me = MediaPlayer.create(getguansuo.this, R.raw.baosanniang);
            me.start();
        }
        if(wj.equals("徐荣")){
            image1.setImageResource(R.mipmap.xurongbg);
            image2.setImageResource(R.mipmap.xurongbk);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：");
            me = MediaPlayer.create(getguansuo.this, R.raw.xurong);
            me.start();
        }

        if(wj.equals("曹婴")){
            image1.setImageResource(R.mipmap.caoyingbg);
            image2.setImageResource(R.mipmap.caoyingbk);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：");
            me = MediaPlayer.create(getguansuo.this, R.raw.caoying);
            me.start();
        }

        if(wj.equals("曹纯")){
            image1.setImageResource(R.mipmap.caochunbg);
            image2.setImageResource(R.mipmap.caochunbk);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：");
            me = MediaPlayer.create(getguansuo.this, R.raw.caochun);
            me.start();
        }

        if(wj.equals("张琪瑛")){
            image1.setImageResource(R.mipmap.zhangqiyingbg);
            image2.setImageResource(R.mipmap.zhangqiyingbk);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：");
            me = MediaPlayer.create(getguansuo.this, R.raw.zhangqiying);
            me.start();
        }
        if(wj.equals("王朗")){
            image1.setImageResource(R.mipmap.b8);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：王朗");
            me = MediaPlayer.create(getguansuo.this, R.raw.wanglang);
            me.start();
        }
        if(wj.equals("司马徽")){
            image1.setImageResource(R.mipmap.simahuibg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：司马徽");
            me = MediaPlayer.create(getguansuo.this, R.raw.simahui);
            me.start();
        }

        if(wj.equals("程昱")){
            image1.setImageResource(R.mipmap.chengyubg);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：程昱");
            me = MediaPlayer.create(getguansuo.this, R.raw.chengyu);
            me.start();
        }
        if(wj.equals("兀突骨")){
            image1.setImageResource(R.mipmap.wutugubg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：兀突骨");
            me = MediaPlayer.create(getguansuo.this, R.raw.wutugu);
            me.start();
        }
        if(wj.equals("孙皓")){
            image1.setImageResource(R.mipmap.sunhaobg);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过将星招募获得：孙皓");
            me = MediaPlayer.create(getguansuo.this, R.raw.sunhao);
            me.start();
        }
        if(wj.equals("陈琳")){
            image1.setImageResource(R.mipmap.chenlinbg);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：陈琳");
            me = MediaPlayer.create(getguansuo.this, R.raw.chenlin);
            me.start();
        }
        if(wj.equals("士燮")){
            image1.setImageResource(R.mipmap.shiyubg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：士燮");
            me = MediaPlayer.create(getguansuo.this, R.raw.shiyu);
            me.start();
        }
        if(wj.equals("杨修")){
            image1.setImageResource(R.mipmap.yangxiubg);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：杨修");
            me = MediaPlayer.create(getguansuo.this, R.raw.yangxiu);
            me.start();
        }
        if(wj.equals("文鸯")){
            image1.setImageResource(R.mipmap.wenyangbg);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：文鸯");
            me = MediaPlayer.create(getguansuo.this, R.raw.wenyang);
            me.start();
        }
        if(wj.equals("蒋干")){
            image1.setImageResource(R.mipmap.jiangganbg);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：蒋干");
            me = MediaPlayer.create(getguansuo.this, R.raw.jianggan);
            me.start();
        }
        if(wj.equals("葛玄")){
            image1.setImageResource(R.mipmap.gexuanbg);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过将星招募获得：葛玄");
            me = MediaPlayer.create(getguansuo.this, R.raw.gexuan);
            me.start();
        }
        if(wj.equals("沙摩柯")){
            image1.setImageResource(R.mipmap.shamokebg);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过将星招募获得：沙摩柯");
            me = MediaPlayer.create(getguansuo.this, R.raw.shamoke);
            me.start();
        }
        if(wj.equals("忙牙长")){
            image1.setImageResource(R.mipmap.mangyazhangbg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：忙牙长");
            me = MediaPlayer.create(getguansuo.this, R.raw.mangyazhang);
            me.start();
        }
        if(wj.equals("许贡")){
            image1.setImageResource(R.mipmap.xugongbg);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过将星招募获得：许贡");
            me = MediaPlayer.create(getguansuo.this, R.raw.xugong);
            me.start();
        }
        if(wj.equals("张菖蒲")){
            image1.setImageResource(R.mipmap.zhangchangpubg);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过将星招募获得：张菖蒲");
            me = MediaPlayer.create(getguansuo.this, R.raw.zhangchangpu);
            me.start();
        }
        if(wj.equals("李傕")){
            image1.setImageResource(R.mipmap.liquebg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：李傕");
            me = MediaPlayer.create(getguansuo.this, R.raw.lique);
            me.start();
        }
        if(wj.equals("郭汜")){
            image1.setImageResource(R.mipmap.guosibg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：郭汜");
            me = MediaPlayer.create(getguansuo.this, R.raw.guosi);
            me.start();
        }
        if(wj.equals("张济")){
            image1.setImageResource(R.mipmap.zhangjibg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：张济");
            me = MediaPlayer.create(getguansuo.this, R.raw.zhangji);
            me.start();
        }
        if(wj.equals("樊稠")){
            image1.setImageResource(R.mipmap.fanchoubg);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过将星招募获得：樊稠");
            me = MediaPlayer.create(getguansuo.this, R.raw.fanchou);
            me.start();
        }
        if(wj.equals("王允")){
            image1.setImageResource(R.mipmap.b27);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：王允");
            me = MediaPlayer.create(getguansuo.this, R.raw.w27);
            me.start();
        }
        if(wj.equals("管辂")){
            image1.setImageResource(R.mipmap.b28);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：管辂");
            me = MediaPlayer.create(getguansuo.this, R.raw.w28);
            me.start();
        }
        if(wj.equals("蒲元")){
            image1.setImageResource(R.mipmap.b29);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：蒲元");
            me = MediaPlayer.create(getguansuo.this, R.raw.w29);
            me.start();
        }
        if(wj.equals("王双")){
            image1.setImageResource(R.mipmap.b30);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：王双");
            me = MediaPlayer.create(getguansuo.this, R.raw.w30);
            me.start();
        }
        if(wj.equals("皇甫嵩")){
            image1.setImageResource(R.mipmap.b31);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：皇甫嵩");
            me = MediaPlayer.create(getguansuo.this, R.raw.w31);
            me.start();
        }
        if(wj.equals("花鬟")){
            image1.setImageResource(R.mipmap.b32);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：花鬟");
            me = MediaPlayer.create(getguansuo.this, R.raw.w32);
            me.start();
        }
        if(wj.equals("辛宪英")){
            image1.setImageResource(R.mipmap.b33);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：辛宪英");
            me = MediaPlayer.create(getguansuo.this, R.raw.w33);
            me.start();
        }
        if(wj.equals("孙鲁育")){
            image1.setImageResource(R.mipmap.b34);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：孙鲁育");
            me = MediaPlayer.create(getguansuo.this, R.raw.w34);
            me.start();
        }
        if(wj.equals("辛毗")){
            image1.setImageResource(R.mipmap.b35);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：辛毗");
            me = MediaPlayer.create(getguansuo.this, R.raw.w35);
            me.start();
        }
        if(wj.equals("李肃")){
            image1.setImageResource(R.mipmap.b36);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：李肃");
            me = MediaPlayer.create(getguansuo.this, R.raw.w36);
            me.start();
        }
        if(wj.equals("张温")){
            image1.setImageResource(R.mipmap.b37);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：张温");
            me = MediaPlayer.create(getguansuo.this, R.raw.w37);
            me.start();
        }
        if(wj.equals("伊籍")){
            image1.setImageResource(R.mipmap.b38);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：伊籍");
            me = MediaPlayer.create(getguansuo.this, R.raw.w38);
            me.start();
        }
        if(wj.equals("张恭")){
            image1.setImageResource(R.mipmap.b39);
            layout.setBackgroundResource(R.mipmap.wei);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：张恭");
            me = MediaPlayer.create(getguansuo.this, R.raw.w39);
            me.start();
        }
        if(wj.equals("吕凯")){
            image1.setImageResource(R.mipmap.b40);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：吕凯");
            me = MediaPlayer.create(getguansuo.this, R.raw.w40);
            me.start();
        }
        if(wj.equals("卫温诸葛直")){
            image1.setImageResource(R.mipmap.b41);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：卫温诸葛直");
            me = MediaPlayer.create(getguansuo.this, R.raw.w41);
            me.start();
        }
        if(wj.equals("卑弥呼")){
            image1.setImageResource(R.mipmap.b42);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：卑弥呼");
            me = MediaPlayer.create(getguansuo.this, R.raw.w42);
            me.start();
        }
        if(wj.equals("灵雎")){
            image1.setImageResource(R.mipmap.b43);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：灵雎");
            me = MediaPlayer.create(getguansuo.this, R.raw.w43);
            me.start();
        }
        if(wj.equals("诸葛果")){
            image1.setImageResource(R.mipmap.b44);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：诸葛果");
            me = MediaPlayer.create(getguansuo.this, R.raw.w44);
            me.start();
        }
        if(wj.equals("诸葛恪")){
            image1.setImageResource(R.mipmap.b45);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：诸葛恪");
            me = MediaPlayer.create(getguansuo.this, R.raw.w45);
            me.start();
        }
        if(wj.equals("群赵云")){
            image1.setImageResource(R.mipmap.b46);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：群赵云");
            me = MediaPlayer.create(getguansuo.this, R.raw.w46);
            me.start();
        }
        if(wj.equals("李傕郭汜")){
            image1.setImageResource(R.mipmap.b47);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：李傕郭汜");
            me = MediaPlayer.create(getguansuo.this, R.raw.w47);
            me.start();
        }
        if(wj.equals("夏侯霸")){
            image1.setImageResource(R.mipmap.b48);
            layout.setBackgroundResource(R.mipmap.shubg);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：夏侯霸");
            me = MediaPlayer.create(getguansuo.this, R.raw.w48);
            me.start();
        }
        if(wj.equals("群马超")){
            image1.setImageResource(R.mipmap.b49);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：群马超");
            me = MediaPlayer.create(getguansuo.this, R.raw.w49);
            me.start();
        }
        if(wj.equals("张宝")){
            image1.setImageResource(R.mipmap.b50);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：张宝");
            me = MediaPlayer.create(getguansuo.this, R.raw.w50);
            me.start();
        }
        if(wj.equals("大乔小乔")){
            image1.setImageResource(R.mipmap.b51);
            layout.setBackgroundResource(R.mipmap.wu);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：大乔小乔");
            me = MediaPlayer.create(getguansuo.this, R.raw.w51);
            me.start();
        }
        if(wj.equals("潘凤")){
            image1.setImageResource(R.mipmap.b52);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：潘凤");
            me = MediaPlayer.create(getguansuo.this, R.raw.w52);
            me.start();
        }
        if(wj.equals("邢道荣")){
            image1.setImageResource(R.mipmap.b53);
            layout.setBackgroundResource(R.mipmap.qun);
            text1.setText("恭喜"+username+"通过国士碎片兑换获得：邢道荣");
            me = MediaPlayer.create(getguansuo.this, R.raw.w53);
            me.start();
        }


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                me.release();
                finish();
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {

        if (keyCode == KeyEvent.KEYCODE_BACK ) {
            me.release();
            finish();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}
