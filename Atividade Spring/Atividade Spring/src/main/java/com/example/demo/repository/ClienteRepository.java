
package com.example.demo.repository;

import com.example.demo.model.Cliente;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
    
    @Query( value= "select c from Cliente c where c.nome like ?1% ")
    public List<Cliente> findByPartialName(String nome);
}
