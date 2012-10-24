package roeCoders.ourProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityLoad extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_load);
    }

    public void startActivitySystem(View view) {
        Intent intent = new Intent(this, ActivitySystem.class);
        startActivity(intent);
    }
}
