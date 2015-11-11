package com.evtde.android.fragmentlifecycle;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class MyDialogFragment extends DialogFragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View theView = inflater.inflate(R.layout.dialog_fragment, container, false);

        View yesButton = theView.findViewById(R.id.button_yes);
        yesButton.setOnClickListener(this);
        yesButton.requestFocus();

        View noButton = theView.findViewById(R.id.button_no);
        noButton.setOnClickListener(this);

        return theView;
    }

    @Override
    public void onClick(View v) {
        int viewId = getView().getId();
        switch (viewId) {
            case R.id.button_yes:
                break;
            case R.id.button_no:
                break;
        }

        dismiss();
    }
}
