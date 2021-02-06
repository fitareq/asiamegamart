package com.youthfireit.asiamegamart.domain.interactors.impl;

import android.util.Log;

import com.youthfireit.asiamegamart.Network.ApiClient;
import com.youthfireit.asiamegamart.Network.response.PolicyResponse;
import com.youthfireit.asiamegamart.Network.services.PolicyApiInterface;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.PolicyInteractor;
import com.youthfireit.asiamegamart.domain.interactors.base.AbstractInteractor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PolicyInteractorImpl extends AbstractInteractor {
    private PolicyInteractor.CallBack mCallback;
    private PolicyApiInterface apiService;
    private String url;

    public PolicyInteractorImpl(Executor threadExecutor, MainThread mainThread, PolicyInteractor.CallBack callBack, String url) {
        super(threadExecutor, mainThread);
        mCallback = callBack;
        this.url = url;
    }

    @Override
    public void run() {
        apiService = ApiClient.getClient().create(PolicyApiInterface.class);
        Call<PolicyResponse> call = apiService.getPolicy(url);

        call.enqueue(new Callback<PolicyResponse>() {
            @Override
            public void onResponse(Call<PolicyResponse> call, Response<PolicyResponse> response) {
                try {
                    mCallback.onPolicyLoaded(response.body().getData().get(0));
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<PolicyResponse> call, Throwable t) {
                mCallback.onPolicyLoadError();
            }
        });

    }
}
