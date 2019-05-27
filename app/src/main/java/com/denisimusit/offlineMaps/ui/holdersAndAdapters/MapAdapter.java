package com.denisimusit.offlineMaps.ui.holdersAndAdapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.denisimusit.offlineMaps.R;
import com.denisimusit.offlineMaps.modell.MapModel;

import java.util.List;

import static com.denisimusit.offlineMaps.util.StringsUtill.firstUpperCase;

public class MapAdapter extends RecyclerView.Adapter<MapHolder> {
    //Здесь мы будем хранить набор наших данных
    private List<MapModel> persons;

    //Простенький конструктор
    public MapAdapter(List<MapModel> persons) {
        this.persons = persons;
    }

    //Этот метод вызывается при прикреплении нового элемента к RecyclerView
    @Override
    public void onBindViewHolder(MapHolder mapHolder, int i) {
        //Получаем элемент набора данных для заполнения
        MapModel mapModel = persons.get(i);
        //Заполняем поля viewHolder'а данными из элемента набора данных
        String name = firstUpperCase(mapModel.getName());
        mapHolder.nameTextView.setText(name);

        if (persons.get(i).getJoinMapFiles() == null) {
            mapHolder.downloadImageView.setVisibility(View.VISIBLE);
        }
    }

    //Этот метод вызывается при создании нового ViewHolder'а

    @Override
    public MapHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        //Создаём новый view при помощи LayoutInflater
        //Особенно упорные могут создать его программно с помощью view.addView
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list,
                viewGroup, false);

        return new MapHolder(itemView);
    }

    //Этот метод возвращает количество элементов списка
    @Override
    public int getItemCount() {
        //не мудрствуя лукаво, вернём размер списка
        return persons.size();
    }
}
