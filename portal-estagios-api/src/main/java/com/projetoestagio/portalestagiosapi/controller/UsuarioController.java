package com.projetoestagio.portalestagiosapi.controller;

import com.projetoestagio.portalestagiosapi.model.Usuario;
import com.projetoestagio.portalestagiosapi.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api") 
public class UsuarioController {

    private final AuthService authService;

    public UsuarioController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/me")
    public Usuario me() {
        return authService.getUsuarioLogado();
    }
}