package com.gtv.hanhee.testingproject.ui.CustomView;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.gtv.hanhee.testingproject.R;
import com.gtv.hanhee.testingproject.ui.clicklistener.OnCustomViewClickListener;


public class CustomDialog extends Dialog {
    public OnCustomViewClickListener itemClickListener;
    LinearLayout ln1;

    public CustomDialog(Context context, OnCustomViewClickListener listener) {
        this(context, 0);
        this.itemClickListener = listener;
    }

    public CustomDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    public CustomDialog instance(Activity activity) {
        View v = (View) View.inflate(activity, R.layout.dialog_share, null);
        final CustomDialog dialog = new CustomDialog(activity, R.style.PauseDialog);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.dialog_share);
        final Window window = dialog.getWindow();
        WindowManager.LayoutParams wmlp = dialog.getWindow().getAttributes();
        wmlp.width = WindowManager.LayoutParams.WRAP_CONTENT;
        wmlp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        wmlp.gravity = Gravity.CENTER;
//        wmlp.x = 100;
//        wmlp.y = 50;
//                window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        window.setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        ln1 = dialog.findViewById(R.id.ll_wechat_friend_circle);
        ln1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClick(1, dialog);
            }
        });
        return dialog;
    }
}
