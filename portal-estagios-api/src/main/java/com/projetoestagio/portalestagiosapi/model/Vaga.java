package com.projetoestagio.portalestagiosapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;
    private String area;
    private String localizacao;
    private String modalidade; 
    private String cargaHoraria;
    private String requisitos;

    @ManyToOne
    @JoinColumn(name = "empresa_id")
    private Empresa empresa;
}
