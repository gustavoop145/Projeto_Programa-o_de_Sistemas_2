package com.projetoestagio.portalestagiosapi.controller;

import com.projetoestagio.portalestagiosapi.model.Estudante;
import com.projetoestagio.portalestagiosapi.model.Vaga;
import com.projetoestagio.portalestagiosapi.service.AuthService;
import com.projetoestagio.portalestagiosapi.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/painel/estudante")
public class PainelEstudanteController {

    @Autowired
    private AuthService authService;

    @Autowired
    private VagaRepository vagaRepository;

    @GetMapping
    public List<Vaga> listarVagasRelacionadas() {
        Estudante estudante = (Estudante) authService.getUsuarioLogado();
        return vagaRepository.findByAreaContainingIgnoreCase(estudante.getAreasInteresse());
    }
}