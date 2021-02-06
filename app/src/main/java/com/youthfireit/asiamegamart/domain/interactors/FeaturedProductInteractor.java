package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Product;

import java.util.List;

public interface FeaturedProductInteractor {
    interface CallBack {

        void onFeaturedProductDownloaded(List<Product> products);

        void onFeaturedProductDownloadError();
    }
}
