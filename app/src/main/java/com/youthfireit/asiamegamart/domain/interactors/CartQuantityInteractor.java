package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.CartQuantityUpdateResponse;

public interface CartQuantityInteractor {
    interface CallBack {

        void onCartQuantityUpdated(CartQuantityUpdateResponse cartQuantityUpdateResponse);

        void onCartQuantityUpdatedError();
    }
}
