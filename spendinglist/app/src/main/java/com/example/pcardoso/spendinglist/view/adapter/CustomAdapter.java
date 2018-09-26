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

import static com.example.pcardoso.spendinglist.R.layout.custom_spinner;

public class CustomAdapter extends ArrayAdapter<Integer> {

    private List<String> titles = new ArrayList<>();
    private List<Integer> images = new ArrayList<>();
    private Context mContext;

    public CustomAdapter(@NonNull Context context, String[] titles, Integer[] images) {
        super(context, custom_spinner);

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
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        ViewHolder viewHolder = new ViewHolder();

        if (view == null) {

            LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = layoutInflater.inflate(R.layout.custom_spinner, parent, false);
            viewHolder.title = view.findViewById(R.id.txtTitleAccount);
            viewHolder.image = view.findViewById(R.id.imgAccount);
            view.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        String title = titles.get(position);

        if (title != null && !title.isEmpty()) {
            viewHolder.title.setText(title);
            viewHolder.image.setImageResource(images.get(position));
        }
        return view;
    }

    private static class ViewHolder {
        ImageView image;
        TextView title;
    }
}
