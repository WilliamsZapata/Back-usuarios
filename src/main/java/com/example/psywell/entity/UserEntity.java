package com.example.psywell.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;



@Data
@NoArgsConstructor
@AllArgsConstructor
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
    public Boolean genero;

    @Column(name = "estado", nullable = true)
    public Boolean estado;
}
