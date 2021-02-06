package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.StripeClientSecretResponse;

public interface StripeInteractor {
    interface CallBack {

        void ononClientSecretReceived(StripeClientSecretResponse stripeClientSecretResponse);

        void ononClientSecretReceiveError();
    }
}
