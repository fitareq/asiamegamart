package com.youthfireit.asiamegamart.domain.interactors;

import com.youthfireit.asiamegamart.Models.PolicyContent;

public interface PolicyInteractor {
    interface CallBack {

        void onPolicyLoaded(PolicyContent policyContent);

        void onPolicyLoadError();
    }
}
