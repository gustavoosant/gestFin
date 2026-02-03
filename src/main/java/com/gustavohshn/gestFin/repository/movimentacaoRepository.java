package com.gustavohshn.gestFin.repository;

import com.gustavohshn.gestFin.model.movimentacaoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface movimentacaoRepository extends JpaRepository<movimentacaoModel, Integer> {
}
