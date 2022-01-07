public class Main {
    public static void main(String[] args) {
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Renato");

        Conta cc = new ContaCorrente(novoCliente);
        Conta poupanca = new ContaPoupanca(novoCliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
