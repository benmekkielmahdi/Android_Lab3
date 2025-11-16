package com.example.android_lab3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView txt_recap;
    private Button btn_retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt_recap = findViewById(R.id.txt_recap);
        btn_retour = findViewById(R.id.btn_retour);

        Intent intent = getIntent();

        String nom     = intent.getStringExtra("nom");
        String email   = intent.getStringExtra("email");
        String phone   = intent.getStringExtra("phone");
        String adresse = intent.getStringExtra("adresse");
        String ville   = intent.getStringExtra("ville");

        String resume = "Nom : " + nom +
                "\nEmail : " + email +
                "\nPhone : " + phone +
                "\nAdresse : " + adresse +
                "\nVille : " + ville;

        txt_recap.setText(resume);

        btn_retour.setOnClickListener(v -> finish());



    }
}