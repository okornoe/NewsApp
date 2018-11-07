package com.sourcecodeinc.newsapp;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class NewsAdapter extends ArrayAdapter<News>{
    public NewsAdapter(@NonNull Activity context, ArrayList<News> list_item) {
        super(context, 0, list_item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.news_list_item, parent,
                    false);
        }

        News currentNews = getItem(position);

        TextView sectionNameTextView = (TextView) convertView.findViewById(R.id.news_sectionTitle);
        sectionNameTextView.setText(currentNews.getSectionName());

        TextView webTitleTextView = (TextView) convertView.findViewById(R.id.news_title);
        webTitleTextView.setText(currentNews.getWebTitle());

        return convertView;
    }
}
