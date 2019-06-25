package com.example.todolist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.todolist.model.Task;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private List<Task> dataset;

    public CustomAdapter(List<Task> dataset) {
        this.dataset = dataset;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_layout,
                        viewGroup,
                        false);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder customViewHolder, int i) {
        customViewHolder.tv_name.setText(
                dataset.get(i).getName()
        );
        customViewHolder.tv_category.setText(
                dataset.get(i).getCategory()
        );
        customViewHolder.tv_date.setText(
                dataset.get(i).getDueDate().toString()
        );
    }

    @Override
    public int getItemCount() {
        return dataset != null ? dataset.size() : 0;
    }
}
