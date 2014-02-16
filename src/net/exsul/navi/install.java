package net.exsul.navi;

import android.app.Activity;
import android.content.Context;
import android.location.LocationManager;
import android.os.Bundle;
import net.exsul.navi.location.manager;

public class install extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        manager m = new manager(this);
    }
}
