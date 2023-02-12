package com.sofka.sofkaU.qa.consultorio.consultorio.controller;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.CitaRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/citas")
public class CitaController implements IController<Cita>{
    @Autowired
    IService service;
    @Override
    public ResponseEntity mostrar() {
        return new ResponseEntity(service.mostrar(),HttpStatus.FOUND);
    }
    @Override
    public ResponseEntity agregar(Cita cita) {
        return new ResponseEntity(service.agregar(cita), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity eliminar(Cita cita) {
        return null;
    }
}
