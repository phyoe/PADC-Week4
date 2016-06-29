package xyz.phyoekhant.padcweek4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
        return inflater.inflate(R.layout.fragment_job_search, container, false);
    }

}
