package com.gustavohshn.gestFin.repository;

import com.gustavohshn.gestFin.model.contaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface contaRepository extends JpaRepository<contaModel, Integer> {
}
