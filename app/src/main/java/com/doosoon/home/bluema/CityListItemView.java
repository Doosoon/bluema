package com.doosoon.home.bluema;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by doosoon on 2016-08-14.
 */
class CityListItemView extends LinearLayout {

    CityListItemView(Context context, DataManager.CityData data) {
        super(context);

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.city_item, this, true);

        TextView cityName = (TextView) findViewById(R.id.cityName);
        cityName.setText(data.name);
        TextView cityPrice = (TextView) findViewById(R.id.cityPrice);
        cityPrice.setText(String.format("%d", data.price));
        if (data.hotelPrice != 0) {
            TextView hotelPrice = (TextView) findViewById(R.id.hotelPrice);
            hotelPrice.setText(String.format("%d", data.price + data.hotelPrice));
            TextView buildingPrice = (TextView) findViewById(R.id.buildingPrice);
            buildingPrice.setText(String.format("%d", data.price + data.buildingPrice));
            TextView villaPrice = (TextView) findViewById(R.id.villaPrice);
            villaPrice.setText(String.format("%d", data.price + data.villaPrice));
        }
    }
}
