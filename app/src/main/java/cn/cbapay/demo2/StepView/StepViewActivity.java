package cn.cbapay.demo2.StepView;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;

import com.baoyachi.stepview.VerticalStepView;

import java.util.ArrayList;
import java.util.List;

import cn.cbapay.demo2.R;

public class StepViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_view);

        VerticalStepView mSetpview0 = (VerticalStepView) findViewById(R.id.step_view0);

        List<String> list0 = new ArrayList<>();
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("接已提交定案，等待系统确认");
        list0.add("您的商品需要从外地调拨，我们会尽快处理，请耐心等待");
        list0.add("您的订单已经进入亚洲第一仓储中心1号库准备出库");
        list0.add("您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中");
        list0.add("您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中。您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中您的订单预计6月23日送达您的手中，618期间促销火爆，可能影响送货时间，请您谅解，我们会第一时间送到您的手中");
        list0.add("您的订单已打印完毕");
        list0.add("您的订单已拣货完成");
        list0.add("扫描员已经扫描");
        list0.add("打包成功");
        list0.add("配送员【包牙齿】已出发，联系电话【130-0000-0000】，感谢您的耐心等待，参加评价还能赢取好多礼物哦");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
        list0.add("2016-12-07\n收到李侠赠送的免费午餐券。");
//        mSetpview0.setStepsViewIndicatorComplectingPosition(list0.size() - 2)//设置完成的步数
//                .reverseDraw(true)//default is true
//                .setStepViewTexts(list0)//总步骤
//                .setLinePaddingProportion(0.85f)//设置indicator线与线间距的比例系数
//                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(StepViewActivity.this, android.R.color.white))//设置StepsViewIndicator完成线的颜色
//                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(StepViewActivity.this, R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
//                .setStepViewComplectedTextColor(ContextCompat.getColor(StepViewActivity.this, android.R.color.white))//设置StepsView text完成线的颜色
//                .setStepViewUnComplectedTextColor(ContextCompat.getColor(StepViewActivity.this, R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
//                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(StepViewActivity.this, R.drawable.complted))//设置StepsViewIndicator CompleteIcon
//                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(StepViewActivity.this, R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
//                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(StepViewActivity.this, R.drawable.attention));//设置StepsViewIndicator AttentionIcon

        mSetpview0.setStepsViewIndicatorComplectingPosition(list0.size())//设置完成的步数
                .setTextSize(14)
                .reverseDraw(true)//default is true
                .setStepViewTexts(list0)//总步骤
                .setLinePaddingProportion(1f)//设置indicator线与线间距的比例系数
                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(StepViewActivity.this, android.R.color.white))//设置StepsViewIndicator完成线的颜色
//                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(StepViewActivity.this, R.color.uncompleted_text_color))//设置StepsViewIndicator未完成线的颜色
                .setStepViewComplectedTextColor(ContextCompat.getColor(StepViewActivity.this, android.R.color.white))//设置StepsView text完成线的颜色
//                .setStepViewUnComplectedTextColor(ContextCompat.getColor(StepViewActivity.this, R.color.uncompleted_text_color))//设置StepsView text未完成线的颜色
                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(StepViewActivity.this, R.drawable.default_icon));//设置StepsViewIndicator CompleteIcon
//                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(StepViewActivity.this, R.drawable.default_icon))//设置StepsViewIndicator DefaultIcon
//                .setStepsViewIndicatorAttentionIcon(ContextCompat.getDrawable(StepViewActivity.this, R.drawable.attention));//设置StepsViewIndicator AttentionIcon

    }
}
