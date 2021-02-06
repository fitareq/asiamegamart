package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Network.response.RegistrationResponse;
import com.youthfireit.asiamegamart.Presentation.ui.activities.RegisterView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.RegisterInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.RegisterInteractorImpl;
import com.google.gson.JsonObject;

public class RegisterPresenter extends AbstractPresenter implements RegisterInteractor.CallBack {

    private RegisterView registerView;

    public RegisterPresenter(Executor executor, MainThread mainThread, RegisterView registerView) {
        super(executor, mainThread);
        this.registerView = registerView;
    }

    public void validateRegistration(JsonObject jsonObject) {
        new RegisterInteractorImpl(mExecutor, mMainThread, this, jsonObject).execute();
    }

    @Override
    public void onRegistrationDone(RegistrationResponse registrationResponse) {
        if (registerView != null){
            registerView.setRegistrationResponse(registrationResponse);
        }
    }

    @Override
    public void onRegistrationError() {

    }
}
