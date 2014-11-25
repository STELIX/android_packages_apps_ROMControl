package com.aokp.romcontrol.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.aokp.romcontrol.R;
import com.aokp.romcontrol.settings.BaseSetting.OnSettingChangedListener;
import com.aokp.romcontrol.settings.CheckboxSetting;

public class StatusbarSettingsFragment extends Fragment implements OnSettingChangedListener {

    CheckboxSetting mDoubleTapSleep;

    public StatusbarSettingsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_statusbar_settings, container, false);

        mDoubleTapSleep = (CheckboxSetting) v.findViewById(R.id.double_tap_sleep_gesture);

        return v;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mDoubleTapSleep.setOnSettingChangedListener(this);
    }

    @Override
    public void onSettingChanged(String table, String key, String oldValue, String value) {
    }
}
