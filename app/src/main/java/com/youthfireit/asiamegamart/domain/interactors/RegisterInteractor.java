package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.RegistrationResponse;

public interface RegisterInteractor {
    interface CallBack {

        void onRegistrationDone(RegistrationResponse registrationResponse);

        void onRegistrationError();
    }
}
