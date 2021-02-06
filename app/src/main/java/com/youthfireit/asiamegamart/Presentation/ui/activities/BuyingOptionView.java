package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Network.response.AddToCartResponse;
import com.youthfireit.asiamegamart.Network.response.VariantResponse;

public interface BuyingOptionView {
    void setVariantprice(VariantResponse variantResponse);
    void setAddToCartMessage(AddToCartResponse addToCartResponse);
}
