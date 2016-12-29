package com.wang.deliciousrecipes.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.wang.deliciousrecipes.R;
import com.wang.deliciousrecipes.fragment.FriendsFragment;
import com.wang.deliciousrecipes.fragment.MenuFragment;
import com.wang.deliciousrecipes.fragment.MyFragment;
import com.wang.deliciousrecipes.fragment.RecommendFragment;
import com.wang.deliciousrecipes.widget.CustomViewPager;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends FragmentActivity {
    private CustomViewPager viewPager;
    private RadioGroup rgRadioGroup;
    private RadioButton rbRecommend;
    private RadioButton rbMenu;
    private RadioButton rbFriends;
    private RadioButton rbMy;

    private List<Fragment> fragments;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
        //ViewPager设置适配器
        setPagerAdapter();
        //设置监听器
        setListeners();
    }

    private void setListeners() {
        rgRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_Recommend:
                        viewPager.setCurrentItem(0);
                        break;
                    case R.id.rb_Menu:
                        viewPager.setCurrentItem(1);
                        break;
                    case R.id.rb_Friends:
                        viewPager.setCurrentItem(2);
                        break;
                    case R.id.rb_My:
                        viewPager.setCurrentItem(3);
                        break;
                }
            }
        });

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        rbRecommend.setChecked(true);
                        break;
                    case 1:
                        rbMenu.setChecked(true);
                        break;
                    case 2:
                        rbFriends.setChecked(true);
                        break;
                    case 3:
                        rbMy.setChecked(true);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
    }

    private void setPagerAdapter() {
        fragments = new ArrayList<>();
        fragments.add(new RecommendFragment());
        fragments.add(new MenuFragment());
        fragments.add(new FriendsFragment());
        fragments.add(new MyFragment());
        fragmentPagerAdapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(fragmentPagerAdapter);
    }

   private class MainPagerAdapter extends FragmentPagerAdapter {
        public MainPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }
    }
    private void initView(){
        viewPager=(CustomViewPager) findViewById(R.id.viewPager);
        rgRadioGroup=(RadioGroup)findViewById(R.id.rg_RadioGroup);
        rbRecommend=(RadioButton)findViewById(R.id.rb_Recommend);
        rbMenu=(RadioButton)findViewById(R.id.rb_Menu);
        rbFriends=(RadioButton)findViewById(R.id.rb_Friends);
        rbMy=(RadioButton)findViewById(R.id.rb_My);
    }
}