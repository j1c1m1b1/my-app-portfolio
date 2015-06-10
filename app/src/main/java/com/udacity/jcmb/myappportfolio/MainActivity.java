package com.udacity.jcmb.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * @author Julio Mendoza
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = "This button will launch ";
                text += ((Button)view).getText().toString();
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_LONG).show();
            }
        };

        Button btnSpotify = (Button)findViewById(R.id.btnSpotify);
        btnSpotify.setOnClickListener(listener);

        Button btnScore = (Button)findViewById(R.id.btnScore);
        btnScore.setOnClickListener(listener);

        Button btnBuild = (Button)findViewById(R.id.btnBuild);
        btnBuild.setOnClickListener(listener);

        Button btnXyz = (Button)findViewById(R.id.btnXyz);
        btnXyz.setOnClickListener(listener);

        Button btnCapstone = (Button)findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(listener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
