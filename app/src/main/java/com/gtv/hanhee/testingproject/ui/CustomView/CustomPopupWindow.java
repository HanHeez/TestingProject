package com.gtv.hanhee.testingproject.ui.CustomView;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Toast;

import com.gtv.hanhee.testingproject.R;


public class CustomPopupWindow extends PopupWindow {

    private View mContentView;
    private Activity mActivity;
    private LinearLayout linearLayout;

    public CustomPopupWindow(final Activity activity) {
        mActivity = activity;

        mContentView = LayoutInflater.from(activity).inflate(R.layout.dialog_share, null);
        LinearLayout container = mContentView.findViewById(R.id.container);

        int width = (int) activity.getResources().getDimension(R.dimen.length_250);
        int height = (int) activity.getResources().getDimension(R.dimen.length_250);
        setWidth(width);
        setHeight(height);

        setContentView(mContentView);

        setFocusable(true);
        setOutsideTouchable(true);
        setTouchable(true);
        Window window = activity.getWindow();
        setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00000000")));
//        window.clearFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        setAnimationStyle(R.style.PauseDialogAnimation);

        setOnDismissListener(new OnDismissListener() {
            @Override
            public void onDismiss() {
                lighton();
            }
        });

        linearLayout = mContentView.findViewById(R.id.ll_wechat_friend_circle);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Click 1", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void lighton() {
        WindowManager.LayoutParams lp = mActivity.getWindow().getAttributes();
        lp.alpha = 1.0f;
        mActivity.getWindow().setAttributes(lp);
    }

    private void lightoff() {
        WindowManager.LayoutParams lp = mActivity.getWindow().getAttributes();
        lp.alpha = 0.3f;
        mActivity.getWindow().setAttributes(lp);
    }

    @Override
    public void showAsDropDown(View anchor, int xoff, int yoff) {
//        lightoff();
        super.showAsDropDown(anchor, xoff, yoff);
    }

    @Override
    public void showAtLocation(View parent, int gravity, int x, int y) {
//        lightoff();
        super.showAtLocation(parent, gravity, x, y);
    }
}
