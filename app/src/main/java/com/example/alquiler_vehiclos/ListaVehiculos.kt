package com.example.alquiler_vehiclos

class ListaVehiculos {
    companion object{
        //Recoger informacion que debe tener veiculos para crear la lista
        val vehiculosList = listOf<DatosVehiculos>(

            DatosVehiculos(
                foto ="https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "carrozado con trampilla",
                plazas = "3 plazas",
                capacidad = "20M3"
            ),
            DatosVehiculos(
                foto ="https://blanauto.com/sites/default/files/inline-images/vehiculos-carrozados-002.jpg",
                modelo = "carrozado sin trampilla",
                plazas = "3 plazas",
                capacidad = "20M3"
            ),
            DatosVehiculos(
                foto ="https://blanauto.com/sites/default/files/inline-images/mercedes-sprinter.png.jpg",
                modelo = "Furgoneta grande",
                plazas = "3 plazas",
                capacidad = "15M3"
            ),
            DatosVehiculos(
                foto ="https://blanauto.com/sites/default/files/inline-images/1539849303199.jpg",
                modelo = "Furgoneta mediana",
                plazas = "3 plazas",
                capacidad = "8M3"
            ),
            DatosVehiculos(
                foto ="https://blanauto.com/sites/default/files/inline-images/mercedes_benz_citan_long_diesel_109cdi_van_2013_front_three_quarter.jpeg",
                modelo = "Furgoneta pequeña",
                plazas = "3 plazas",
                capacidad = "20M3"
            )

        )
    }
}