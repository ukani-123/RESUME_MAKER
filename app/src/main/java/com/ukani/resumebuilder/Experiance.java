package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Experiance extends AppCompatActivity {

    TextInputEditText companyname,startdate,enddate;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiance);

        String name = getIntent().getStringExtra("name");
        String fn = getIntent().getStringExtra("fathername");
        String surname = getIntent().getStringExtra("surname");
        String dob = getIntent().getStringExtra("DOB");
        String gmail = getIntent().getStringExtra("G-mail");
        String mobileNumber = getIntent().getStringExtra("mobile number");
        String gd = getIntent().getStringExtra("Gender");
        String hobby = getIntent().getStringExtra("hobby");
        String course = getIntent().getStringExtra("course");
        String sc = getIntent().getStringExtra("school/collage");
        String grade = getIntent().getStringExtra("grade");


        companyname = findViewById(R.id.companyname);
        startdate = findViewById(R.id.sd);
        enddate = findViewById(R.id.ed);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String cn = companyname.getText().toString();
                String sd = startdate.getText().toString();
                String ed = enddate.getText().toString();

                Intent intent = new Intent(Experiance.this,Skill.class);
                intent.putExtra("name",name);
                intent.putExtra("fathername",fn);
                intent.putExtra("surname",surname);
                intent.putExtra("DOB",dob);
                intent.putExtra("G-mail",gmail);
                intent.putExtra("mobile number",mobileNumber);
                intent.putExtra("Gender",gd);
                intent.putExtra("hobby",hobby);
                intent.putExtra("course",course);
                intent.putExtra("school/collage",sc);
                intent.putExtra("grade",grade);
                intent.putExtra("Company name",cn);
                intent.putExtra("Start Date",sd);
                intent.putExtra("End Date",ed);
                startActivity(intent);
            }
        });

    }
}