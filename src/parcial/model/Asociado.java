/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.model;

/**
 *
 * @author sala7
 */
public class Asociado {
    
        private String codigo;
    private String nombre;
    private double salario;
    private String estado;

    public Asociado(String codigo, String nombre, double salario, String estado) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.salario = salario;
        this.estado = estado;
    }

    public Asociado() {        
    }
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
