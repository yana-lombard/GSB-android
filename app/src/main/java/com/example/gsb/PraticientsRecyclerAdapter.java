package com.example.gsb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PraticientsRecyclerAdapter extends RecyclerView.Adapter<PraticientsRecyclerAdapter.ViewHolder> {

    private List<Praticients> mPraticientsList;

    public PraticientsRecyclerAdapter(List<Praticients> praticientsList) {
        mPraticientsList = praticientsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerviewlayout2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Praticients currentPraticient = mPraticientsList.get(position);
        holder.textViewNom.setText(currentPraticient.getNom());
        holder.textViewPrenom.setText(currentPraticient.getPrenom());
    }

    @Override
    public int getItemCount() {
        return mPraticientsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNom;
        private TextView textViewPrenom;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNom = itemView.findViewById(R.id.textViewNomPraticient);
            textViewPrenom = itemView.findViewById(R.id.textViewPrenomPraticient);
        }
    }
}