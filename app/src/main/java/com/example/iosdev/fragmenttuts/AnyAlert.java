package com.example.iosdev.fragmenttuts;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Toast;

/**
 * Created by iosdev on 01/04/2018.
 */

public class AnyAlert extends Application {





    // Creating the Alert PopUP
    public void openAlert(View view){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage("Are you sure, You wanted to make decision");
        alertDialogBuilder.setPositiveButton("yes",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        Toast.makeText(getApplicationContext(),"You clicked yes button",Toast.LENGTH_LONG).show();
                    }
                });

        alertDialogBuilder.setNegativeButton("No",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //finish();
            }
        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
