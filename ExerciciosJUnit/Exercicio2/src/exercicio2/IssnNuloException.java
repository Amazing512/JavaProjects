package exercicio2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class IssnNuloException extends RuntimeException{
    private String message;
    
    public IssnNuloException(String message)
    {
        this.message = message;
    }
    
    @Override
    public String getMessage()
    {
        return (message);
    }
}
