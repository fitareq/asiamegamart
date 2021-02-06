package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ProductListingResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProductListingApiInterface {
    @GET
    Call<ProductListingResponse> getProducts(@Url String url);
}
