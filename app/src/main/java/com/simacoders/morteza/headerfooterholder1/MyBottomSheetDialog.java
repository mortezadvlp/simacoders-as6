package com.simacoders.morteza.headerfooterholder1;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class MyBottomSheetDialog extends BottomSheetDialogFragment {

    MyBottomDialogListener mListener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.mydialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttonCapture = view.findViewById(R.id.buttonCapture);
        Button buttonGallery = view.findViewById(R.id.buttonGallery);
        buttonCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.changeText("Capture selected.");
                dismiss();
            }
        });
        buttonGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mListener.changeText("Gallery selected.");
                dismiss();
            }
        });
    }

    public interface MyBottomDialogListener{
        void changeText(String text);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = ((FragmentActivity)context).getSupportFragmentManager()
                .findFragmentById(R.id.fragment);
        mListener = (MyBottomDialogListener) fragment;
    }
}
