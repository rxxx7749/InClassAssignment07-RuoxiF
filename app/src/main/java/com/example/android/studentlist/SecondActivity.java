package com.example.android.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    private EditText studentName;
    private EditText studentGrade;
    private CheckBox studentStatus;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //initialize all the variables
        studentName = (EditText) findViewById(R.id.student_name);
        studentGrade = (EditText) findViewById(R.id.student_grade);
        studentStatus = (CheckBox) findViewById(R.id.student_status);
        submitButton = (Button) findViewById(R.id.submit_button);
        //attach the listener to the button view and create object instance of event listener
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //define the event listener inline
                submitStudent();
            }
        });
    }

    /**
     * This method is to combine all the input text and send it back to the main activity
     * This method will be called when the submit button being clicked
     */
    public void submitStudent() {
        String name = studentName.getText().toString();
        String gradeStr = studentGrade.getText().toString();
        double grade = Double.valueOf(gradeStr);
        boolean status = studentStatus.isChecked();
        Student student = new Student(name, grade, status);
        Intent data = new Intent();
        data.putExtra(Keys.STUDENT,student);
        setResult(RESULT_OK,data);
        finish();

    }
}
