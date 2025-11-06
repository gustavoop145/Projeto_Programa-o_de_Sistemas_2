package com.projetoestagio.portalestagiosapi.model;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Empresa extends Usuario {
    private String nome;
    private String cnpj;
    private String email;
    private String telefone;
    private String endereco;
    private String areaAtuacao;
}