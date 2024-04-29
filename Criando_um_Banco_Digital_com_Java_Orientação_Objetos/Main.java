import java.util.ArrayList;
import java.util.List;

class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}

class ContaBancaria {
    private Cliente cliente;
    private int numeroConta;
    private double saldo;

    public ContaBancaria(Cliente cliente, int numeroConta, double saldoInicial) {
        this.cliente = cliente;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

class Banco {
    private List<ContaBancaria> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(ContaBancaria conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("Lista de Contas Bancárias:");
        for (ContaBancaria conta : contas) {
            System.out.println("Cliente: " + conta.getCliente().getNome() +
                               " | Número da Conta: " + conta.getNumeroConta() +
                               " | Saldo: " + conta.getSaldo());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria", "987.654.321-00");

        // Criando contas
        ContaBancaria conta1 = new ContaBancaria(cliente1, 1001, 1000);
        ContaBancaria conta2 = new ContaBancaria(cliente2, 1002, 2000);

        // Criando banco
        Banco banco = new Banco();

        // Adicionando contas
        banco.adicionarConta(conta1);
        banco.adicionarConta(conta2);

        // Listando contas
        banco.listarContas();

        // Realizando operações
        conta1.depositar(500);
        conta2.sacar(1000);

        // Listando contas
        banco.listarContas();
    }
}