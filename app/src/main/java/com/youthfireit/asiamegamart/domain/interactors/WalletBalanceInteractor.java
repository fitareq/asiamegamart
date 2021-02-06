package com.youthfireit.asiamegamart.domain.interactors;

public interface WalletBalanceInteractor {
    interface CallBack {

        void onWalletBalanceLodaded(Double balance);

        void onWalletBalanceLoadError();
    }
}
