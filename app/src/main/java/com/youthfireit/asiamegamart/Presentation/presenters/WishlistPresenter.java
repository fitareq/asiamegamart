package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Models.WishlistModel;
import com.youthfireit.asiamegamart.Presentation.ui.activities.WishlistView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.WishlistInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.WishlistInteractorImpl;

import java.util.List;

public class WishlistPresenter extends AbstractPresenter implements WishlistInteractor.CallBack {
    private WishlistView wishlistView;

    public WishlistPresenter(Executor executor, MainThread mainThread, WishlistView wishlistView) {
        super(executor, mainThread);
        this.wishlistView = wishlistView;
    }

    public void getWishlistItems(int id, String token) {
        new WishlistInteractorImpl(mExecutor, mMainThread, this, id, token).execute();
    }

    public void removeWishlistItem(int id, String token){
        new WishlistInteractorImpl(mExecutor, mMainThread, this, id, token).execute();
    }

    @Override
    public void onWishlistLodaded(List<WishlistModel> wishlistModels) {
        if(wishlistView != null){
            wishlistView.setWishlistProducts(wishlistModels);
        }
    }

    @Override
    public void onWishlistError() {

    }
}
