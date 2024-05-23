package muchoDinero.bancario.base;

public class CuentaCorriente extends Cuenta{

    private double cupoSobregiro; 

    public CuentaCorriente(String numero, double cupoSobregiro) {
        super(numero);
        this.cupoSobregiro = cupoSobregiro;
    }

    @Override
    public boolean retirar(double cantidad){
        if((getSaldo() + this.cupoSobregiro) >= cantidad ) {
            this.saldo -= cantidad;
            return true;
        }else {
            return false;
        }
    }
}
