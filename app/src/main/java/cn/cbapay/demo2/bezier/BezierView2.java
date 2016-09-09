package cn.cbapay.demo2.bezier;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/**
 * Created by xuetao on 16/9/9.
 */
public class BezierView2 extends View {

    private final static String TAG = "BezierView";

    private Paint mPaint;
    private Path mPath;

    private float mRadius = 100;
    private float mBlackMagic = 0.551915024494f;
    private float mCircleX = 200;
    private float mCircleY = 800;

    private float mControlPointTrans = 400;

    private float mInterpolatedTime;

    public BezierView2(Context context) {
        this(context, null, 0);
    }

    public BezierView2(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BezierView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint();
        mPaint.setColor(0xFFfe626d);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(8);
        mPaint.setAntiAlias(true);
        mPath = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPath.reset();
        canvas.translate(mCircleX, mCircleY);

        mPath.moveTo(mInterpolatedTime * mControlPointTrans, mRadius);

//        if (mInterpolatedTime >= 0 && mInterpolatedTime <= 0.2) {
//            drawModel1();
//        } else if (mInterpolatedTime > 0.2 && mInterpolatedTime <= 0.5) {
//            drawModel2();
//        } else if (mInterpolatedTime > 0.5 && mInterpolatedTime <= 0.8) {
//            drawModel3();
//        } else if (mInterpolatedTime > 0.8 && mInterpolatedTime <= 0.9) {
//            drawModel4();
//        } else if (mInterpolatedTime > 0.9 && mInterpolatedTime <= 1) {
//            drawModel5();
//        }

        if (mInterpolatedTime >= 0 && mInterpolatedTime <= 0.25) {
            drawModel1();
        } else if (mInterpolatedTime > 0.25 && mInterpolatedTime <= 0.5) {
            drawModel2();
        } else if (mInterpolatedTime > 0.5 && mInterpolatedTime <= 0.75) {
            drawModel3();
        } else if (mInterpolatedTime > 0.75 && mInterpolatedTime <= 1.0) {
            drawModel4();
        }

        canvas.drawPath(mPath, mPaint);

    }

    private void drawCircle(Canvas canvas) {
        mPath.moveTo(0, mRadius);

        // 连接路径到点
        mPath.cubicTo(mRadius * mBlackMagic, mRadius,
                mRadius, mRadius * mBlackMagic,
                mRadius, 0);

        mPath.cubicTo(mRadius, -mRadius * mBlackMagic,
                mRadius * mBlackMagic, -mRadius,
                0, -mRadius);

        mPath.cubicTo(-mRadius * mBlackMagic, -mRadius,
                -mRadius, -mRadius * mBlackMagic,
                -mRadius, 0);

        mPath.cubicTo(-mRadius, mRadius * mBlackMagic,
                -mRadius * mBlackMagic, mRadius,
                0, mRadius);

    }

//    private void drawCircle(Canvas canvas) {
//        mPath.moveTo(mCircleX, mCircleY + mRadius);
//
//        // 连接路径到点
//        mPath.cubicTo(mCircleX + mRadius * mBlackMagic, mCircleY + mRadius,
//                mCircleX + mRadius, mCircleY + mRadius * mBlackMagic,
//                mCircleX + mRadius, mCircleY);
//
//        mPath.cubicTo(mCircleX + mRadius, mCircleY - mRadius * mBlackMagic,
//                mCircleX + mRadius * mBlackMagic, mCircleY - mRadius,
//                mCircleX, mCircleY - mRadius);
//
//        mPath.cubicTo(mCircleX - mRadius * mBlackMagic, mCircleY - mRadius,
//                mCircleX - mRadius, mCircleY - mRadius * mBlackMagic,
//                mCircleX - mRadius, mCircleY);
//
//        mPath.cubicTo(mCircleX - mRadius, mCircleY + mRadius * mBlackMagic,
//                mCircleX - mRadius * mBlackMagic, mCircleY + mRadius,
//                mCircleX, mCircleY + mRadius);
//
//        canvas.drawPath(mPath, mPaint);
//
//    }

