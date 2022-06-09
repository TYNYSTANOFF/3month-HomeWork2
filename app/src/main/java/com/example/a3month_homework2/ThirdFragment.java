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

public class ThirdFragment extends Fragment {
    private EditText etThird;
    private TextView tvThird;
    private Button btnThird;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etThird = view.findViewById(R.id.et_third);
        tvThird = view.findViewById(R.id.tv_third);
        btnThird = view.findViewById(R.id.btn_third);

        Bundle bundle = getArguments();
        String text = bundle.getString(FirstFragment.KEY);
        etThird.setText(text);

        btnThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                String text = etThird.getText().toString();
                bundle.putString(FirstFragment.KEY, text);
                Fragment fragment = new FourthFragment();
                fragment.setArguments(bundle);

                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment).commit();
            }
        });
    }
}