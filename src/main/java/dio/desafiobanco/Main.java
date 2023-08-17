package dio.desafiobanco;

import dio.desafiobanco.Domain.Conta;
import dio.desafiobanco.Domain.Cliente;
import dio.desafiobanco.Service.ContaCorrente;
import dio.desafiobanco.Service.ContaPoupanca;

public class Main {

    public static void main(String[] args) {
        Cliente wanderson = new Cliente();
        Cliente judson = new Cliente();
        
        wanderson.setNome("Wanderson");
        judson.setNome("Judson");

        Conta cc1 = new ContaPoupanca(wanderson);
        Conta cc2 = new ContaCorrente(judson);
        
        cc1.depositar(100);
        cc2.depositar(260);
        
        cc1.imprimirExtrato();
        
        cc1.depositar(200);
        cc1.imprimirExtrato();
    }
}
