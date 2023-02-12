package com.sofka.sofkaU.qa.consultorio.consultorio.service;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.PacienteRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PacienteService implements IService<Paciente>{
    @Autowired
    PacienteRepository pacienteRepository;
    public Set<Paciente> getPacientes(){
        return pacienteRepository.getPacientes();
    }
    @Override
    public void getServicio() {
        this.getPacientes();
    }
}
