package com.example.pcardoso.spendinglist.view.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pcardoso.spendinglist.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Integer>{


    List<String> titles = new ArrayList<>();
    List<Integer> images = new ArrayList<>();

    Context mContext;

    public CustomAdapter(@NonNull Context context, String[] titles, Integer[] images ) {
        super(context, R.layout.custom_spinner);

        this.titles.addAll(Arrays.asList(titles));
        this.images.addAll(Arrays.asList(images));
        this.mContext = context;
    }



    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder mViewHolder = new ViewHolder();

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.
                    getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.custom_spinner, parent, false);
            mViewHolder.title =  convertView.findViewById(R.id.tvName);
            mViewHolder.image =  convertView.findViewById(R.id.ivFlag);
            convertView.setTag(mViewHolder);

        }else {
            mViewHolder = (ViewHolder) convertView.getTag();
        }

        String title = titles.get(position);
        if(title!= null && !title.isEmpty()){
            mViewHolder.title.setText(title);
            mViewHolder.image.setImageResource(images.get(position));
        }
       return convertView;

    }

    private static class ViewHolder {
       ImageView image;
        TextView title;

    }
}
