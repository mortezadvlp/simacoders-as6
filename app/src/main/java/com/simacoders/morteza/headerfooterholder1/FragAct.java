package com.simacoders.morteza.headerfooterholder1;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FragAct extends Fragment implements MyBottomSheetDialog.MyBottomDialogListener {

    View iView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragact, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iView = view;
        Button button = view.findViewById(R.id.buttonDialog);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyBottomSheetDialog dialog = new MyBottomSheetDialog();
                dialog.show(getActivity().getSupportFragmentManager(), "");
            }
        });
    }

    @Override
    public void changeText(String text) {
        TextView textView = iView.findViewById(R.id.textViewComment);
        textView.setText(text);
    }
}
