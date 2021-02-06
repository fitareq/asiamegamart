package com.youthfireit.asiamegamart.Presentation.ui.fragments;

import com.youthfireit.asiamegamart.Models.AuctionProduct;
import com.youthfireit.asiamegamart.Models.Banner;
import com.youthfireit.asiamegamart.Models.Brand;
import com.youthfireit.asiamegamart.Models.Category;
import com.youthfireit.asiamegamart.Models.FlashDeal;
import com.youthfireit.asiamegamart.Models.Product;
import com.youthfireit.asiamegamart.Models.SliderImage;
import com.youthfireit.asiamegamart.Network.response.AppSettingsResponse;
import com.youthfireit.asiamegamart.Network.response.AuctionBidResponse;

import java.util.List;

public interface HomeView {
    void onAppSettingsLoaded(AppSettingsResponse appSettingsResponse);

    void setSliderImages(List<SliderImage> sliderImages);

    void setHomeCategories(List<Category> categories);

    void setTodaysDeal(List<Product> products);

    void setFlashDeal(FlashDeal flashDeal);

    void setBanners(List<Banner> banners);

    void setBestSelling(List<Product> products);

    void setFeaturedProducts(List<Product> products);

    void setTopCategories(List<Category> categories);

    void setPopularBrands(List<Brand> brands);

    void setAuctionProducts(List<AuctionProduct> auctionProducts);

    void onAuctionBidSubmitted(AuctionBidResponse auctionBidResponse);
}