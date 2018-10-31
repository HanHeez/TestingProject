package com.gtv.hanhee.testingproject.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.airbnb.lottie.LottieAnimationView;
import com.flyco.tablayout.listener.OnTabSelectListener;

import java.util.ArrayList;

import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MainGroupActivity extends AppCompatActivity {


    CommonTabLayout commonTabLayout;
    ViewPager mViewPager;
    LottieAnimationView lottieAnimationView;
    LinearLayout linearLayout;
    Unbinder unbinder;
    private String[] mTitles = {"首页", "消息", "联系人", "更多"};
    private int[] mIconSelectIds = {
            R.raw.tab_bookshelf, R.raw.tab_bookstore, R.raw.tab_find, R.raw.tab_mine};
    private int[] mIconUnselectIds = {
            R.raw.tab_bookshelf_reverse, R.raw.tab_bookstore_reverse, R.raw.tab_find_reverse, R.raw.tab_mine_reverse};
    private ArrayList<CustomTabEntity> mTabEntities = new ArrayList<>();
    private ArrayList<Fragment> mFragments = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        unbinder = ButterKnife.bind(this);

        setContentView(R.layout.activity_main_group);
        commonTabLayout = findViewById(R.id.tabs);
        mViewPager = findViewById(R.id.viewpager);


        mFragments.add(new AFragment());
        mFragments.add(new BFragment());
        mFragments.add(new CFragment());
        for (int i = 0; i < mTitles.length; i++) {
            mTabEntities.add(new TabEntity(mTitles[i], mIconSelectIds[i], mIconUnselectIds[i]));
        }

        mViewPager.setAdapter(new FlycoAdapter(getSupportFragmentManager(), mFragments, mTitles));
        commonTabLayout.setTabData(mTabEntities);
        commonTabLayout.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelect(int position) {
                mViewPager.setCurrentItem(position);
            }

            @Override
            public void onTabReselect(int position) {

            }
        });
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                commonTabLayout.setCurrentTab(i);
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
