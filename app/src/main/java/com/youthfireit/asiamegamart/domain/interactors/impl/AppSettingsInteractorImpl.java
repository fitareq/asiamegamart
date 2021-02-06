package com.youthfireit.asiamegamart.domain.interactors.impl;

import android.util.Log;

import com.youthfireit.asiamegamart.Network.ApiClient;
import com.youthfireit.asiamegamart.Network.response.AppSettingsResponse;
import com.youthfireit.asiamegamart.Network.services.AppSettingsApiInterface;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.AppSettingsInteractor;
import com.youthfireit.asiamegamart.domain.interactors.base.AbstractInteractor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AppSettingsInteractorImpl extends AbstractInteractor {
    private AppSettingsInteractor.CallBack mCallback;
    private AppSettingsApiInterface apiService;

    public AppSettingsInteractorImpl(Executor threadExecutor, MainThread mainThread, AppSettingsInteractor.CallBack callBack) {
        super(threadExecutor, mainThread);
        mCallback = callBack;
    }

    @Override
    public void run() {
        apiService = ApiClient.getClient().create(AppSettingsApiInterface.class);
        Call<AppSettingsResponse> call = apiService.getAppSettings();

        call.enqueue(new Callback<AppSettingsResponse>() {
            @Override
            public void onResponse(Call<AppSettingsResponse> call, Response<AppSettingsResponse> response) {
                try {
                    mCallback.onAppSettingsLoaded(response.body());
                    //Log.d("AppSettings", response.body().getData().get(0).getName());
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<AppSettingsResponse> call, Throwable t) {
                mCallback.onAppSettingsLoadedError();
            }
        });

    }
}
