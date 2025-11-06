package com.projetoestagio.portalestagiosapi.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Estudante extends Usuario {

    private String nome;
    private String cpf;
    private String curso;
    private String telefone;
    private String areasInteresse;
}
