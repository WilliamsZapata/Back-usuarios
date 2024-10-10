package com.example.psywell.service;

import com.example.psywell.dto.outputs.user.UsuarioOutput;
import java.util.List;

public interface UserService {

    List<UsuarioOutput>obtenerUsuarios();
}
