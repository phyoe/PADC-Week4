package xyz.phyoekhant.padcweek4.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import xyz.phyoekhant.padcweek4.R;
import xyz.phyoekhant.padcweek4.views.ViewItemLinkedIn;

public class LinkedinFragment extends Fragment {

    public LinkedinFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linkedin, container, false);
        ImageView imgLinkedinUser = (ImageView) view.findViewById(R.id.img_linkedin_user);
        imgLinkedinUser.bringToFront();
        return view;
    }
}
