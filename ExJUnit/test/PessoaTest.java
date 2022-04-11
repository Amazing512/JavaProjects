/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import exjunit.Pessoa;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class PessoaTest {
    
    public PessoaTest() {
    }
    @Test(expected= IllegalArgumentException.class)
    public void testaIdade()
    {
        Pessoa p = new Pessoa();
        p.setIdade(-1);
    }
}
