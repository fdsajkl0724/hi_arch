package com.example.hi_arch.scene1;

import com.example.hi_arch.scene2.User;

/**
 * 作者：haoshuai on 2021/4/15 15:45
 * 邮箱：
 * desc：
 */

public interface HomeContract {

    interface View extends BaseView{
        void onGetUserInfoResult(User user, String errorMsg);

    }

    abstract class Presenter extends BasePresenter<View>{
        abstract void getUserInfo();
    }
}
