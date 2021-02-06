package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Category;

import java.util.List;

public interface AllCategoryInteractor {
    interface CallBack {

        void onAllCategoriesDownloaded(List<Category> categories);

        void onAllCategoriesDownloadError();
    }
}
