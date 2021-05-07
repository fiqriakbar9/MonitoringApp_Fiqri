package com.example.monitoringapp_fiqri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
/**
 * Tanggal Pengerjaan : 07 Mei 2021
 * Deskripsi : Mengirimkan nilai yang akan dikirim kan ke halaman selanjutnya setelah meng-klik tombol
 * Nim : 10118020
 * Nama : Fiqri Akbar Pratama
 * Kelas : IF-1 / S1 / VI
 *
 * **/

public class biodata extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.monitoringapp_fiqri.MESSAGE";
    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
    }

    public void PindahToSayhi(View view) {
        Intent intent = new Intent(this, sayhi.class);
        EditText nama = findViewById(R.id.nama_biodata);
        String message = nama.getText().toString();
        intent.putExtra(EXTRA_MESSAGE,message);
        startActivity(intent);
    }
}