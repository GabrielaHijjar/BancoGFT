public class Conta implements IConta {
    private static final int AGENCIA_PADRAO = 1 ;

    private static int SEQUENCIAL = 2;
    protected Object getAgencia;

    public Conta() {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
    }
    private int agencia;
    protected int conta;
    protected double saldo;

    @Override
    public void sacar(double valor){
        saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }





}
