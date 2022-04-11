/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author mathe
 */
public class NomeVazioException extends RuntimeException{
    
    @Override
    public String getMessage(){
        return ("O nome deve ser preenchido!");
    }
}
