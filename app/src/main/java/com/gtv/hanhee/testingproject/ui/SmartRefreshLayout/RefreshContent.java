package com.gtv.hanhee.testingproject.ui.SmartRefreshLayout;

import android.animation.ValueAnimator;
import android.support.annotation.NonNull;
import android.view.MotionEvent;
import android.view.View;

public interface RefreshContent {

    @NonNull
    View getView();

    @NonNull
    View getScrollableView();

    void onActionDown(MotionEvent e);

    void setUpComponent(RefreshKernel kernel, View fixedHeader, View fixedFooter);

    void setScrollBoundaryDecider(ScrollBoundaryDecider boundary);

    void setEnableLoadMoreWhenContentNotFull(boolean enable);

    void moveSpinner(int spinner, int headerTranslationViewId, int footerTranslationViewId);

    boolean canRefresh();

    boolean canLoadMore();

    ValueAnimator.AnimatorUpdateListener scrollContentWhenFinished(int spinner);
}
