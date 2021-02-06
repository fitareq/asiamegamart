package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.SliderImage;

import java.util.List;

public interface SliderInteractor {

    interface CallBack {

        void onSliderDownloaded(List<SliderImage> sliderImages);

        void onSliderDownloadError();
    }
}
