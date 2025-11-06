package com.projetoestagio.portalestagiosapi.repository;

import com.projetoestagio.portalestagiosapi.model.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InscricaoRepository extends JpaRepository<Inscricao, Long> {
    List<Inscricao> findByVagaEmpresaId(Long empresaId);
}