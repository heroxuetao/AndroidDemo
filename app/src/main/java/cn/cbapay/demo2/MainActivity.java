package cn.cbapay.demo2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.umeng.analytics.MobclickAgent;

import cn.cbapay.demo2.ElemeShoppingView.ElemeShoppingViewActivity;
import cn.cbapay.demo2.EventBus.EventBusActivity;
import cn.cbapay.demo2.GoogleProgressBar.GoogleProgressBarActivity;
import cn.cbapay.demo2.HideOrShowToolbar.HideOrShowToolbarActivity;
import cn.cbapay.demo2.News.NewsActivity;
import cn.cbapay.demo2.TemperatureView.TemperatureViewActivity;
import cn.cbapay.demo2.WatchView.WatchViewActivity;
import cn.cbapay.demo2.bezier.BezierActivity;
import cn.cbapay.demo2.circularProgressButton.CircularProgressButtonActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobclickAgent.setDebugMode(false);
    }

    public void startNewsActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, NewsActivity.class);
        startActivity(i);
    }

    public void startCircularProgressButtonActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, CircularProgressButtonActivity.class);
        startActivity(i);
    }

    public void startGoogleProgressBarActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, GoogleProgressBarActivity.class);
        startActivity(i);
    }

    public void startEventBusActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, EventBusActivity.class);
        startActivity(i);
    }

    public void startTestActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, TestActivity.class);
        startActivity(i);
    }

    public void startElemeShoppingViewActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, ElemeShoppingViewActivity.class);
        startActivity(i);
    }

    public void startCustomViewActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, CustomViewActivity.class);
        startActivity(i);
    }

    public void startHideOrShowToolbarViewActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, HideOrShowToolbarActivity.class);
//        i.setClass(this, HideOrShowToolbarActivity2.class);
        startActivity(i);
    }

    public void startWatchViewActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, WatchViewActivity.class);
        startActivity(i);
    }

    public void startTemperatureViewActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, TemperatureViewActivity.class);
        startActivity(i);
    }

    public void startBezierActivity(View v) {
        Intent i = new Intent();
        i.setClass(this, BezierActivity.class);
        startActivity(i);
    }

    @Override
    protected void onResume() {
        super.onResume();
        MobclickAgent.onResume(this);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        MobclickAgent.onPause(this);
    }


}
