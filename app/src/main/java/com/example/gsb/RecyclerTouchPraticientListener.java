package com.example.gsb;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

public class RecyclerTouchPraticientListener implements RecyclerView.OnItemTouchListener {
    //Declaration des variables
    private GestureDetector gestureDetector;
    private RecyclerViewPraticientsClickListerner clickListener;

    public RecyclerTouchPraticientListener(Context context, final RecyclerView recyclerView, final RecyclerViewPraticientsClickListerner clickListener) {
        this.clickListener = clickListener;
        //Initialisation du gestureDetector
        gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }
        });
    }

    @Override
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        //Recuperation dela vue
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        //Su une vue a ete trouvé et que le GestureDetector a detecté un événement de toucher, on appelle la méthode onClick du clickListener
        if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
            clickListener.onClick(child, rv.getChildAdapterPosition(child));
        }
        return false;
    }

    // Méthode appelée lorsqu'un événement de toucher est détecté sur le RecyclerView
    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {
    }

    // Méthode appelée pour demander à ne pas intercepter les événements de toucher
    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
}