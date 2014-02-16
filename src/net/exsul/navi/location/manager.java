package net.exsul.navi.location;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;

/**
 * Created by deanonym on 2/16/14.
 */
public class manager {
    private LocationManager manager;
    private listener listener;

    public manager( Activity current_activity )
    {
        manager = (LocationManager)current_activity.getSystemService(Context.LOCATION_SERVICE);
        listener = new listener();
        manager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, listener);
    }
}
