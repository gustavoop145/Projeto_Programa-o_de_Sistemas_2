package com.projetoestagio.portalestagiosapi.controller;

import com.projetoestagio.portalestagiosapi.model.Empresa;
import com.projetoestagio.portalestagiosapi.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/empresas") 
@CrossOrigin(origins = "*") 
public class EmpresaController {

    @Autowired
    private EmpresaRepository repository;

    
    @GetMapping
    public List<Empresa> listar() {
        return repository.findAll();
    }

    @PostMapping
    public Empresa cadastrar(@RequestBody Empresa empresa) {
        return repository.save(empresa);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        repository.deleteById(id);
    }
}