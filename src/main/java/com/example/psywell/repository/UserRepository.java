package com.example.psywell.repository;

import com.example.psywell.dto.outputs.user.UserOutput;
import com.example.psywell.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByPerfil(String perfil);

}




