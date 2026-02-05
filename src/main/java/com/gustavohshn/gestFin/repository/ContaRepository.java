package com.gustavohshn.gestFin.repository;

import com.gustavohshn.gestFin.model.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Integer> {
}
