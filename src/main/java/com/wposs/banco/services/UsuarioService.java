package com.wposs.banco.services;

import com.wposs.banco.entities.UsuarioEntity;

import java.util.List;

public interface UsuarioService {

    List<UsuarioEntity> listarUsuario();

    void agregarUsuario(UsuarioEntity usuario);

    UsuarioEntity buscarUsuario(UsuarioEntity usuario);

}
