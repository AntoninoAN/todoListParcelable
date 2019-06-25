package com.example.todolist;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton button;
    RecyclerView recyclerView;
    private int REQUEST_CODE_NEW_TASK = 1825;//RANDOM.ORG/
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.floatingActionButton);
        recyclerView = findViewById(R.id.recyclerview);

        /*
            Adapter extends RecyclerView.Adapter
            ViewHolder extends RecyclerView.ViewHolder
            Item Layout
            LayoutManager {Linear Layout Manager
                            Grid Layout Manager
                            Staggered Layout Manager}
             assign the adapter to the recyclerview
         */

        LinearLayoutManager linearLayoutManager = new
                LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager = new
                GridLayoutManager(this, 2);
        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(3,
                        StaggeredGridLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this,
                        SaveNewTask.class);
                startActivityForResult(intent,
                        REQUEST_CODE_NEW_TASK);
            }
        });

//        recyclerView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
//            @Override
//            public boolean onItemLongClick(AdapterView<?> parent,
//                                           View view,
//                                           int position,
//                                           long id) {
//                adapter.remove(adapter.getItem(position));
//                adapter.notifyDataSetChanged();
//                return false;
//            }
//        });
    }

    public void openNewActivity(){
//            Intent intent = new Intent(this, SaveDatabaseData.class);
//            intent.setClass(this, SaveDatabaseData.class);
//            startActivity(intent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE_NEW_TASK
            && resultCode == RESULT_OK
        && data != null){
//            String newTask = data.getStringExtra(
//                    SaveNewTask.KEY_NEW_TASK
//            );
//
//            if(!newTask.isEmpty()) {
//                adapter.add(newTask);
//                adapter.notifyDataSetChanged();
//            }
            Bundle bundle = data.getBundleExtra(SaveNewTask.KEY_NEW_TASK);

        }
    }
}
