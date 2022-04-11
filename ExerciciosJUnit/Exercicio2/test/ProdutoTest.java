
import exercicio2.Livro;
import exercicio2.Produto;
import exercicio2.Revista;
import exercicio2.RevistaDigital;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {
    
    public ProdutoTest() {
        ArrayList<Produto> produtos = new ArrayList<>();
        Revista revista1 = new Revista("a",1);
        Revista revista2 = new Revista("b",2);
        Livro livro1 = new Livro("c",1);
        Livro livro2 = new Livro("d",2);
        RevistaDigital revistaDigit1 = new RevistaDigital("e",1,"1");
        RevistaDigital revistaDigit2 = new RevistaDigital("f",2,"2");
        produtos.add(revista1);
        produtos.add(revista2);
        produtos.add(livro1);
        produtos.add(livro2);
        produtos.add(revistaDigit1);
        produtos.add(revistaDigit2);
        for(Produto aux : produtos)
        {
            if(aux instanceof RevistaDigital)
            {
                System.out.println("------ Revista Digital ------");
                aux.mostrarDados();
                System.out.println("-----------------------------");
            }
            else
            {
                aux.mostrarDados();
            }
            
        }
    }
    
    @Test(expected= NullPointerException.class)
    public void testaDescrição()
    {
        RevistaDigital revistaDigitalTeste = new RevistaDigital("",2,"1");
    }
}
