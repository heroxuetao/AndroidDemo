package cn.cbapay.demo2.GoogleProgressBar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

import com.jpardogo.android.googleprogressbar.library.ChromeFloatingCirclesDrawable;
import com.jpardogo.android.googleprogressbar.library.FoldingCirclesDrawable;
import com.jpardogo.android.googleprogressbar.library.GoogleMusicDicesDrawable;
import com.jpardogo.android.googleprogressbar.library.NexusRotationCrossDrawable;

import cn.cbapay.demo2.R;

public class GoogleProgressBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google_progress_bar);

        ProgressBar mProgressBar1 = (ProgressBar) findViewById(R.id.google_progress1);
        mProgressBar1.setIndeterminateDrawable(new FoldingCirclesDrawable.Builder(this).build());

        ProgressBar mProgressBar2 = (ProgressBar) findViewById(R.id.google_progress2);
        mProgressBar2.setIndeterminateDrawable(new GoogleMusicDicesDrawable.Builder().build());

        ProgressBar mProgressBar3 = (ProgressBar) findViewById(R.id.google_progress3);
        mProgressBar3.setIndeterminateDrawable(new NexusRotationCrossDrawable.Builder(this).build());

        ProgressBar mProgressBar4 = (ProgressBar) findViewById(R.id.google_progress4);
        mProgressBar4.setIndeterminateDrawable(new ChromeFloatingCirclesDrawable.Builder(this).build());
    }
}
