package com.sofka.sofkaU.qa.consultorio.consultorio.repository;
import com.sofka.sofkaU.qa.consultorio.consultorio.repository.modelo.IRepositorio;
import com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo.Paciente;
import org.springframework.stereotype.Repository;
import java.util.HashSet;
import java.util.Optional;
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
    public void actualizar(String id,Paciente p) {
        if (id.isBlank()) {
            System.out.println("Entró");
            Optional<Paciente> pacienteActualizar = pacientes.stream()
                    .filter(paciente -> paciente.getNombre().equals(p.getNombre())).findFirst();
            if (pacienteActualizar.isPresent()) {
                pacientes.remove(pacienteActualizar.get());
                pacientes.add(p);
            }
        } else {
                Optional<Paciente> pacienteAntiguo = pacientes.stream()
                        .filter(paciente -> paciente.getCedula().equals(id)).findFirst();
                if (pacienteAntiguo.isPresent()) {
                    pacientes.remove(pacienteAntiguo.get());
                    pacientes.add(p);
                }
        }
    }
}
