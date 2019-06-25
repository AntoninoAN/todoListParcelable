package com.example.todolist;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.todolist.model.Task;

public class SaveNewTask extends AppCompatActivity {

    TextInputLayout textInputLayout;
    Button button;
    public static String KEY_NEW_TASK = SaveNewTask.class.getSimpleName() + "_KEY_NEW_TASK";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_new_task);
        textInputLayout = findViewById(R.id.til_task);
        button = findViewById(R.id.button);

        textInputLayout.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {

            }
        });

        final Intent intent = new Intent();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent.putExtra(KEY_NEW_TASK,
                textInputLayout.
                        getEditText().
                        getText().
                        toString());
                intent.putExtra()
                setResult(RESULT_OK, intent);

                Task task = new Task();
                task.set
                finish();
            }
        });

    }
}
