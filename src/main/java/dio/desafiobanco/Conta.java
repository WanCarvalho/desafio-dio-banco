package dio.desafiobanco;

public abstract class Conta implements IConta {

    private int agencia;
    private int numero;
    private double saldo;

    @Override
    public void sacar(double valor) {

    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void transferir(double valor, Conta contaDestino) {

    }

    public void sacar(){

    }

    public void depositar(){

    }

    public void transferir(){

    }

    //getters: apenas getters pois não faz sentido alterar os dados dessa classe já que são dados importante do mundo real
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

}
