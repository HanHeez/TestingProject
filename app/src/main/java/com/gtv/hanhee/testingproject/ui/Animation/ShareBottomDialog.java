package com.gtv.hanhee.testingproject.ui.Animation;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

import com.gtv.hanhee.testingproject.R;

import butterknife.BindView;
import butterknife.ButterKnife;

// set layout
public class ShareBottomDialog extends BottomBaseDialog<ShareBottomDialog> {
    @BindView(R.id.ll_wechat_friend_circle)
    public LinearLayout mLlWechatFriendCircle;
    @BindView(R.id.ll_wechat_friend)
    LinearLayout mLlWechatFriend;
    @BindView(R.id.ll_qq)
    LinearLayout mLlQq;
    @BindView(R.id.ll_sms)
    LinearLayout mLlSms;

    public ShareBottomDialog(Context context, View animateView) {
        super(context, animateView);
    }

    public ShareBottomDialog(Context context) {
        super(context);
    }


    @Override
    public View onCreateView() {
        dismissAnim(null);
        View inflate = View.inflate(mContext, R.layout.dialog_share, null);
        ButterKnife.bind(this, inflate);

        return inflate;
    }

    @Override
    public void setUiBeforShow() {

//        mLlWechatFriendCircle.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                T.showShort(mContext, "1");
//                dismiss();
//            }
//        });
//        mLlWechatFriend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                T.showShort(mContext, "2");
//                dismiss();
//            }
//        });
//        mLlQq.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                T.showShort(mContext, "3");
//                dismiss();
//            }
//        });
//        mLlSms.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                T.showShort(mContext, "4");
//                dismiss();
//            }
//        });
    }
}
