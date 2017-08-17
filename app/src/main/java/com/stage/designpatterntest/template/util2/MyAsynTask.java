package com.stage.designpatterntest.template.util2;

import android.util.Log;

/**
 * @author Djk
 * @Title:
 * @Time: 2017/8/15.
 * @Version:1.0.0
 */

public abstract class MyAsynTask {

    public void onPreExecute() {
        Log.e("dengzi", "onPreExecute");
    }

    public abstract Object doInBackground();

    public void onPostExecute(Object o) {
        Log.e("dengzi", "onPostExecute");
    }

    public void execute() {
        onPreExecute();
        Object obj = doInBackground();
        onPostExecute(obj);
    }

}
