package com.example.financeiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.financeiro.entities.Transacao;

public interface TransacaoRepository extends JpaRepository<Transacao,Long> {
    
}
