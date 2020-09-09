package com.xuexiang.xupdatedemo;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class AndroidHelper {

    public AndroidHelper() {

    }

    //获取屏幕方向
    public static int ScreenOrient(Activity activity) {
        int orient = activity.getRequestedOrientation();
        if (orient != ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE && orient != ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            //宽<高为竖屏，反之为横屏
            WindowManager windowManager = activity.getWindowManager();
            Display display = windowManager.getDefaultDisplay();

            int screenWidth = display.getWidth();
            int screenHeight = display.getHeight();

            orient = screenWidth < screenHeight ? ActivityInfo.SCREEN_ORIENTATION_PORTRAIT :
                    ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        }
        return orient;
    }

    public static void AutoBackground(Activity activity, View view, int bg_v, int bg_h) {

        int orient = ScreenOrient(activity);
        if (orient == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {//横屏
            view.setBackgroundResource(bg_h);
        } else {//竖屏
            view.setBackgroundResource(bg_v);
        }
    }
}