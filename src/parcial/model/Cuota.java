
package parcial.model;


public class Cuota {
    
    private int Ncuota;
    private double valorCuota;
    private double valorPagar;
    private double saldo;
    private boolean pagada;
    private Prestamo pres1;

    public Cuota(int Ncuota, double valorCuota, double valorPagar, double saldo, boolean pagada, Prestamo pres1) {
        this.Ncuota = Ncuota;
        this.valorCuota = valorCuota;
        this.valorPagar = valorPagar;
        this.saldo = saldo;
        this.pagada = pagada;
        this.pres1 = pres1;
    }

    public int getNcuota() {
        return Ncuota;
    }

    public void setNcuota(int Ncuota) {
        this.Ncuota = Ncuota;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public double getValorPagar() {
        return valorPagar;
    }

    public void setValorPagar(double valorPagar) {
        this.valorPagar = valorPagar;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public Prestamo getPres1() {
        return pres1;
    }

    public void setPres1(Prestamo pres1) {
        this.pres1 = pres1;
    }
    
    
    
}
