package com.example.psywell.dto.outputs.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.swing.*;
import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserOutput {
        private Long idUsuario;
        private String rut;
        private String nombre;
        private String correo;
        private String contrasena;
        private String rol;
        private String fechaNacimiento;
        private String genero;
        private Boolean estado;

}
