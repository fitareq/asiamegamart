package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.ProductSearchResponse;

public interface ProductSearchInteractor {
    interface CallBack {

        void onProductSearched(ProductSearchResponse productSearchResponse);

        void onProductSearchedError();
    }
}
