package com.sofka.sofkaU.qa.consultorio.consultorio.service.modelo;
public class HistoriaMedica {
    private String descripcion;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
class HistoriaMedicaBuilder{
    private HistoriaMedica historiaMedica;
    public HistoriaMedicaBuilder(){
        historiaMedica=new HistoriaMedica();
    }
    public HistoriaMedicaBuilder descripcion(String descripcion){
        historiaMedica.setDescripcion(descripcion);
        return this;
    }
    public HistoriaMedica build(){
        return historiaMedica;
    }
}
