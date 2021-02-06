package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Brand;

import java.util.List;

public interface BrandInteractor {
    interface CallBack {

        void onBrandsDownloaded(List<Brand> brands);

        void onBrandsDownloadError();
    }
}
