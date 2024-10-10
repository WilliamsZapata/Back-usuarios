package com.example.psywell.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.swing.*;
import java.util.Date;

@Entity
@Table(name = "usuario")
@Data // Lombok: Genera getters, setters, equals, hashCode, y toString
@NoArgsConstructor // Lombok: Genera un constructor sin argumentos
@AllArgsConstructor // Lombok: Genera un constructor con todos los argumentos
public class Usuario {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idUsuario;

@Column(name = "rut", nullable = true)
private int rut;

@Column(name = "nombre", nullable = true)
private String nombre;

@Column(name = "correo", nullable = true)
private String corrreo;

@Column(name = "contrasena", nullable = true)
private JPasswordField contrasena;

@Column(name = "rol", nullable = true)
private String rol;

@Column(name = "fechaNacimiento", nullable = true)
private Date fechaNacimiento;

@Column(name = "genero", nullable = true)
private Boolean genero;

@Column(name = "sexo", nullable = true)
private Boolean estado;

}
