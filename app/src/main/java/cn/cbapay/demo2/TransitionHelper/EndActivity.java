package cn.cbapay.demo2.TransitionHelper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import cn.cbapay.demo2.R;
import immortalz.me.library.TransitionsHeleper;
import immortalz.me.library.bean.InfoBean;
import immortalz.me.library.method.ColorShowMethod;

public class EndActivity extends AppCompatActivity {

    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        image = (ImageView) findViewById(R.id.image);

        TransitionsHeleper.getInstance()
                .setShowMethod(new ColorShowMethod(R.color.TextColorGray,
                        R.color.TextColorRed) {
                    @Override
                    public void loadCopyView(InfoBean bean, ImageView copyView) {
                        Glide.with(EndActivity.this)
                                .load(bean.getImgUrl())
                                .centerCrop()
                                .into(copyView);
                    }

                    @Override
                    public void loadTargetView(InfoBean bean, ImageView targetView) {
                        Glide.with(EndActivity.this)
                                .load(bean.getImgUrl())
                                .centerCrop()
                                .into(targetView);
                    }

                }).show(this, image);

    }
}
