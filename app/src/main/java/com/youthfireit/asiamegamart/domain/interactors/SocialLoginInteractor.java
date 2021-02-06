package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.AuthResponse;

public interface SocialLoginInteractor {
    interface CallBack {

        void onValidLogin(AuthResponse authResponse);

        void onLoginError();
    }
}
