package com.simplewippy.main;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.simplewippy.R;
import com.simplewippy.databinding.FragmentWippyMainBinding;

/**
 * A simple {@link Fragment} subclass.
 */
public class WippyMainFragment extends Fragment implements IWippyMain.View  {

    FragmentWippyMainBinding binding;
    IWippyMain.Presenter mPresenter;
    WippyMain mWippyMain;

    public WippyMainFragment() {
        //
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_wippy_main, container, false);

        mPresenter = new WippyMainPresenter(this);
        mPresenter.getInfo();

        return binding.getRoot();
    }

    @Override
    public void showInfo(WippyMain wippyMain) {
        mWippyMain = wippyMain;
        binding.setInfo(wippyMain);

        binding.tabWippyProfile.setupWithViewPager(binding.pagerWippyProfile, true);

        ImagePagerAdapter pagerAdapter = new ImagePagerAdapter();
        binding.pagerWippyProfile.setAdapter(pagerAdapter);
    }

    @Override
    public void setPresenter(IWippyMain.Presenter presenter) {
        mPresenter = presenter;
    }

    public class ImagePagerAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            if (mWippyMain == null) {
                return 0;
            }
            return mWippyMain.getProfile_images().size();
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            if (o instanceof View) {
                return view.equals(o);
            }
            return false;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            ImageView view = new ImageView(getContext());
            view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            Glide.with(getContext()).load(mWippyMain.getProfile_images().get(position)).into(view);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            if (object instanceof View) {
                container.removeView((View) object);
            }
        }
    }
}
