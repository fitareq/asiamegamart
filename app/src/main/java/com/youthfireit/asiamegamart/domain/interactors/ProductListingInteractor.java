package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Network.response.ProductListingResponse;

public interface ProductListingInteractor {
    interface CallBack {

        void onProductDownloaded(ProductListingResponse productListingResponse);

        void onProductDownloadError();
    }
}
