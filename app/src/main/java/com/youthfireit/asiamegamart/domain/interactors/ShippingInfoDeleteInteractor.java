package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.ShippingInfoResponse;

public interface ShippingInfoDeleteInteractor {
    interface CallBack {

        void onShippingInfoDeleted(ShippingInfoResponse shippingInfoResponse);

        void onShippingInfoDeleteError();
    }
}
