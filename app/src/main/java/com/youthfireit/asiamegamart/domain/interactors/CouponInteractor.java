package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.CouponResponse;

public interface CouponInteractor {
    interface CallBack {

        void onCouponApplied(CouponResponse couponResponse);

        void onCouponAppliedError();
    }
}
