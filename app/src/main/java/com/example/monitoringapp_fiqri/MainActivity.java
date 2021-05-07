package com.example.monitoringapp_fiqri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Tanggal Pengerjaan : 07 Mei 2021
 * Deskripsi : MainActivity untuk mengarahkan halaman awal yang akan terbuka saat aplikasi di jalankan dan membuat aksi tombol pada saat di klik
 * Nim : 10118020
 * Nama : Fiqri Akbar Pratama
 * Kelas : IF-1 / S1 / VI
 *
 * **/

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

    }

    public void PindahToLogin(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}
