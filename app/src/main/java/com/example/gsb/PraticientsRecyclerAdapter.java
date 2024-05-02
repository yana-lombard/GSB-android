package com.example.gsb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PraticientsRecyclerAdapter extends RecyclerView.Adapter<PraticientsRecyclerAdapter.ViewHolder> {

    //declaration de la liste de praticients
    private List<Praticients> mPraticientsList;

    //Cobnstructeur de la classe qui prend en parametre la liste de praticients
    public PraticientsRecyclerAdapter(List<Praticients> praticientsList) {
        mPraticientsList = praticientsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Création d'une nouvelle vue
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewlayout2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Recuperation du praticiren à la posotion donnée
        Praticients currentPraticient = mPraticientsList.get(position);
        //Mis à jour des TexViews avec les information du praticien
        holder.textViewNom.setText(currentPraticient.getNom());
        holder.textViewPrenom.setText(currentPraticient.getPrenom());
    }

    @Override
    public int getItemCount() {
        return mPraticientsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        //Declaration des TextViews pour le nom et le prenom du praticien
        private TextView textViewNom;
        private TextView textViewPrenom;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Recuperation des TextViews à partir de la vue
            textViewNom = itemView.findViewById(R.id.textViewNomPraticient);
            textViewPrenom = itemView.findViewById(R.id.textViewPrenomPraticient);
        }
    }
}