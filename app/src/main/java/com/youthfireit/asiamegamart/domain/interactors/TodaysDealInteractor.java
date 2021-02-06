package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Product;

import java.util.List;

public interface TodaysDealInteractor {
    interface CallBack {

        void onTodaysDealProductDownloaded(List<Product> products);

        void onTodaysDealProductDownloadError();
    }
}
