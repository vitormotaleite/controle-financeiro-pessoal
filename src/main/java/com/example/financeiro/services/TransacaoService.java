package com.example.financeiro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.financeiro.entities.Transacao;
import com.example.financeiro.repositories.TransacaoRepository;

@Service
public class TransacaoService {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public List<Transacao> findAll() {
        return transacaoRepository.findAll();
    }

    public Transacao findTransacaoByid(Long id) {
        Optional<Transacao> obj = transacaoRepository.findById(id);
        return obj.get();
    }

    public Transacao insert(Transacao obj) {
        return transacaoRepository.save(obj);
    }

    public void delete(Long id) {
        transacaoRepository.deleteById(id);
    }

    public Transacao update(Long id, Transacao obj) {
        Transacao entity = transacaoRepository.getReferenceById(id);
        updateData(entity,obj);
        return transacaoRepository.save(entity);
    }

    private void updateData(Transacao entity, Transacao obj) {
        entity.setDescricao(obj.getDescricao());
        entity.setValor(obj.getValor());
        entity.setData(obj.getData());
        entity.setTipo(obj.getTipo());
        entity.setCategoria(obj.getCategoria());
    }
}
