package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.UserBid;

import java.util.List;

public interface UserBidInteractor {
    interface CallBack {

        void onUserBidLodaded(List<UserBid> userBids);

        void onUserBidError();
    }
}
