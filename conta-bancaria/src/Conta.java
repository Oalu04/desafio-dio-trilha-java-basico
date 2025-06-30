public class Conta {
    private double saldo;
    private double chequeEspecial;
    private double deposito;
    private double saque;
    private Double boleto;
    private boolean chequeUsado = false;
    private double taxa;
    private double valorChequeAtual;
    private double saldoTotal;
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        if (saldo <= 500) {
            chequeEspecial = saldo / 10;
        } else {
            chequeEspecial = saldo / 2;
        }
        return chequeEspecial;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
        saldo += this.deposito;
    }

    public void setSaque(double saque) {
        this.saque = saque;
        saldo -= this.saque;
    }

    public void setBoleto(double boleto) {
        this.boleto = boleto;

    }

    public void verificarPagamento() {
        if(this.taxa > 0){
            System.out.println("Há taxas pendentes realizar esse processo acarretará em novas taxas.");
        }
        if (boleto > saldo) {
            saldoTotal = chequeEspecial + saldo;
            valorChequeAtual = boleto - saldo;
            chequeUsado = true;
            if (saldoTotal < boleto) {
                System.out.println("Não foi possivel realizar a transição, saldo insuficiente.");
                chequeUsado = false;
            } else {
                saldoTotal -= boleto;
                saldo = saldoTotal;
            }
        } else {
            saldo -= boleto;
            
        }
    }

    public double getBoleto() {
        return boleto;
    }

    public void verificarChequeEspecial(){
        if(this.chequeUsado){
            System.out.println("O cheque especial foi utilizado, calculando taxas adicionais...");
            this.taxa += valorChequeAtual * 0.2; 
            System.out.println("Valor da taxa atual: " + this.taxa); 
            if(saldo <= 0 ){
                System.out.println("Saldo insuficiente");
            } else{
                this.taxa -= saldo; 
            }
        } else {
            System.out.println("O cheque especial não foi utilizado.");
        }
    }
}
