package com.eduardoczpla.hen.ui.batch;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import com.eduardoczpla.hen.databinding.FragmentBatchBinding;
import com.google.android.material.snackbar.Snackbar;

public class BatchFragment extends Fragment {

    private BatchViewModel batchViewModel;
    private FragmentBatchBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        batchViewModel =
                new ViewModelProvider(this).get(BatchViewModel.class);

        binding = FragmentBatchBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textBatchshow;
        batchViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}