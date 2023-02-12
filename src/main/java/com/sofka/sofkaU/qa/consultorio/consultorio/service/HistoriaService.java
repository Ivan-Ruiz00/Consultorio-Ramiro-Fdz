package com.sofka.sofkaU.qa.consultorio.consultorio.service;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.HistoriaMedicaRepository;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.HistoriaMedica;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class HistoriaService {
    @Autowired
    protected HistoriaMedicaRepository historiaMedicaRepository;
    public HashMap<Paciente, ArrayList<HistoriaMedica>> getHistoriaMedica(){
        return historiaMedicaRepository.getHistorias();
    }
}
