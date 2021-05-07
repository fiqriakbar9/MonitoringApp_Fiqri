package com.example.monitoringapp_fiqri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.View;
import android.widget.EditText;
/**
 * Tanggal Pengerjaan : 07 Mei 2021
 * Deskripsi : Terdapat kolom unutk memasukkan Kode Login Keluarga lalu login dan tombol untuk beli kode (Tanpa aksi)
 * Nim : 10118020
 * Nama : Fiqri Akbar Pratama
 * Kelas : IF-1 / S1 / VI
 *
 * **/

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText kodelogin = findViewById(R.id.kode_login);

        //All capslock kode login
        kodelogin.setFilters(new InputFilter[]{new InputFilter.AllCaps()});
    }

    public void PindahToBiodata(View view) {
        Intent intent = new Intent(this, biodata.class);
        startActivity(intent);
    }
}