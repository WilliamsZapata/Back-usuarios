package com.example.psywell.repository;

import com.example.psywell.dto.outputs.user.UserOutput;
import com.example.psywell.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
  /*  @Query("SELECT NEW com.example.psywell.dto.outputs.user.UserOutput(u.idUsuario, u.rut, u.nombre, u.correo, u.contrasena, u.rol, u.fechaNacimiento, u.genero, u.estado) " +
            "FROM UserEntity u WHERE u.estado = true ORDER BY u.nombre ASC")
    ArrayList<UserOutput> obtenerUsuariosActivos();*/
}




