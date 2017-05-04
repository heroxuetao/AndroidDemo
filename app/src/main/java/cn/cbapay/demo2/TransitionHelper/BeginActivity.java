package cn.cbapay.demo2.TransitionHelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.cbapay.demo2.R;
import immortalz.me.library.TransitionsHeleper;

public class BeginActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        image = (ImageView) findViewById(R.id.image);

        Glide.with(this)
                .load("http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg")
                .centerCrop()
                .into(image);
    }

    public void start(View v) {
        Intent intent = new Intent();
        intent.putExtra("data", "This is immortalZ");
//        TransitionsHeleper.startActivity(BeginActivity.this, EndActivity.class, a);

        TransitionsHeleper.startAcitivty(this, EndActivity.class, image, "http://img02.tooopen.com/images/20150928/tooopen_sy_143912755726.jpg");

    }
}
