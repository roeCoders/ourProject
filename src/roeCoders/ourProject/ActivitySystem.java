package roeCoders.ourProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySystem extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system);
    }

    public void startActivityObserve(View view) {
        Intent intent = new Intent(this, ActivityObserve.class);
        startActivity(intent);
    }
}
