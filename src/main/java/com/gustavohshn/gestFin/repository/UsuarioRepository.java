package com.gustavohshn.gestFin.repository;

import com.gustavohshn.gestFin.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    Optional<UsuarioModel> findByEmailUsuario(String emailUsuario);
}
