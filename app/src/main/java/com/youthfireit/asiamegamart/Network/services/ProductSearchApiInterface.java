package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ProductSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ProductSearchApiInterface {
    @GET
    Call<ProductSearchResponse> getSearchedProducts(@Url String url);
}
