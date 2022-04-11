
package control;

import java.util.ArrayList;
import model.Cliente;

public class ClienteController {
    private ArrayList<Cliente> listaCliente;
    
    public ClienteController()
    {
        listaCliente = new ArrayList<>();
    }
    
    public void addNewClient(String CPF, String name, String address, int numberCel, String username, String password)
    {
        Cliente cliente = new Cliente(CPF, name, address, numberCel,  username,  password);
        listaCliente.add(cliente);
    }
    
    public boolean authenticateLogin(String username, String password)
    {
        boolean success = true;
        boolean denied = false;
        Cliente user = getClientByUsername(username);
        
        if(user.haveSamePassword(password))
        {
            return success;
        }
        return denied;
    }
    
    public Cliente getClientByUsername(String username)
    {
        for(Cliente cli: listaCliente)
        {
            if(cli.haveSameUsername(username) == true)
            {
                return cli;
            }
        }
        return null;
    }
}
