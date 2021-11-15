package com.example.wyswietlaczsegmentowy;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frag2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag2.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag2 newInstance(String param1, String param2) {
        Frag2 fragment = new Frag2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    View viewA;
    View viewB;
    View viewC;
    View viewD;
    View viewE;
    View viewF;
    View viewG;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_frag2, container, false);

        viewA = view.findViewById(R.id.viewA);
        viewB = view.findViewById(R.id.viewB);
        viewC = view.findViewById(R.id.viewC);
        viewD = view.findViewById(R.id.viewD);
        viewE = view.findViewById(R.id.viewE);
        viewF = view.findViewById(R.id.viewF);
        viewG = view.findViewById(R.id.viewG);

        //viewA.setBackgroundResource(R.color.green);

        return view;
    }

    public View getViewA() {
        return viewA;
    }

    public View getViewB() {
        return viewB;
    }

    public View getViewC() {
        return viewC;
    }

    public View getViewD() {
        return viewD;
    }

    public View getViewE() {
        return viewE;
    }

    public View getViewF() {
        return viewF;
    }

    public View getViewG() {
        return viewG;
    }
}