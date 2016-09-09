package cn.cbapay.demo2.TemperatureView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.cbapay.demo2.R;

public class TemperatureViewActivity extends AppCompatActivity {

    private TemperatureView mTemperatureView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_view);

        mTemperatureView = (TemperatureView) findViewById(R.id.temperature_view);
        new Thread(new Runnable() {

            @Override
            public void run() {
                for (float i = 0; i <= 40; i++) {
                    mTemperatureView.setCurrentTemp(i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
