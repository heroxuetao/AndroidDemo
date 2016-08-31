package cn.cbapay.demo2.HideOrShowToolbar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import cn.cbapay.demo2.R;


/**
 * Created by xuetao on 16/1/8.
 */
public class AddRemarkAdapter extends MyBaseAdapter<String> {

    private Context mContext;

    public AddRemarkAdapter(Context context) {
        super(context);
        this.mContext = context;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        final ViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(
                    R.layout.item_string, parent, false);
            holder = new ViewHolder();
            holder.tv = (TextView) convertView.findViewById(R.id.tv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final String str = itemList.get(position);

        holder.tv.setText(str);

        return convertView;
    }

    static class ViewHolder {
        public TextView tv;
    }

}
