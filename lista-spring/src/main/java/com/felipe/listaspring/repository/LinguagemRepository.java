package com.felipe.listaspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.felipe.listaspring.model.Linguagem;

@Repository
public interface LinguagemRepository extends JpaRepository< Linguagem, Long> {

}
