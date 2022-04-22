package com.ukani.resumebuilder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    TextInputEditText name,fathername,surname,dob,gmail,mobilenumber,gender,hobby;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        fathername = findViewById(R.id.fathername);
        surname = findViewById(R.id.surname);
        dob = findViewById(R.id.birthdate);
        gmail = findViewById(R.id.gmail);
        mobilenumber = findViewById(R.id.mobilenumber);
        gender = findViewById(R.id.gender);
        hobby = findViewById(R.id.hobby);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String n = name.getText().toString();
                String fn = fathername.getText().toString();
                String sn = surname.getText().toString();
                String birth = dob.getText().toString();
                String mail = gmail.getText().toString();
                String mn = mobilenumber.getText().toString();
                String gd = gender.getText().toString();
                String ho = hobby.getText().toString();

                Intent intent = new Intent(MainActivity.this,Education.class);
                intent.putExtra("name",n);
                intent.putExtra("fathername",fn);
                intent.putExtra("surname",sn);
                intent.putExtra("DOB",birth);
                intent.putExtra("G-mail",mail);
                intent.putExtra("mobile number",mn);
                intent.putExtra("Gender",gd);
                intent.putExtra("hobby",ho);
                startActivity(intent);
            }
        });
    }
}