package com.xuexiang.xupdatedemo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

public class ImageViewCriCle extends AppCompatImageView {

    private Paint paint;
    private Matrix matrix;
    private float height;
    private float width;
    private float adius;

    public ImageViewCriCle(Context context) {
        this(context,null);
    }

    public ImageViewCriCle(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public ImageViewCriCle(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        paint = new Paint();//初始化画笔
        paint.setAntiAlias(true);//扛锯齿
        matrix = new Matrix();//矩形

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = getMeasuredWidth();
        height = getMeasuredHeight();
        adius = Math.min(width, height) / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            super.onDraw(canvas);
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            paint.setShader(initBitmapShader((BitmapDrawable) drawable));
            canvas.drawCircle(width / 2, height / 2, adius, paint);
            return;
        }
        super.onDraw(canvas);
    }

    private BitmapShader initBitmapShader(BitmapDrawable drawable) {
        Bitmap bitmap = drawable.getBitmap();
        BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        float scale = Math.max(width / bitmap.getWidth(), height / bitmap.getHeight());
        matrix.setScale(scale, scale);
        bitmapShader.setLocalMatrix(matrix);
        return bitmapShader;
    }

}
