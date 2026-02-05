package com.gustavohshn.gestFin.repository;

import com.gustavohshn.gestFin.model.MovimentacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimentacaoRepository extends JpaRepository<MovimentacaoModel, Integer> {
}
