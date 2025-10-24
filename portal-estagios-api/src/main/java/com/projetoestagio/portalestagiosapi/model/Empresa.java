package com.projetoestagio.portalestagiosapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cnpj;
    private String email;
    private String telefone;
    private String endereco;
    private String areaAtuacao;
}
