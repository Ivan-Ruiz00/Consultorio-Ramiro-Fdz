package com.sofka.sofkaU.qa.consultorio.consultorio.controller.modelo;

import com.sofka.sofkaU.qa.consultorio.consultorio.repository.CitaRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class PacienteCon {
    @Autowired
    protected IService<Paciente> service;
    @Autowired
    protected CitaRepository citaRepository;
}
