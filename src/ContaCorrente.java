public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public String toString() {
        return "O Saldo do Cheque Especial é R$ " + chequeEspecial;
    }

    public double getSaldo(){

        return this.chequeEspecial + this.saldo;
    }

    public void sacar(double valorSaque){
        if(valorSaque <= saldo){
            saldo = saldo - valorSaque;
        }
        else if(valorSaque <= saldo + chequeEspecial){
            chequeEspecial = chequeEspecial - (valorSaque - saldo);
            saldo = 0;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }
    public void depositar(double valorDeposito){
        saldo = saldo + valorDeposito;
    }
}
