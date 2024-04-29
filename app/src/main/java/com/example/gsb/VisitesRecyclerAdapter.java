/*
package com.example.gsb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VisitesRecyclerAdapter extends RecyclerView.Adapter<VisitesRecyclerAdapter.VisitesViewHolder> {
    private List<Visites> listeVisites;

    // Constructeur
    public VisitesRecyclerAdapter(List<Visites> listeVisites) {
        this.listeVisites = listeVisites;
    }

    @NonNull
    @Override
    public VisitesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerviewlayout3, parent, false);
        return new VisitesViewHolder(itemView);
    }
/*
    @Override
    public void onBindViewHolder(@NonNull VisitesViewHolder holder, int position) {
        Visites visite = listeVisites.get(position);
        holder.dateVisite.setText(visite.getDateVisite());
        holder.motifVisite.setText(visite.getMotifId().getLibelle()); // Assurez-vous que votre classe Visites a une méthode getMotif() qui renvoie un objet Motif
    }



    @Override
    public int getItemCount() {
        return listeVisites.size();
    }

    public class VisitesViewHolder extends RecyclerView.ViewHolder {
        public TextView dateVisite, motifVisite;

        public VisitesViewHolder(View view) {
            super(view);
            dateVisite = view.findViewById(R.id.dateVisite);
            motifVisite = view.findViewById(R.id.MotifVisite);
        }
    }
}
*/
