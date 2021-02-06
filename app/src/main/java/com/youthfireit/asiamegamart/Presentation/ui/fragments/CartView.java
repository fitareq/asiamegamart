package com.youthfireit.asiamegamart.Presentation.ui.fragments;

import com.youthfireit.asiamegamart.Models.CartModel;
import com.youthfireit.asiamegamart.Network.response.CartQuantityUpdateResponse;
import com.youthfireit.asiamegamart.Network.response.RemoveCartResponse;

import java.util.List;

public interface CartView {
    void setCartItems(List<CartModel> cartItems);
    void showRemoveCartMessage(RemoveCartResponse removeCartResponse);
    void showCartQuantityUpdateMessage(CartQuantityUpdateResponse cartQuantityUpdateResponse);
}
