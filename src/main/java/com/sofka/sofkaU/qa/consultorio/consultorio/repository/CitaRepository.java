package com.sofka.sofkaU.qa.consultorio.consultorio.repository;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo.IRepositorio;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Cita;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Repository
public class CitaRepository implements IRepositorio<Cita>{
    private final int horasDiarias=8;
    private HashMap<String,Integer> semana= (HashMap<String, Integer>)Map.of("Lunes",getHorasDiarias(),"Martes",getHorasDiarias()
    ,"Miercoles",getHorasDiarias(),"Jueves",getHorasDiarias(),"Viernes",getHorasDiarias());
    Set<Cita> citas=new HashSet<>();
    @Override
    public void agregar(Cita cita) {
        if (semana.get(cita.getDia())>0){
            citas.add(cita);
            return;
        }
        System.out.println("La agenda del día "+cita.getDia()+" se encuentra a tope");
    }

    @Override
    public void eliminar(Cita cita) {

    }

    @Override
    public void actualizar(String id, Cita cita) {

    }

    public int getHorasDiarias() {
        return horasDiarias;
    }
}
