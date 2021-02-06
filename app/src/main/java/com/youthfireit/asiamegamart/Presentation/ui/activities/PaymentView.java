package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Network.response.CouponResponse;
import com.youthfireit.asiamegamart.Network.response.OrderResponse;

public interface PaymentView {
    void onCouponApplied(CouponResponse couponResponse);
    void onOrderSubmitted(OrderResponse orderResponse);
}
