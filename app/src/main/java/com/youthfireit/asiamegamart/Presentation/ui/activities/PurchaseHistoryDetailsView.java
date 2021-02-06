package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.OrderDetail;

import java.util.List;

public interface PurchaseHistoryDetailsView {
    void onOrderDetailsLoaded(List<OrderDetail> orderDetailList);
}
