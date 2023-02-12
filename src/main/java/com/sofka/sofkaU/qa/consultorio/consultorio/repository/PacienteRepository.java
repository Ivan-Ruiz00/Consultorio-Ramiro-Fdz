package com.sofka.sofkaU.qa.consultorio.consultorio.repository;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo.IRepositorio;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.stereotype.Repository;
import java.util.HashSet;
import java.util.Set;
@Repository
public class PacienteRepository implements IRepositorio<Paciente>{
    private Set<Paciente> pacientes=new HashSet<>();
    public Set<Paciente> getPacientes() {
        return pacientes;
    }
    @Override
    public void agregar(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public void eliminar(Paciente paciente) {
        pacientes.remove(paciente);
    }

    @Override
    public void actualizar(Paciente p) {
        pacientes.stream()
                .filter(paciente -> paciente.getNombre().equalsIgnoreCase(p.getNombre()))
                .findFirst()
                .ifPresent(paciente -> paciente=p);
    }
}
