
package parcial.model;


public class Cuota {
    
    private int ncuota;
    private double valorCuota;
    private double valorPagar;
    private double saldo;
    private boolean pagada;
    private Prestamo prestamo;

    public Cuota() {
    }

    public Cuota(int ncuota, double valorCuota, double valorPagar, double saldo, boolean pagada, Prestamo prestamo) {
        this.ncuota = ncuota;
        this.valorCuota = valorCuota;
        this.valorPagar = valorPagar;
        this.saldo = saldo;
        this.pagada = pagada;
        this.prestamo = prestamo;
    }
    
    

    /**
     * @return the ncuota
     */
    public int getNcuota() {
        return ncuota;
    }

    /**
     * @param ncuota the ncuota to set
     */
    public void setNcuota(int ncuota) {
        this.ncuota = ncuota;
    }

    /**
     * @return the valorCuota
     */
    public double getValorCuota() {
        return valorCuota;
    }

    /**
     * @param valorCuota the valorCuota to set
     */
    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    /**
     * @return the valorPagar
     */
    public double getValorPagar() {
        return valorPagar;
    }

    /**
     * @param valorPagar the valorPagar to set
     */
    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the pagada
     */
    public boolean isPagada() {
        return pagada;
    }

    /**
     * @param pagada the pagada to set
     */
    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    /**
     * @return the prestamo
     */
    public Prestamo getPrestamo() {
        return prestamo;
    }

    /**
     * @param prestamo the prestamo to set
     */
    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    
    
}
