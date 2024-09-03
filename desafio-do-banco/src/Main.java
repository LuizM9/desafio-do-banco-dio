public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente luiz = new Cliente("Luiz", banco);
        luiz.setNome("Luiz");

        Cliente carlos = new Cliente("Carlos", banco);
        carlos.setNome("Carlos");

        IConta conta1 = new ContaCorrente(luiz);
        conta1.depositar(100);

        IConta conta2 = new ContaPoupanca(carlos);

        conta1.transferir(100, conta2);

        conta1.imprimirExtrato();
        conta2.imprimirExtrato();
        banco.exibirClientes();
    }
}
