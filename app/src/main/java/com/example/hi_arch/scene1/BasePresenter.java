package com.example.hi_arch.scene1;

/**
 * 作者：haoshuai on 2021/4/15 15:43
 * 邮箱：
 * desc：
 */

public class BasePresenter<IView extends BaseView>{
    protected IView view;

    public void attach(IView view){
        this.view = view;
    }

    public void detach(){
        view =null;
    }
}
