package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Product;

import java.util.List;

public interface BestSellingInteractor {
    interface CallBack {

        void onBestSellingProductDownloaded(List<Product> products);

        void onBestSellingProductDownloadError();
    }
}
