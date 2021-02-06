package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.ShippingAddress;
import java.util.List;

public interface ShippingInfoInteractor {
    interface CallBack {

        void onShippingInfoRetrived(List<ShippingAddress> shippingAddresses);

        void onShippingInfoRetrivedError();
    }
}
