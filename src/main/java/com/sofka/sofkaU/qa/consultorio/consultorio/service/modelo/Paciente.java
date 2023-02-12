package com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo;

import java.util.Objects;

public class Paciente {
    private String nombre,cedula;
    private int edad;
    private Cita cita;
    private HistoriaMedica historiaMedica;
    public Cita getCita() {
        return cita;
    }
    public void setCita(Cita cita) {
        this.cita = cita;
    }
    public HistoriaMedica getHistoriaMedica() {
        return historiaMedica;
    }

    public void setHistoriaMedica(HistoriaMedica historiaMedica) {
        this.historiaMedica = historiaMedica;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paciente paciente = (Paciente) o;
        return edad == paciente.edad || Objects.equals(nombre, paciente.nombre) || Objects.equals(cedula, paciente.cedula);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nombre, cedula, edad);
    }
}
