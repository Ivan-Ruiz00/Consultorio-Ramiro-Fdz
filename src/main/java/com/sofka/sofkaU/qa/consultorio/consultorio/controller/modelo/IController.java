package com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo;
import org.springframework.http.ResponseEntity;
public interface IController <Modelo>{
    ResponseEntity mostrar();
    ResponseEntity agregar(Modelo modelo);
    ResponseEntity eliminar(Modelo modelo);
}
