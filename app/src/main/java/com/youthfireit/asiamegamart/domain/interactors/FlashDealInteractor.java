package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.FlashDeal;


public interface FlashDealInteractor {
    interface CallBack {

        void onFlashDealProductDownloaded(FlashDeal flashDeal);

        void onFlashDealProductDownloadError();
    }
}