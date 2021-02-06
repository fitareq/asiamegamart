package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.OrderResponse;

public interface WalletInteractor {
    interface CallBack {

        void onWalletOrderSubmitted(OrderResponse orderResponse);

        void onWalletOrderSubmitError();
    }
}
