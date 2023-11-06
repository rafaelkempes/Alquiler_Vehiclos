package com.example.alquiler_vehiclos

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.alquiler_vehiclos.adapter.VehiculosAdapter
import com.example.alquiler_vehiclos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Crear el dialogo
        var dialogo = AlertDialog.Builder(this)
        //Confirmacion
        dialogo.setTitle("Confirmacion")
        //mensaje
        dialogo.setTitle("Desea guardar datos")



        //diseñar el listado
        binding.BMostarVehiculos.setOnClickListener(
             binding.recycler.visibility =View.VISIBLE
        )
        binding.BGuardar.setOnClickListener(
            mostrarDialogo()
        )


        val manager = LinearLayoutManager(this)

        binding.recycler.layoutManager = LinearLayoutManager(this)
        binding.recycler.adapter =VehiculosAdapter(ListaVehiculos.vehiculosList)
    }
    private fun mostrarDialogo() {
        //Crear el dialogo
        var dialogo = AlertDialog.Builder(this)
        //Confirmacion
        dialogo.setTitle("Confirmacion")
        //mensaje
        dialogo.setTitle("Desea guardar datos")

        // Agregar botón positivo
        dialogo.setPositiveButton("Aceptar") { dialog, which ->
            Toast.makeText(applicationContext,"has confirmado la operacion",Toast.LENGTH_LONG).show()
        }

        // Agregar botón negativo
        dialogo.setNegativeButton("Cancelar") { dialog, which ->
            Toast.makeText(applicationContext,"has cancelado la operacion",Toast.LENGTH_LONG).show()

        }

        val dialog = dialogo.create()
        dialog.show()
    }
}