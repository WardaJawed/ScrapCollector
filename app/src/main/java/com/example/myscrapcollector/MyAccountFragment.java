package com.example.myscrapcollector;

import static android.content.Context.MODE_PRIVATE;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MyAccountFragment extends Fragment {
    SharedPreferences sharedPreferences;
    TextView txtname,txtpass;
    private static final String SHARED_PREF_NAME ="mypref";
    private static final String KEY_NAME ="name";
    private static final String KEY_PASS ="pass";

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MyAccountFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MyAccountFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MyAccountFragment newInstance(String param1, String param2) {
        MyAccountFragment fragment = new MyAccountFragment();
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



        @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_user_appoint, container, false);
            txtname = view.findViewById(R.id.name);
            txtpass = view.findViewById(R.id.sharepass);

//===================================================================================SharedPreferences
            sharedPreferences = getActivity().getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
            String NAME = sharedPreferences.getString(KEY_NAME,null);
            String PASS = sharedPreferences.getString(KEY_PASS,null);


            if(NAME !=null && PASS !=null)
            {
                txtname.setText("Name : "+NAME );
                txtname.setText("Name : "+NAME );

            }

//        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.Myacc, null);
//        TextView txtname = (TextView) root.findViewById(R.id.name);

//        return root;
            return view;

    }
}