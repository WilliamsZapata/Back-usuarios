package com.example.psywell.configuration;


import cl.cgr.vu.vuadministracion.entity.Funcionario;
import cl.cgr.vu.vuadministracion.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Funcionario funcionario = funcionarioRepository
                .findFuncionarioByNombreCortoWhereEstadoActivo(username)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario " + username + " no existe."));
        return new UserDetailsImpl(funcionario);
    }
}
