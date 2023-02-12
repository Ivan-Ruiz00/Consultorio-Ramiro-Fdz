package com.sofka.sofkaU.qa.consultorio.consultorio.controller;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/citas")
public class CitaController implements IController<Cita>{
    @Autowired
    private IService<Cita> service;
    @Autowired
    private IService<Paciente> pacienteIService;
    @GetMapping("/all")
    @Override
    public ResponseEntity mostrar() {
        return new ResponseEntity(service.mostrar(),HttpStatus.FOUND);
    }
    @PostMapping("/agendar")
    @Override
    public ResponseEntity agregar(@RequestBody Cita cita) {
        pacienteIService.agregar(cita.getPaciente());
        return new ResponseEntity(service.agregar(cita), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity eliminar(Cita cita) {
        return new ResponseEntity(service.eliminar(cita),HttpStatus.GONE);
    }

    @Override
    public ResponseEntity actualizar(String cedula, Cita cita) {
        return new ResponseEntity(service.actualizar(cedula,cita),HttpStatus.ACCEPTED);
    }
}
