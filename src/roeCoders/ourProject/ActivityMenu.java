package roeCoders.ourProject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class ActivityMenu extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }

    public void startActivitySystem(View view) {
        Intent intent = new Intent(this, ActivitySystem.class);
        startActivity(intent);
    }

    public void startActivityLoad(View view) {
        Intent intent = new Intent(this, ActivityLoad.class);
        startActivity(intent);
    }

}

