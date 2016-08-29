package cn.cbapay.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {

    private EditText edit_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        edit_text = (EditText) findViewById(R.id.edit_text);
        Tools.formatPriceEditText(edit_text);
    }
}
