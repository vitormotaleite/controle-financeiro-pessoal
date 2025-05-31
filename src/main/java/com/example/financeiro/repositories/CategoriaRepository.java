package com.example.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financeiro.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {
    
}
