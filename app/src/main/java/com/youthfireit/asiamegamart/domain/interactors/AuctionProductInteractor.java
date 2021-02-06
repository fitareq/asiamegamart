package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.AuctionProduct;

import java.util.List;

public interface AuctionProductInteractor {
    interface CallBack {

        void onAuctionProductDownloaded(List<AuctionProduct> auctionProducts);

        void onAuctionProductDownloadError();
    }
}
