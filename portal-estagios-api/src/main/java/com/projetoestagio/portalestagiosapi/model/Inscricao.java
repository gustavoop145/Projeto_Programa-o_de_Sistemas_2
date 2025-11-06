package com.projetoestagio.portalestagiosapi.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "estudante_id")
    private Estudante estudante;

    @ManyToOne
    @JoinColumn(name = "vaga_id")
    private Vaga vaga;
}
