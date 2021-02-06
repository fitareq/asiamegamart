package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.LogoutResponse;

public interface LogoutInteractor {
    interface CallBack {

        void onLoggedOut(LogoutResponse logoutResponse);

        void onLoggedOutError();
    }
}
