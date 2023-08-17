package dio.desafiobanco.Domain;

//A interface serve para forçar todas as classes que a implementam a terem tudo que estão nela
public interface IConta {

    //obs: todos os métodos da interface são públicos, dessa forma se torna redundante declarar os métodos como public
    boolean sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
