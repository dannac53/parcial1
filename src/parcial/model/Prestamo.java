
package parcial.model;





public class Prestamo {
    
    
    private double valor;
    private double interes;
    private double plazo;
    private Asociado asociado;

    public Prestamo() {
    }

    public Prestamo(double valor, double interes, double plazo, Asociado asociado) {
        this.valor = valor;
        this.interes = interes;
        this.plazo = plazo;
        this.asociado = asociado;
    }
    
    
    

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the interes
     */
    public double getInteres() {
        return interes;
    }

    /**
     * @param interes the interes to set
     */
    public void setInteres(double interes) {
        this.interes = interes;
    }

    /**
     * @return the plazo
     */
    public double getPlazo() {
        return plazo;
    }

    /**
     * @param plazo the plazo to set
     */
    public void setPlazo(double plazo) {
        this.plazo = plazo;
    }

    /**
     * @return the asociado
     */
    public Asociado getAsociado() {
        return asociado;
    }

    /**
     * @param asociado the asociado to set
     */
    public void setAsociado(Asociado asociado) {
        this.asociado = asociado;
    }
    
    
}