    private void drawStatus2(Canvas canvas) {
//        mPath.moveTo(mCircleX, mCircleY + mRadius);
//
//        // 连接路径到点
//        mPath.cubicTo(mCircleX + mRadius * mBlackMagic + mControlPointTrans, mCircleY + mRadius,
//                mCircleX + mRadius + mControlPointTrans, mCircleY + mRadius * mBlackMagic,
//                mCircleX + mRadius + mControlPointTrans, mCircleY);
//
//        mPath.cubicTo(mCircleX + mRadius + mControlPointTrans, mCircleY - mRadius * mBlackMagic,
//                mCircleX + mRadius * mBlackMagic + mControlPointTrans, mCircleY - mRadius,
//                mCircleX, mCircleY - mRadius);
//
//        mPath.cubicTo(mCircleX - mRadius * mBlackMagic, mCircleY - mRadius,
//                mCircleX - mRadius, mCircleY - mRadius * mBlackMagic,
//                mCircleX - mRadius, mCircleY);
//
//        mPath.cubicTo(mCircleX - mRadius, mCircleY + mRadius * mBlackMagic,
//                mCircleX - mRadius * mBlackMagic, mCircleY + mRadius,
//                mCircleX, mCircleY + mRadius);
//
//        canvas.drawPath(mPath, mPaint);

    }

    private void drawModel1() {

        mPath.moveTo(0, mRadius);

        mPath.cubicTo(mRadius * mBlackMagic + mInterpolatedTime * mControlPointTrans, mRadius,
                mRadius + mInterpolatedTime * mControlPointTrans, mRadius * mBlackMagic,
                mRadius + mInterpolatedTime * mControlPointTrans, 0);

        mPath.cubicTo(mRadius + mInterpolatedTime * mControlPointTrans, -mRadius * mBlackMagic,
                mRadius * mBlackMagic + mInterpolatedTime * mControlPointTrans, -mRadius,
                0, -mRadius);

        mPath.cubicTo(-mRadius * mBlackMagic, -mRadius,
                -mRadius, -mRadius * mBlackMagic,
                -mRadius, 0);

        mPath.cubicTo(-mRadius, mRadius * mBlackMagic,
                -mRadius * mBlackMagic, mRadius,
                0, mRadius);

    }

    private void drawModel2() {
        mPath.moveTo(mInterpolatedTime * mControlPointTrans, mRadius);

        mPath.cubicTo(mRadius * mBlackMagic + mInterpolatedTime * mControlPointTrans, mRadius,
                mRadius + mInterpolatedTime * mControlPointTrans, mRadius * mBlackMagic,
                mRadius + mInterpolatedTime * mControlPointTrans, 0);

        mPath.cubicTo(mRadius + mInterpolatedTime * mControlPointTrans, -mRadius * mBlackMagic,
                mRadius * mBlackMagic + mInterpolatedTime * mControlPointTrans, -mRadius,
                mInterpolatedTime * mControlPointTrans, -mRadius);

        mPath.cubicTo(-mRadius * mBlackMagic + mInterpolatedTime * mControlPointTrans, -mRadius,
                -mRadius + mInterpolatedTime * mControlPointTrans, -mRadius * mBlackMagic,
                -mRadius + mInterpolatedTime * mControlPointTrans, 0);

        mPath.cubicTo(-mRadius + mInterpolatedTime * mControlPointTrans, mRadius * mBlackMagic,
                -mRadius * mBlackMagic + mInterpolatedTime * mControlPointTrans, mRadius,
                mInterpolatedTime * mControlPointTrans, mRadius);
    }

    private void drawModel3() {

    }

    private void drawModel4() {
        mPath.moveTo(mControlPointTrans, mRadius);

        // 连接路径到点
        mPath.cubicTo(mRadius * mBlackMagic, mRadius,
                mRadius, mRadius * mBlackMagic,
                mRadius, 0);

        mPath.cubicTo(mRadius, -mRadius * mBlackMagic,
                mRadius * mBlackMagic, -mRadius,
                0, -mRadius);

        mPath.cubicTo(-mRadius * mBlackMagic, -mRadius,
                -mRadius, -mRadius * mBlackMagic,
                -mRadius, 0);

        mPath.cubicTo(-mRadius, mRadius * mBlackMagic,
                -mRadius * mBlackMagic, mRadius,
                0, mRadius);
    }

    private void drawModel5() {

    }

    private class MoveAnimation extends Animation {

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t) {
            super.applyTransformation(interpolatedTime, t);
            mInterpolatedTime = interpolatedTime;
            Log.e(TAG, "mInterpolatedTime__>>" + mInterpolatedTime);
            invalidate();
        }
    }

    public void startAnimation() {
        mPath.reset();
        mInterpolatedTime = 0;
        MoveAnimation mAnimation = new MoveAnimation();
        mAnimation.setDuration(1000);
        mAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
        //move.setRepeatCount(Animation.INFINITE);
        //move.setRepeatMode(Animation.REVERSE);
        startAnimation(mAnimation);
    }
}
