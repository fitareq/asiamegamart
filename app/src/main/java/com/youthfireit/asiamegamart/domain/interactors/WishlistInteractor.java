package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.WishlistModel;

import java.util.List;

public interface WishlistInteractor {
    interface CallBack {

        void onWishlistLodaded(List<WishlistModel> wishlistModels);

        void onWishlistError();
    }
}
