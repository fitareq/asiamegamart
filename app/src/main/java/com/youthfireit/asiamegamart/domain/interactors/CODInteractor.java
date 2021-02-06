package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.OrderResponse;

public interface CODInteractor {
    interface CallBack {

        void onCODOrderSubmitted(OrderResponse orderResponse);

        void onCODOrderSubmitError();
    }
}
