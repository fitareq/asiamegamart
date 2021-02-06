package com.youthfireit.asiamegamart.Presentation.ui.activities;

import com.youthfireit.asiamegamart.Models.ShippingAddress;
import com.youthfireit.asiamegamart.Models.User;
import com.youthfireit.asiamegamart.Network.response.ProfileInfoUpdateResponse;
import com.youthfireit.asiamegamart.Network.response.ShippingInfoResponse;

import java.util.List;

public interface AccountInfoView {
    void onProfileInfoUpdated(ProfileInfoUpdateResponse profileInfoUpdateResponse);
    void setShippingAddresses(List<ShippingAddress> shippingAddresses);
    void onShippingInfoCreated(ShippingInfoResponse shippingInfoResponse);
    void onShippingInfoDeleted(ShippingInfoResponse shippingInfoResponse);
    void setUpdatedUserInfo(User user);
}
