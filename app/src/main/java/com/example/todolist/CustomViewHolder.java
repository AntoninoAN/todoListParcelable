package com.example.todolist;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    TextView tv_name, tv_category, tv_date;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.tv_name_task);
        tv_category = itemView.findViewById(R.id.tv_category_task);
        tv_date = itemView.findViewById(R.id.tv_due_date_task);
    }
}
