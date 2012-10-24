package roeCoders.ourProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySplash extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    public void startActivityMenu(View view) {
        Intent intent = new Intent(this, ActivityMenu.class);
        startActivity(intent);
    }
}
