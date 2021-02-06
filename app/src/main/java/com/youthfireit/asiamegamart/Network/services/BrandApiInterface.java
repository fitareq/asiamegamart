package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.BrandResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BrandApiInterface {
    @GET("brands")
    Call<BrandResponse> getBrands();
}
