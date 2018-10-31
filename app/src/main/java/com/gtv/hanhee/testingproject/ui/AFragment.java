package com.gtv.hanhee.testingproject.ui;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.gtv.hanhee.testingproject.R;
import com.gtv.hanhee.testingproject.ui.Animation.BaseAnimatorSet;
import com.gtv.hanhee.testingproject.ui.CustomView.CustomDialog;
import com.gtv.hanhee.testingproject.ui.clicklistener.OnCustomViewClickListener;
import com.scwang.smartrefresh.layout.api.RefreshLayout;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class AFragment extends Fragment implements OnCustomViewClickListener<CustomDialog> {
    Button btnShowDialog, btnShowPopup;
    LinearLayout linearLayout;
    SlidePopupWindow slidePopupWindow;
    BaseAnimatorSet mBasOut;
    LinearLayout one;
    Unbinder unbinder;
    View rootView;

    RefreshLayout refreshLayout;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        unbinder = ButterKnife.bind(getActivity());
        rootView = inflater.inflate(R.layout.fragment_a, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        refreshLayout = view.findViewById(R.id.refreshLayout);
        refreshLayout.setRefreshHeader(new CustomFragmentHeader(getContext()));
//        btnShowDialog = view.findViewById(R.id.btnShowDialog);
//        btnShowPopup = view.findViewById(R.id.btnShowPopup);
//        linearLayout = view.findViewById(R.id.background);
//        refreshLayout = view.findViewById(R.id.smartRefreshLayout);
//
//        mBasOut = new FlipVerticalSwingEnter();
//        btnShowPopup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CustomPopupWindow customPopupWindow = new CustomPopupWindow(getActivity());
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//                    customPopupWindow.showAsDropDown(v, -5 , 0, Gravity.END);
//                } else {
//                    customPopupWindow.showAsDropDown(v, v.getWidth() - customPopupWindow.getWidth(), 0);
//                }
//            }
//        });
//
//        btnShowDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                CustomDialog customDialog = new CustomDialog(getContext(), AFragment.this);
//                customDialog = customDialog.instance(getActivity());
//                customDialog.show();

//                one = dialog.mLlWechatFriendCircle;
//                one.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        Toast.makeText(getContext(), "click 1", Toast.LENGTH_SHORT).show();
//                        dialog.dismiss();
//                    }
//                });
//            }
//        });
//        refreshLayout.setRefreshHeader(new WaterDropHeader(getContext()));
//        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
//            @Override
//            public void onRefresh(@NonNull final RefreshLayout refreshLayout) {
//                refreshLayout.finishRefresh(3000);
//                refreshLayout.getLayout().postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//
//                    }
//                }, 2000);
//            }
//        });
    }


    @Override
    public void onItemClick(int position, CustomDialog customView) {
        customView.dismiss();
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }

}
