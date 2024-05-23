package muchoDinero.bancario.base;


public  abstract class Cuenta {
 
    private String numero;
    protected double saldo;

    public Cuenta(
    String numero
    ){
        this.numero = numero;   
    }

    public double getSaldo(){
        return this.saldo;
    }
    
    public String getNumero(){
        return numero;
    }

    public  void consignar(double cantidad){
        this.saldo += cantidad;
    }
    
    public abstract boolean retirar(double cantidad);

     

    
}
 