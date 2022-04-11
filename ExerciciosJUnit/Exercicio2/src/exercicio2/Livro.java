/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author mathe
 */
public class Livro extends Produto{
    private int isbn;

    public Livro( String descricao, int isbn) {
        super(descricao);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    
    @Override
    public void mostrarDados()
    {
        super.mostrarDados();
        System.out.println("ISBN: " + isbn);
    }
    
    
}
