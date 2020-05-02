package com.example.androidjavabasic;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

class PlanetAdapter extends RecyclerView.Adapter<PlanetAdapter.ViewHolder> {


    private Context context;
    private ArrayList<Planet> planets;

    public PlanetAdapter( Context context, ArrayList<Planet> planets) {

        this.context = context;
        this.planets = planets;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(context).inflate(R.layout.itemrow, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Planet planet = planets.get(position);
        Log.e("lost size",""+planet);
        holder.setDetails(planet);
        
        

       holder.txtName.setText(planets.get(position).getPlanetName());

        holder.txtDistance.setText(String.format(Locale.US, "Distance from Sun : %d Million KM", planets.get(position).getDistanceFromSun()));
        holder. txtGravity.setText(String.format(Locale.US, "Surface Gravity : %d N/kg", planets.get(position).getGravity()));
        holder. txtDiameter.setText(String.format(Locale.US, "Diameter : %d KM", planets.get(position).getDiameter()));
    }

    @Override
    public int getItemCount() {
        return planets.size();






    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView txtName, txtDistance, txtGravity, txtDiameter;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtDistance = itemView.findViewById(R.id.txtDistance);
            txtGravity = itemView.findViewById(R.id.txtGravity);
            txtDiameter = itemView.findViewById(R.id.txtDiameter);
        }


        public void setDetails(Planet planet) {

            //txtName.setText(planet.getPlanetName());
           // txtDistance.setText(String.format(Locale.US, "Distance from Sun : %d Million KM", planet.getDistanceFromSun()));
           // txtGravity.setText(String.format(Locale.US, "Surface Gravity : %d N/kg", planet.getGravity()));
            //txtDiameter.setText(String.format(Locale.US, "Diameter : %d KM", planet.getDiameter()));
        }
    }


}
