package com.regi.uplabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ItemFragment extends Fragment {

    public ItemFragment() {}

    public static ItemFragment newInstance(String title) {
        ItemFragment fragment = new ItemFragment();

        Bundle args = new Bundle();
        args.putCharSequence("title", title);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        View v = inflater.inflate(R.layout.fragment_input, container, false);

        TextView tv = v.findViewById(R.id.textview);
        tv.setText(getTitle());

        return v;
    }


    public String getTitle() {
        Bundle args = getArguments();
        return args.getCharSequence("title", "NO TITLE FOUND").toString();
    }
}
