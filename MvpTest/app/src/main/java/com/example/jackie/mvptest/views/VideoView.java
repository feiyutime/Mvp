package com.example.jackie.mvptest.views;

import com.example.jackie.mvptest.app.view.MvpView;

/**
 * Created by Jackie on 2018/6/8.
 */

public interface VideoView extends MvpView{

    // 登录成功
    void onLoginSDKSuccess();
    // 登录失败
    void onLoginSDKFailed(String module, int errCode, String errMsg);
}
