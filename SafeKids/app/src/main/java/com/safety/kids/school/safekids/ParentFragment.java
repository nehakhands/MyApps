package com.safety.kids.school.safekids;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by nkhandelwal on 18/08/2017.
 */

public class ParentFragment extends Fragment {
    public static final String PARENT_FRAGMENT = "Register As Parent";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.parent_signup_fragment, container, false);
        return view;
    }
}
