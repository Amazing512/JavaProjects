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
public class ValorInvalidoException extends RuntimeException{
    private String mensagem;
    public ValorInvalidoException(String mensagem, double valorInvalido)
    {
        this.mensagem = mensagem + valorInvalido;
    }
    
    
    @Override
    public String getMessage()
    {
        return (mensagem);
    }
}
