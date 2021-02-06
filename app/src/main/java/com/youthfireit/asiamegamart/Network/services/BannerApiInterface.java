package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.BannerResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BannerApiInterface {
    @GET("banners")
    Call<BannerResponse> getBanners();
}
