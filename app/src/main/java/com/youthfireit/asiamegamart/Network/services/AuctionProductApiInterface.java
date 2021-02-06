package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.AuctionResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AuctionProductApiInterface {
    @GET("auctions")
    Call<AuctionResponse> getAuctionProducts();
}
