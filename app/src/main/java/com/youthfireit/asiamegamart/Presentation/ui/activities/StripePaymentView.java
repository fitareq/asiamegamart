package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Network.response.StripeClientSecretResponse;

public interface StripePaymentView {
    void onClientSecretReceived(StripeClientSecretResponse stripeClientSecretResponse);
}
