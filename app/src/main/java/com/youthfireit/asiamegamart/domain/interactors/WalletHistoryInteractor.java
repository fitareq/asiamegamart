package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Wallet;

import java.util.List;

public interface WalletHistoryInteractor {
    interface CallBack {

        void onWalletHistoryLodaded(List<Wallet> walletList);

        void onWalletHistoryLoadError();
    }
}
