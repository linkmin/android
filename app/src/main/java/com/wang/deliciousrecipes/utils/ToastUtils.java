package com.wang.deliciousrecipes.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by tarena on 2016/12/21.
 */

public class ToastUtils {

    public static void showToast(Context context,String string){
        Toast.makeText(context,string,Toast.LENGTH_SHORT).show();
    }
}
