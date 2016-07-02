package xyz.phyoekhant.padcweek4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import xyz.phyoekhant.padcweek4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class JobSearchFragment extends Fragment {


    public JobSearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_job_search, container, false);

        Button btnJobSearchNew = (Button) view.findViewById(R.id.btn_job_search_new);
        btnJobSearchNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "New button click ...", Toast.LENGTH_SHORT).show();
            }
        });
        return view;

    }

}
