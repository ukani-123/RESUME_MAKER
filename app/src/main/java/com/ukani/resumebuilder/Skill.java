package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Skill extends AppCompatActivity {

    TextInputEditText primarys,secondarys,thirds,forths;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        String name = getIntent().getStringExtra("name");
        String fathername = getIntent().getStringExtra("fathername");
        String surname = getIntent().getStringExtra("surname");
        String dob = getIntent().getStringExtra("DOB");
        String gmail = getIntent().getStringExtra("G-mail");
        String mobileNumber = getIntent().getStringExtra("mobile number");
        String gender = getIntent().getStringExtra("Gender");
        String hobby = getIntent().getStringExtra("hobby");
        String course = getIntent().getStringExtra("course");
        String sc = getIntent().getStringExtra("school/collage");
        String grade = getIntent().getStringExtra("grade");
        String cn1 = getIntent().getStringExtra("Company Name");
        String sd = getIntent().getStringExtra("Start Date");
        String ed = getIntent().getStringExtra("End Date");

        primarys = findViewById(R.id.ps);
        secondarys = findViewById(R.id.ss);
        thirds = findViewById(R.id.ts);
        forths = findViewById(R.id.fs);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String ps = primarys.getText().toString();
                String ss = secondarys.getText().toString();
                String ts = thirds.getText().toString();
                String fs = forths.getText().toString();

                Intent intent = new Intent(Skill.this,Work.class);
                intent.putExtra("name",name);
                intent.putExtra("fathername",fathername);
                intent.putExtra("surname",surname);
                intent.putExtra("DOB",dob);
                intent.putExtra("G-mail",gmail);
                intent.putExtra("mobile number",mobileNumber);
                intent.putExtra("Gender",gender);
                intent.putExtra("hobby",hobby);
                intent.putExtra("course",course);
                intent.putExtra("school/collage",sc);
                intent.putExtra("grade",grade);
                intent.putExtra("Company Name",cn1);
                intent.putExtra("Start Date",sd);
                intent.putExtra("End Date",ed);
                intent.putExtra("Primary Skill",ps);
                intent.putExtra("Secondory Skill",ss);
                intent.putExtra("third Skill",ts);
                intent.putExtra("forth Skill",fs);
                startActivity(intent);
            }
        });

    }

}