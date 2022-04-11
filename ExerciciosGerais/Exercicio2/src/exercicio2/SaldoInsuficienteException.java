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
public class SaldoInsuficienteException extends RuntimeException{
    private String mensagem;
    public SaldoInsuficienteException(String mensagem, double saldo)
    {
        this.mensagem = mensagem + saldo;
    }
    
    
    @Override
    public String getMessage()
    {
        return (mensagem);
    }
}
