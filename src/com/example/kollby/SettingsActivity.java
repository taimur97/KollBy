//TODO  

package com.example.kollby;

import com.example.kollby.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class SettingsActivity extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pref);
		addPreferencesFromResource(R.xml.pref);
	}

}
