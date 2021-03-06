package com.youthfireit.asiamegamart.Presentation.ui.activities.impl;

import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import com.youthfireit.asiamegamart.Models.PolicyContent;
import com.youthfireit.asiamegamart.Presentation.presenters.PolicyPresenter;
import com.youthfireit.asiamegamart.Presentation.ui.activities.PolicyView;
import com.youthfireit.asiamegamart.R;
import com.youthfireit.asiamegamart.Threading.MainThreadImpl;
import com.youthfireit.asiamegamart.domain.executor.impl.ThreadExecutor;

public class PolicyViewActivity extends BaseActivity implements PolicyView {
    private String title, url;
    private TextView policy_content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        title = getIntent().getStringExtra("title");
        url = getIntent().getStringExtra("url");

        initializeActionBar();
        setTitle(title);

        policy_content = findViewById(R.id.policy_content);

        new PolicyPresenter(ThreadExecutor.getInstance(), MainThreadImpl.getInstance(), this).getPolicy(url);
    }

    @Override
    public void onPolicyContentLoaded(PolicyContent policyContent) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            policy_content.setText(Html.fromHtml(policyContent.getContent(), Html.FROM_HTML_MODE_COMPACT));
        } else {
            policy_content.setText(Html.fromHtml(policyContent.getContent()));
        }
    }
}
