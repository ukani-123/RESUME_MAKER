package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Work extends AppCompatActivity {

    TextInputEditText git,linked;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

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
        String cn1 = getIntent().getStringExtra("Company Name");
        String sd = getIntent().getStringExtra("Start Date");
        String ed = getIntent().getStringExtra("End Date");
        String ps = getIntent().getStringExtra("Primary Skill");
        String ss = getIntent().getStringExtra("Secondory Skill");
        String ts = getIntent().getStringExtra("third Skill");
        String fs = getIntent().getStringExtra("forth Skill");

        git = findViewById(R.id.github);
        linked = findViewById(R.id.linkedin);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String gi = git.getText().toString();
                String link = linked.getText().toString();

                Intent intent = new Intent(Work.this,Refrence.class);
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
                intent.putExtra("Company Name",cn1);
                intent.putExtra("Start Date",sd);
                intent.putExtra("End Date",ed);
                intent.putExtra("Primary Skill",ps);
                intent.putExtra("Secondory Skill",ss);
                intent.putExtra("third Skill",ts);
                intent.putExtra("forth Skill",fs);
                intent.putExtra("Github",gi);
                intent.putExtra("Linked In",link);
                startActivity(intent);
            }
        });
    }
}