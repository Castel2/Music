
package TiendaMusik;

/**
 *
 * @author yordan
 */
public class TarjetaCredita {
    
    private int numcuenta;
    private int saldo;

    public TarjetaCredita(int numcuenta, int saldo) {
        this.numcuenta = numcuenta;
        this.saldo = saldo;
    }

    public TarjetaCredita() {
    }

    public int getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(int numcuenta) {
        this.numcuenta = numcuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    
    
}
