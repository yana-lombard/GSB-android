package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<Praticients> praticientsList = new ArrayList<>();
        praticientsList.add(new Praticients("66019f38249fdc7d472a9076","Carlos","Veum","869-741-8954","Margie_Quigley70@yahoo.com" ,"013 Scottie Loop","74000","Novi"));
        praticientsList.add(new Praticients("66019f37249fdc7d472a9074","Aidan","Fritsch","671-564-0796","Lilian_Wiegand@gmail.com","6180 Kendrick Fork","74000","East Kentonfurt"));
        praticientsList.add(new Praticients("66019ee5249fdc7d472a9071","Emiliano","Jenkins","919-382-9793","Madaline77@yahoo.com" ,"020 Harvey Cliff","74000","Bel Air South"));
    }

    binding.recyclerViewPraticients.addOnItemTouchListener(new RecyclerTouchPraticientListener(this, binding.recyclerViewPraticients, new RecyclerViewPraticientsClickListerner() {
        @Override
        public void onClick(View view, int position) {
            Toast.makeText(MainActivity2.this, "Position : " + position, Toast.LENGTH_SHORT).show();
        }
    });
}