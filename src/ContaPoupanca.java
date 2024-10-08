public class ContaPoupanca extends Conta{

    ContaPoupanca(int numero, Cliente dono, double saldo, double limite){
        super(numero, dono, saldo, limite);
    }

    public void checkLimite(double limite) throws IllegalArgumentException{
        if(limite < 100 || limite > 1000){
            throw new IllegalArgumentException("Valor não está dentro do limite");
        }else{
            setLimite(limite);
        }
    }

    public double calculaTaxas() {
        return 0;
    }
}
