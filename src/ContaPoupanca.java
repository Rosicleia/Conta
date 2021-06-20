import java.time.LocalDate;

public class ContaPoupanca extends Conta{
    private int diaAniversarioConta;
    private double taxaJuros;

    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int diaAniversarioConta, double taxaJuros) {
        super(numero, agencia, banco, saldo);
        this.diaAniversarioConta = diaAniversarioConta;
        this.taxaJuros = taxaJuros;
    }

    public double getSaldo(){
        LocalDate data = LocalDate.now();
        int hoje = data.getDayOfMonth();

        if(hoje >= diaAniversarioConta) {
            return this.saldo + this.taxaJuros * this.saldo;
        }
        return this.saldo;
    }

    public void sacar(double valorSaque){
        if(valorSaque <= saldo) {
            saldo = saldo - valorSaque;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
    }
}
