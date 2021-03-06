package com.mirea.denisignatenko.layouttype;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        myTextView.setText("Name");
        Button button = findViewById(R.id.button);
        button.setText("Save");
        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setChecked(true);

    }

}