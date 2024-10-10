package com.example.psywell.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "fichaPaciente")
@Data // Lombok: Genera getters, setters, equals, hashCode, y toString
@NoArgsConstructor // Lombok: Genera un constructor sin argumentos
@AllArgsConstructor // Lombok: Genera un constructor con todos los argumentos
public class InformePsicologoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPsicologo;

    @Column(name = "idPaciente", nullable = true)
    private String idPaciente;

    @Column(name = "fecha", nullable = true)
    private Date fecha;

    @Column(name = "analisis", nullable = true)
    private String analisis;

    @Column(name = "recomendacones", nullable = true)
    private String recomendaciones;


}
