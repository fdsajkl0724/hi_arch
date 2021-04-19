package com.example.hi_arch.scene1;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * 作者：haoshuai on 2021/4/15 15:58
 * 邮箱：
 * desc：
 */

public class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements BaseView {
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Type superclass = this.getClass().getGenericSuperclass();
        //具备泛型参数的类型
        if (superclass instanceof ParameterizedType){
            Type[] arguments = ((ParameterizedType)superclass).getActualTypeArguments();
            if (arguments != null&& arguments[0] instanceof  BasePresenter) {
                try {
                    mPresenter = (P) arguments[0].getClass().newInstance();
                    mPresenter.attach(this);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean isAlive() {
        return !isDestroyed() && isFinishing();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }
}
