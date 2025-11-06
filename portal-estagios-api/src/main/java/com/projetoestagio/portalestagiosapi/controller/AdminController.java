package com.projetoestagio.portalestagiosapi.controller;

import com.projetoestagio.portalestagiosapi.repository.EmpresaRepository;
import com.projetoestagio.portalestagiosapi.repository.EstudanteRepository;
import com.projetoestagio.portalestagiosapi.repository.VagaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/painel/admin")
public class AdminController {

    @Autowired
    private EmpresaRepository empresaRepository;
    
    @Autowired
    private EstudanteRepository estudanteRepository;
    
    @Autowired
    private VagaRepository vagaRepository;


    @GetMapping
    public Map<String, Long> dashboard() {
        return Map.of(
            "totalEmpresas", empresaRepository.count(),
            "totalEstudantes", estudanteRepository.count(),
            "totalVagas", vagaRepository.count()
        );
    }
}