package com.digis01.SLeonProgramacionNCapas.ML;

public class Estado {
    private int IdEstado;
    private String Nombre;
    public Pais Pais;
    
    
    public Estado(){
    
    }
    

    public Estado(int IdEstado, String Nombre, Pais Pais) {
        this.IdEstado = IdEstado;
        this.Nombre = Nombre;
        this.Pais = Pais;
    }
    
    
    
    public int getIdEstado() {
        return IdEstado;
    }

    public void setIdEstado(int IdEstado) {
        this.IdEstado = IdEstado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
