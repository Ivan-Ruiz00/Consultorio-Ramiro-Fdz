package com.sofka.sofkaU.qa.consultorio.consultorio.controller;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.IController;
import com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo.PacienteCon;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.CitaRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/pacientes")
public class PacienteController extends PacienteCon implements IController<Paciente>{

    @GetMapping("/all")
    @Override
    public ResponseEntity mostrar() {
        return new ResponseEntity(super.service.mostrar(),HttpStatus.FOUND);
    }
    @PostMapping("/agregar")
    @Override
    public ResponseEntity agregar(@RequestBody Paciente paciente) {
        return new ResponseEntity(super.service.agregar(paciente),HttpStatus.ACCEPTED);
    }
    @PutMapping("/{cedula}")
    public ResponseEntity actualizar(@PathVariable String cedula,@RequestBody Paciente paciente){
        super.citaRepository.getCitas().stream().filter(cita -> cita.getPaciente().equals(paciente))
                .findFirst().ifPresent(cita -> cita.setPaciente(paciente));
        return new ResponseEntity(super.service.actualizar(cedula,paciente),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/eliminar")
    @Override
    public ResponseEntity eliminar(@RequestBody Paciente paciente) {
        return new ResponseEntity(super.service.eliminar(paciente),HttpStatus.GONE);
    }
}
