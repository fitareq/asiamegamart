package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ProductDetialsResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProductDetailsApiInterface {
    @GET
    Call<ProductDetialsResponse> getProductDetails(@Url String url);
}
