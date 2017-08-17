package com.stage.designpatterntest.builder.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/16.
 * @Version:1.0.0
 */
public class MyAlertDialog {
    protected MyAlertParams P;

    protected MyAlertDialog(MyAlertParams P) {
        this.P = P;
    }

    public void show() {
        String showStr = "";
        if (!TextUtils.isEmpty(P.title)) {
            showStr = showStr + "title = " + P.title + "\n";
        }
        if (!TextUtils.isEmpty(P.message)) {
            showStr = showStr + "message = " + P.message + "\n";
        }
        showStr = showStr + "cancelable = " + P.cancelable;
        Toast.makeText(P.context, showStr, Toast.LENGTH_SHORT).show();
    }

    public static class Builder {
        public Context context;
        public MyAlertParams P;

        public Builder(Context context) {
            this.context = context;
            P = new MyAlertParams(context);
        }

        public Builder setTitle(String title) {
            P.title = title;
            return this;
        }

        public Builder setCancelable(boolean cancelable) {
            P.cancelable = cancelable;
            return this;
        }

        public Builder setMessage(String message) {
            P.message = message;
            return this;
        }

        public MyAlertDialog creat() {
            return new MyAlertDialog(P);
        }

        public void show() {
            MyAlertDialog dialog = new MyAlertDialog(P);
            dialog.show();
        }
    }
}
