package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Récupérez le nom et le prénom du praticien de l'intention
        String nomPraticien = getIntent().getStringExtra("nomPraticien");
        String prenomPraticien = getIntent().getStringExtra("prenomPraticien");
        String telPraticien = getIntent().getStringExtra("telPraticien");
        String emailPraticien = getIntent().getStringExtra("emailPraticien");
        String ruePraticien = getIntent().getStringExtra("ruePraticien");
        String villePraticien = getIntent().getStringExtra("villePraticien");

        // Trouvez les TextViews
        TextView nomPraticienTextView = findViewById(R.id.textViewNomReponsePraticient);
        TextView prenomPraticienTextView = findViewById(R.id.textViewPrenomReponsePraticient);
        TextView telPraticienTextView = findViewById(R.id.textViewTelephoneReponsePraticient);
        TextView emailPraticienTextView = findViewById(R.id.textViewEmailReponsePraticient);
        TextView ruePraticienTextView = findViewById(R.id.textViewRueReponsePraticient);
        TextView villePraticienTextView = findViewById(R.id.textViewVilleReponsePraticient);

        // Définissez le nom et le prénom du praticien dans les TextViews
        nomPraticienTextView.setText(nomPraticien);
        prenomPraticienTextView.setText(prenomPraticien);
        telPraticienTextView.setText(telPraticien);
        emailPraticienTextView.setText(emailPraticien);
        ruePraticienTextView.setText(ruePraticien);
        villePraticienTextView.setText(villePraticien);
    }
}