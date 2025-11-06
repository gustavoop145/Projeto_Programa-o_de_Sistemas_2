package com.projetoestagio.portalestagiosapi.repository;

import com.projetoestagio.portalestagiosapi.model.Vaga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VagaRepository extends JpaRepository<Vaga, Long> {
    List<Vaga> findByAreaContainingIgnoreCase(String area);
 }