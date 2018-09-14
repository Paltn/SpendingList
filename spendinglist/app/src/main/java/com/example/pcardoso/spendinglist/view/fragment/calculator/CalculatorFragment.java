package com.example.pcardoso.spendinglist.view.fragment.calculator;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.pcardoso.spendinglist.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorFragment extends Fragment {


    public CalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_calculator, container, false);

        ImageButton imagewater = (ImageButton) view.findViewById(R.id.imagewater);
        ImageButton imagecar = (ImageButton) view.findViewById(R.id.imagecar);
        ImageButton imageelec = (ImageButton) view.findViewById(R.id.imageelectr);
        ImageButton imageweb = (ImageButton) view.findViewById(R.id.imageweb);
        ImageButton imagehome = (ImageButton) view.findViewById(R.id.imagehome);
        ImageButton imagemobile = (ImageButton) view.findViewById(R.id.imagemobile);
        ImageButton imagesalary = (ImageButton) view.findViewById(R.id.imagesalary);



        // Inflate the layout for this fragment
        imagewater.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new WaterFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        imagecar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new CarFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });


        imageelec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new ElectricityFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        imageweb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new WebFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        imagehome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new HomeFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });

        imagemobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new MobileFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });
        imagesalary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.setCustomAnimations(R.anim.enter_from_right, R.anim.exit_to_left, R.anim.enter_from_left, R.anim.exit_to_right);
                fr.replace(R.id.frmlt, new SalaryFragment());
                fr.addToBackStack(null);
                fr.commit();
            }
        });



        return view;
    }

}
