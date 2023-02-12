package com.sofka.sofkaU.qa.consultorio.consultorio.service;

import com.sofka.sofkaU.qa.consultorio.consultorio.repository.CitaRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.IService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class CitaService implements IService<Cita>{
    @Autowired
    CitaRepository citaRepository;
    @Override
    public Cita agregar(Cita cita) {
        citaRepository.agregar(cita);
        return cita;
    }

    @Override
    public ArrayList<Cita> mostrar() {
        return (ArrayList<Cita>)citaRepository.getCitas().stream().collect(Collectors.toList());
    }

    @Override
    public Cita actualizar(String id, Cita cita) {
        return null;
    }

    @Override
    public String eliminar(Cita cita) {
        return null;
    }
}
