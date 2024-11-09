package com.example.psywell.dto.inputs.user;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInput {
    private Long idUsuario;
    private String nombre;
    private String email;
    private String contrasena;
    private String perfil;
    private String fechaNacimiento;
    private String genero;
    private Boolean estado;

}
