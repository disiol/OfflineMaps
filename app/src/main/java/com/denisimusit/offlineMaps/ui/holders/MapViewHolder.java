package com.denisimusit.offlineMaps.ui.holders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.denisimusit.offlineMaps.R;

public class MapViewHolder extends RecyclerView.ViewHolder {
    //объявим поля, созданные в файле интерфейса itemView.xml
    public ImageView mapImageView;
    public TextView nameTextView;
    public ImageView downloadImageView;
    public ProgressBar downloadProgressBar;
    
    //объявляем конструктор
    public MapViewHolder(View itemView){
        super(itemView);
        //привязываем элементы к полям
        mapImageView = itemView.findViewById(R.id.map_imageView);
        nameTextView = itemView.findViewById(R.id.name_textView);
        downloadImageView = itemView.findViewById(R.id.download_imageView);
        downloadProgressBar = itemView.findViewById(R.id.download_progressBar);
    }
}