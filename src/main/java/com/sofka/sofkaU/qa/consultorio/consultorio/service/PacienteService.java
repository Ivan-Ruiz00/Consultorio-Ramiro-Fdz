package com.sofka.sofkaU.qa.consultorio.consultorio.service;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.PacienteRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class PacienteService implements IService<Paciente>{
    @Autowired
    PacienteRepository pacienteRepository;
    public Set<Paciente> getPacientes(){
        return pacienteRepository.getPacientes();
    }
    @Override
    public Paciente agregar(Paciente paciente) {
        if (paciente.getNombre()==null||paciente.getCedula()==null) {
            System.out.println("No se pudo agregar el paciente");
            return null;
        }
        this.pacienteRepository.agregar(paciente);
        return paciente;
    }

    @Override
    public ArrayList<Paciente> mostrar() {
        return (ArrayList<Paciente>)this.pacienteRepository.getPacientes().stream().collect(Collectors.toList());
    }
}
