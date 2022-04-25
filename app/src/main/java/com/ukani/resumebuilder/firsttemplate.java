package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class firsttemplate extends AppCompatActivity {

    TextView na,fathername,sirname,DOB,mail,mobile,jati,hobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttemplate);

        String name = getIntent().getStringExtra("name");
        String surname = getIntent().getStringExtra("surname");
        String fn = getIntent().getStringExtra("fathername");
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
        String ss = getIntent().getStringExtra("secondory Skill");
        String ts = getIntent().getStringExtra("third Skill");
        String fs = getIntent().getStringExtra("forth Skill");
        String gi = getIntent().getStringExtra("Git Hub");
        String link = getIntent().getStringExtra("Linked In");
        String cn = getIntent().getStringExtra("Company Name");
        String wl = getIntent().getStringExtra("Web Link");

        na = findViewById(R.id.name);
        fathername = findViewById(R.id.fathername);
        sirname = findViewById(R.id.sirname);
        DOB = findViewById(R.id.dateofbirth);
        mail = findViewById(R.id.Gmail);
        mobile= findViewById(R.id.mn);
        jati= findViewById(R.id.jati);
        hobi= findViewById(R.id.hobi);

        na.setText(name);
        fathername.setText(fn);
        sirname.setText(surname);
        DOB.setText(dob);
        mail.setText(gmail);
        mobile.setText(mobileNumber);
        jati.setText(gd);
        hobi.setText(hobby);
    }
}