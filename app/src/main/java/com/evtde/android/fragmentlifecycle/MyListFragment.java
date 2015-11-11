package com.evtde.android.fragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class MyListFragment extends ListFragment {

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        String[] courseTitles = getResources().getStringArray(R.array.emptyList);
//        String[] courseTitles = getResources().getStringArray(R.array.courseTitles);
        ArrayAdapter<String> courseTitleAdapter =
                new ArrayAdapter<String>(getActivity(),
                        android.R.layout.simple_list_item_activated_1, courseTitles);

        setListAdapter(courseTitleAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_custom_list_layout, container, false);
    }
}
