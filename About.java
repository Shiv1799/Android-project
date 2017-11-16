package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by root on 11/9/17.
 */

public class About extends AppCompatActivity implements About_Fragment1.OnFragmentInteractionListener,About_Fragment2.OnFragmentInteractionListener,About_fragment3.OnFragmentInteractionListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_about);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayout4);
        tabLayout.addTab(tabLayout.newTab().setText("Director's Desk"));
        tabLayout.addTab(tabLayout.newTab().setText("About The Management"));
        tabLayout.addTab(tabLayout.newTab().setText("Mission And Vision"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager4);
        final About_pageAdapter3 adapter = new About_pageAdapter3(getSupportFragmentManager(), tabLayout.getTabCount());
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
