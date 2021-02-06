package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ProductResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TodaysDealApiInterface {
    @GET("products/todays-deal")
    Call<ProductResponse> getTodaysDeal();
}
