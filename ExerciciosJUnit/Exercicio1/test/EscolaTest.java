import exercicio1.Aluno;
import exercicio1.Escola;
import java.util.ArrayList;
//import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EscolaTest {
    ArrayList<Aluno> array;
    public EscolaTest() {
        array = new ArrayList<>();
        Aluno al1 = new Aluno(1,1,"Aluno A");
        array.add(al1);
        Aluno al2 = new Aluno(2,20,"Aluno B");
        array.add(al2);
        Aluno al3 = new Aluno(3,30,"Aluno C");
        array.add(al3);
        Aluno al4 = new Aluno(4,4,"Aluno D");
        array.add(al4);
        Aluno al5 = new Aluno(5,5,"Aluno E");
        array.add(al5);
        Aluno al6 = new Aluno(6,6,"Aluno F");
        array.add(al6);
    }
    
    @Test
    public void testaAnalisaMaisVelho()
    {
        Escola escola = new Escola(array);
        //escola.analisa();
        assertEquals(1, escola.getMaisNovo());
    }
    
    @Test
    public void testaAnalisaMaisNovo()
    {
        Escola escola = new Escola(array);
        //escola.analisa();
        assertEquals(30, escola.getMaisVelho());
    }
}
