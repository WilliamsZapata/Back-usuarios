package com.example.psywell.controller;
import com.example.psywell.JSend.JSendResult;
import com.example.psywell.dto.outputs.user.UserOutput;
import com.example.psywell.repository.UserRepository;
import com.example.psywell.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserRepository userRepository, UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/ListarUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUser() {
        try {
            List<UserOutput> miRespuesta = this.userService.obtenerUsuarios();
            return JSendResult.success(miRespuesta);
        } catch (Exception e) {
            //log.error("Error al listar usuarios: {}", e.getMessage(), e);
            return JSendResult.error("Error al listar usuarios: " + e.getMessage());
        }
    }

/*
    @PostMapping (value = "/agregarUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces =
            MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>agregarUsuario(@RequestBody UsuarioInput usuarioInput){

        Long
    }
    public
*/
}
