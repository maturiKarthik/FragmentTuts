package com.example.iosdev.fragmenttuts;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button frame1;
    Button frame2;
    FrameLayout frameLayout;

  android.app.FragmentManager fragmentManager;
   android.app.FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        frame1 = (Button)findViewById(R.id.F_frame);
        frame2 = (Button)findViewById(R.id.S_frame);
        frameLayout=(FrameLayout)findViewById(R.id.frame);

        frame1.setOnClickListener(this);
        frame2.setOnClickListener(this);

        // alerts are always opened from the Activity
        open(new View(this));

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.F_frame:
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame,new Fragment1());

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                break;
            case R.id.S_frame:
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.frame,new Fragment2());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();


                break;
        }

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

       getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.coupons:
                Toast.makeText(this,"CLICK_IN_MENU",Toast.LENGTH_LONG).show();
                break;


        }
        return true;
    }

    // Creating the Alert PopUP
    public void open(View view){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
                alertDialogBuilder.setPositiveButton("yes",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
