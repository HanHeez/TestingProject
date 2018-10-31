package com.gtv.hanhee.testingproject.base;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public class BaseViewHolder<T> extends RecyclerView.ViewHolder{
    public IViewHolder<T> holder;

    public BaseViewHolder(View itemView, IViewHolder<T> holder) {
        super(itemView);
        this.holder = holder;
        holder.initView();
    }
}
