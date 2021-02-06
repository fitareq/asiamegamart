package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.Product;
import com.youthfireit.asiamegamart.Models.ProductDetails;
import com.youthfireit.asiamegamart.Network.response.AddToCartResponse;
import com.youthfireit.asiamegamart.Network.response.AddToWishlistResponse;
import com.youthfireit.asiamegamart.Network.response.CheckWishlistResponse;
import com.youthfireit.asiamegamart.Network.response.RemoveWishlistResponse;

import java.util.List;

public interface ProductDetailsView {
    void setProductDetails(ProductDetails productDetails);
    void setRelatedProducts(List<Product> relatedProducts);
    void setTopSellingProducts(List<Product> topSellingProducts);
    void setAddToCartMessage(AddToCartResponse addToCartResponse);
    void setAddToWishlistMessage(AddToWishlistResponse addToWishlistMessage);
    void onCheckWishlist(CheckWishlistResponse checkWishlistResponse);
    void onRemoveFromWishlist(RemoveWishlistResponse removeWishlistResponse);
}
