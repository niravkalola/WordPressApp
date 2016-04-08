package com.nkdroid.wordpress.app.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.nkdroid.wordpress.app.R;
import com.nkdroid.wordpress.app.util.PrefUtils;


public class LearnAndroidFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private WebView makeAppView;

    public LearnAndroidFragment() {
        // Required empty public constructor
    }


    public static LearnAndroidFragment newInstance(String param1, String param2) {
        LearnAndroidFragment fragment = new LearnAndroidFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View convertView= inflater.inflate(R.layout.fragment_learn_android, container, false);
        makeAppView= (WebView) convertView.findViewById(R.id.leanAppView);

        makeAppView.loadData(PrefUtils.getPages(getActivity()).pageContentArrayList.get(1).pageContent, "text/html", "UTF-8");
        return convertView;
    }


}
