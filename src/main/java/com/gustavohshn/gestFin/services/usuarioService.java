package com.gustavohshn.gestFin.services;

import com.gustavohshn.gestFin.model.usuarioModel;
import com.gustavohshn.gestFin.repository.usuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class usuarioService {

    @Autowired
    private usuarioRepository usuarioRepository;

    public usuarioModel criarUsuario(usuarioModel usuario){
        //criar regras de negócio para criação de usuário
        return usuarioRepository.save(usuario);
    }
}
