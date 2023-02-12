package com.sofka.sofkaU.qa.consultorio.consultorio.controller;

import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.PacienteRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.HistoriaService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.HistoriaMedica;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/historias")
public class HistoriasController {
    @Autowired
    HistoriaService historiaMedicaIService;
    @Autowired
    PacienteRepository pacienteRepository;
    @GetMapping("/all")
    public ResponseEntity mostrar() {
        return new ResponseEntity(historiaMedicaIService.mostrar(), HttpStatus.FOUND);
    }
    @PostMapping("/actualizar/{cedula}")
    public ResponseEntity agregar(@PathVariable String cedula,@RequestBody HistoriaMedica historiaMedica) {
        historiaMedicaIService.agregar(pacienteRepository.getPacientes().stream()
                .filter(h -> h.getCedula().equals(cedula))
                .findFirst().get(),historiaMedica);
    return new ResponseEntity(historiaMedica,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/eliminar/{cedula}")
    public ResponseEntity eliminar(@PathVariable String cedula) {
        historiaMedicaIService.eliminar(pacienteRepository.getPacientes().stream()
                .filter(h -> h.getCedula().equals(cedula))
                .findFirst().get());
        return new ResponseEntity("el historial del paciente con cédula "+cedula+" se ha eliminado",HttpStatus.GONE);
    }

    public ResponseEntity actualizar(String cedula, HistoriaMedica historiaMedica) {
        return null;
    }
}
