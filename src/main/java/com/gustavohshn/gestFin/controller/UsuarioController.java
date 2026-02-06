package com.gustavohshn.gestFin.controller;

import com.gustavohshn.gestFin.model.UsuarioModel;
import com.gustavohshn.gestFin.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Void> criarUsuario(@RequestBody UsuarioModel usuarioModel){
        usuarioService.criarUsuario(usuarioModel);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<UsuarioModel> buscarUsuarioPorEmail(@RequestBody String email){
        return ResponseEntity.ok(usuarioService.buscarUsuarioPorEmail(email));
    }

    @DeleteMapping
    public ResponseEntity<UsuarioModel> deletarUsuario(@RequestBody Integer idUsuario){
        usuarioService.deletarUsuario(idUsuario);
        return ResponseEntity.ok().build();
    }
}
