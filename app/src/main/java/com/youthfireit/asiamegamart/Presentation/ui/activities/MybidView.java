package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.UserBid;
import com.youthfireit.asiamegamart.Network.response.AuctionBidResponse;

import java.util.List;

public interface MybidView {
    void setUserBids(List<UserBid> userBids);
    void onAuctionBidSubmitted(AuctionBidResponse auctionBidResponse);
}
