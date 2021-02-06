package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.AddToWishlistResponse;

public interface AddToWishlistInteractor {
    interface CallBack {

        void onWishlistItemAdded(AddToWishlistResponse addToWishlistResponse);

        void onWishlistItemAddedError();
    }
}
