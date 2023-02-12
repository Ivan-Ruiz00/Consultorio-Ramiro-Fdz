package com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo;

import java.util.ArrayList;

public interface IService<Modelo>{
    Modelo agregar(Modelo objeto);
    ArrayList<Modelo> mostrar();
}
