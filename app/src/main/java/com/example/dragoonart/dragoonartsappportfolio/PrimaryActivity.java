package com.example.dragoonart.dragoonartsappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PrimaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primary);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_primary, menu);
        return true;
    }

    /** Called when the user touches the button */
    public void goBuild(View view) {
        createToast(view);
    }

    /** Called when the user touches the button */
    public void goXYZ(View view) {
        createToast(view);
    }


    /** Called when the user touches the button */
    public void goSPOTIFY(View view) {
        createToast(view);
    }
    /** Called when the user touches the button */
    public void goScores(View view) {
        createToast(view);
    }

    /** Called when the user touches the button */
    public void goLibrary(View view) {
        createToast(view);
    }

    private Toast toast = null;

    private void createToast(View view) {
        String text = ((Button)view).getText().toString();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        if(toast !=null) {
            //cancel existing toast if there is one
            toast.cancel();
        }
        toast = Toast.makeText(context, text, duration);
        toast.show();


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
