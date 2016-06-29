package xyz.phyoekhant.padcweek4.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.phyoekhant.padcweek4.R;

public class LinkedinFragment extends Fragment {
    public LinkedinFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linkedin, container, false);
        return view;
    }
}
