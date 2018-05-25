package com.astroweatherapp.jakub.astroweather;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.astrocalculator.AstroCalculator;
import com.astrocalculator.AstroCalculator.Location;
import com.astrocalculator.AstroDateTime;

/**
 * Created by Jakub on 2018-04-26.
 */

public class SunFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_sun,container,false);


        Location location = new Location(19.28   , 51.47);//19°28'E        51°47'N Lodz
        AstroDateTime dateTime = new AstroDateTime(2018,5,25,17,
                30,20,1,true);
        AstroCalculator astroCalculator = new AstroCalculator(dateTime,location);

        final TextView wsh = view.findViewById(R.id.Wsh);
        TextView ws_num = view.findViewById(R.id.ws_num);

        final TextView zach = view.findViewById(R.id.Zach);
        TextView za_num = view.findViewById(R.id.za_num);

        Button settings = view.findViewById(R.id.Options);

        final TextView latandLong = view.findViewById(R.id.LatAndLiong);

        TextView latitude = view.findViewById(R.id.latitude);
        TextView longtitude = view.findViewById(R.id.longtitude);



        ws_num.setText( String.valueOf(astroCalculator.getSunInfo().getSunrise()));
        za_num.setText( String.valueOf(astroCalculator.getSunInfo().getSunset()));

        return view;
    }


}
