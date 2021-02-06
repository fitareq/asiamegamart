package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.OrderDetail;

import java.util.List;

public interface PurchaseHistoryDetailsInteractor {
    interface CallBack {

        void onOrderDetailsLoaded(List<OrderDetail> orderDetails);

        void onOrderDetailsLoadError();
    }
}
