package muchoDinero;

import muchoDinero.bancario.base.Bono;
import muchoDinero.bancario.base.Rentable;
import muchoDinero.bancario.base.CuentaAhorros;
import muchoDinero.bancario.base.CuentaCorriente;


public class MainBanco {
    public static void main(String[] args) {


        CuentaCorriente cuentaCorriente = new CuentaCorriente("12345", 200000);
        System.out.println("Saldo cuenta corriente: " + cuentaCorriente.getSaldo());
        cuentaCorriente.consignar(100000);
        cuentaCorriente.retirar(300000);
        System.out.println("Saldo despues de consignar y retirar: " + cuentaCorriente.getSaldo());


        Rentable rentable1 = new Bono(500000);
        System.out.println("Consultar saldo del bono: "+ rentable1.consultarSaldo());
        System.out.println("Intereses del bono anual : " + rentable1.calcularIntereses()); // Seria 50.000 ya que pusimos interes 10& anual.

        /*
         * En este caso el atributo interes de la clase cuentaAhorros vendria
         * siendo el interes anual que se le daria a la cuenta sea el valor que sea
         * y como resultado nos dara el 10% del saldo actual "Segun esto en un año"
         */
        CuentaAhorros cuentaAhorros = new CuentaAhorros("6789", 10); /* Un de interes 10%  anual */
        cuentaAhorros.consignar(500000);
        System.out.println("Saldo cuenta de ahorro: " + cuentaAhorros.consultarSaldo());
        System.out.println("Intereses cuenta de ahorro anual: " + cuentaAhorros.calcularIntereses()); 
        // Cabe recalcar que los intereses que estoy dando son anuales y no mensuales.
        // El interes mensual seria 4.166(Hice el anual, no el mensual)
        // que por 12 meses nos da los 50.000
        }
 } 
