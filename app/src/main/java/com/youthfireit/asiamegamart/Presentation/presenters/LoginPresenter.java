package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Network.response.AuthResponse;
import com.youthfireit.asiamegamart.Presentation.ui.activities.LoginView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.LoginInteractor;
import com.youthfireit.asiamegamart.domain.interactors.SocialLoginInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.LoginInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.SocialLoginInteractorImpl;

public class LoginPresenter extends AbstractPresenter implements LoginInteractor.CallBack, SocialLoginInteractor.CallBack {

    private LoginView loginView;

    public LoginPresenter(Executor executor, MainThread mainThread, LoginView loginView) {
        super(executor, mainThread);
        this.loginView = loginView;
    }

    public void validLogin(String email, String password) {
        new LoginInteractorImpl(mExecutor, mMainThread, this, email, password).execute();
    }

    public void validSocialLogin(String id, String name, String email) {
        new SocialLoginInteractorImpl(mExecutor, mMainThread, this, id, name, email).execute();
    }

    @Override
    public void onValidLogin(AuthResponse authResponse) {
        if (loginView != null){
            loginView.setLoginResponse(authResponse);
        }
    }

    @Override
    public void onLoginError() {

    }
}
