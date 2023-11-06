package com.example.alquiler_vehiclos.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.alquiler_vehiclos.DatosVehiculos
import com.example.alquiler_vehiclos.databinding.ItemVehiculoBinding

class VehiculosViewHolder(view: View):RecyclerView.ViewHolder(view) {
    //Accedemos a la lista creada
    val binding= ItemVehiculoBinding.bind(view)
    fun render(vehiculoMode:DatosVehiculos){
        binding.Modelo.text=vehiculoMode.modelo
        binding.Capazidad.text=vehiculoMode.capacidad
        binding.Plazas.text=vehiculoMode.plazas
        Glide.with(binding.vehiculo.context).load(vehiculoMode.foto).into(binding.vehiculo)
    }
}