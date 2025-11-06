package com.projetoestagio.portalestagiosapi.controller;

import com.projetoestagio.portalestagiosapi.model.Empresa;
import com.projetoestagio.portalestagiosapi.model.Inscricao;
import com.projetoestagio.portalestagiosapi.service.AuthService;
import com.projetoestagio.portalestagiosapi.repository.InscricaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/painel/empresa")
public class PainelEmpresaController {

    @Autowired
    private AuthService authService;

    @Autowired
    private InscricaoRepository inscricaoRepository;

    @GetMapping
    public List<Inscricao> listarInscricoes() {
        Empresa empresa = (Empresa) authService.getUsuarioLogado();
        return inscricaoRepository.findByVagaEmpresaId(empresa.getId());
    }
}