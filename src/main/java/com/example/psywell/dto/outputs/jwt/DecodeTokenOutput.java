package com.example.psywell.dto.outputs.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DecodeTokenOutput {
    private String sub;
    private Long exp;
    private Long funcionarioId;
    private String nombre;
    private Long rut;
    private String email;


}