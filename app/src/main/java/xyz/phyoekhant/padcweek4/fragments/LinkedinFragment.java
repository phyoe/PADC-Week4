package xyz.phyoekhant.padcweek4.fragments;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import xyz.phyoekhant.padcweek4.R;
import xyz.phyoekhant.padcweek4.views.ViewItemLinkedIn;

public class LinkedinFragment extends Fragment {

    public LinkedinFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_linkedin, container, false);

        ImageView linkedinSetting = (ImageView) view.findViewById(R.id.linkedin_setting);
        linkedinSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Setting click ...", Toast.LENGTH_SHORT).show();
            }
        });

        FloatingActionButton linkedinFab = (FloatingActionButton) view.findViewById(R.id.linkedin_fab);
        linkedinFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Fab click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imgEdit = (ImageView) view.findViewById(R.id.img_edit);
        imgEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Edit click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imgClose = (ImageView) view.findViewById(R.id.img_close);
        imgClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Close click ...", Toast.LENGTH_SHORT).show();
            }
        });



        return view;
    }
}
