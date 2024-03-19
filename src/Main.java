import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado();

       //simulando uma base de dados de clientes
        supermercado.adicionarCliente(new Cliente("João", "12345678900", "987654321", "joao@email.com"));
        supermercado.adicionarCliente(new Cliente("Maria", "98765432100", "123456789", "maria@email.com"));


        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF do cliente para busca:");
        String cpf = scanner.nextLine();

        Cliente cliente = supermercado.buscarClientePorCpf(cpf);
        if (cliente != null) {
            System.out.println("Cliente encontrado: " + cliente.getNome());
        } else {
            System.out.println("Cliente não encontrado.");
        }

        // Removendo cliente
        supermercado.removerCliente("12345678900");
    }
}
