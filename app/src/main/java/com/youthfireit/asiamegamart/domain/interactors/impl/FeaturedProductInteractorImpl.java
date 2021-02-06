package com.youthfireit.asiamegamart.domain.interactors.impl;

import android.util.Log;

import com.youthfireit.asiamegamart.Network.ApiClient;
import com.youthfireit.asiamegamart.Network.response.ProductResponse;
import com.youthfireit.asiamegamart.Network.services.FeaturedProductApiInterface;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.FeaturedProductInteractor;
import com.youthfireit.asiamegamart.domain.interactors.base.AbstractInteractor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FeaturedProductInteractorImpl extends AbstractInteractor {
    private FeaturedProductInteractor.CallBack mCallback;
    private FeaturedProductApiInterface apiService;

    public FeaturedProductInteractorImpl(Executor threadExecutor, MainThread mainThread, FeaturedProductInteractor.CallBack callBack) {
        super(threadExecutor, mainThread);
        mCallback = callBack;
    }

    @Override
    public void run() {
        apiService = ApiClient.getClient().create(FeaturedProductApiInterface.class);
        Call<ProductResponse> call = apiService.getFeaturedPrdocuts();

        call.enqueue(new Callback<ProductResponse>() {
            @Override
            public void onResponse(Call<ProductResponse> call, Response<ProductResponse> response) {
                try {
                    mCallback.onFeaturedProductDownloaded(response.body().getData());
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<ProductResponse> call, Throwable t) {
                mCallback.onFeaturedProductDownloadError();
            }
        });

    }
}
