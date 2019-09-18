package com.chirpmessenger.Activities;

import android.content.pm.ActivityInfo;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.chirpmessenger.Adapters.WizardAdapter;
import com.chirpmessenger.Fragments.WizardFragment;
import com.chirpmessenger.R;

public class StartActivity extends AppCompatActivity implements WizardFragment.OnFragmentInteractionListener{

    public static ViewPager viewPager;

    private Button btnStartChirping, btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setContentView(R.layout.activity_start);

        ((TextView) findViewById(R.id.tvLogo)).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Bigdey.ttf"));

        viewPager = (ViewPager) findViewById(R.id.wizardViewPager);
        viewPager.setAdapter(new WizardAdapter(getSupportFragmentManager()));
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

}
