package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.CategoryResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface HomeCategoryApiInterface {
    @GET("home-categories")
    Call<CategoryResponse> getHomeCategories();
}
