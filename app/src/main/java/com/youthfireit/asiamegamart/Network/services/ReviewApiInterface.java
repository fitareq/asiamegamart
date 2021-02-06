package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ReviewResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ReviewApiInterface {
    @GET
    Call<ReviewResponse> getReviews(@Url String url);
}
