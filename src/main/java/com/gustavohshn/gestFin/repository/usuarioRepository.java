package com.gustavohshn.gestFin.repository;

import com.gustavohshn.gestFin.model.usuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<usuarioModel, Integer> {
}
