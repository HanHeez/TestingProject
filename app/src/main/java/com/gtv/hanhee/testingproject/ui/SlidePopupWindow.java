package com.gtv.hanhee.testingproject.ui;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class SlidePopupWindow extends AlertDialog {
    private View mContentView;
    private Activity mActivity;

    private LinearLayout background;

    private Button mBtnMale;
    private Button mBtnFemale;
    private ImageView mIvClose;


    protected SlidePopupWindow(@NonNull Context context) {
        super(context);
    }

    protected SlidePopupWindow(@NonNull Context context, int themeResId) {
        super(context, themeResId);
    }

    protected SlidePopupWindow(@NonNull Context context, boolean cancelable, @Nullable OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }


}
