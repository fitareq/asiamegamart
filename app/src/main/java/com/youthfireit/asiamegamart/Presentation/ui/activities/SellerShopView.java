package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.Product;
import com.youthfireit.asiamegamart.Models.Shop;

import java.util.List;

public interface SellerShopView {
    void onShopDetailsLoaded(Shop shop);
    void setFeaturedProducts(List<Product> products);
    void setTopSellingProducts(List<Product> products);
    void setNewProducts(List<Product> products);
}
