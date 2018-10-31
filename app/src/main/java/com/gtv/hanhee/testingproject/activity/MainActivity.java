package com.gtv.hanhee.testingproject.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.gtv.hanhee.testingproject.R;
import com.gtv.hanhee.testingproject.adapter.CommentAdapter;
import com.gtv.hanhee.testingproject.base.DividerItemDecoration;
import com.gtv.hanhee.testingproject.base.RefreshLayout;
import com.gtv.hanhee.testingproject.base.WholeAdapter;
import com.gtv.hanhee.testingproject.model.CommentBean;
import com.gtv.hanhee.testingproject.presenter.CommendDetailPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<CommentBean> commentBeanList = new ArrayList<>();

    private CommentAdapter mCommentAdapter;
    RecyclerView recyclerView;
    CommendDetailPresenter mPresenter;
    RefreshLayout mRefreshLayout;
    private int start = 0;
    private int limit = 7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRefreshLayout = findViewById(R.id.refresh_layout);
        mPresenter = new CommendDetailPresenter();
        mPresenter.attachView(this);
//        mRefreshLayout.showError();
        initData();
        initRecyclerView();
        initClick();
        processLogic();

    }

    protected void processLogic() {
        mRefreshLayout.showLoading();
        mPresenter.refreshCommentDetail(commentBeanList,start,limit);
    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView);
        mCommentAdapter = new CommentAdapter(this,new WholeAdapter.Options());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this));
        recyclerView.setAdapter(mCommentAdapter);
    }

    private void initData() {
        for (int i=0;i<=50;i++) {
            CommentBean commentBean = new CommentBean("id"+i,"content " + i,i*2, i*5, "create by"+ i);
            commentBeanList.add(commentBean);
        }
    }

    protected void initClick() {
        mCommentAdapter.setOnLoadMoreListener(
                () ->
                {
                    mPresenter.loadComment(commentBeanList, start, limit);
                    Log.d("kiemtra", start+" - "+limit);
                }
        );
    }

    public void finishLoad(List<CommentBean> list) {
        start += list.size();
        mCommentAdapter.addItems(list);
    }

    public void finishRefresh(List<CommentBean> list) {
        //加载
        start = list.size();
        mCommentAdapter.refreshItems(list);
        complete();
    }

    public void showError() {
        mRefreshLayout.showError();
    }

    public void complete() {
        mRefreshLayout.showFinish();
    }
}
