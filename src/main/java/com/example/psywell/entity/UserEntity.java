package com.example.psywell.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;


@Entity
@Table(name = "usuario")

public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idUsuario;

    @Column(name = "rut", nullable = true)
    public String rut;

    @Column(name = "nombre", nullable = true)
    public String nombre;

    @Column(name = "correo", nullable = true)
    public String correo;

    @Column(name = "contrasena", nullable = true)
    public String contrasena;

    @Column(name = "rol", nullable = true)
    public String rol;

    @Column(name = "fecha_nacimiento", nullable = true)
    public String fechaNacimiento;

    @Column(name = "genero", nullable = true)
    public String genero;

    @Column(name = "estado", nullable = true)
    public Boolean estado;

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public UserEntity() {
    }

    public UserEntity(Long idUsuario, String rut, String nombre, String correo, String contrasena,
                      String rol, String fechaNacimiento, String genero, Boolean estado) {
        this.idUsuario = idUsuario;
        this.rut = rut;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.rol = rol;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.estado = estado;
    }
}
