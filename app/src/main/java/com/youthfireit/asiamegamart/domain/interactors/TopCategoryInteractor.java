package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Category;

import java.util.List;

public interface TopCategoryInteractor {
    interface CallBack {

        void onTopCategoriesDownloaded(List<Category> categories);

        void onTopCategoriesDownloadError();
    }
}
