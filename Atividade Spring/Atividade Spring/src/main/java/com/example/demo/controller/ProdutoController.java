/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Produto;
import com.example.demo.repository.ProdutoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/apiProduto")
public class ProdutoController {
    @Autowired
    ProdutoRepository prodRepo;
      
    @PostMapping(value = "/inserir")
    public void inserirProdutos(@RequestBody Produto prod)
    {
        prodRepo.save(prod);
    }
    

    @GetMapping (value = "/produtos/{codigo}")
    public Optional<Produto> listarProdutoPorCodigo(@PathVariable(value="codigo")int codigo){
        return prodRepo.findById(codigo);
    }
    
    @GetMapping (value = "/produtoPorDesc/{desc}")
    public List<Produto> listarProdutoPorDescricao(@PathVariable(value="desc")String desc){
        return prodRepo.findByPartialDescription(desc);
    }
    
    @GetMapping (value = "/produtoPorMarca/{marca}")
    public List<Produto> listarProdutoPorMarca(@PathVariable(value="marca")String marca){
        return prodRepo.findByMarca(marca);
    }
    
    @GetMapping (value = "/produtoComPrecoMenorQue/{preco}")
    public List<Produto> listarProdutoComPrecoMenorQue(@PathVariable(value="preco")double preco){
        return prodRepo.findByPriceLowerThan(preco);
    }

    @DeleteMapping(value = "/remover")
    public void removerProduto(@RequestBody Produto prod){
        prodRepo.delete(prod);
    }
    
    @PutMapping(value = "/atualizar")
    public void atualizarProduto(@RequestBody Produto prod){
        prodRepo.save(prod);
    }
}
