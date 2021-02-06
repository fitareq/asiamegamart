package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Models.UserBid;
import com.youthfireit.asiamegamart.Network.response.AuctionBidResponse;
import com.youthfireit.asiamegamart.Presentation.ui.activities.MybidView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.AuctionBidInteractor;
import com.youthfireit.asiamegamart.domain.interactors.UserBidInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.AuctionBidInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.UserBidInteractorImpl;
import com.google.gson.JsonObject;

import java.util.List;

public class MybidsPresenter extends AbstractPresenter implements UserBidInteractor.CallBack, AuctionBidInteractor.CallBack {
    private MybidView mybidView;

    public MybidsPresenter(Executor executor, MainThread mainThread, MybidView mybidView) {
        super(executor, mainThread);
        this.mybidView = mybidView;
    }

    public void getUserBidsItems(int id, String token) {
        new UserBidInteractorImpl(mExecutor, mMainThread, this, id, token).execute();
    }

    public void submitBid(JsonObject jsonObject, String token){
        new AuctionBidInteractorImpl(mExecutor, mMainThread, this, jsonObject, token).execute();
    }

    @Override
    public void onUserBidLodaded(List<UserBid> userBids) {
        if (mybidView != null){
            mybidView.setUserBids(userBids);
        }
    }

    @Override
    public void onUserBidError() {

    }

    @Override
    public void onBidSubmitted(AuctionBidResponse auctionBidResponse) {
        if (mybidView != null){
            mybidView.onAuctionBidSubmitted(auctionBidResponse);
        }
    }

    @Override
    public void onBidSubmittedError() {

    }
}
