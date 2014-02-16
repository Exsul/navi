package net.exsul.navi.location;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by deanonym on 2/16/14.
 */
public class listener implements LocationListener {
    public void onLocationChanged(Location location) {
        // Called when a new location is found by the network location provider.
    }

    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    public void onProviderEnabled(String provider) {

    }

    public void onProviderDisabled(String provider) {

    }
}
