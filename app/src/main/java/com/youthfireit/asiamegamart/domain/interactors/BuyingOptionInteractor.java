package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.VariantResponse;

public interface BuyingOptionInteractor {
    interface CallBack {

        void onGetVariantPrice(VariantResponse variantResponse);

        void onGetVariantPriceError();
    }
}
