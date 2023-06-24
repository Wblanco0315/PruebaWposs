package com.wposs.banco.services.impl;

import com.wposs.banco.entities.UsuarioEntity;
import com.wposs.banco.repositories.UsuarioRepository;
import com.wposs.banco.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioEntity> listarUsuario() {
        return usuarioRepository.findAll();
    }

    @Override
    public void agregarUsuario(UsuarioEntity usuario) {
        usuarioRepository.save(usuario);
    }

    @Override
    public UsuarioEntity buscarUsuario(UsuarioEntity usuario) {
        return usuarioRepository.findById(usuario.getIdUsuario()).orElse(null);
    }
}
