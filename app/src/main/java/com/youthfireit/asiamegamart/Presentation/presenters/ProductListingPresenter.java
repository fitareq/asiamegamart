package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Network.response.ProductListingResponse;
import com.youthfireit.asiamegamart.Presentation.ui.activities.ProductListingView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.ProductListingInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.ProductListingInteractorImpl;

public class ProductListingPresenter extends AbstractPresenter implements ProductListingInteractor.CallBack {
    private ProductListingView productListingView;

    public ProductListingPresenter(Executor executor, MainThread mainThread, ProductListingView productListingView) {
        super(executor, mainThread);
        this.productListingView = productListingView;
    }

    public void getProducts(String url) {
        new ProductListingInteractorImpl(mExecutor, mMainThread, this, url).execute();
    }


    @Override
    public void onProductDownloaded(ProductListingResponse productListingResponse) {
        if (productListingView != null){
            productListingView.setProducts(productListingResponse);
        }
    }

    @Override
    public void onProductDownloadError() {

    }
}
