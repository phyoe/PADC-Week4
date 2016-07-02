package xyz.phyoekhant.padcweek4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import xyz.phyoekhant.padcweek4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YoteShinFragment extends Fragment {


    public YoteShinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_yote_shin, container, false);

        Button btnYoteshinDetails = (Button) view.findViewById(R.id.btn_yoteshin_details);
        btnYoteshinDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Details click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btnYoteshinShare = (ImageButton) view.findViewById(R.id.btn_yoteshin_share);
        btnYoteshinShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Share click ...", Toast.LENGTH_SHORT).show();
            }
        });

        TextView tvReadMore = (TextView) view.findViewById(R.id.tv_read_more);
        tvReadMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Read More click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btnMovieCallPlanet = (ImageButton) view.findViewById(R.id.btn_movie_call_planet);
        btnMovieCallPlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Planet Call Click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btnMovieSharePlanet = (ImageButton) view.findViewById(R.id.btn_movie_share_planet);
        btnMovieSharePlanet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Planet Share click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btnMovieCallMingalar = (ImageButton) view.findViewById(R.id.btn_movie_call_mingalar);
        btnMovieCallMingalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Mingalar Call click ...", Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton btnMovieShareMingalar = (ImageButton) view.findViewById(R.id.btn_movie_share_mingalar);
        btnMovieShareMingalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Mingalar Share click ...", Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
