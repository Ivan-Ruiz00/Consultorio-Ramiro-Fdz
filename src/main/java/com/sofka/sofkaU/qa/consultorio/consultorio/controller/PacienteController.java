package com.sofka.sofkaU.qa.consultorio.consultorio.controller;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.PacienteRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pacientes")
public class PacienteController implements IController<Paciente> {
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    IService<Paciente> service;
    @GetMapping("/all")
    @Override
    public ResponseEntity mostrar() {
        return new ResponseEntity(service.mostrar(),HttpStatus.FOUND);
    }
    @PostMapping("/agregar")
    @Override
    public ResponseEntity agregar(@RequestBody Paciente paciente) {
        return new ResponseEntity(service.agregar(paciente),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity eliminar(Paciente paciente) {
        return null;
    }
}
