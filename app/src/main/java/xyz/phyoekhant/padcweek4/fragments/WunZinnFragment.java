package xyz.phyoekhant.padcweek4.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import xyz.phyoekhant.padcweek4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WunZinnFragment extends Fragment {


    public WunZinnFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wun_zinn, container, false);

        Button btnWunzinnBuy = (Button) view.findViewById(R.id.btn_wunzinn_buy);
        btnWunzinnBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Buy click ...", Toast.LENGTH_SHORT).show();
            }
        });

        Button btnWunzinnSample = (Button) view.findViewById(R.id.btn_wunzinn_sample);
        btnWunzinnSample.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Sample click ...", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
