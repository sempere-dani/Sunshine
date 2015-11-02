package com.example.sempere.sunshine;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {



    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        //Create an ArrayList
        Resources res = getResources();
        String[] forecastArray = res.getStringArray(R.array.items);

        List<String> weekForecast = new ArrayList<>(Arrays.asList(forecastArray));

        for (int i=0;i<=forecastArray.length;i++){

            Log.i("Item ", String.valueOf(i));

        }

        //Array Adapter

        ArrayAdapter<String> forecastAdapter  = new ArrayAdapter<>(getActivity(), R.layout.list_item_forecast,
                                                R.id.list_item_forecast_textview,weekForecast);

        View  rootView = inflater.inflate(R.layout.fragment_main, container, false);
        //setup Views
        ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(forecastAdapter);

       // return inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }

}
