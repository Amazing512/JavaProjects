/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;
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
@RequestMapping (value = "/apiCliente")
public class ClienteController {
    @Autowired
    ClienteRepository cliRepo;
    
    @PostMapping(value = "/inserir")
    public void inserirClientes(@RequestBody Cliente cli)
    {
        cliRepo.save(cli);
    }

    @GetMapping (value = "/clientes/{codigo}")
    public Optional<Cliente> listarClientePorCodigo(@PathVariable(value="codigo")int codigo){
        return cliRepo.findById(codigo);
    }
    
    @GetMapping (value = "/pesquisaPorNome/{nome}")
    public List<Cliente> listarClientePorNome(@PathVariable(value="nome")String nome){
        return cliRepo.findByPartialName(nome);
    }
    
    @DeleteMapping(value = "/remover")
    public void removerCliente(@RequestBody Cliente cli){
        cliRepo.delete(cli);
    }
    
    @PutMapping(value = "/atualizar")
    public void atualizarCliente(@RequestBody Cliente cli){
        cliRepo.save(cli);
    }
}
