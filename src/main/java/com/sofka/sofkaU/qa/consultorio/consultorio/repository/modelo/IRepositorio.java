package com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo;
public interface IRepositorio<Modelo> {
    void agregar(Modelo objeto);
    void eliminar(Modelo objeto);
    void actualizar(String id,Modelo objeto);
}
