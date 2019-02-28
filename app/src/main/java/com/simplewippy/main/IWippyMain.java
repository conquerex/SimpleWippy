package com.simplewippy.main;

import com.simplewippy.BasePresenter;
import com.simplewippy.BaseView;

/**
 * Created by barley on 28/02/2019
 */
public class IWippyMain {

    interface View extends BaseView<Presenter> {
        void showInfo(WippyMain wippyMain);
    }

    interface Presenter extends BasePresenter {
        void getInfo();
    }
}
