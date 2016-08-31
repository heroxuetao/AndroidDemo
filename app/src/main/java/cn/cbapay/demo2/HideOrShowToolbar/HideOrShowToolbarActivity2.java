package cn.cbapay.demo2.HideOrShowToolbar;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cn.cbapay.demo2.R;

public class HideOrShowToolbarActivity2 extends AppCompatActivity {

    private Toolbar mToolbar;
    private AddRemarkAdapter mAdapter;
    private ListView mListView;

    private int mTouchSlop;
    private float mFirstY;
    private float mCurrentY;
    private int direction;
    private boolean mShow;
    private Animator mAnimator;

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
        mListView = (ListView) findViewById(R.id.list_view);

        List<String> mList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            mList.add(i + "");
        }

        mAdapter = new AddRemarkAdapter(this);
        mListView.setAdapter(mAdapter);

        mAdapter.setItems(mList);

        init();

    }

    private void init() {
        View header = new View(this);
//        header.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT,
//                (int) getResources().getDimension(R.dimen.action_bar_height)));

        header.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, 0));
        mListView.addHeaderView(header);
        mTouchSlop = ViewConfiguration.get(this).getScaledTouchSlop();

        mListView.setOnTouchListener(myTouchListener);

        Log.e("xuetao", "--mTouchSlop---->>" + mTouchSlop);
    }

    View.OnTouchListener myTouchListener = new View.OnTouchListener() {

        @Override
        public boolean onTouch(View v, MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    mFirstY = event.getY();
                    Log.e("xuetao", "--mFirstY---->>" + mFirstY);
                    break;

                case MotionEvent.ACTION_MOVE:
                    mCurrentY = event.getY();
                    if (mCurrentY > mFirstY) {//向下
                        if ((mCurrentY - mFirstY) > mTouchSlop) {
                            direction = 1;//下
                            if (!mShow) {
                                animToolBar(direction);//显示toolBar
                                mShow = !mShow;
                            }
                        }
                    } else {
                        if ((mFirstY - mCurrentY) > mTouchSlop) {
                            direction = 0;//上
                            if (mShow) {
                                animToolBar(direction);//隐藏toolBar
                                mShow = !mShow;
                            }
                        }
                    }


                    break;

                case MotionEvent.ACTION_UP:
                    break;

            }

            return false;
        }

    };

    private void animToolBar(int flag) {

        if (mAnimator != null && mAnimator.isRunning()) {
            mAnimator.cancel();
        }
        if (flag == 0) {//向上滑隐藏toolBar
            mAnimator = new ObjectAnimator().ofFloat(mToolbar, "translationY", mToolbar.getTranslationY(), -mToolbar.getHeight());
        } else {//向下滑
            mAnimator = new ObjectAnimator().ofFloat(mToolbar, "translationY", mToolbar.getTranslationY(), 0);
        }

        mAnimator.start();
    }
}
