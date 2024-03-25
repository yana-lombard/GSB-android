package com.example.gsb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PraticientsRecyclerAdapter  extends RecyclerView.Adapter<PraticientsRecyclerAdapter.RecyclerViewHolder>{

    private List<Praticients> praticientsList;

    public PraticientsRecyclerAdapter(List<Praticients> praticientsList) {
        this.praticientsList = praticientsList;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewlayout2, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
    holder.textViewNom.setText(praticientsList.get(position).getNom());
    holder.textViewPrenom.setText(praticientsList.get(position).getPrenom());
    }

    @Override
    public int getItemCount() {
        return praticientsList.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNom;
        private TextView textViewPrenom;


        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNom = itemView.findViewById(R.id.textViewNomPraticient);
            textViewPrenom = itemView.findViewById(R.id.textViewPrenomPraticient);

        }
    }
}
