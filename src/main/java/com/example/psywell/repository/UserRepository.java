package com.example.psywell.repository;

import com.example.psywell.dto.outputs.user.UsuarioOutput;
import com.example.psywell.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<Usuario, Long> {

    @Query("SELECT NEW com.example.psywell.dto.outputs.user.UserOutputs(" +
            "u.idUsuario, u.nombre, u.rut, u.correo, u.contrasena, " +
            "u.fechaNacimiento, u.sexo, u.estado) " +
            "FROM Usuario u WHERE u.estado = true ORDER BY u.nombre ASC")
    List<UsuarioOutput> obtenerUsuariosActivos();
}


