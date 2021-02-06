package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Models.Review;
import com.youthfireit.asiamegamart.Presentation.ui.activities.ProductReviewView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.ReviewInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.ReviewInteractorImpl;

import java.util.List;

public class ProductReviewPresenter extends AbstractPresenter implements ReviewInteractor.CallBack {
    private ProductReviewView productReviewView;

    public ProductReviewPresenter(Executor executor, MainThread mainThread, ProductReviewView productReviewView) {
        super(executor, mainThread);
        this.productReviewView = productReviewView;
    }

    public void sendUpdateProfileRequest(String url) {
        new ReviewInteractorImpl(mExecutor, mMainThread, this, url).execute();
    }


    @Override
    public void onReviewLodaded(List<Review> reviews) {
        if (productReviewView != null){
            productReviewView.onReviewsLoaded(reviews);
        }
    }

    @Override
    public void onReviewError() {

    }
}
