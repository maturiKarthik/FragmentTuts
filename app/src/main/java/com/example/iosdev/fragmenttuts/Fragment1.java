package com.example.iosdev.fragmenttuts;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by iosdev on 01/04/2018.
 */

public class Fragment1 extends Fragment  implements View.OnClickListener{

    View view;
    Button frame1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
         // Inflating the VIew
         view = inflater.inflate(R.layout.frame1,container,false);
        // fetching the Buttons using view
         frame1 = (Button)view.findViewById(R.id.frame1_button);

         frame1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.frame1_button:
                Log.d("FRAME_1","THIS IS FRAMGEMTN 1");
                Toast.makeText(getActivity(),"THIS_IS_THE_FRAME_1",Toast.LENGTH_LONG).show();
                AnyAlert anyAlert = new AnyAlert();


                break;

        }
    }
}
