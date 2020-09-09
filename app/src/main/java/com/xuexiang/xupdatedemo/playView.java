package com.xuexiang.xupdatedemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class playView extends View {
    public float bitmapX;
    public  float bitmapY;
    public playView(Context context) {
        super(context);
        bitmapX=450;
        bitmapY=610;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint =new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(this.getResources(),R.mipmap.play);
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
