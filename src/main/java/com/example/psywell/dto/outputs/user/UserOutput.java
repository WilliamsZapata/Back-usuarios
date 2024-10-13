package com.example.psywell.dto.outputs.user;

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

        public Long getIdUsuario() {
                return idUsuario;
        }

        public void setIdUsuario(Long idUsuario) {
                this.idUsuario = idUsuario;
        }

        public String getRut() {
                return rut;
        }

        public void setRut(String rut) {
                this.rut = rut;
        }

        public String getNombre() {
                return nombre;
        }

        public void setNombre(String nombre) {
                this.nombre = nombre;
        }

        public String getCorreo() {
                return correo;
        }

        public void setCorreo(String correo) {
                this.correo = correo;
        }

        public String getContrasena() {
                return contrasena;
        }

        public void setContrasena(String contrasena) {
                this.contrasena = contrasena;
        }

        public String getRol() {
                return rol;
        }

        public void setRol(String rol) {
                this.rol = rol;
        }

        public String getFechaNacimiento() {
                return fechaNacimiento;
        }

        public void setFechaNacimiento(String fechaNacimiento) {
                this.fechaNacimiento = fechaNacimiento;
        }

        public String getGenero() {
                return genero;
        }

        public void setGenero(String genero) {
                this.genero = genero;
        }

        public Boolean getEstado() {
                return estado;
        }

        public void setEstado(Boolean estado) {
                this.estado = estado;
        }

        public UserOutput() {
        }

        public UserOutput(Long idUsuario, String rut, String nombre, String correo, String contrasena,
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
