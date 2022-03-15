package dio.desafiobanco;

public class Main {

    public static void main(String[] args) {
        Cliente wanderson = new Cliente();
        wanderson.setNome("Wanderson");

        Conta cc = new ContaCorrente(wanderson);
        cc.depositar(100);

        Conta pp = new ContaPoupanca(wanderson);
        cc.transferir(100, pp);

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
