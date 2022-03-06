public class ContaPoupanca extends  Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println(        "Imprimir Extrato Conta Poupança");
        System.out.println(String.format("Agencia:  %d", super.getAgencia));
        System.out.println(String.format("Conta:  %d", super.conta));
        System.out.println(String.format("Saldo:  %.2f", super.saldo));}

}