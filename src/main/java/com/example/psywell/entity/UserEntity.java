package com.example.psywell.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuario")

public class UserEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idUsuario;

    @Column(name = "nombre", nullable = true)
    public String nombre;

    @Column(name = "email", nullable = true)
    public String email;

    @Column(name = "contrasena", nullable = true)
    public String contrasena;

    @Column(name = "perfil", nullable = true)
    public String perfil;

    @Column(name = "fecha_nacimiento", nullable = true)
    public String fechaNacimiento;

    @Column(name = "genero", nullable = true)
    public String genero;

    @Column(name = "estado", nullable = true)
    public Boolean estado;


}
