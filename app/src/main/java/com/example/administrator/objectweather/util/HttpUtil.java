package com.example.administrator.objectweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by obj on 2017/7/2.
 */

public class HttpUtil {

    public static void sendOKHttpRequest(String adress, okhttp3.Callback callback){
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url(adress).build();
        okHttpClient.newCall(request).enqueue(callback);
    }

}
