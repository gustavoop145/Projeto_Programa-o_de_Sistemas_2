package com.projetoestagio.portalestagiosapi.repository;

import com.projetoestagio.portalestagiosapi.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> { }