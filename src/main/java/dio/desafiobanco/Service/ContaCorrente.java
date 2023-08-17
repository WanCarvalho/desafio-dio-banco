package dio.desafiobanco.Service;

import dio.desafiobanco.Domain.Conta;
import dio.desafiobanco.Domain.Cliente;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public boolean sacar(double valor) {
    	if(valor < saldo || valor == saldo) {
    		saldo -= valor;
    		
    		System.out.printf("\nSaque de R$ %.2f realizado com sucesso!", valor);
    		
    		return true;
    	} else {
    		System.out.printf("\nErro: Você tentou sacar R$ %.2f. Não existe esse valor disponível para saque.", valor);
    		
    		return false;
    	}
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    	
    	if(valor < this.saldo || valor == this.saldo) {
    		this.saldo -= valor;
    		
    		contaDestino.depositar(valor);
    		
    		System.out.println("Transferência entre contas");
    		System.out.println("- De: " + this.cliente.getNome());
    		System.out.println("- Para: " + contaDestino.getCliente().getNome());
    		System.out.printf("- Valor R$ %.2f transferido com sucesso!\n", valor);
    	} else {
    		System.out.printf("\nErro: Não é possível transferir o valor R$ %.2f. Sem saldo disponível na conta do titular.", valor);
    	}
    	  
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo em conta: R$ %.2f\n", this.saldo));
    }
}
