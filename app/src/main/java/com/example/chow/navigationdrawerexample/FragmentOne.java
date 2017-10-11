package com.example.chow.navigationdrawerexample;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by per6 on 10/11/17.
 */

public class FragmentOne extends Fragment implements View.OnClickListener {

    private Button button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.one_fragment, container, false);
        wireWidgets(rootView);
        return rootView;
    }

    private void wireWidgets(View rootView) {
        button = rootView.findViewById(R.id.button);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(getActivity(), "Button clicked", Toast.LENGTH_SHORT).show();
    }
}