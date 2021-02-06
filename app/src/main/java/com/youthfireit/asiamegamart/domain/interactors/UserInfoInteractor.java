package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.User;

public interface UserInfoInteractor {
    interface CallBack {

        void onUserInfoLodaded(User user);

        void onUserInfoError();
    }
}
