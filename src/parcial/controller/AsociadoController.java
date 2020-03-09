/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.controller;

import java.util.Vector;
import javax.swing.JOptionPane;
import parcial.model.Asociado;
import parcial.model.Cuota;
import parcial.model.Prestamo;

/**
 *
 * @author sala7
 */
public class AsociadoController {
    
      static Vector<Cuota> list_prestamos = new Vector();
    static Vector<Asociado> list_asociados = new Vector();

    public void add(Cuota p1) {
        list_prestamos.add(p1);
    }

    public void remove(int i) {
        list_prestamos.remove(i);
    }

    public void cuotas(int limit, int i, double valorPagar, double valorCuota, double valorTotal, Prestamo p1, Vector<Cuota> arr) {

        if (i > 0) {
            valorPagar -= valorCuota;
        }

        arr.add(new Cuota(
                (i + 1),
                valorCuota,
                valorTotal,
                (i == 0) ? valorTotal : ( valorPagar < 0) ? valorPagar*-1 : valorPagar,
                false,
                p1
        ));

        i++;
        if (i < limit) {
            cuotas(limit, i, valorPagar, valorCuota, valorTotal, p1, arr);
        }

    }

    public void borrarCuotas(int i, Asociado a1) {
        if (getList_prestamos().get(i).getPres1().getA1().getCodigo().equals(a1.getCodigo())) {
            getList_prestamos().remove(i);
            i = -1;
        }
        i++;        
        if (i < getList_prestamos().size()) {
            borrarCuotas(i, a1);
        }
    }
    
     public void igualar(int i, Vector<Cuota> arr1, Vector<Cuota> arr2){
        arr1.add(arr2.get(i));
        
        i++;
        if (i < arr2.size()) {
            igualar(i, arr1, arr2);
        }             
    }
    
    public void cambiarEst_prestamo(int i, Asociado a1, String estado){
        if(getList_asociados().get(i).getCodigo().equals(a1.getCodigo())){
            getList_asociados().get(i).setEstado(estado);
            i = getList_asociados().size();
        }
        i++;
        if (i < getList_asociados().size()) {
            cambiarEst_prestamo(i, a1, estado);
        }
    }
    
    public void ultimaCuota(int i, Asociado a1, int indexM) {
        
        Cuota actual = getList_prestamos().get(i);
        Cuota mayor = getList_prestamos().get(indexM);
        Asociado pagando = actual.getPres1().getA1();
        
        if (actual.getNcuota() > mayor.getNcuota() && pagando.getCodigo().equals(a1.getCodigo())) {
            indexM = i;
            i = -1;
        }
        i++;
        if (i < getList_prestamos().size()) {
            ultimaCuota(i, a1, indexM);
        } else {
            if (mayor.isPagada() && mayor.getPres1().getA1().getCodigo().equals(a1.getCodigo())) {
                JOptionPane.showMessageDialog(null,
                        "La ultima cuota de " + mayor.getPres1().getA1().getNombre()
                        + " #" + mayor.getNcuota() + " ha sido PAGADA - PRESTAMOS ELIMINADO"
                );
                borrarCuotas(0, a1);
                cambiarEst_prestamo(0, a1, "sinPrestamo");                
            }
        }
    }
    
    public static Vector<Cuota> getList_prestamos() {
        return list_prestamos;
    }

    public static void setList_prestamos(Vector<Cuota> list_prestamos) {
        AsociadoController.list_prestamos = list_prestamos;
    }

    public static Vector<Asociado> getList_asociados() {
        return list_asociados;
    }

    public static void setList_asociados(Vector<Asociado> list_asociados) {
        AsociadoController.list_asociados = list_asociados;
    }

    
}
