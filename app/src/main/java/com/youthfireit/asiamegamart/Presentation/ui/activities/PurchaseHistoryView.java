package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.PurchaseHistory;

import java.util.List;

public interface PurchaseHistoryView {
    void onPurchaseHistoryLoaded(List<PurchaseHistory> purchaseHistoryList);
}
