package adastudio.idareyou.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import adastudio.idareyou.R;

/**
 * Created by mojar on 4/24/2017.
 */

public class Profile_Fragment extends Fragment
{

    View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        rootView= inflater.inflate(R.layout.fragment_profile, container, false);

        return rootView;
    }
}
