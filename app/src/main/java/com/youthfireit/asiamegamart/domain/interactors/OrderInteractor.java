package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.OrderResponse;

public interface OrderInteractor {
    interface CallBack {

        void onOrderSubmitted(OrderResponse orderResponse);

        void onOrderSubmitError();
    }
}
