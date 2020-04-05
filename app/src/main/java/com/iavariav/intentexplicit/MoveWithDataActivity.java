package com.iavariav.intentexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MoveWithDataActivity extends AppCompatActivity {
    private String nama, age;
    private TextView tvNama, tvAge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        tvNama = findViewById(R.id.tv_nama);
        tvAge = findViewById(R.id.tv_umur);

        nama = getIntent().getStringExtra("EXTRA_NAME");
        age = getIntent().getStringExtra("EXTRA_AGE");

        tvNama.setText(nama);
        tvAge.setText(age + " Tahun");


    }
}
