package cn.cbapay.demo2.bezier;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.cbapay.demo2.R;

public class BezierActivity extends AppCompatActivity {

    private BezierView mBezierView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bezier);
        mBezierView = (BezierView) findViewById(R.id.bezier_view);
    }

    public void startAnimation(View v) {
        mBezierView.startAnimation();
    }
}
