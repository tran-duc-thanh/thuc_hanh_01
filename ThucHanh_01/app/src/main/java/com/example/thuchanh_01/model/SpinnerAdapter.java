package com.example.thuchanh_01.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.example.thuchanh_01.R;

public class SpinnerAdapter extends BaseAdapter {

    private final int[] images = new int[]{R.drawable.cat1, R.drawable.cat2, R.drawable.cat3, R.drawable.cat4,
            R.drawable.cat5, R.drawable.cat6, R.drawable.cat7, R.drawable.cat8, R.drawable.cat9,
            R.drawable.cat10};

    private Context context;

    public SpinnerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int i) {
        return images[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewItem = LayoutInflater.from(context).inflate(R.layout.item_image_spinner_cat, viewGroup, false);
        ImageView img = viewItem.findViewById(R.id.imageCat);
        img.setImageResource(images[i]);
        return viewItem;
    }
}
