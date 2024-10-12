package com.example.psywell.service;

import com.example.psywell.dto.outputs.user.UserOutput;
import java.util.List;

public interface UserService {

    List<UserOutput>obtenerUsuarios();
}
