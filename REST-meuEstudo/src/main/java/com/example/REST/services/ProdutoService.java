package com.example.REST.services;

import com.example.REST.exceptions.ProductNullException;
import com.example.REST.exceptions.ProductPriceException;
import com.example.REST.models.Produto;
import com.example.REST.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.sound.sampled.Port;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto) throws Exception{

        if(produto.getName() == null || produto.getPreco() == null || produto.getDescricao() == null)
            throw new ProductNullException();
        if(produto.getPreco() < 0)
            throw new ProductPriceException();

        return repository.save(produto);
    }

    public Produto findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public List<Produto> FindAll(){
        return repository.findAll();
    }

}
