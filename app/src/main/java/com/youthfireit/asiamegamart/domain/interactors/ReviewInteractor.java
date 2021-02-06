package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.Review;

import java.util.List;

public interface ReviewInteractor {
    interface CallBack {

        void onReviewLodaded(List<Review> reviews);

        void onReviewError();
    }
}
