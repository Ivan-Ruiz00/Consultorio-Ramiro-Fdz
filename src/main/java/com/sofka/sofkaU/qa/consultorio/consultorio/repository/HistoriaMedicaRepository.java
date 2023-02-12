package com.sofka.sofkaU.qa.consultorio.consultorio.repository;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo.IRepositorio;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.HistoriaMedica;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class HistoriaMedicaRepository{
    protected HashMap<Paciente,ArrayList<HistoriaMedica>> historias=new HashMap<>();
    public HashMap<Paciente, ArrayList<HistoriaMedica>> getHistorias() {
        return historias;
    }
    public void agregar(Paciente paciente, HistoriaMedica historiaMedica) {
        ArrayList<HistoriaMedica> lista=historias.get(paciente);
        lista.add(historiaMedica);
        historias.put(paciente,lista);
    }
    public void eliminar(Paciente paciente) {
        historias.remove(paciente);
    }
    public void actualizar(Paciente paciente, HistoriaMedica historiaMedica){
        ArrayList<HistoriaMedica> lista=historias.get(paciente);
        lista.add(historiaMedica);
        historias.put(paciente,lista);
    }
}
