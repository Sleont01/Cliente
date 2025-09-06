package com.digis01.SLeonProgramacionNCapas.ML;

public class Pais {
    private int IdPais;
    private String Nombre;
    
    public Pais(){
    }
    

    public Pais(int IdPais, String Nombre) {
        this.IdPais = IdPais;
        this.Nombre = Nombre;
    }
    
    

    public int getIdPais() {
        return IdPais;
    }

    public void setIdPais(int idPais) {
        this.IdPais = idPais;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
}
