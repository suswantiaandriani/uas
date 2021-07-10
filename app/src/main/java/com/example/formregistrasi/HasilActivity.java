package com.example.formregistrasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HasilActivity extends AppCompatActivity {

    TextView txt1, txt2, txt3, txt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        txt1 =(TextView) findViewById(R.id.namaUser);
        txt2 =(TextView) findViewById(R.id.emailUser);
        txt3 =(TextView) findViewById(R.id.passwordUser);
        txt4 =(TextView) findViewById(R.id.genderUser);

        String nama = getIntent().getExtras().getString("nama");
        String email = getIntent().getExtras().getString("email");
        String password = getIntent().getExtras().getString("password");
        String gender = getIntent().getExtras().getString("jenisKelamin");

        txt1.setText("Nama anda\n"+nama);
        txt2.setText("Email anda\n"+email);
        txt3.setText("Password anda\n"+password);
        txt4.setText("Jenis Kelamin anda\n"+gender);
    }
}