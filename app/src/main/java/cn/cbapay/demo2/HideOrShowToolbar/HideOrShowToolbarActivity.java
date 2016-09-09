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

public class HideOrShowToolbarActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_hide_or_show_toolbar);
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
        header.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT,
                (int) getResources().getDimension(R.dimen.action_bar_height)));

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
                    Log.e("xuetao", "--mCurrentY---->>" + mCurrentY);
                    if (mCurrentY - mFirstY > mTouchSlop) {
                        direction = 0; // down
                    } else if (mFirstY - mCurrentY > mTouchSlop) {
                        direction = 1; // up
                    }

                    Log.e("xuetao", "--direction---->>" + direction);

                    if (direction == 0) {
                        if (!mShow) {
                            toolbarAnim(0); // show
                            mShow = !mShow;
                        }
                    } else if (direction == 1) {
                        if (mShow) {
                            toolbarAnim(1); // hide
                            mShow = !mShow;
                        }
                    }

                    break;

                case MotionEvent.ACTION_UP:
                    break;

            }

            return false;
        }

    };

    private void toolbarAnim(final int flag) {

        Log.e("xuetao", "--flag---->>" + flag);

        if (mAnimator != null && mAnimator.isRunning()) {
            mAnimator.cancel();
        }

        if (flag == 0) {  // show
            mAnimator = ObjectAnimator.ofFloat(mToolbar, "translationY", mToolbar.getTranslationY(), 0);
        } else {  // hide
            mAnimator = ObjectAnimator.ofFloat(mToolbar, "translationY", mToolbar.getTranslationY(), -mToolbar.getHeight());
        }

//        mAnimator.addListener(new AnimatorListenerAdapter() {
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                super.onAnimationEnd(animation);
//                if (flag == 0) {
//                    mAppBarLayout.setVisibility(View.GONE);
//                } else {
//                    mAppBarLayout.setVisibility(View.VISIBLE);
//                }
//
//            }
//        });

        mAnimator.start();
    }
}
