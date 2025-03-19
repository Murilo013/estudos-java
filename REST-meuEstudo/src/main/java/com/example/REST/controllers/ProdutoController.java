package com.example.REST.controllers;

import com.example.REST.models.Produto;
import com.example.REST.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produto") //indica que todos os metodos vão ser de origem /produto/...
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping(value = "/save") // indica a rota
    public ResponseEntity<Produto> salvaProduto(@RequestBody Produto produto) throws Exception{

        service.save(produto);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/{id}") // indica a rota
    public ResponseEntity<Produto> buscaProduto(@PathVariable Long id){

        Produto produto = service.findById(id);
        return ResponseEntity.ok().body(produto);
    }

    @GetMapping(value = "/buscarTodos") // indica a rota
    public ResponseEntity<List<Produto>> buscarTodos(){

        List<Produto> produtos = service.FindAll();
        return ResponseEntity.ok().body(produtos);
    }

}
