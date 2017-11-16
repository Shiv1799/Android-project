package website.copyandpaste.bottombarnavigationwithnavigationdrawer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by root on 11/12/17.
 */

public class hostel_campus_pageAdapter extends FragmentStatePagerAdapter {
    int mNoOfTabs;
    public hostel_campus_pageAdapter(FragmentManager fm,int NumberOfTabs){
        super(fm);
        this.mNoOfTabs=NumberOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                hostel tab1 = new hostel();
                return tab1;

            case 1:
                hostel3 tab2 = new hostel3();
                return tab2;

            case 2:
                hostel4 tab3 = new hostel4();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
