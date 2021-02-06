package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.AuctionBidResponse;

public interface AuctionBidInteractor {
    interface CallBack {

        void onBidSubmitted(AuctionBidResponse auctionBidResponse);

        void onBidSubmittedError();
    }
}
