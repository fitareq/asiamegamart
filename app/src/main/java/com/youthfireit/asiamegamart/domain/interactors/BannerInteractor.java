package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Banner;

import java.util.List;

public interface BannerInteractor {
    interface CallBack {

        void onBannersDownloaded(List<Banner> banners);

        void onBannersDownloadError();
    }
}
