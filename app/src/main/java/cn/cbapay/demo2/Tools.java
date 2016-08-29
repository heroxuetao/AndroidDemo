package cn.cbapay.demo2;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by xuetao on 16/8/9.
 */
public class Tools {

    public static void formatPriceEditText(final EditText editText) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

                if (s.toString().contains(".")) {
                    if (s.length() - 1 - s.toString().indexOf(".") > 2) {
                        s = s.toString().subSequence(0,
                                s.toString().indexOf(".") + 3);
                        editText.setText(s);
                        editText.setSelection(s.length());
                    } else if ((s.length() - s.toString().replace(".", "").length()) == 2) {
                        // 输入了两个点
                        s = s.subSequence(0, s.length() - 1);
                        editText.setText(s);
                        editText.setSelection(s.length());
                    }
                }

                if (s.toString().contains("-")) {
                    if (s.toString().trim().substring(0, 1).equals("-")) {
                        // -必须放在开头
                        if ((s.length() - s.toString().replace("-", "").length()) == 2) {
                            // 输入了两个-
                            s = s.subSequence(0, s.length() - 1);
                            editText.setText(s);
                            editText.setSelection(s.length());
                        }

                    } else {
                        s = s.subSequence(0, s.length() - 1);
                        editText.setText(s);
                        editText.setSelection(s.length());
                    }

                }

                if (s.toString().trim().substring(0).equals(".")) {
                    s = "0" + s;
                    editText.setText(s);
                    editText.setSelection(2);
                }

                if (s.toString().startsWith("0") && s.toString().trim().length() > 1) {
                    if (!s.toString().substring(1, 2).equals(".")) {
                        editText.setText(s.subSequence(0, 1));
                        editText.setSelection(1);
                        return;
                    }
                }

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
}
