
import java.util.HashMap;
import java.util.Map;

public class Supermercado {
    private Map<String, Cliente> clientes;

    public Supermercado() {
        clientes = new HashMap<>();
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.put(cliente.getCpf(), cliente);
    }

    public Cliente buscarClientePorCpf(String cpf) {
        return clientes.get(cpf);
    }

    public void removerCliente(String cpf) {
        clientes.remove(cpf);
    }
}