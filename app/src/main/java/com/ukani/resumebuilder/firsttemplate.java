package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class firsttemplate extends AppCompatActivity {

    TextView na,father_surname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttemplate);

        String name = getIntent().getStringExtra("name");
        String Fathername = getIntent().getStringExtra("fatherName");
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
        String ss = getIntent().getStringExtra("secondory Skill");
        String ts = getIntent().getStringExtra("third Skill");
        String fs = getIntent().getStringExtra("forth Skill");
        String gi = getIntent().getStringExtra("Git Hub");
        String link = getIntent().getStringExtra("Linked In");
        String cn = getIntent().getStringExtra("Company Name");
        String wl = getIntent().getStringExtra("Web Link");

        na = findViewById(R.id.name);
        father_surname = findViewById(R.id.fnsn);

        na.setText(name);
        father_surname.setText(Fathername + surname);
    }
}