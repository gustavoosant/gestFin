package com.gustavohshn.gestFin.services;

import com.gustavohshn.gestFin.model.UsuarioModel;
import com.gustavohshn.gestFin.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void criarUsuario(UsuarioModel usuario){
        usuarioRepository.saveAndFlush(usuario);
    }

    public UsuarioModel buscarUsuarioPorEmail(String emailUsuario){

        return usuarioRepository.findByEmailUsuario(emailUsuario).orElseThrow(
                () -> new RuntimeException("E-mail não encontrado")
        );
    }

    public void deletarUsuario (Integer idUsuario) {
        if(!usuarioRepository.existsById(idUsuario)){
            throw new RuntimeException("Usuário não encontrado");
        }
        usuarioRepository.deleteById(idUsuario);
    }
}
