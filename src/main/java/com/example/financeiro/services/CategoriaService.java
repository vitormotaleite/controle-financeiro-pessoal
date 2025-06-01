package com.example.financeiro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.financeiro.entities.Categoria;
import com.example.financeiro.repositories.CategoriaRepository;

@Service
public class CategoriaService {
    
    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    public Categoria findCategoriaByid(Long id) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.get();
    }

    public Categoria insert(Categoria obj) {
        return categoriaRepository.save(obj);
    }
}
