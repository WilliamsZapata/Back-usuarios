package com.example.psywell.service.impl;

import com.example.psywell.dto.inputs.user.UserInput;
import com.example.psywell.dto.outputs.user.UserOutput;
import com.example.psywell.entity.UserEntity;
import com.example.psywell.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UserServiceImpl {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserOutput> obtenerUsuarios() {
        List<UserEntity> listado = this.userRepository.findAll();
        List<UserOutput> listOut = new ArrayList<>();
        for (UserEntity userEntity : listado) {
            UserOutput out = new UserOutput();
            out.setIdUsuario(userEntity.getIdUsuario());
            out.setNombre(userEntity.getNombre());
            out.setEmail(userEntity.getEmail());
            out.setContrasena(userEntity.getContrasena());
            out.setPerfil(userEntity.getPerfil());
            out.setFechaNacimiento(userEntity.getFechaNacimiento());
            out.setGenero(userEntity.getGenero());
            out.setEstado(userEntity.getEstado());
            listOut.add(out);
        }
        return listOut;
    }

    public UserEntity addUser(UserInput usuarioInput) {
        UserEntity user = new UserEntity();
        user.setNombre(usuarioInput.getNombre());
        user.setEmail(usuarioInput.getEmail());
        user.setContrasena(usuarioInput.getContrasena());
        user.setPerfil(usuarioInput.getPerfil());
        user.setFechaNacimiento(usuarioInput.getFechaNacimiento());
        user.setGenero(usuarioInput.getGenero());
        user.setEstado(true);
        return userRepository.save(user);  // Guarda el usuario y lo retorna
    }


    public UserOutput getUserById(Long id) {
        List<UserEntity> listado = this.userRepository.findAllById(Collections.singleton(id));
        List<UserOutput> listOut = new ArrayList<>();
        for (UserEntity userEntity : listado) {
            UserOutput out = new UserOutput();
            out.setIdUsuario(userEntity.getIdUsuario());
            out.setNombre(userEntity.getNombre());
            out.setEmail(userEntity.getEmail());
            out.setContrasena(userEntity.getContrasena());
            out.setPerfil(userEntity.getPerfil());
            out.setFechaNacimiento(userEntity.getFechaNacimiento());
            out.setGenero(userEntity.getGenero());
            out.setEstado(userEntity.getEstado());
            listOut.add(out);
        }
        return listOut.get(0);
    }

    // Nuevo método para verificar si el usuario existe o guardarlo si no existe
    public UserEntity verificarOGuardarUsuario(UserInput usuarioInput) {
        Optional<UserEntity> usuarioExistente = userRepository.findByEmail(usuarioInput.getEmail());
        if (usuarioExistente.isPresent()) {
            // Si el usuario ya existe, retornamos el usuario existente
            log.info("Usuario ya existe: {}", usuarioExistente.get().getEmail());
            return usuarioExistente.get();
        } else {
            // Si el usuario no existe, lo creamos y guardamos
            UserEntity nuevoUsuario = new UserEntity();
            nuevoUsuario.setNombre(usuarioInput.getNombre());
            nuevoUsuario.setEmail(usuarioInput.getEmail());
            nuevoUsuario.setContrasena(usuarioInput.getContrasena());
            nuevoUsuario.setPerfil(usuarioInput.getPerfil());
            nuevoUsuario.setFechaNacimiento(usuarioInput.getFechaNacimiento());
            nuevoUsuario.setGenero(usuarioInput.getGenero());
            nuevoUsuario.setEstado(true);
            log.info("Nuevo usuario creado: {}", nuevoUsuario.getEmail());
            return userRepository.save(nuevoUsuario);
        }
    }
}
