package com.example.hi_arch.scene1;

import com.example.hi_arch.scene2.User;

/**
 * 作者：haoshuai on 2021/4/15 15:49
 * 邮箱：
 * desc：
 */

public class HomePresenter extends HomeContract.Presenter{
    @Override
    void getUserInfo() {
       /* HiRestful.create(Home.class).getUserInfo(new HiCallback<User>(){
           void onSuccess(User user){
               if (view!=null&& view.isAlive()){
                   view.onGetUserInfoResult(user,null);
               }
           }
        });*/
    }
}
