package adastudio.idareyou.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adastudio.idareyou.R;

public class Dare_Fragment extends Fragment {


    private View rootView;
    public Dare_Fragment()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        rootView= inflater.inflate(R.layout.fragment_dare, container, false);
        return rootView;
    }

}