package com.youthfireit.asiamegamart.Presentation.ui.listeners;

import com.youthfireit.asiamegamart.Models.CartModel;

public interface CartItemListener {
    void onCartRemove(CartModel cartModel);
    void onQuantityUpdate(int quantity, CartModel cartModel);
}
