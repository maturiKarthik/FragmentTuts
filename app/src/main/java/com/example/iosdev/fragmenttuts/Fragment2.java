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

public class Fragment2 extends Fragment implements View.OnClickListener {

    View view;
    Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.frame2,container,false);

        button = (Button) view.findViewById(R.id.frame2_button);


        button.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.frame2_button:
                Log.d("FRAME_1","THIS IS FRAMGEMTN_2 ");
                Toast.makeText(getActivity(),"THIS_IS_THE_FRAME_2",Toast.LENGTH_LONG).show();
                break;
        }
    }
}





