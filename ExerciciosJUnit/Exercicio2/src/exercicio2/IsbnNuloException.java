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
public class IsbnNuloException extends RuntimeException{
    private String message;
    
   public IsbnNuloException(String message)
   {
       this.message = message;
   }
   
   @Override
    public String getMessage()
    {
        return (message);
    }
}
