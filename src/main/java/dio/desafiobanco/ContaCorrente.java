package dio.desafiobanco;

public class ContaCorrente {

    private int agencia;
    private int numero;
    private double saldo;

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
