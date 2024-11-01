public class ContaPoupanca extends Conta{
    public ContaPoupanca(int _id, int _numeroConta, String _nomeCliente, String _telefone, Double _saldo){
        super(_id, _numeroConta, _nomeCliente, _telefone, _saldo);
    }
    @Override
    public void depositar(double valor){
        if (valor >= 1){
            double saldo = getSaldo();
            saldo+=valor+1.00;
            setSaldo(saldo);
            System.out.println("Valor depositado: R$" + valor);
            System.out.println("Seu saldo agora é de: R$" + saldo);
        } else{
            System.out.println("Valor inferior a R$1,00.");
        }
    }
}