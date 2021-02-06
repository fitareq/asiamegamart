package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.AppSettingsResponse;

public interface AppSettingsInteractor {
    interface CallBack {

        void onAppSettingsLoaded(AppSettingsResponse appSettingsResponse);

        void onAppSettingsLoadedError();
    }
}
