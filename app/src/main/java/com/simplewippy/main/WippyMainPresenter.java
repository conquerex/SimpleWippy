package com.simplewippy.main;

import android.support.annotation.NonNull;
import android.util.Log;

import com.simplewippy.util.NetworkSetting;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.http.GET;

/**
 * Created by barley on 28/02/2019
 */
public class WippyMainPresenter implements IWippyMain.Presenter {

    private final IWippyMain.View mView;

    public WippyMainPresenter(@NonNull IWippyMain.View view) {
        mView = view;
    }

    @Override
    public void getInfo() {
        WippyMainApi api = NetworkSetting.getClient().create(WippyMainApi.class);
        Call<WippyMain> call = api.getInfo();
        call.enqueue(new Callback<WippyMain>() {
            @Override
            public void onResponse(Call<WippyMain> call, Response<WippyMain> response) {
                if (response == null || response.body() == null) {
                    return;
                }
                mView.showInfo(response.body());
            }

            @Override
            public void onFailure(Call<WippyMain> call, Throwable t) {
                Log.d(" * * * onFailure : ", t.getMessage());
            }
        });
    }

    @Override
    public void start() {
        //
    }

    interface WippyMainApi {
        @GET("app_bind.json")
        Call<WippyMain> getInfo();
    }
}
