package com.sofka.sofkaU.qa.consultorio.consultorio.controller;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.PacienteRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("api/v1/pacientes")
public class PacienteController implements IController<Paciente> {
    @Autowired
    PacienteRepository pacienteRepository;
    @Autowired
    IService<Paciente> service;
    @PostMapping("/agregar")
    @Override
    public ResponseEntity agregar(Paciente paciente) {
        return new ResponseEntity(,HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity eliminar(Paciente paciente) {
        return null;
    }
}
