package com.example.psywell.controller;

import com.example.psywell.JSend.JSendResult;
import com.example.psywell.dto.inputs.user.UserInput;
import com.example.psywell.dto.outputs.user.UserOutput;
import com.example.psywell.entity.UserEntity;
import com.example.psywell.repository.UserRepository;
import com.example.psywell.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.OPTIONS}, allowCredentials = "true")
@Slf4j
public class UserController {

    private final UserServiceImpl userService;
    private final UserRepository userRepository; // Inyección del UserRepository

    // Constructor para inyectar UserServiceImpl y UserRepository
    public UserController(UserServiceImpl userService, UserRepository userRepository) {
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping(value = "/ListarUsuarios", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUser() {
        try {
            List<UserOutput> miRespuesta = this.userService.obtenerUsuarios();
            return JSendResult.success(miRespuesta);
        } catch (Exception e) {
            log.error("Error al listar usuarios: {}", e.getMessage(), e);
            return JSendResult.error("Error al listar usuarios: " + e.getMessage());
        }
    }

    @PostMapping(value = "/agregarUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> addUser(@RequestBody UserInput usuarioInput) {
        try {
            // Verificar si el usuario ya existe
            Optional<UserEntity> usuarioExistente = userRepository.findByEmail(usuarioInput.getEmail());
            if (usuarioExistente.isPresent()) {
                // Si el usuario ya existe, retornamos una respuesta con el usuario
                return JSendResult.success(usuarioExistente.get());
            }

            // Si el usuario no existe, lo guardamos
            UserEntity nuevoUsuario = userService.addUser(usuarioInput);
            return JSendResult.success(nuevoUsuario);
        } catch (Exception e) {
            log.error("Error al agregar usuario: {}", e.getMessage(), e);
            return JSendResult.error("Error al agregar usuario: " + e.getMessage());
        }
    }

    @GetMapping(value = "/ListarUsuariosById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> getUserById(@PathVariable(value="id") Long id) {
        try {
            UserOutput miRespuesta = this.userService.getUserById(id);
            return JSendResult.success(miRespuesta);
        } catch (Exception e) {
            log.error("Error al listar usuarios por ID: {}", e.getMessage(), e);
            return JSendResult.error("Error al listar usuarios por ID: " + e.getMessage());
        }
    }

    @PostMapping(value = "/verificarOGuardarUsuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> verificarOGuardarUsuario(@RequestBody UserInput usuarioInput) {
        try {
            // Verificar si el usuario ya existe en la base de datos
            Optional<UserEntity> usuarioExistente = userRepository.findByEmail(usuarioInput.getEmail());

            if (usuarioExistente.isPresent()) {
                // Si el usuario ya existe, retornamos el usuario existente
                return JSendResult.success(usuarioExistente.get());
            } else {
                // Si el usuario no existe, lo creamos
                UserEntity nuevoUsuario = userService.addUser(usuarioInput);
                return JSendResult.success(nuevoUsuario);
            }
        } catch (Exception e) {
            log.error("Error al verificar o guardar usuario: {}", e.getMessage(), e);
            return JSendResult.error("Error al verificar o guardar usuario: " + e.getMessage());
        }
    }
}
