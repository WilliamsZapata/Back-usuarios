package com.example.psywell.service.impl;

import com.example.psywell.dto.outputs.user.UserOutput;
import com.example.psywell.entity.UserEntity;
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
    public List<UserOutput> obtenerUsuarios() {
        List<UserEntity> listado = this.userRepository.findAll();
        List<UserOutput>listOut = null;
        for (int i = 0 ; i<listado.size(); i++){
            UserOutput out = new UserOutput();
         //   out.setIdUsuario(listado.get(i).getIdUsuario());

            listOut.add(out);
        }
        return listOut;
    }


}
