package com.example.implisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText EtUrl,EtLokasi,EtTeks;
    Button BtnBukaWibesite,BtnBukaLokasi,BtnBagikanTeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EtUrl.findViewById(R.id.et_url);
        EtLokasi.findViewById(R.id.et_lokasi);
        EtTeks.findViewById(R.id.et_teks);
        BtnBukaWibesite.findViewById(R.id.btn_buka_wibesite);
        BtnBukaLokasi.findViewById(R.id.btn_buka_lokasi);
        BtnBagikanTeks.findViewById(R.id.btn_bagikan_teks);

        BtnBukaWibesite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String web = EtUrl.getText().toString();
                Uri uriUrlWebsite = Uri.parse(web);
                Intent intentWebsite = new Intent(Intent.ACTION_VIEW, uriUrlWebsite);
                try{
                    startActivity(intentWebsite);
                }catch (Exception e){
                    EtUrl.setError("URL Tidak Sesuai !!!");
                }


//                if (web.trim().equals("")){
//                    EtUrl.setError("Isi");
//                }
            }
        });

        BtnBukaLokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lokasi = EtLokasi.getText().toString();
            }
        });

        BtnBagikanTeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teks = EtTeks.getText().toString();
            }
        });
    }
}