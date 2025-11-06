package com.projetoestagio.portalestagiosapi.controller;

import com.projetoestagio.portalestagiosapi.model.Empresa;
import com.projetoestagio.portalestagiosapi.repository.EmpresaRepository;
import com.projetoestagio.portalestagiosapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/empresas")
@CrossOrigin(origins = "*")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public java.util.List<Empresa> listar() {
        return empresaRepository.findAll();
    }

    @PostMapping("/cadastrar")
    public Empresa cadastrar(@RequestBody Empresa empresa) {
        empresa.setPerfil("ROLE_EMPRESA");
        return (Empresa) usuarioService.salvar(empresa);
    }

    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {
        empresaRepository.deleteById(id);
    }
}