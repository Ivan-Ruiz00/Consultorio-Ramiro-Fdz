package com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo;

import java.util.ArrayList;

public interface IService<Modelo>{
    Modelo agregar(Modelo modelo);
    ArrayList<Modelo> mostrar();
    Modelo actualizar(String id,Modelo modelo);
    String eliminar(Modelo modelo);
}
