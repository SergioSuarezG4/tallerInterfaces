
package muchoDinero.bancario.base;

public class CuentaAhorros extends Cuenta implements Rentable {

    private double interes ;

    public CuentaAhorros(
    String numero,
    double interes

    ){
        super(numero);
        this.interes = interes;
    }


    @Override
    public boolean retirar(double cantidad){
        if(cantidad <= getSaldo()){
            this.saldo -= cantidad;
            return true;
        }else{
            return false;
        }
    }

    public double consultarSaldo(){
        return super.getSaldo();

    }

    public double calcularIntereses(){
        double intereses = (saldo * interes ) / 100;
        return intereses;
    }
    


    
}
