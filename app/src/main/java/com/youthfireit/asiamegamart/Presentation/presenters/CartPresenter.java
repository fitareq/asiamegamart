package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Models.CartModel;
import com.youthfireit.asiamegamart.Network.response.CartQuantityUpdateResponse;
import com.youthfireit.asiamegamart.Network.response.RemoveCartResponse;
import com.youthfireit.asiamegamart.Presentation.ui.fragments.CartView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.CartInteractor;
import com.youthfireit.asiamegamart.domain.interactors.CartQuantityInteractor;
import com.youthfireit.asiamegamart.domain.interactors.RemoveCartInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.CartInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.CartQuantityInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.RemoveCartInteractorImpl;

import java.util.List;

public class CartPresenter extends AbstractPresenter implements CartInteractor.CallBack, RemoveCartInteractor.CallBack, CartQuantityInteractor.CallBack {
    private CartView cartView;

    public CartPresenter(Executor executor, MainThread mainThread, CartView cartView) {
        super(executor, mainThread);
        this.cartView = cartView;
    }

    public void getCartItems(int id, String token) {
        new CartInteractorImpl(mExecutor, mMainThread, this, id, token).execute();
    }

    public void removeCartItem(int id, String token){
        new RemoveCartInteractorImpl(mExecutor, mMainThread, this, id, token).execute();
    }

    public void updateCartQuantity(int id, int quantity, String token) {
        new CartQuantityInteractorImpl(mExecutor, mMainThread, this, id, quantity, token).execute();
    }

    @Override
    public void onCartLodaded(List<CartModel> cartModels) {
        if(cartView != null){
            cartView.setCartItems(cartModels);
        }
    }

    @Override
    public void onCartError() {

    }

    @Override
    public void onCartItemRemoved(RemoveCartResponse removeCartResponse) {
        if(cartView != null){
            cartView.showRemoveCartMessage(removeCartResponse);
        }
    }

    @Override
    public void onCartItemRemovedError() {

    }

    @Override
    public void onCartQuantityUpdated(CartQuantityUpdateResponse cartQuantityUpdateResponse) {
        if(cartView != null){
            cartView.showCartQuantityUpdateMessage(cartQuantityUpdateResponse);
        }
    }

    @Override
    public void onCartQuantityUpdatedError() {

    }
}
