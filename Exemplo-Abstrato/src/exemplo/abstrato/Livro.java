/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.abstrato;

/**
 *
 * @author mathe
 */
public class Livro extends Produto{
    private String isbn;

    public Livro(String descricao, double preco, String isbn) {
        super(descricao, preco);
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @Override
    public void mostraDados()
    {
        System.out.println("è um livro");
    }
    
    
    
}
