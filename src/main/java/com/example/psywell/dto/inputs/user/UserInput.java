package com.example.psywell.dto.inputs.user;



public class UserInput {
    private String rut;
    private String nombre;
    private String correo;
    private String contrasena;
    private String rol;
    private String fechaNacimiento;
    private String genero;
    private Boolean estado;

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public UserInput() {
    }

    public UserInput(Boolean estado, String genero, String fechaNacimiento, String rol, String contrasena,
                     String correo, String nombre, String rut) {
        this.estado = estado;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.rol = rol;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nombre = nombre;
        this.rut = rut;
    }
}
