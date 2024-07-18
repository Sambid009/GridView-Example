package com.earth.gv_practice;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomGridAdapter extends BaseAdapter {
     Context context;
      int[] language_image;
      String[] language_name;
      LayoutInflater layoutinflater;

    public CustomGridAdapter(Context context, int[]language_image, String[] language_name){
        this.context = context;
        this.language_image = language_image;
        this.language_name = language_name;
        layoutinflater = (LayoutInflater.from(context));


    }
    @Override
    public int getCount() {
        return language_image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutinflater.inflate(R.layout.layout_grid_item,null);
        ImageView imageGridItem = convertView.findViewById(R.id.imageGridItem);
        TextView textGridItem = convertView.findViewById(R.id.textGridItem);
        textGridItem.setText(language_name[position]);
        imageGridItem.setImageResource(language_image[position]);

        return convertView;
    }
}
