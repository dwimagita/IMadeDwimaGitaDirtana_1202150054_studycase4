package com.example.imadedwimagitadirtana_1202150054_si3906.imadedwimagitadirtana_1202150054_studycase4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button list, cari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Inisialisasi Komponen View
        list =(Button)findViewById(R.id.btnListMhs);
        cari =(Button)findViewById(R.id.btnCariGbr);
        //method agar saat menclick tombol listnamamahasiswa akan menuju aktivitas listnamamahasiswa
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ListNamaMahasiswa.class));
            }
        });
        //method agar saat menclick tombol carigambar akan menuju aktivitas carigambar
        cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CariGambar.class));
            }
        });
    }

}
