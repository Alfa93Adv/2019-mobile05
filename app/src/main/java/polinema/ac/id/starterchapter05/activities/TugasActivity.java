package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;
import polinema.ac.id.starterchapter05.fragments.RedFragment;

public class TugasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas);
    }

    public void handlerClickPushupFragments(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        PushupFragment pushupFragment = (PushupFragment) getSupportFragmentManager().findFragmentByTag("_PUSHUP_FRAGMENT");
        if(pushupFragment != null && pushupFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tugas_Placeholder, new PushupFragment(), "PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }

    }

    public void handlerClickDipsFragments(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        DipsFragment dipsFragment = (DipsFragment) getSupportFragmentManager().findFragmentByTag("_DIPS_FRAGMENT");
        if(dipsFragment != null && dipsFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tugas_Placeholder, new DipsFragment(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickHandstandFragments(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        HandstandFragment handstandFragment = (HandstandFragment) getSupportFragmentManager().findFragmentByTag("HANDSTAND_FRAGMENT");
        if(handstandFragment != null && handstandFragment.isVisible()){
            fragmentTransaction.commit();
        }else {
            fragmentTransaction.setCustomAnimations(R.anim.exit_from_right, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.tugas_Placeholder, new HandstandFragment(), "HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

}
