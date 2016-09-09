package cn.cbapay.demo2.HideOrShowToolbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.zhy.base.adapter.ViewHolder;
import com.zhy.base.adapter.recyclerview.CommonAdapter;
import com.zhy.base.adapter.recyclerview.DividerItemDecoration;

import java.util.ArrayList;
import java.util.List;

import cn.cbapay.demo2.R;

public class HideOrShowToolbarActivity2 extends AppCompatActivity {

    private Toolbar mToolbar;
    private CommonAdapter mCommonAdapter;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hide_or_show_toolbar2);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("动态显示和隐藏");
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
            }
        });
        mRecyclerView = (RecyclerView) findViewById(R.id.id_recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL_LIST));

        List<String> mList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mList.add(i + "");
        }
//
//        mAdapter = new AddRemarkAdapter(this);
//        mListView.setAdapter(mAdapter);
//
//        mAdapter.setItems(mList);
        mCommonAdapter = new CommonAdapter<String>(this, R.layout.item_string, mList) {

            @Override
            public void convert(ViewHolder holder, String str) {

                holder.setText(R.id.tv, String.valueOf(str));

            }

        };
        mRecyclerView.setAdapter(mCommonAdapter);
    }

}
