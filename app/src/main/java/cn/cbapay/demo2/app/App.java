package cn.cbapay.demo2.app;

import android.app.Application;

import com.yalantis.cameramodule.ManagerInitializer;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
//        ManagerInitializer.i.init(getApplicationContext());
    }
}