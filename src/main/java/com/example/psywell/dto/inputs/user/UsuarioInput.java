package com.example.psywell.dto.inputs.user;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsuarioInput {
    private Long idUsuario;
    private String nombre;
    private String rut;
    private String corrreo;
    private JPasswordField contrasena;
    private Date fechaNacimiento;
    private Boolean sexo;
    private Boolean estado;
}
