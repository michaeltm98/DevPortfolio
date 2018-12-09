package michaeltm98.com.devportfolio.views;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import michaeltm98.com.devportfolio.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View aboutView = inflater.inflate(R.layout.fragment_about, container, false);
//        TextView textView = aboutView.findViewById(R.id.textView1);
//        textView.setText("Hello");

        return aboutView;
    }

}
