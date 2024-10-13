package com.example.psywell.controller;
import com.example.psywell.JSend.JSendResult;
import com.example.psywell.dto.inputs.user.UserInput;
import com.example.psywell.dto.outputs.user.UserOutput;
//import com.example.psywell.service.UserService;
import com.example.psywell.entity.UserEntity;
import com.example.psywell.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@Slf4j
public class UserController {

     UserServiceImpl userService;

    public UserController(UserServiceImpl userService) {
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


    @PostMapping (value = "/agregarUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces =
            MediaType.APPLICATION_JSON_VALUE)
    public UserEntity addUser(@RequestBody UserInput usuarioInput){
       return this.userService.addUser(usuarioInput);
    }

    @GetMapping(value = "/ListarUsuariosById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUserById(@PathVariable(value="id") Long id) {
    try {
        UserOutput miRespuesta = this.userService.getUserById(id);
        return JSendResult.success(miRespuesta);
    } catch (Exception e) {
        //log.error("Error al listar usuarios: {}", e.getMessage(), e);
        return JSendResult.error("Error al listar usuarios: " + e.getMessage());
    }
}
}
