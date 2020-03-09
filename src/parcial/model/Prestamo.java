
package parcial.model;





public class Prestamo {
    
    
    private double valor;
    private double interes;
    private double plazo;
    private Asociado a1;

    public Prestamo(double valor, double interes, double plazo, Asociado a1) {
        this.valor = valor;
        this.interes = interes;
        this.plazo = plazo;
        this.a1 = a1;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getPlazo() {
        return plazo;
    }

    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    public Asociado getA1() {
        return a1;
    }

    public void setA1(Asociado a1) {
        this.a1 = a1;
    }
    
    
    
    
}
