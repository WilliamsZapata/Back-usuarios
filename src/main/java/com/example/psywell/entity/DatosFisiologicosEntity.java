package com.example.psywell.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "datos_fisiologicos")
@Data // Lombok: Genera getters, setters, equals, hashCode, y toString
@NoArgsConstructor // Lombok: Genera un constructor sin argumentos
@AllArgsConstructor // Lombok: Genera un constructor con todos los argumentos
public class DatosFisiologicosEntity {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idUsuario;

@Column(name = "fecha", nullable = true)
private Date fecha;

@Column(name = "pulsaciones", nullable = true)
private int pulsaciones;

@Column(name = "niveles_estres", nullable = true)
private int nivelesEstres;

@Column(name = "calidad_sueno", nullable = true)
private int calidadSueno;

}
