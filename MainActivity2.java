package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;
import android.widget.Toolbar;

/**
 * Created by root on 11/12/17.
 */

public class MainActivity2 extends AppCompatActivity implements Fragment1.OnFragmentInteractionListener,Fragment2.OnFragmentInteractionListener,Fragment3.OnFragmentInteractionListener,Fragment4.OnFragmentInteractionListener,Fragment5.OnFragmentInteractionListener,Fragment6.OnFragmentInteractionListener,Fragment7.OnFragmentInteractionListener,Fragment8.OnFragmentInteractionListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.addTab(tabLayout.newTab().setText("AS"));
        tabLayout.addTab(tabLayout.newTab().setText("CSE"));
        tabLayout.addTab(tabLayout.newTab().setText("ECE"));
        tabLayout.addTab(tabLayout.newTab().setText("EEE"));
        tabLayout.addTab(tabLayout.newTab().setText("IT"));
        tabLayout.addTab(tabLayout.newTab().setText("ME"));
        tabLayout.addTab(tabLayout.newTab().setText("Civil"));
        tabLayout.addTab(tabLayout.newTab().setText("Humanities"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
