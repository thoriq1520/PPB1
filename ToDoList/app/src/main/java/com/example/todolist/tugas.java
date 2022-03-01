package com.example.todolist;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link tugas#newInstance} factory method to
 * create an instance of this fragment.
 */
public class tugas extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button button;
    private ArrayList<String> items;
    private ArrayAdapter<String> itemsAdapter;
    private ListView listView;


    public tugas() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment tugas.
     */
    // TODO: Rename and change types and number of parameters
    public static tugas newInstance(String param1, String param2) {
        tugas fragment = new tugas();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

//    private void addItem(View view) {
//        EditText input = findViewById(R.id.editText);
//        String itemText = input.getText().toString();
//
//        if(!(itemText.equals(""))){
//            itemsAdapter.add(itemText);
//            input.setText("");
//        }
//        else {
//            Toast.makeText(getActivity(), "Please enter text...", Toast.LENGTH_SHORT).show();
//        }
//    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        listView = findViewById(R.id.listView);
//        button = findViewById(R.id.button);
//        button.OnClickListener(new View.OnClickListener(){
//            @Override
//                    public void onClick(View view) { addItem(view); }
//        });
//        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);



        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tugas, container, false);
    }
}