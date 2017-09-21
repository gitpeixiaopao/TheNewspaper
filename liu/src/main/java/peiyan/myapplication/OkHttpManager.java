package peiyan.myapplication;


import android.os.Handler;


import org.json.JSONObject;

import java.io.IOException;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static okhttp3.internal.Internal.instance;


/**
 * functinn:okhttp中级封装，实现两个功能，从服务端下载数据；从客户端提交数据
 * 封装优秀的OKHttp：okhttpUtils,OKGO(更深入的封装，研究OKGO)
 * 1.节约内存，使所有的网络请求都用一个OKhttpClick和Handler对象
 * 2.解决okhttp，网络请求成功，代码在子线程的问题，把请求成功后的逻辑代码，放到主线程中执行
 * 3.简化代码
 * 这次封装用到哪些知识点？
 * 1.单例模式（内存）
 * 2.handler
 * 3.接口
 * (解决主线程的问题)
 * 4.okhttp
 * 我们在使用单例模式时，构造方法一般权限为私有，这样保证了对象的唯一性（EventBus，如果看源码的话，他的构造方法时public所以一方面可以通过单例方法拿到对象，一方面可以通过new的方式拿到）
 */


public class OkHttpManager {

    private OkHttpClient mClient;

    private static Handler mHandler;

    private volatile static OkHttpManager sManager=null;  //防止多个线程同时访问，volatile

    //使用构造方法完成初始化
    private OkHttpManager() {
        mClient = new OkHttpClient();
        mHandler = new Handler();


    }

    //使用单例模式通过获取的方式拿到对象
    public static OkHttpManager getInstance() {

        if (sManager == null) {
            synchronized (OkHttpManager.class) {

                if (instance == null) {

                    sManager = new OkHttpManager();

                }

            }

        }
        return sManager;
    }

    //定义接口
    interface Func1 {
        void onResponse(String result);


    }

    interface Func2 {
        void onResponse(byte[] result);

    }

    interface Func3 {
        void onResponse(JSONObject jsonObject);

    }

    //使用handler，接口，保证处理数据的逻辑在主线程

    //处理请求网络成功的方法，返回的结果是Json字符串
    private static void OnSuccessJsonStringMethod(final String jsonValue, final Func1 callBack) {

        //这里我用的是mHandler.post方法把数据放到主线程中，你们以后可以用EventBus或RxJava的线程调度器
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (callBack != null) {

                    try {
                        callBack.onResponse(jsonValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }

            }
        });


    }

    private static void OnSuccessJsonStringMethodImage(final byte[] jsonValue, final Func2 callBack) {

        //这里我用的是mHandler.post方法把数据放到主线程中，你们以后可以用EventBus或RxJava的线程调度器
        mHandler.post(new Runnable() {
            @Override
            public void run() {
                if (callBack != null) {

                    try {
                        callBack.onResponse(jsonValue);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }


                }

            }
        });


    }

    //加载网络图片
    public void downImage(String url, final Func2 callBack){

        //监简化代码
        Request request = new Request.Builder().url(url).build();
        mClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                //判断这个response是否有对象
                if (response != null && response.isSuccessful()) {
                    OnSuccessJsonStringMethodImage(response.body().bytes(), callBack);
                }
            }
        });


    }

    //暴露提供给外界调用的方法

    /**
     * 请求指定的URL返回的结果是Json字符串
     */
    public void asyncJsonStringByURL(String url, final Func1 callBack) {

        //监简化代码
        Request request = new Request.Builder().url(url).build();
        mClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                //判断这个response是否有对象
                if (response != null && response.isSuccessful()) {
                    OnSuccessJsonStringMethod(response.body().string(), callBack);
                }
            }
        });


    }

    /**
     * 提交表单
     */
    public void sendComplexForm(String url, Map<String, String> params, final Func1 callBack) {

        //表单对象
        FormBody.Builder form_builder = new FormBody.Builder();
        //键值非空判断
        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                form_builder.add(entry.getKey(), entry.getValue());

            }

        }
        FormBody request_body = form_builder.build();
        final Request request = new Request.Builder().url(url).post(request_body).build();
        mClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {

                if (response != null && response.isSuccessful()) {
                    OnSuccessJsonStringMethod(response.body().string(), callBack);
                }
            }
        });


    }
}

