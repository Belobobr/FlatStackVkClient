package com.flatstack.vkclient.ui.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


import com.flatstack.vkclient.R;
import com.flatstack.vkclient.ui.AbstractFragment;
import com.vk.sdk.VKSdk;

import butterknife.Bind;
import butterknife.OnClick;

public class LoginStumbFragment extends AbstractFragment {

    @Bind(R.id.login)
    Button mLoginButton;

    public static LoginStumbFragment newInstance() {
        LoginStumbFragment loginStumbFragment = new LoginStumbFragment();
        Bundle arguments = new Bundle();
        loginStumbFragment.setArguments(arguments);
        return loginStumbFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.layout_login_stumb, container, false);
    }

    @OnClick(R.id.login)
    public void login() {
        if (!VKSdk.isLoggedIn()) {
            String scope = "friends,video,offline,wall";
            VKSdk.login(getActivity(), scope);
        }
    }

}
