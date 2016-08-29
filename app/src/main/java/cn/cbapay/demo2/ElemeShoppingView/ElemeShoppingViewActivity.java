package cn.cbapay.demo2.ElemeShoppingView;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import cn.cbapay.demo2.R;

public class ElemeShoppingViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eleme_shopping_view);
        ShoppingView mShoppingView = (ShoppingView) findViewById(R.id.shopping_view);
//        mShoppingView.setTextNum();
    }
}
