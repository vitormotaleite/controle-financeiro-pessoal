package com.example.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financeiro.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    
}
