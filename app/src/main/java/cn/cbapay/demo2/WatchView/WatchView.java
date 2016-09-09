package cn.cbapay.demo2.WatchView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import cn.cbapay.demo2.DisplayUtils;

/**
 * Created by xuetao on 16/8/31.
 */
public class WatchView extends View {

    private Context mContext;
    private Paint paintCircle;
    private Paint paintDegree;
    private Paint paintHour;
    private Paint paintMinute;
    private int mWidth; // 屏幕宽度
    private int mHeight;// 屏幕高度


    public WatchView(Context context) {
        super(context);
        init(context);
    }

    public WatchView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public WatchView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        mContext = context;
        paintCircle = new Paint();
        paintDegree = new Paint();
        paintHour = new Paint();
        paintMinute = new Paint();
        mWidth = DisplayUtils.getScreenWidthPixels(mContext);
        mHeight = DisplayUtils.getScreenHeightPixels(mContext);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // 画外圆
        paintCircle.setStyle(Paint.Style.STROKE);
        paintCircle.setAntiAlias(true);
        paintCircle.setStrokeWidth(5);
        canvas.drawCircle(mWidth / 2, mHeight / 2, mWidth / 2, paintCircle);

        // 画刻度
        paintDegree.setStrokeWidth(3);
        for (int i = 0; i < 24; i++) {
            // 区分整点与非整点
            if (i == 0 || i == 6 || i == 12 || i == 18) {
                paintDegree.setStrokeWidth(5);
                paintDegree.setTextSize(30);
                canvas.drawLine(mWidth / 2, mHeight / 2 - mWidth / 2, mWidth / 2, mHeight / 2 - mWidth / 2 + 60, paintDegree);
                String degree = String.valueOf(i);
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2, mHeight / 2 - mWidth / 2 + 90, paintDegree);
            } else {
                paintDegree.setStrokeWidth(3);
                paintDegree.setTextSize(15);
                canvas.drawLine(mWidth / 2, mHeight / 2 - mWidth / 2, mWidth / 2, mHeight / 2 - mWidth / 2 + 30, paintDegree);
                String degree = String.valueOf(i);
                canvas.drawText(degree, mWidth / 2 - paintDegree.measureText(degree) / 2, mHeight / 2 - mWidth / 2 + 60, paintDegree);
            }

            // 通过旋转画布简化坐标运算
            canvas.rotate(15, mWidth / 2, mHeight / 2);

        }

        // 画指针
        paintHour.setStrokeWidth(20);
        paintMinute.setStrokeWidth(10);
        canvas.save();
        canvas.translate(mWidth / 2, mHeight / 2);
        canvas.drawLine(0, 0, 100, 100, paintHour);
        canvas.drawLine(0, 0, 100, 200, paintMinute);
        canvas.restore();

    }

}
