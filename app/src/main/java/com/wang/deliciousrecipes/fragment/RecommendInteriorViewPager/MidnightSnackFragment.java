package com.wang.deliciousrecipes.fragment.RecommendInteriorViewPager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wang.deliciousrecipes.R;

/**
 * Created by tarena on 2016/12/28.
 */

public class MidnightSnackFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_recommend_interior_viewpager,null);
        return  view;
    }
}
