package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.CheckWishlistResponse;

public interface CheckWishlistInteractor {
    interface CallBack {

        void onWishlistChecked(CheckWishlistResponse checkWishlistResponse);

        void onWishlistCheckedError();
    }
}
