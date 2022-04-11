
package com.example.demo.repository;

import com.example.demo.model.Produto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{
    
    @Query( value= "select p from Produto p where p.descricao like ?1% ")
    public List<Produto> findByPartialDescription(String description);
    
    @Query( value= "select p from Produto p where p.marca like %?1% ")
    public List<Produto> findByMarca(String marca);
    
    @Query( value= "select p from Produto p where p.preco < ?1")
    public List<Produto> findByPriceLowerThan(double preco);
    
    
}
