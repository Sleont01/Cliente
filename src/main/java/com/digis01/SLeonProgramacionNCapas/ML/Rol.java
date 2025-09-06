package com.digis01.SLeonProgramacionNCapas.ML;

public class Rol {
    
    private int IdRol;
    private String Nombre;
    
    public Rol(){
    
    }
    


    public Rol(int idRol, String nombre) {
        this.IdRol = idRol;
        this.Nombre = nombre;
    }

  

    

    
    

    public int getIdRol() {
        return IdRol;
    }

    public void setIdRol(int IdRol) {
        this.IdRol = IdRol;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
