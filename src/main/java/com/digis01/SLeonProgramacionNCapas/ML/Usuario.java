package com.digis01.SLeonProgramacionNCapas.ML;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;

public class Usuario {
    
    private int IdUsuario;

    private String Nombre;

    private String ApellidoPaterno;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date FechaNacimiento;

    private String ApellidoMaterno;
    
    private String Username;

    private String Email;

    private String Password;

    private String Sexo;

    private String Telefono;

    private String Celular;

    private String CURP;
    private int IdRol;
    public Rol Rol;
    
    private int Status;

    public List<Direccion> Direcciones;
    private String Imagen;
    
    

    public Usuario() {
    }
    
   
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    
    
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    
    public String getNombre(){
        return this.Nombre;
    }
    
    public void setApellidoPaterno(String apellidopaterno) {
        this.ApellidoPaterno = apellidopaterno; 
    }
    
    public String getApellidoPaterno(){
        return ApellidoPaterno;
    }

    
    
    
    public void setFechaNacimiento(Date fechanacimiento){
        this.FechaNacimiento = fechanacimiento;
    }
    
    public Date getFechaNacimiento(){
        return FechaNacimiento;
    }
    
  
    
    public void setApellidoMaterno(String apellidomaterno){
        this.ApellidoMaterno = apellidomaterno;
    }
    
    public String getApellidoMaterno(){
        return ApellidoMaterno;
    }
    
    public void setUsername(String username) {
        this.Username = username;
    }
    
    public String getUsername() {
        return Username;
    }
    
    public void setEmail(String email) {
        this.Email = email;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setPassword(String password) {
        this.Password = password;
    }
    
    public String getPassword() {
        return Password;
    }
    
    public void setSexo(String sexo) {
        this.Sexo = sexo;
    }
    
    public String getSexo() {
        return Sexo;
    }
    
    public void setTelefono(String telefono){
        this.Telefono = telefono;
    }
    
    public String getTelefono(){
        return Telefono;
    }
    
    public void setCelular(String celular){
        this.Celular = celular;
    }
    
    public String getCelular(){
        return Celular;
    }
    
    public void setCURP(String curp){
        this.CURP = curp;
    }
    
    public String getCURP(){
        return CURP;
    }
    
    public void setIdRol(int idrol){
        this.IdRol = idrol;
    }
    
    public int getIdRol(){
        return IdRol;
    }

    public Rol getRol() {
        return Rol;
    }

    public void setRol(Rol Rol) {
        this.Rol = Rol;
    }

    

    public List<Direccion> getDirecciones() {
        return Direcciones;
    }

    public void setDirecciones(List<Direccion> Direcciones) {
        this.Direcciones = Direcciones;
    }
    
    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String Imagen) {
        this.Imagen = Imagen;
    }

    public Usuario(String Nombre, String ApellidoPaterno, String ApellidoMaterno, Rol rol) {
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Rol = rol;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public Usuario(int IdUsuario, String Nombre, String ApellidoPaterno, Date FechaNacimiento, String ApellidoMaterno, String Username, String Email, String Password, String Sexo, String Telefono, String Celular, String CURP, int IdRol, Rol Rol, int Status, List<Direccion> Direcciones, String Imagen) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.FechaNacimiento = FechaNacimiento;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
        this.Sexo = Sexo;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.CURP = CURP;
        this.IdRol = IdRol;
        this.Rol = Rol;
        this.Status = Status;
        this.Direcciones = Direcciones;
        this.Imagen = Imagen;
        
    }
    
    

    

    

    
    
}
