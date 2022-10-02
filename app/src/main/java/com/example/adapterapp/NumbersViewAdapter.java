package com.example.adapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class NumbersViewAdapter extends ArrayAdapter<NumberView> {
    public NumbersViewAdapter(@NonNull Context context, ArrayList<NumberView> arrayList) {
        super(context, 0,arrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;
        if (currentItemView == null){
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_view,parent,false);
        }
        NumberView currentNumberPosition = getItem(position);

        // then according to the position of the view assign the desired image for the same
        ImageView numbersImage = currentItemView.findViewById(R.id.list_item_icon);
        assert currentNumberPosition != null;
        numbersImage.setImageResource(currentNumberPosition.getImageId());

        TextView  numText = currentItemView.findViewById(R.id.version_name);
        numText.setText(currentNumberPosition.getNum());

        TextView mainText = currentItemView.findViewById(R.id.version_number);
        mainText.setText(currentNumberPosition.getText());

        return currentItemView;
    }
}
