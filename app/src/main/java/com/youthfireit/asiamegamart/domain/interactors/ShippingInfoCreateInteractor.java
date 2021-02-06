package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.ShippingInfoResponse;

public interface ShippingInfoCreateInteractor {
    interface CallBack {

        void onShippingInfoCreated(ShippingInfoResponse shippingInfoResponse);

        void onShippingInfoCreateError();
    }
}
