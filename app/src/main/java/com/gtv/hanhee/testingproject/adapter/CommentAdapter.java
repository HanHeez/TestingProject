package com.gtv.hanhee.testingproject.adapter;

import android.content.Context;

import com.gtv.hanhee.testingproject.model.CommentBean;
import com.gtv.hanhee.testingproject.base.IViewHolder;
import com.gtv.hanhee.testingproject.base.WholeAdapter;
import com.gtv.hanhee.testingproject.viewholder.CommentHolder;

public class CommentAdapter extends WholeAdapter<CommentBean> {

    public CommentAdapter(Context context, Options options) {
        super(context, options);
    }

    @Override
    protected IViewHolder<CommentBean> createViewHolder(int viewType) {
        return new CommentHolder(false);
    }
}
