package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ProductResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProductApiInterface {
    @GET
    Call<ProductResponse> getProducts(@Url String url);
}
