package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.RemoveWishlistResponse;

public interface RemoveWishlistInteractor {
    interface CallBack {

        void onWishlistItemRemoved(RemoveWishlistResponse removeWishlistResponse);

        void onWishlistItemRemovedError();
    }
}
