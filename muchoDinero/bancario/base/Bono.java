package muchoDinero.bancario.base;

public class Bono implements Rentable {

    private double saldo;
    private static double interes = 0.1;

    public Bono(
    double saldo

    ){
        this.saldo = saldo;
    }

    @Override
    public double consultarSaldo(){
        return saldo;
    }

    @Override
    public double calcularIntereses(){
        return saldo * interes ;
    }

    
    
}
