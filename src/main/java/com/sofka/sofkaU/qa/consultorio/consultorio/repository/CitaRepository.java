package com.sofka.sofkaU.qa.consultorio.consultorio.repository;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo.IRepositorio;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CitaRepository implements IRepositorio<Cita>{
    private final int horasDiarias=8;
    private Set<Cita> citas=new HashSet<>();
    private HashMap<String,Integer> semana= new HashMap<>();
    public CitaRepository() {
        semana.put("Lunes",getHorasDiarias());
        semana.put("Martes",getHorasDiarias());
        semana.put("Miercoles",getHorasDiarias());
        semana.put("Jueves",getHorasDiarias());
        semana.put("Viernes",getHorasDiarias());
    }

    public Set<Cita> getCitas() {
        return citas;
    }
    @Override
    public void agregar(Cita cita) {
        if (semana.get(cita.getDia())>0){
                if (!citas.stream().anyMatch(c -> c.getDia()
                        .equals(cita.getDia())&&c.getHoras().equals(cita.getHoras()))){
                    citas.add(cita);
                    semana.put(cita.getDia(),semana.get(cita.getDia())-Integer.parseInt(cita.getDuracion()));
                }
            return;
        }
        System.out.println("La agenda del día "+cita.getDia()+" se encuentra a tope");
    }

    @Override
    public void eliminar(Cita cita) {
        citas.remove(cita);
    }

    @Override
    public void actualizar(String id, Cita cita) {
        if (id.isBlank()) {
            Optional<Cita> citaActualizar = citas.stream()
                    .filter(c -> c.getPaciente().getNombre().equals(cita.getPaciente().getNombre())).findFirst();
            if (citaActualizar.isPresent()) {
                citas.remove(citaActualizar.get());
                citas.add(cita);
            }
        } else {
            Optional<Cita> citaActualizar = citas.stream()
                    .filter(c -> c.getPaciente().getCedula().equals(id)).findFirst();
            if (citaActualizar.isPresent()) {
                citas.remove(citaActualizar.get());
                citas.add(cita);
            }
        }
    }

    public int getHorasDiarias() {
        return horasDiarias;
    }
}
