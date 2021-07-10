package com.example.formregistrasi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText nama, email, password;
    RadioButton jeniskelamin;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.editNama);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        gender = (RadioGroup) findViewById(R.id.jenisKelamin);
    }

    public void submitRegis(View view) {
        int radioId = gender.getCheckedRadioButtonId();
        jeniskelamin = (RadioButton) findViewById(radioId);

        Intent hubung = new Intent(this, HasilActivity.class);
        hubung.putExtra("nama", nama.getText().toString());
        hubung.putExtra("email", email.getText().toString());
        hubung.putExtra("password", password.getText().toString());
        hubung.putExtra("jenisKelamin", jeniskelamin.getText().toString());

        startActivity(hubung);


    }
}