package com.example.monitoringapp_fiqri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Tanggal Pengerjaan : 07 Mei 2021
 * Deskripsi : Menampilkan tampilan dan nilai yang dikirim dari tampilan sebelumnya
 * Nim : 10118020
 * Nama : Fiqri Akbar Pratama
 * Kelas : IF-1 / S1 / VI
 *
 * **/

public class sayhi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayhi);

        //get data intent
        Intent intent = getIntent();
        String pesan = intent.getStringExtra(biodata.EXTRA_MESSAGE);

        //set text
        TextView teks2 = findViewById(R.id.teks2_main);
        teks2.setText(pesan);
        TextView teks6 = findViewById(R.id.teks6_main);
        teks6.setText(pesan);

    }
}