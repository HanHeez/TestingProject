package com.gtv.hanhee.testingproject.ui.SmartRefreshLayout;

import android.support.annotation.NonNull;
import android.support.annotation.RestrictTo;

import static android.support.annotation.RestrictTo.Scope.LIBRARY;
import static android.support.annotation.RestrictTo.Scope.LIBRARY_GROUP;
import static android.support.annotation.RestrictTo.Scope.SUBCLASSES;

public interface OnStateChangedListener {
    /**
     * 状态改变事件 {@link RefreshState}
     *
     * @param refreshLayout RefreshLayout
     * @param oldState      改变之前的状态
     * @param newState      改变之后的状态
     */
    @RestrictTo({LIBRARY, LIBRARY_GROUP, SUBCLASSES})
    void onStateChanged(@NonNull RefreshLayout refreshLayout, @NonNull RefreshState oldState, @NonNull RefreshState newState);
}
