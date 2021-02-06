package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.ProfileInfoUpdateResponse;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface ProfileInfoApiInterface {
    @POST("user/info/update")
    Call<ProfileInfoUpdateResponse> updateProfileInfo(@Header("Authorization") String authHeader, @Body JsonObject jsonObject);
}
