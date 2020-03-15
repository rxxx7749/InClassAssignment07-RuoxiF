package com.example.android.studentlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //declare global variables
    private Button addButton;
    private TextView displayText;
    private ArrayList<String> list;
    private String message;
    private String studentInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize all the variables
        addButton = (Button) findViewById(R.id.add_button);
        displayText = (TextView) findViewById(R.id.student_info);
        list=new ArrayList<String>();
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //define the event listener inline
                addStudent();

            }

        });

    }

    public void addStudent(){
        Intent intent = new Intent(this,SecondActivity.class);
        startActivityForResult(intent,Keys.REQUEST_ADD_STUDENT);
    }

    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data){

        if(requestCode == Keys.REQUEST_ADD_STUDENT&&resultCode==RESULT_OK){
            Student student = (Student) data.getSerializableExtra(Keys.STUDENT);
            String studentMessage = student.toString();
            list.add(studentMessage);
            message="";
            for(int i = 0; i< list.size();i++) {
                studentInfo = list.get(i);
                message = message + studentInfo;
            }
        }
        displayText.setText(message);
    }
}
