package com.sofka.sofkaU.qa.consultorio.consultorio.controller;

import com.sofka.sofkaU.qa.consultorio.consultorio.repository.PacienteRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pacientes/existentes")
public class PacienteExistenteController extends PacienteController{
    @Autowired
    protected PacienteRepository pacienteRepository;
    @Autowired
    protected IService<Cita> citaIService;
    @PostMapping("/agendar/citas/{cedula}")
    public ResponseEntity agendarCita(@PathVariable String cedula,@RequestBody Cita cita){
        cita.setPaciente(pacienteRepository.getPacientes().
                stream().filter(p -> p.getCedula()
                        .equals(cedula)).findFirst()
                .get());
        return new ResponseEntity(citaIService.agregar(cita),HttpStatus.ACCEPTED);
    }
}
