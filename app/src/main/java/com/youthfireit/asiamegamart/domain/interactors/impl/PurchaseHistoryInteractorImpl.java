package com.youthfireit.asiamegamart.domain.interactors.impl;

import android.util.Log;

import com.youthfireit.asiamegamart.Network.ApiClient;
import com.youthfireit.asiamegamart.Network.response.PurchaseHistoryResponse;
import com.youthfireit.asiamegamart.Network.services.PurchaseHistoryApiInterface;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.PurchaseHistoryInteractor;
import com.youthfireit.asiamegamart.domain.interactors.base.AbstractInteractor;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PurchaseHistoryInteractorImpl extends AbstractInteractor {
    private PurchaseHistoryInteractor.CallBack mCallback;
    private PurchaseHistoryApiInterface apiService;
    private int user_id;
    private String token;

    public PurchaseHistoryInteractorImpl(Executor threadExecutor, MainThread mainThread, PurchaseHistoryInteractor.CallBack callBack, int id, String token) {
        super(threadExecutor, mainThread);
        mCallback = callBack;
        this.user_id = id;
        this.token = "Bearer "+token;
    }

    @Override
    public void run() {
        apiService = ApiClient.getClient().create(PurchaseHistoryApiInterface.class);
        Call<PurchaseHistoryResponse> call = apiService.getPurchaseHistories(token,"purchase-history/"+user_id);

        call.enqueue(new Callback<PurchaseHistoryResponse>() {
            @Override
            public void onResponse(Call<PurchaseHistoryResponse> call, Response<PurchaseHistoryResponse> response) {
                try {
                    mCallback.onPurchaseHistoryLodaded(response.body().getData());
                } catch (Exception e) {
                    Log.e("Exception", e.getMessage());
                }
            }

            @Override
            public void onFailure(Call<PurchaseHistoryResponse> call, Throwable t) {
                mCallback.onPurchaseHistoryLodadedError();
            }
        });

    }
}
