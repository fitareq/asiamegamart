package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.AuthResponse;

public interface LoginInteractor {
    interface CallBack {

        void onValidLogin(AuthResponse authResponse);

        void onLoginError();
    }
}
