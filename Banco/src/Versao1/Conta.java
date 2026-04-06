package Versao1;

public class Conta {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void Conta(double saldoinicial){
        this.saldo = saldoinicial;
    }

    public void depositar(double valor) {
        this.saldo = this.getSaldo() + valor;

    }

    public void sacar(double amount){
        if(saldo >= amount) {
            this.saldo = this.getSaldo() - amount;
        }else{
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
