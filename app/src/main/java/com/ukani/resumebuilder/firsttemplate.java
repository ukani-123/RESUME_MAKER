package com.ukani.resumebuilder;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class firsttemplate extends AppCompatActivity {

    TextView mob,mail;
    ImageView zimage;

    private static final int IMG_PICK_CODE = 1000;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firsttemplate);

        String name = getIntent().getStringExtra("name");
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


        mob = findViewById(R.id.mon);
        mail = findViewById(R.id.mail);
        zimage = findViewById(R.id.photo);

        mob.setText(mobileNumber);
        mail.setText(gmail);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && requestCode == IMG_PICK_CODE){
            zimage.setImageURI(data.getData());
        }
    }
}