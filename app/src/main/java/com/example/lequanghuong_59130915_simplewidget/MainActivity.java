package com.example.lequanghuong_59130915_simplewidget;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {

    TextView textView,textView2,textView3,textView4,textView5;
    EditText editText, editText2, editText3;
    RadioGroup radioGroup;
    CheckBox checkBox, checkBox2, checkBox3, checkBox4, checkBox5;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addViews();
        addEvents();
    }
    private void addViews() {
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        button = findViewById(R.id.button);
    }

    private void addEvents() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show();
            }
        });
    }

    private void show() {
        String mesage = editText.getText() + "\n" + "Ngày sinh: " + editText2.getText() + "\n";
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.radioButton:
                mesage = mesage + "Giới tính: Nam" + "\n" + "Sở thích: ";
                break;
            case R.id.radioButton2:
                mesage = mesage + "Giới tính: Nữ" + "\n" + "Sở thích: ";
                break;
        }
        if (checkBox.isChecked()) {
            mesage = mesage + checkBox.getText() + "; ";
        }
        if (checkBox2.isChecked()) {
            mesage = mesage + checkBox2.getText() + "; ";
        }
        if (checkBox3.isChecked()) {
            mesage = mesage + checkBox3.getText() + "; ";
        }
        if (checkBox4.isChecked()) {
            mesage = mesage + checkBox4.getText() + "; ";
        }
        if (checkBox5.isChecked()) {
            mesage = mesage + checkBox5.getText() + "; ";
        }
        mesage = mesage + editText3.getText();
        Toast toast = Toast.makeText(getApplicationContext(), mesage, Toast.LENGTH_LONG);
        View view = toast.getView();
        TextView view1 = (TextView) view.findViewById(android.R.id.message);
        view1.setTextColor(Color.WHITE);
        view.setBackgroundResource(R.color.colorMessage);
        toast.show();
    }
}
