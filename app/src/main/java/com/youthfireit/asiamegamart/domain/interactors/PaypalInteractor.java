package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.OrderResponse;

public interface PaypalInteractor {
    interface CallBack {

        void onPayaplOrderSubmitted(OrderResponse orderResponse);

        void onPayaplOrderSubmitError();
    }
}
