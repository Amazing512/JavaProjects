
package exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        ContaInvestimento conta2 = new ContaInvestimento();
        conta.depositar(5000);
        conta2.depositar(5000);
        try
        {
            conta.depositar(-5);
        }
        catch(ValorInvalidoException e)
        {
            System.out.println(e.getMessage());
        }
        try
        {
            conta2.transferir(5001, conta);
        }
        catch(SaldoInsuficienteException e)
        {
            System.out.println(e.getMessage());
        }
        
        conta2.transferir(5000, conta);
        conta.transferir(5001, conta2);
        conta.sacar(4999);
        
    }
    
}
