package com.example.TERCEIROPERIODO.controller;

import com.example.TERCEIROPERIODO.model.Cidade;
import com.example.TERCEIROPERIODO.service.CidadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class CidadeController {
    @Autowired
    CidadeService cidadeService;

    @PostMapping()
    public ResponseEntity<Cidade> salvarCidade(@RequestBody Cidade cidade){

        Cidade response = cidadeService.salvar(cidade);
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/all", produces = "application/json")
    public ResponseEntity<List<Cidade>> buscarTodos(){

        List<Cidade> response = cidadeService.buscarTodos();
        return ResponseEntity.ok(response);
    }

    @GetMapping(path = "/pageable/all", produces = "application/json")
    public ResponseEntity<Page<Cidade>> buscarTodosPaginado(
            @RequestParam Integer page,
            @RequestParam Integer size){

        Page<Cidade> response = cidadeService.
                getAllCidadesByPage(page, size);
        return ResponseEntity.ok(response);
    }
}
