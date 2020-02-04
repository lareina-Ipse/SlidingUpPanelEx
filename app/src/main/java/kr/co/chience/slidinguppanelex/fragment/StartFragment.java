package kr.co.chience.slidinguppanelex.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Switch;

import kr.co.chience.slidinguppanelex.R;
import kr.co.chience.slidinguppanelex.StartActivity;


/**
 * A simple {@link Fragment} subclass.
 */
public class StartFragment extends Fragment {

    Button start;

    public StartFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_start, container, false);
        start = view.findViewById(R.id.start);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), StartActivity.class));
            }
        });
        return view;
    }

}
