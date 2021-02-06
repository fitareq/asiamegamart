package com.youthfireit.asiamegamart.Network.services;

import com.youthfireit.asiamegamart.Network.response.AppSettingsResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AppSettingsApiInterface {
    @GET("settings")
    Call<AppSettingsResponse> getAppSettings();
}
