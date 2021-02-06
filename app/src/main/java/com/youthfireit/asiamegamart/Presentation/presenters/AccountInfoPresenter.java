package com.youthfireit.asiamegamart.Presentation.presenters;

import com.youthfireit.asiamegamart.Models.ShippingAddress;
import com.youthfireit.asiamegamart.Models.User;
import com.youthfireit.asiamegamart.Network.response.ProfileInfoUpdateResponse;
import com.youthfireit.asiamegamart.Network.response.ShippingInfoResponse;
import com.youthfireit.asiamegamart.Presentation.ui.activities.AccountInfoView;
import com.youthfireit.asiamegamart.domain.executor.Executor;
import com.youthfireit.asiamegamart.domain.executor.MainThread;
import com.youthfireit.asiamegamart.domain.interactors.ProfileInfoUpdateInteractor;
import com.youthfireit.asiamegamart.domain.interactors.ShippingInfoDeleteInteractor;
import com.youthfireit.asiamegamart.domain.interactors.ShippingInfoInteractor;
import com.youthfireit.asiamegamart.domain.interactors.ShippingInfoCreateInteractor;
import com.youthfireit.asiamegamart.domain.interactors.UserInfoInteractor;
import com.youthfireit.asiamegamart.domain.interactors.impl.ProfileInfoUpdateInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.ShippingInfoDeleteInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.ShippingInfoInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.ShippingInfoCreateInteractorImpl;
import com.youthfireit.asiamegamart.domain.interactors.impl.UserInfoInteractorImpl;
import com.google.gson.JsonObject;

import java.util.List;

public class AccountInfoPresenter extends AbstractPresenter implements ProfileInfoUpdateInteractor.CallBack, ShippingInfoCreateInteractor.CallBack, UserInfoInteractor.CallBack, ShippingInfoInteractor.CallBack, ShippingInfoDeleteInteractor.CallBack {
    private AccountInfoView accountInfoView;

    public AccountInfoPresenter(Executor executor, MainThread mainThread, AccountInfoView accountInfoView) {
        super(executor, mainThread);
        this.accountInfoView = accountInfoView;
    }

    public void sendUpdateProfileRequest(JsonObject jsonObject, String token) {
        new ProfileInfoUpdateInteractorImpl(mExecutor, mMainThread, this, jsonObject, token).execute();
    }

    public void getShippingAddresses(int user_id, String token) {
        new ShippingInfoInteractorImpl(mExecutor, mMainThread, this, user_id, token).execute();
    }

    public void addNewShippingRequest(JsonObject jsonObject, String token) {
        new ShippingInfoCreateInteractorImpl(mExecutor, mMainThread, this, jsonObject, token).execute();
    }

    public void deleteShippingAddress(int address_id, String token) {
        new ShippingInfoDeleteInteractorImpl(mExecutor, mMainThread, this, address_id, token).execute();
    }

    public void getUpdatedUserInfo(int user_id, String token) {
        new UserInfoInteractorImpl(mExecutor, mMainThread, this, user_id, token).execute();
    }

    @Override
    public void onProfileInfoUpdated(ProfileInfoUpdateResponse profileInfoUpdateResponse) {
        if (accountInfoView != null){
            accountInfoView.onProfileInfoUpdated(profileInfoUpdateResponse);
        }
    }

    @Override
    public void onProfileInfoUpdatedError() {

    }

    @Override
    public void onShippingInfoCreated(ShippingInfoResponse shippingInfoResponse) {
        if (accountInfoView != null){
            accountInfoView.onShippingInfoCreated(shippingInfoResponse);
        }
    }

    @Override
    public void onShippingInfoCreateError() {

    }

    @Override
    public void onUserInfoLodaded(User user) {
        if (accountInfoView != null){
            accountInfoView.setUpdatedUserInfo(user);
        }
    }

    @Override
    public void onUserInfoError() {

    }

    @Override
    public void onShippingInfoRetrived(List<ShippingAddress> shippingAddresses) {
        if (accountInfoView != null){
            accountInfoView.setShippingAddresses(shippingAddresses);
        }
    }

    @Override
    public void onShippingInfoRetrivedError() {

    }

    @Override
    public void onShippingInfoDeleted(ShippingInfoResponse shippingInfoResponse) {
        if (accountInfoView != null){
            accountInfoView.onShippingInfoDeleted(shippingInfoResponse);
        }
    }

    @Override
    public void onShippingInfoDeleteError() {

    }
}
