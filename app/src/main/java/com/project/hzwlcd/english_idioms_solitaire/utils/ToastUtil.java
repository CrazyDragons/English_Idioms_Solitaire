package com.project.hzwlcd.english_idioms_solitaire.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Project EnglishidiomsSolitaire/com.project.hzwlcd.englishidiomssolitaire.utils/ToastUtil
 * Created by HZW
 * Data 2017/10/16
 * Time 16:12
 */

public class ToastUtil {
    private Context context;

    public ToastUtil(Context context) {
        this.context = context;
    }

    public void showToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
