package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class templatescreen extends AppCompatActivity {

    Button Template1,Template2,Template3,Template4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_templatescreen);

        String name = getIntent().getStringExtra("name");
        String fathername = getIntent().getStringExtra("father name");
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
        String ps = getIntent().getStringExtra("Primary Skill");
        String ss = getIntent().getStringExtra("Secondory Skill");
        String ts = getIntent().getStringExtra("third Skill");
        String fs = getIntent().getStringExtra("forth Skill");
        String gi = getIntent().getStringExtra("Git Hub");
        String link = getIntent().getStringExtra("Linked In");
        String cn = getIntent().getStringExtra("Company Name");
        String wl = getIntent().getStringExtra("Web Link");


        Template1 = findViewById(R.id.temp1);
        Template2 = findViewById(R.id.temp2);
        Template3 = findViewById(R.id.temp3);
        Template4 = findViewById(R.id.temp4);

        Template1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent  intent = new Intent(templatescreen.this,firsttemplate.class);
                intent.putExtra("name",name);
                intent.putExtra("Father name",fathername);
                intent.putExtra("surname",surname);
                intent.putExtra("DOB",dob);
                intent.putExtra("G-mail",gmail);
                intent.putExtra("mobile number",mobileNumber);
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
                intent.putExtra("Company Nmae",cn);
                intent.putExtra("Web Link",wl);
                startActivity(intent);
            }
        });
    }
}