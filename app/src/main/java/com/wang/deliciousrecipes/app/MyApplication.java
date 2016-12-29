package com.wang.deliciousrecipes.app;

import android.app.Application;
import android.content.Context;

/**
 * Created by tarena on 2016/12/21.
 */

public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context=this;
    }

    public static Context getContext(){
      return context;
    }
}
