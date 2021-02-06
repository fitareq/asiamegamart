package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.FlashDealResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FlashDealApiInterface {
    @GET("products/flash-deal")
    Call<FlashDealResponse> getFlashDeal();
}