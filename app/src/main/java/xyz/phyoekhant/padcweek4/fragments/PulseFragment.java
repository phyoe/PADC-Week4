package xyz.phyoekhant.padcweek4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import xyz.phyoekhant.padcweek4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PulseFragment extends Fragment {


    public PulseFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pulse, container, false);

        ImageView pulseTouch = (ImageView) view.findViewById(R.id.pulse_touch);
        pulseTouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Pulse touch click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView pulsePerson = (ImageView) view.findViewById(R.id.pulse_person);
        pulsePerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Person click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView pulseSearch = (ImageView) view.findViewById(R.id.pulse_search);
        pulseSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Search click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView pulseSetting = (ImageView) view.findViewById(R.id.pulse_setting);
        pulseSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Setting click ...", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
