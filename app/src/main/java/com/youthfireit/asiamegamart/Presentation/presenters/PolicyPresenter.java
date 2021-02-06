package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Models.PolicyContent;
import com.youthfireit.asiamegamart.Presentation.ui.activities.PolicyView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.PolicyInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.PolicyInteractorImpl;

public class PolicyPresenter extends AbstractPresenter implements PolicyInteractor.CallBack {
    private PolicyView policyView;
    private int type = 0;

    public PolicyPresenter(Executor executor, MainThread mainThread, PolicyView policyView) {
        super(executor, mainThread);
        this.policyView = policyView;
    }

    public void getPolicy(String url){
        new PolicyInteractorImpl(mExecutor, mMainThread, this, url).execute();
    }

    @Override
    public void onPolicyLoaded(PolicyContent policyContent) {
        if (policyView != null){
            policyView.onPolicyContentLoaded(policyContent);
        }
    }

    @Override
    public void onPolicyLoadError() {

    }
}
