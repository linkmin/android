package com.wang.deliciousrecipes.utils;

/**
 * Created by tarena on 2016/12/21.
 */

public class HttpUtils {
    private static MySingleton mInstance;
    private RequestQueue mRequestQueue;
    private static Context mCtx;

    private MySingleton(Context context){
        mCtx=context;
        mRequestQueue=getRequestQueue();
    }

    public static synchronized MySingleton getInstance(Context context){
        if(mInstance == null){
            mInstance=new MySingleton(context);
        }
        return mInstance;
    }

    public RequestQueue getRequestQueue(){
        if(mRequestQueue==null){
            mRequestQueue=Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return mRequestQueue;

    }

    public <T> void addToRequestQueue(Request<T> req) {

        getRequestQueue().add(req);

    }
}
