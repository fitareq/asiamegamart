package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Product;

import java.util.List;

public interface ProductInteractor {
    interface CallBack {

        void onProductDownloaded(List<Product> products);

        void onProductDownloadError();
    }
}
