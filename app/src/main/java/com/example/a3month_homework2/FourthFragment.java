package com.example.a3month_homework2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FourthFragment extends Fragment {
    private EditText etFourth;
    private TextView tvFourth;
    private Button btnFourth;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etFourth = view.findViewById(R.id.et_fourth);
        tvFourth = view.findViewById(R.id.tv_fourth);
        btnFourth = view.findViewById(R.id.btn_fourth);
        Bundle bundle = getArguments();
        String text = bundle.getString(FirstFragment.KEY);
        etFourth.setText(text);

        btnFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String text = etFourth.getText().toString();
                bundle.putString(FirstFragment.KEY, text);
                Fragment fragment = new FifthFragment();
                fragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().
                        replace(R.id.container, fragment).commit();
            }
        });
    }
}