package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Category;

import java.util.List;

public interface HomeCategoriesInteractor {
    interface CallBack {

        void onHomeCategoriesDownloaded(List<Category> categories);

        void onHomeCategoriesDownloadError();
    }
}
