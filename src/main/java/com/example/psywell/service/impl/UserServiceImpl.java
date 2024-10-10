package com.example.psywell.service.impl;

import com.example.psywell.dto.outputs.user.UsuarioOutput;
import com.example.psywell.repository.UserRepository;
import com.example.psywell.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UsuarioOutput> obtenerUsuarios() {
        return this.userRepository.obtenerUsuariosActivos();
    }
}
