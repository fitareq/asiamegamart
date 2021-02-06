package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.Wallet;

import java.util.List;

public interface WalletView {
    void setWalletBalance(Double balance);
    void setWalletHistory(List<Wallet> walletList);
}
