package com.pcauto.video.demo;

import android.app.Application;

import cn.com.pcauto.video.library.PCFollowVideoConfig;
import cn.com.pcauto.video.library.PCFollowVideoSDK;
import cn.com.pcauto.video.library.PCSDKCallback;

public class DemoApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //TODO:
        PCFollowVideoSDK.init(getApplicationContext(), new PCFollowVideoConfig("你的appKey", "你的sdkId"), new PCSDKCallback() {
            @Override
            public void onRegisterError(String code, String message) {
                if ("400".equals(code)) {
                    //TODO: key失效，请联系客服
                } else {

                }
            }

            @Override
            public void onRegisterSuccess() {

            }
        });
    }
}
