public class ContaSalario extends Conta {
    private int limiteSaque;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limiteSaque) {
        super(numero, agencia, banco, saldo);
        this.limiteSaque = limiteSaque;
    }

    public int getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(int limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public double getSaldo(){
        return this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        if(limiteSaque <= 0) {
            System.out.println("Limite de saque excedido.");
            return;
        }
        if (valorSaque <= saldo) {
            saldo = saldo - valorSaque;
            limiteSaque --;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
        public void depositar(double valorDeposito){
            saldo = saldo + valorDeposito;
        }
}
