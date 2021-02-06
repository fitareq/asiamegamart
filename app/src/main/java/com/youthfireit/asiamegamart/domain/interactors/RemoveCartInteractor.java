package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.RemoveCartResponse;

public interface RemoveCartInteractor {
    interface CallBack {

        void onCartItemRemoved(RemoveCartResponse removeCartResponse);

        void onCartItemRemovedError();
    }
}
