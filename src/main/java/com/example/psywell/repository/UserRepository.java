package com.example.psywell.repository;

import com.example.psywell.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByPerfil(String perfil);

    // Método para buscar un usuario por su correo electrónico
    Optional<UserEntity> findByEmail(String email);
}
