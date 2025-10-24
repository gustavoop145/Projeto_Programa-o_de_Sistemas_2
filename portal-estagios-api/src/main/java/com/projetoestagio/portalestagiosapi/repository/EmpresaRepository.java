package com.projetoestagio.portalestagiosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoestagio.portalestagiosapi.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> { }
