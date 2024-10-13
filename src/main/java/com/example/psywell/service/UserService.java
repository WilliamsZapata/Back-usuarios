package com.example.psywell.service;

import com.example.psywell.dto.inputs.user.UserInput;
import com.example.psywell.dto.outputs.user.UserOutput;
import java.util.List;

public interface UserService {

   public List<UserOutput>obtenerUsuarios();

    public UserOutput addUser(UserInput usuarioInput);
}
