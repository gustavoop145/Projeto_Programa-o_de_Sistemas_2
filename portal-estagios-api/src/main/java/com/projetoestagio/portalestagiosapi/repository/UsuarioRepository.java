package com.projetoestagio.portalestagiosapi.repository;

import com.projetoestagio.portalestagiosapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}