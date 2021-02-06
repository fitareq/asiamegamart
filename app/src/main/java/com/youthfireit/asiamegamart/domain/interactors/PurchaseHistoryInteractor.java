package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.PurchaseHistory;

import java.util.List;

public interface PurchaseHistoryInteractor {
    interface CallBack {

        void onPurchaseHistoryLodaded(List<PurchaseHistory> purchaseHistories);

        void onPurchaseHistoryLodadedError();
    }
}
