package com.example.psywell.controller;
import com.example.psywell.JSend.JSendResult;
import com.example.psywell.dto.inputs.user.UsuarioInput;
import com.example.psywell.dto.outputs.user.UsuarioOutput;
import com.example.psywell.repository.UserRepository;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@Slf4j
public class UsuarioController {
    /*
    private final UserRepository userRepository;

    public UsuarioController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/ListarUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>getUSer() {
        try{
            List<UsuarioOutput>miRespuesta = this.userRepository.obtenerUsuariosActivos();
        } catch (Exception e) {
           // log.error("Error al listar servicios: " + e.getMessage(), e);
            return JSendResult.error("Error al listar servicios: " + e.getMessage());
        }
        return null;
    }
/*
    @PostMapping (value = "/agregarUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces =
            MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object>agregarUsuario(@RequestBody UsuarioInput usuarioInput){

        Long
    }
    public*/

}
