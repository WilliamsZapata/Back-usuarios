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

@Service
@Slf4j
public class UserServiceImpl {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

  //  @Override
    public List<UserOutput> obtenerUsuarios() {
        List<UserEntity> listado = this.userRepository.findAll();
        List<UserOutput>listOut = new ArrayList<>();
        for (int i = 0 ; i<listado.size(); i++){
            UserOutput out = new UserOutput();
            out.setIdUsuario(listado.get(i).getIdUsuario());
            out.setRut(listado.get(i).getRut());
            out.setNombre(listado.get(i).getNombre());
            out.setCorreo(listado.get(i).getCorreo());
            out.setContrasena(listado.get(i).getContrasena());
            out.setRol(listado.get(i).getRol());
            out.setFechaNacimiento(listado.get(i).getFechaNacimiento());
            out.setGenero(listado.get(i).getGenero());
            out.setEstado(listado.get(i).getEstado());
            listOut.add(out);
        }
        return listOut;
    }

   // @Override
    public UserEntity addUser(UserInput usuarioInput) {
        UserEntity user = new UserEntity();
        user.setNombre(usuarioInput.getNombre());
        user.setRut(usuarioInput.getRut());
        user.setCorreo(usuarioInput.getCorreo());
        user.setContrasena(usuarioInput.getContrasena());
        user.setRol(usuarioInput.getRol());
        user.setFechaNacimiento(usuarioInput.getFechaNacimiento());
        user.setGenero(usuarioInput.getGenero());
        user.setEstado(true);
        this.userRepository.save(user) ;
        return user;
    }

    public UserOutput getUserById(Long id) {
        List<UserEntity> listado = this.userRepository.findAllById(Collections.singleton(id));
        List<UserOutput>listOut = new ArrayList<>();
        for (int i = 0 ; i<listado.size(); i++){
            UserOutput out = new UserOutput();
            out.setIdUsuario(listado.get(i).getIdUsuario());
            out.setRut(listado.get(i).getRut());
            out.setNombre(listado.get(i).getNombre());
            out.setCorreo(listado.get(i).getCorreo());
            out.setContrasena(listado.get(i).getContrasena());
            out.setRol(listado.get(i).getRol());
            out.setFechaNacimiento(listado.get(i).getFechaNacimiento());
            out.setGenero(listado.get(i).getGenero());
            out.setEstado(listado.get(i).getEstado());
            listOut.add(out);
        }
        return listOut.get(0);
    }
}
