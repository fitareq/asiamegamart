package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.CartModel;

import java.util.List;

public interface CartInteractor {
    interface CallBack {

        void onCartLodaded(List<CartModel> cartModel);

        void onCartError();
    }
}
