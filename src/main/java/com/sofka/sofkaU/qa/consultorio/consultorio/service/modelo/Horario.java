package com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo;

import java.util.Objects;

public abstract class Horario {
    private String duracion, horas, dia;
    public String getDuracion() {
        return duracion;
    }
    public String getHoras() {
        return horas;
    }
    public String getDia() {
        return dia;
    }
}
