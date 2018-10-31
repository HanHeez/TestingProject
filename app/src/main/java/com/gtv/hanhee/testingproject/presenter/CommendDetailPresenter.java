package com.gtv.hanhee.testingproject.presenter;

import com.gtv.hanhee.testingproject.activity.MainActivity;
import com.gtv.hanhee.testingproject.model.CommentBean;

import java.util.ArrayList;
import java.util.List;

public class CommendDetailPresenter {

    MainActivity mainActivity;

    public void loadComment(List<CommentBean> list, int start, int limit) {
        List<CommentBean> newList = new ArrayList<>();

        int lastItem = limit + start;
        if (limit+ start >= 50) {
            lastItem = 50;
        }
        if (start >= 50) {
            start = 50;
        }
        for (int i = start; i <= lastItem-1; i++) {
            newList.add(list.get(i));
        }
        mainActivity.finishLoad(newList);
    }

    public void refreshCommentDetail(List<CommentBean> commentBeanList, int start, int limit) {
        List<CommentBean> newList = new ArrayList<>();
        int lastItem = limit + start;
        if (limit+ start >= 50) {
            lastItem = 50;
        }
        if (start >= 50) {
            start = 50;
        }
        for (int i = lastItem; i >= start; i--) {
            newList.add(commentBeanList.get(i));
        }
        mainActivity.finishRefresh(newList);

    }

    public void attachView(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }
}
