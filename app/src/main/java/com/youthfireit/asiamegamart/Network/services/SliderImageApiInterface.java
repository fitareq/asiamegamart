package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.SliderImageResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface SliderImageApiInterface {
    @GET("sliders")
    Call<SliderImageResponse> getSliderImages();
}
