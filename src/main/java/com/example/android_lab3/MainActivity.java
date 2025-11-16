package com.example.android_lab3;



import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText edt_nom, edt_email, edt_phone, edt_adresse;
    private Spinner spn_ville;
    private Button btn_envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nom     = findViewById(R.id.nom);
        edt_email   = findViewById(R.id.email);
        edt_phone   = findViewById(R.id.phone);
        edt_adresse = findViewById(R.id.adresse);
        spn_ville   = findViewById(R.id.ville);
        btn_envoyer = findViewById(R.id.btn_envoyer);

        btn_envoyer.setOnClickListener(v -> {
            String nom = edt_nom.getText().toString();
            String email = edt_email.getText().toString();
            String phone = edt_phone.getText().toString();
            String adresse = edt_adresse.getText().toString();
            String ville = spn_ville.getSelectedItem().toString();

            if (nom.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "\"Nom et Email sont obligatoires.\"", Toast.LENGTH_SHORT).show();
                return;
            }

            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("nom", nom);
            intent.putExtra("email", email);
            intent.putExtra("phone", phone);
            intent.putExtra("adresse", adresse);
            intent.putExtra("ville", ville);

            startActivity(intent);

        });
    }
}