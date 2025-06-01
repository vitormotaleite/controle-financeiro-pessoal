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

    public void delete(Long id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria update(Long id, Categoria obj) {
        Categoria entity = categoriaRepository.getReferenceById(id);
        updateData(entity,obj);
        return categoriaRepository.save(entity);
    }

    private void updateData(Categoria entity, Categoria obj) {
        entity.setName(obj.getName());
    }
}
