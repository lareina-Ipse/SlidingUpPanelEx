package kr.co.chience.slidinguppanelex.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import kr.co.chience.slidinguppanelex.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class HowFragment extends Fragment {

    List<String> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup view = (ViewGroup) inflater.inflate(R.layout.fragment_how, container, false);
        final ListView listView = view.findViewById(R.id.listView);

        for (int i = 0; i < 100; i++) {
            list.add("item : " + i);
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1, list);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getContext(), list.get(position), Toast.LENGTH_SHORT).show();
            }
        });

        listView.setAdapter(adapter);


        return view;
    }

}
