package com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo;

import java.util.Objects;

public class Cita extends Horario{
    private String descripcion;
    private Paciente paciente;
    public String getDescripcion() {
        return descripcion;
    }
    public Paciente getPaciente() {
        return paciente;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
