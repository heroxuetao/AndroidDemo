package cn.cbapay.demo2;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.umeng.analytics.MobclickAgent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import cn.cbapay.demo2.ElemeShoppingView.ElemeShoppingViewActivity;
import cn.cbapay.demo2.EventBus.EventBusActivity;
import cn.cbapay.demo2.GoogleProgressBar.GoogleProgressBarActivity;
import cn.cbapay.demo2.Graph.GraphActivity;
import cn.cbapay.demo2.HideOrShowToolbar.HideOrShowToolbarActivity;
import cn.cbapay.demo2.News.NewsActivity;
import cn.cbapay.demo2.StepView.StepViewActivity;
import cn.cbapay.demo2.TemperatureView.TemperatureViewActivity;
import cn.cbapay.demo2.TransitionHelper.BeginActivity;
import cn.cbapay.demo2.WatchView.WatchViewActivity;
import cn.cbapay.demo2.bezier.BezierActivity;
import cn.cbapay.demo2.camera.CameraActivity;
import cn.cbapay.demo2.circularProgressButton.CircularProgressButtonActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobclickAgent.setDebugMode(false);

        String path = Environment.getExternalStorageDirectory()+ "/cn.qd.tacfinance";
        Log.e("xuetao", "path--->>" + path);

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
//        Intent i = new Intent();
//        i.setClass(this, TestActivity.class);
//        startActivity(i);

        Intent share = new Intent(Intent.ACTION_SEND);
        ComponentName component = new ComponentName("com.tencent.mobileqq","com.tencent.mobileqq.activity.JumpActivity");
//        share.setComponent(component);
        File file = new File(Environment.getExternalStorageDirectory()+ "/cn.qd.zip");
//        System.out.println("file " + file.exists());
        share.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(file));
        share.setType("*/*");
        startActivityForResult(Intent.createChooser(share, "发送"), 100);

//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    Log.e("xuetao", "begin");
//                    String filepath = Environment.getExternalStorageDirectory()+ "/cn.qd.tacfinance";
//                    String zippath = Environment.getExternalStorageDirectory()+ "/heroxuetao.zip";
//                    List<File> mList = new ArrayList<>();
//                    mList.add(new File(filepath));
//                    ZipUtils.zipFiles(mList, new File(zippath));
//                    Log.e("xuetao", "end");
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();

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

    public void startCameraActivity(View v) {
        Intent intent = new Intent(this, CameraActivity.class);
        startActivity(intent);
    }

    public void startTransitionHelperActivity(View v) {
        Intent intent = new Intent(this, BeginActivity.class);
        startActivity(intent);
    }

    public void startStepViewActivity(View v) {
        Intent intent = new Intent(this, StepViewActivity.class);
        startActivity(intent);
    }

    public void startGraphactivity(View v) {
        Intent intent = new Intent(this, GraphActivity.class);
        startActivity(intent);
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

    public static void ZipMultiFile(String filepath ,String zippath) {
        try {
            File file = new File(filepath);// 要被压缩的文件夹
            File zipFile = new File(zippath);
            InputStream input = null;
            ZipOutputStream zipOut = new ZipOutputStream(new FileOutputStream(zipFile));
            if(file.isDirectory()){
                File[] files = file.listFiles();
                for(int i = 0; i < files.length; ++i){
                    input = new FileInputStream(files[i]);
                    zipOut.putNextEntry(new ZipEntry(file.getName() + File.separator + files[i].getName()));
                    int temp = 0;
                    while((temp = input.read()) != -1){
                        zipOut.write(temp);
                    }
                    input.close();
                }
            }
            zipOut.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e("xuetao", "----onActivityResult-------");
        if (resultCode == RESULT_OK) {
            Log.e("xuetao", "----RESULT_OK-------");
            if (requestCode == 100) {
                Log.e("xuetao", "----100-------");
            }
        }
    }
}
