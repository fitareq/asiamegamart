package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.ProfileInfoUpdateResponse;

public interface ProfileInfoUpdateInteractor {
    interface CallBack {

        void onProfileInfoUpdated(ProfileInfoUpdateResponse profileInfoUpdateResponse);

        void onProfileInfoUpdatedError();
    }
}
