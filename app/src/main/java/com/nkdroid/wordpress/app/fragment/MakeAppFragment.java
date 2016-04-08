package com.nkdroid.wordpress.app.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.nkdroid.wordpress.app.R;
import com.nkdroid.wordpress.app.util.PrefUtils;

public class MakeAppFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private WebView makeAppView;

    public MakeAppFragment() {
        // Required empty public constructor
    }


    public static MakeAppFragment newInstance(String param1, String param2) {
        MakeAppFragment fragment = new MakeAppFragment();
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
        View convertView= inflater.inflate(R.layout.fragment_make_app, container, false);
        makeAppView= (WebView) convertView.findViewById(R.id.makeAppView);

        makeAppView.loadData(PrefUtils.getPages(getActivity()).pageContentArrayList.get(0).pageContent, "text/html", "UTF-8");
//        makeAppView.setText(Html.fromHtml(, null, null));


        return convertView;
    }









}
