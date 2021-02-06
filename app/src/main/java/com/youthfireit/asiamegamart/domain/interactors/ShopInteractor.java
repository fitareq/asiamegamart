package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Shop;

public interface ShopInteractor {
    interface CallBack {

        void onShopLoaded(Shop shop);

        void onShopLoadError();
    }
}
