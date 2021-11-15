package com.example.wyswietlaczsegmentowy;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Frag1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Frag1 extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    Frag2 frag2 = new Frag2();

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Frag1() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Frag1.
     */
    // TODO: Rename and change types and number of parameters
    public static Frag1 newInstance(String param1, String param2) {
        Frag1 fragment = new Frag1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonF;
    Button buttonG;

    EditText editTextA;
    EditText editTextB;
    EditText editTextC;
    EditText editTextD;
    EditText editTextE;
    EditText editTextF;
    EditText editTextG;

    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frag2, frag2);
        fragmentTransaction.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag1, container, false);

        buttonA = view.findViewById(R.id.buttonA);
        buttonB = view.findViewById(R.id.buttonB);
        buttonC = view.findViewById(R.id.buttonC);
        buttonD = view.findViewById(R.id.buttonD);
        buttonE = view.findViewById(R.id.buttonE);
        buttonF = view.findViewById(R.id.buttonF);
        buttonG = view.findViewById(R.id.buttonG);

        editTextA = view.findViewById(R.id.editTextA);
        editTextB = view.findViewById(R.id.editTextB);
        editTextC = view.findViewById(R.id.editTextC);
        editTextD = view.findViewById(R.id.editTextD);
        editTextE = view.findViewById(R.id.editTextE);
        editTextF = view.findViewById(R.id.editTextF);
        editTextG = view.findViewById(R.id.editTextG);

        buttonA.setOnClickListener(this);
        buttonB.setOnClickListener(this);
        buttonC.setOnClickListener(this);
        buttonD.setOnClickListener(this);
        buttonE.setOnClickListener(this);
        buttonF.setOnClickListener(this);
        buttonG.setOnClickListener(this);

        return view;
    }


        @Override
    public void onClick(View v) {
        View viewA = this.frag2.getViewA();
        View viewB = this.frag2.getViewB();
        View viewC = this.frag2.getViewC();
        View viewD = this.frag2.getViewD();
        View viewE = this.frag2.getViewE();
        View viewF = this.frag2.getViewF();
        View viewG = this.frag2.getViewG();

        switch (v.getId()) {
            case R.id.buttonA:
                a = editTextA.getText().toString();
                a = a.replaceAll("\\s+","");
                System.out.println(a);
                if (a.contains("(b*d')") && a.contains("(a*d'*c)") && a.contains("(b*d*c')") && a.contains("(a'*b'*c)"))
                {
                    viewA.setBackgroundResource(R.color.green);
                    System.out.println("Idiota");
                } else {
                    viewA.setBackgroundResource(R.color.black);
                }

                break;
            case R.id.buttonB:
                b = editTextB.getText().toString();
                b = b.replaceAll("\\s+", "");
                if (b.contains("(d'*c')") && b.contains("(b'*c')") && b.contains("(b'*a'*d)") && b.contains("(d'*b*a)"))
                {
                    viewB.setBackgroundResource(R.color.green);
                } else {
                    viewB.setBackgroundResource(R.color.black);
                }
                break;
            case R.id.buttonC:
                c = editTextC.getText().toString();
                c = c.replaceAll("\\s+", "");
                if (c.contains("(d'*c)") && c.contains("(c'*b')") && c.contains("(b'*d')"))
                {
                    viewC.setBackgroundResource(R.color.green);
                } else {
                    viewC.setBackgroundResource(R.color.black);
                }
                break;
            case R.id.buttonD:
                d = editTextD.getText().toString();
                d = d.replaceAll("\\s+", "");
                if (d.contains("(b'*a'*c')") && d.contains("(b*d*c)") && d.contains("(b'*d*c')") && d.contains("(b*d'*c')")) {
                    viewD.setBackgroundResource(R.color.green);
                } else {
                    viewD.setBackgroundResource(R.color.black);
                }
                break;
            case R.id.buttonE:
                e = editTextE.getText().toString();
                e = e.replaceAll("\\s+", "");
                if (e.contains("(c'*b'*a')") && e.contains("(d'*b*a')")) {
                    viewE.setBackgroundResource(R.color.green);
                } else {
                    viewE.setBackgroundResource(R.color.black);
                }
                break;
            case R.id.buttonF:
                f = editTextF.getText().toString();
                f = f.replaceAll("\\s+", "");
                if (f.contains("(c'*b'*a')") && f.contains("(c*b'*d')") && f.contains("(d*c'*b')") && f.contains("(d'*c*a')")) {
                    viewF.setBackgroundResource(R.color.green);
                } else {
                    viewF.setBackgroundResource(R.color.black);
                }
                break;
            case R.id.buttonG:
                g = editTextG.getText().toString();
                g = g.replaceAll("\\s+", "");
                if (g.contains("(d'*c*b')") && g.contains("(d'*c*a')") && g.contains("(b*d'*c')")) {
                    viewG.setBackgroundResource(R.color.green);
                } else {
                    viewG.setBackgroundResource(R.color.black);
                }
                break;

        }
    }
}