package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.AddToCartResponse;

public interface AddToCartInteractor {
    interface CallBack {

        void onCartItemAdded(AddToCartResponse addToCartResponse);

        void onCartItemAddedError();
    }
}
