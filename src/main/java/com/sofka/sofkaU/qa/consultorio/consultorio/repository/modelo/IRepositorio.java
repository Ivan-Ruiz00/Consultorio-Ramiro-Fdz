package com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo;
public interface IRepositorio<Modelo> {
    void agregar(Modelo modelo);
    void eliminar(Modelo modelo);
    void actualizar(String id,Modelo modelo);
}
