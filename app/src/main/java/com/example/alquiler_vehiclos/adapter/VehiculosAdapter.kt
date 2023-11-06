package com.example.alquiler_vehiclos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.alquiler_vehiclos.DatosVehiculos
import com.example.alquiler_vehiclos.ListaVehiculos.Companion.vehiculosList
import com.example.alquiler_vehiclos.R

class VehiculosAdapter(vehiculosList: List<DatosVehiculos>) : RecyclerView.Adapter<VehiculosViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VehiculosViewHolder {
        //pasarle al viewHolder
        val layoutInflater=LayoutInflater.from(parent.context)
        return VehiculosViewHolder(layoutInflater.inflate(R.layout.item_vehiculo,parent,false))
    }

    override fun getItemCount(): Int {
        //Devuelve el numero de vehiculos implementados
        return vehiculosList.size
    }

    override fun onBindViewHolder(holder: VehiculosViewHolder, position: Int) {
        //Este metodo pasa cada vehiculo a la lista
        val item = vehiculosList[position]
        holder.render(item)
    }
}