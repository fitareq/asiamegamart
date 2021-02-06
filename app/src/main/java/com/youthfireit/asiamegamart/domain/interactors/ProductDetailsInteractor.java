package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.ProductDetails;

public interface ProductDetailsInteractor {
    interface CallBack {

        void onProductDetailsDownloaded(ProductDetails productDetails);

        void onProductDetailsDownloadError();
    }
}
