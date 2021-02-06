package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.SubCategory;

import java.util.List;

public interface SubSubCategoryInteractor {
    interface CallBack {

        void onSubSubCategoriesDownloaded(List<SubCategory> subCategories);

        void onSubSubCategoriesDownloadError();
    }
}
