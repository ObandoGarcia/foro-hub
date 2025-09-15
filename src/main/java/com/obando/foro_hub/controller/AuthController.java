package com.obando.foro_hub.controller;

import com.obando.foro_hub.domain.usuarios.DatosAutenticacionUsuario;
import com.obando.foro_hub.domain.usuarios.Usuario;
import com.obando.foro_hub.infra.security.DatosJWTToken;
import com.obando.foro_hub.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AuthController {

    private final AuthenticationManager authenticationManager;
    private final TokenService tokenService;

    public AuthController(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity autenticarUsuario(@RequestBody @Valid DatosAutenticacionUsuario datosAutenticacionUsuario){
        Authentication authenticationToken = new UsernamePasswordAuthenticationToken(datosAutenticacionUsuario.email(),
                datosAutenticacionUsuario.contrasenia());
        var usuarioAtenticado = authenticationManager.authenticate(authenticationToken);
        var JwtToken = tokenService.generarToken((Usuario) usuarioAtenticado.getPrincipal());
        return ResponseEntity.ok(new DatosJWTToken(JwtToken));
    }
}
