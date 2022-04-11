
package exercicio2;

public class ContaInvestimento extends ContaBancaria{
    
    
    @Override
    public void calcularSaldo(){
        saldo = saldo * 1.05;
    }
}
