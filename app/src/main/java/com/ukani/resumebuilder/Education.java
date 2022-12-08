package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Education extends IMAGECHOOSE {

    TextInputEditText course,school,grade;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        String name = getIntent().getStringExtra("name");
        String dob = getIntent().getStringExtra("DOB");
        String gmail = getIntent().getStringExtra("G-mail");
        String mobileNumber = getIntent().getStringExtra("mobile number");
        String gd = getIntent().getStringExtra("Gender");
        String hobby = getIntent().getStringExtra("hobby");

        course = findViewById(R.id.cd);
        school = findViewById(R.id.sc);
        grade = findViewById(R.id.grade);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cour = course.getText().toString();
                String scl = school.getText().toString();
                String g = grade.getText().toString();

                Intent intent = new Intent(Education.this,Experiance.class);
                intent.putExtra("name",name);
                intent.putExtra("DOB",dob);
                intent.putExtra("G-mail",gmail);
                intent.putExtra("mobile number",mobileNumber);
                intent.putExtra("Gender",gd);
                intent.putExtra("hobby",hobby);
                intent.putExtra("Course",cour);
                intent.putExtra("School",scl);
                intent.putExtra("Grade",g);
                startActivity(intent);
            }
        });

    }

}