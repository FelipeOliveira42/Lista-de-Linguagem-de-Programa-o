package com.felipe.listaspring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.felipe.listaspring.model.Linguagem;
import com.felipe.listaspring.repository.LinguagemRepository;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/linguagens")
@AllArgsConstructor
public class LinguagemController {
    
    private final LinguagemRepository linguagemRepository;

    @GetMapping
    // @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Linguagem> list() {
        return linguagemRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Linguagem create(@RequestBody Linguagem linguagem) {
        // System.out.println(linguagem.getName());
        return linguagemRepository.save(linguagem);
        // return ResponseEntity.status(HttpStatus.CREATED)
        // .body(linguagemRepository.save(linguagem));
    }

}
