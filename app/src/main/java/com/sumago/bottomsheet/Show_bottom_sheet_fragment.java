package com.sumago.bottomsheet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;


public class Show_bottom_sheet_fragment extends Fragment {

    Button btn_open_fragment;

    public Show_bottom_sheet_fragment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view =inflater.inflate(R.layout.fragment_show_bottom_sheet_fragment, container, false);


        btn_open_fragment = view.findViewById(R.id.btn_open_fragment);

        btn_open_fragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



//                Fragment_bottom_sheet fragment_bottom_sheet = new Fragment_bottom_sheet();
//                fragment_bottom_sheet.show(getSupportFragmentManager(), fragment_bottom_sheet.getTag());

//                BottomSheetDialogFragment myBottomSheet = Fragment_bottom_sheet.newInstance(SendString);
//                myBottomSheet.show(getFragmentManager(),myBottomSheet.getTag());

                BottomSheetDialogFragment bottomSheetFragment = new Fragment_bottom_sheet();
                bottomSheetFragment.show(getFragmentManager(), bottomSheetFragment.getTag());

            }
        });





        return  view;

    }
}