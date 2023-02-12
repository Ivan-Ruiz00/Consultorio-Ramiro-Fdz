package com.sofka.sofkaU.qa.consultorio.consultorio.controller;

import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.PacienteCon;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pacientes/existentes")
public class PacienteExistenteController extends PacienteCon implements IController<Paciente>{
    @GetMapping("/all")
    @Override
    public ResponseEntity mostrar() {
        return new ResponseEntity(super.service.mostrar(), HttpStatus.FOUND);
    }
    @PostMapping("/agregar")
    @Override
    public ResponseEntity agregar(Paciente paciente) {
        return new ResponseEntity(super.service.agregar(paciente),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/")
    @Override
    public ResponseEntity eliminar(Paciente paciente) {
        return null;
    }

}
