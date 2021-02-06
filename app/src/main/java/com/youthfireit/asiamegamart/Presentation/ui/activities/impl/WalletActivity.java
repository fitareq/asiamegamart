package com.youthfireit.asiamegamart.Presentation.ui.activities.impl;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.youthfireit.asiamegamart.Models.Wallet;
import com.youthfireit.asiamegamart.Network.response.AuthResponse;
import com.youthfireit.asiamegamart.Presentation.presenters.WalletPresenter;
import com.youthfireit.asiamegamart.Presentation.ui.activities.WalletView;
import com.youthfireit.asiamegamart.Presentation.ui.adapters.WalletHistoryAdapter;
import com.youthfireit.asiamegamart.R;
import com.youthfireit.asiamegamart.Threading.MainThreadImpl;
import com.youthfireit.asiamegamart.Utils.AppConfig;
import com.youthfireit.asiamegamart.Utils.RecyclerViewMargin;
import com.youthfireit.asiamegamart.Utils.UserPrefs;
import com.youthfireit.asiamegamart.domain.executor.impl.ThreadExecutor;

import java.util.List;

public class WalletActivity extends BaseActivity implements WalletView {
    private AuthResponse authResponse;
    private TextView tv_balance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallet);

        initializeActionBar();
        setTitle("My Wallet");
        initviews();

        authResponse = new UserPrefs(getApplicationContext()).getAuthPreferenceObjectJson("auth_response");
        if(authResponse != null && authResponse.getUser() != null){
            new WalletPresenter(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this).getWalletBalance(authResponse.getUser().getId(), authResponse.getAccessToken());
        }
        else {
            //startActivityForResult(new Intent(getActivity(), LoginActivity.class), 100);
            //getActivity().finish();
        }
    }

    private void initviews(){
        tv_balance = findViewById(R.id.balance);
    }

    @Override
    public void setWalletBalance(Double balance) {
        tv_balance.setText(AppConfig.convertPrice(getApplicationContext(), balance));
        new WalletPresenter(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this).getWalletHistory(authResponse.getUser().getId(), authResponse.getAccessToken());
    }

    @Override
    public void setWalletHistory(List<Wallet> walletList) {
        RecyclerView recyclerView = findViewById(R.id.rv_wallet_history);
        LinearLayoutManager horizontalLayoutManager
                = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(horizontalLayoutManager);
        RecyclerViewMargin decoration = new RecyclerViewMargin(AppConfig.convertDpToPx(this,10), 1);
        recyclerView.addItemDecoration(decoration);
        WalletHistoryAdapter adapter = new WalletHistoryAdapter(getApplicationContext(), walletList);
        recyclerView.setAdapter(adapter);
    }
}